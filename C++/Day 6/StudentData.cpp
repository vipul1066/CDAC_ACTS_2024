#include <iostream>
using namespace std;
class Student{
    public:
    int rno;
    string name;
    public:
    void acceptData(){
        cout<<"Enter the Roll no.: ";
        cin>>rno;
        cout<<"Enter name of student: ";
        cin>>name;
    }
    void displayData(){
        cout<<"Student roll no is: "<<rno<<endl;
        cout<<"Student name: "<<name<<endl;
    }
};
void sortfun(Student s[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(s[i].rno>s[j].rno){
            Student temp= s[i];
            s[i]=s[j];
            s[j]=temp;
            }
        }
    }
}

int main() {
    int n;
    cout<<"Enter Number of student: ";
    cin>>n;
    Student *s = new Student[n];
    for(int i=0;i<n;i++){
        s[i].acceptData();
    }
    cout<<"Before sorting: "<<endl;
    for(int j=0;j<n;j++){
        s[j].displayData();
    }
    sortfun(s,n);
    cout<<"After sorting: "<<endl;
    for(int i=0;i<n;i++){
        s[i].displayData();
    }

    return 0;
}