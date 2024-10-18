#include<iostream>
using namespace std;
struct student{
	int rno;
	string name;
};

void addStudent(student arr[],int n){
	for(int i=0;i<n;i++){
		cout<<"Enter Roll no.=";
		cin>>arr[i].rno;
		cout<<endl;
		cout<<"Enter Name of student=";
		//cin.get();
		//getline(cin,student[i].name)
		cin>>arr[i].name;
		cout<<endl;
	}
}

void printStudent(student arr[],int n){
	for(int i=0;i<n;i++){
	cout<<"Student Roll no="<<arr[i].rno;
	cout<<endl;
	cout<<"Student name="<<arr[i].name;
	cout<<endl;
	}
}
int main(){
	cout<<"Enter number of student=";
	int n;
	cin>>n;
	student arr[n];
	addStudent(arr,n);	
	printStudent(arr,n);
	return 0;
}
