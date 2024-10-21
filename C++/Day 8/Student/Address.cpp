#include<iostream>
#include"Address.h"
using namespace std;

	Address::Address(){
		int FlatNo=01;
	    string Area="Pachbati";
	    string PINCODE="301026";
	}
	
	Address::Address(int i,string a,string p): FlatNo(i),Area(a),PINCODE(p){}

	void Address::Acceptdata()
	{	cout<<"\nEnter the FlatNo.";
		cin>>this->FlatNo;
		cout<<"enter the Area ";
		cin>>this->Area;
        cout<<"enter the Pincode";
		cin>>this->PINCODE;
	}
	void Address::display(){
		cout<<"\n:FlatNo.- "<<this->FlatNo;
		cout<<"Area  : "<<this->Area;
		cout<<"Pincode  : "<<this->PINCODE;
	}

	
