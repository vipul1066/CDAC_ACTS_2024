package Expection_Basic;

public class MainList {
	public static void main(String[] args) {
		FList  f=new FList();
		try
		{
			f.InsertElement(12);
			f.InsertElement(12);
			f.InsertElement(34);
			f.InsertElement(20);
			f.InsertElement(88);
			f.InsertElement(23);
		}
		catch(Exception ie)
		{
			System.out.println(ie);
		}
		try
		{
			f.RetriveElement(5);
		}
		catch(Exception re)
		{
			System.out.println(re);
		}
	}
}
