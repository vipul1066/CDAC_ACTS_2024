#include "address.cc"
#include<string>
#include<iostream>
using namespace std;
class Student
{
    int rno;
    string strName;
    Address permAddress;
    public:
    Student()
    {
        rno=0;
        strName="";

    }
    Student(int i,string  str):permAddress("2001","NorthSide","41303"){}
    Student(int i,string str,string flat,string area,string pin):rno(i),strName(str),permAddress(flat,area,pin){}
    void Accept  ()
    {
        cout<<"Rno:";
        cin>>rno;
        cout<<"Name:";
        cin>>strName;
    }
    void Display()
    {
        cout<<"Rno="<<rno<<endl;
        cout<<"Name:"<<strName<<endl;
    }
};
int main()
{
    Address A("Vipul","dgsdg","900");
    A.Display();
    
}
