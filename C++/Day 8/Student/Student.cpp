#include<iostream>
#include"Student.h"
using namespace std;

	Student::Student(){
		cout<<"\ndefault constructur is called";
		rollno=001;
		name="NA";
	}
	Student::Student(int rollno){
		this->rollno=rollno;
		name="NA";
	}
	void Student::Acceptdata()
	{	cout<<"\nEnter the new rol no.";
		cin>>this->rollno;
		cout<<"enter the new name: ";
		cin>>this->name;
	}
	void Student::display(){
		cout<<"\nRoLLNo: "<<this->rollno;
		cout<<"   Name: "<<this->name;
	}

	// Constructor using initialized list
	Student::Student(int i,string s): rollno(i),name(s){}
