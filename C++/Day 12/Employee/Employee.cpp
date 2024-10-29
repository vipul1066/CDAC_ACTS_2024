#include<iostream>
#include"Employee.h"
using namespace std;


Employee::Employee(){
}

Employee :: Employee(string name){
}

void Employee::accept(){
	cout<<"\nEnter name";
	cin>>name;
}

void Employee::display(){
	cout<<"\nName =  "<<name;
}
