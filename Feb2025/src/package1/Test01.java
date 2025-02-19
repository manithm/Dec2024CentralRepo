package package1;

public class Test01 {
	int a,b,c,d;
	
	public int sum(int a,int b) {
		c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01 t01=new Test01();
		int x= t01.sum(5, 2);
		System.out.println("sum is "+x);
		
	}

}
