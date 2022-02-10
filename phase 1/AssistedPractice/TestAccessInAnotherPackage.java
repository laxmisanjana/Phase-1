package accessmodianother;
public class TestAccessInAnotherPackage {
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
				TestAccessInAnotherPackage obj=new TestAccessInAnotherPackage();
				obj.methodPublic();
				obj.methodDefault();
				obj.methodPrivate();
				obj.methodProtected();
			}
}

