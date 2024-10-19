#include<iostream>
using namespace std;

class Employee{
	public:
	int empNo,salary,dept;
	string name;
	
	void acceptData (){
		
			cout<<"Enter Employee ID= ";
			cin>>empNo;
			cout<<"Enter name of Employee= ";
			cin>>name;
			cout<<"Enter salary of Employee= ";
			cin>>salary;
			cout<<"Enter dept of Employee= ";
			cin>>dept;
		
	}

	void displayData(){
		
			cout<<"Employee ID= "<<empNo<<endl;
			cout<<"Employee Name= "<<name<<endl;
			cout<<"Employee salary= "<<salary<<endl;
			cout<<"Employee dept= "<<dept<<endl;
		
	}

};

int main(){
	int n;
	cout<<"Enter number of employee you want to enter=";
	cin>>n;
	Employee empArr[n];
	for(int i=0;i<n;i++){
		empArr[i].acceptData();
	}
    cout<<"Employee Data: "<<endl;
	for(int j=0;j<n;j++){
		empArr[j].displayData();
	}

	return 0;
}
