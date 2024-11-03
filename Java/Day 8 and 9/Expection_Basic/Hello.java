package Expection_Basic;

public class Hello {
	 void addint(int a) throws Exception
	{
		if(a==5);
		throw new Exception("The value of a cannnot be try another value");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Hemant");
		Hello a=new Hello();
		try
		{
			a.addint(5);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
