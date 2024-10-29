#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include<iostream>
using namespace std;
class Employee{

	private:
	string name;

	public:
	Employee();
	Employee(string);

        virtual void calSalary() =0;

        void accept();
	void display();

};
		
#endif
