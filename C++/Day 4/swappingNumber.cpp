#include<iostream>
using namespace std;
void swap(int *a, int *b){
	int temp = *a;
	*a=*b;
	*b=temp;
}
int main(){
	int a=10;
	int b=20;
	cout<<"The value of a="<<a<<" and b="<<b<<"before swapping";
	cout<<endl;
	swap(&a,&b);
	cout<<"The value of a="<<a<<"and b="<<b<<"after swapping";
	return 0;
}

