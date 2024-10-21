#include<iostream>
using namespace std;
class Address{
	int FlatNo;
	string Area;
	string PINCODE;
	public:
	Address();
	Address(int ,string,string );
	void Acceptdata();	
	void display();
};