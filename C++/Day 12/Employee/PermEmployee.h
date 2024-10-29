#include<iostream>
#include"Employee.h"
using namespace std;

class PermEmployee : public Employee{

	private:
	double sal;
	int hra;
	int ta;  //Travel allowance
	int gross_salary;	 

	public:
	PermEmployee();
	PermEmployee(string,double,int,int);

	void accept();

	void display();


	void calSalary();




};
