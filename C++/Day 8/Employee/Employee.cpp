#include<iostream>
#include"Empclass.h"
#include<bits/stdc++.h>
using namespace std;

	Employ::Employ(): empNo(0),name("NA"),salary(0),dept("IT"){}

	void Employ::setdata(){
                cout<<"enter the empNo: ";
                cin>>(this->empNo);
                cout<<"enter the name: ";
                cin>>(this->name);
		        cout<<"enter the salary: ";
                cin>>(this->salary);
                cout<<"enter the department: ";
                cin>>(this->dept);
	}
	
	void Employ::getdata(){
		cout<<"empNo : "<<this->empNo;
		cout<<" name: "<<this->name;
		cout<<" salary : "<<this->salary;
        cout<<" department "<<this->dept<<endl;

	}

