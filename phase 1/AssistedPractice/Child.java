package accessmodianother;

public class Child extends TestAccessInAnotherPackage {

	public void methodPublic()
	{
		System.out.println("This is my Public Method");
	}

	void methodPrivate()
	{
		System.out.println("this is my Private Method");
	}

	void methodDefault()
	{
		System.out.println("This is my Default Method");
	}
	protected void methodProtected()
	{
		System.out.println("This is my Protected Method");
	}
	public static void main(String[] args) {
		Child obj=new Child();
		//child will be able to access protected and public properties
		obj.methodPublic();
		obj.methodProtected();

		obj.methodDefault();
		obj.methodPrivate();
	}
}
