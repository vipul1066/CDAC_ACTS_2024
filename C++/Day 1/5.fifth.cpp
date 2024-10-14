#include<iostream>
using namespace std;
int main(){
	int a=10;
	int b=20;
	cout<<"the value of a before swapping "<<a<<endl;
	cout<<"the value of b before swapping "<<b<<endl;
	int temp=a;
	a=b;
	b=temp;
	cout <<"the value of a after swapping "<<a<<endl;
	cout <<"the value of b after swapping "<<b<<endl;
	return 0;
}

