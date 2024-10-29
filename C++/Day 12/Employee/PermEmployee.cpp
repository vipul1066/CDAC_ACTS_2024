#include<iostream>
#include"PermEmployee.h"
using namespace std;


PermEmployee::PermEmployee(){
}

PermEmployee :: PermEmployee(string name, double sal, int hra, int ta){
}


        void PermEmployee::accept(){
		Employee::accept();
                cout<<"\nEnter salary";
                cin>>sal;
                cout<<"\nEnter HRA";
                cin>>hra;
                cout<<"\nEnter TA";
                cin>>ta;
        }

        void PermEmployee::display(){
                Employee::display();
                cout<<"\nSalary =  "<<gross_salary;
        }


        void PermEmployee::calSalary(){
                 gross_salary = sal + hra + ta;

        }



           


