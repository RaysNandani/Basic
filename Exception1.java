package in.co.rays;

public class Exception1 {
public static void main(String[] args) {
	int i = 0;
	int j = 15;
	 try {
		 int value = j/i;
		 System.out.println(value);
	 }catch (Exception e) {
		 //TODO : handle exception
		//System.out.println("divided by zero");
		e.printStackTrace();		
		//System.out.println(e.getMessage());
	 }finally {
		 System.out.println("finally block");
	 }
}

    private void printStackTrace() {
	// TODO Auto-generated method stub
	

}
}
