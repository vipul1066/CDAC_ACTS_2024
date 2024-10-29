#include<iostream>
#include"conEmp.h"
using namespace std;

conEmp::conEmp(){
}

conEmp::conEmp(string name, int day, int dailywages){
}

void conEmp::accept(){
	Employee::accept();
	cout<<"\nEnter day ";
	cin>>days;
	cout<<"\nEnter daily wage";
	cin>>dailywages;
}

void conEmp::display(){
	Employee::display();
	cout<<"\nSalary =  "<<gross_salary;

}

void conEmp :: calSalary(){
	gross_salary = days * dailywages;
}

