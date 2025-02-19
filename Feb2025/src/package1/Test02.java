package package1;

public class Test02 {

	public Test02() {
		System.out.println("Default constructor");
	}
	
	public Test02(int a) {
		System.out.println("One parameter constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test02 t02=new Test02();
		Test02 t021=new Test02(1);
		
	}

}
