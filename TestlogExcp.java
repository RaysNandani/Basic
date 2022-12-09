package in.co.rays;

public class TestlogExcp  {
public static void main(String[] args) throws loginException{
	TestlogExcp  t = new TestlogExcp ();
	try {
		t.authenticate("admin");
	System.out.println("no exception found!");
}
	catch (loginException e){
	System.out.println("user access denied");
	}
	finally {
		System.out.println("this is finally block");
	}
}
private void authenticate(String name)throws loginException{
	// TODO Auto-generated method stub

		if(!"admin".equals(name)) {
			loginException  e = new loginException ();
			throw e ;
			
		}
	}
} 

