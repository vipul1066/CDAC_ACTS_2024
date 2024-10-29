#include<iostream>
#include"Employee.h"
using namespace std;

class conEmp: public Employee{

private:
int days;
int dailywages;
int gross_salary;

public:

conEmp();
conEmp(string name, int day, int dailywages);

void accept();
void display();

void calSalary();

};
