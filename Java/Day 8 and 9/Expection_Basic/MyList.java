package Expection_Basic;

public interface MyList {
	//we also have to throw exception
	void InsertElement(int element) throws Exception;
	int  RetriveElement(int index) throws Exception;
}
