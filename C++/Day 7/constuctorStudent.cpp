#include<iostream>
using namespace std;

class Student{
	private:
		int rno;
		string name;
		const int k;
	public:
	    Student():rno(1),name("aman"),k(10){
	        cout<<"student::student() default ctor"<<endl;
	    }
		Student(int rno, string name):rno(rno),name(name),k(10){
			cout<<"student::student() para ctor"<<endl;
			this->rno=rno;
			this->name=name;
			
		}
		void acceptData(){
			cout<<"Enter Student Roll No: ";
			cin>>rno;
			cout<<"Enter Student name: ";
			cin>>name;
		}
		void displayData(){
		    cout<<this<<endl;
			cout<<"Student Roll no is: "<<rno<<endl;
			cout<<"Student name is: "<<name<<endl;
		}
};


int main(){
    cout<<"Below constructor getting called multiple time: "<<endl;
	Student s[3];
	s->displayData();
	Student *s1= new Student(3,"aman");
	Student *s2 = new Student(2,"bob");
	s1->displayData();
	s2->displayData();
	cout<<s1<<endl;
	cout<<s2<<endl;
	

	return 0;
}
