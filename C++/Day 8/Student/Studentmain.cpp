#include<iostream>
#include"Student.h"
using namespace std;

int main(){
    Student s1;
	s1.display();
	Student s2(002);
	s2.display();

	Student s3(003,"Vipul");
	s3.display();

	// dynamic memory allocation
	Student *s4=new Student(004,"Ram");
	s4->display();

	// Creating Array of Student obj using default constructure
	int n;
	cout<<"\nenter the number of students: ";
	cin>>n;
	Student stdr[n];

	for(int i=0;i<n;i++){
		stdr[i].Acceptdata();
	}
	for(int j=0;j<n;j++){
		stdr[j].display();
	}

        // Initialize Obj using initialised list 
	Student s5(5,"Aman");
	s5.display();
	cout<<endl;

	return 0;
}

