#include<iostream>
#include"PermEmployee.h"
#include"conEmp.h"

using namespace std;

int main(){

	/*
	Employee e;
	e.accept();
	e.display();
	*/

	PermEmployee e1;

	e1.accept();
	e1.calSalary();
	e1.display();

	conEmp e2;
	e2.accept();
	e2.calSalary();
	e2.display();
	return 0;
}
