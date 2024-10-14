#include<iostream>
using namespace std;
int main(){
	int num;
	cout<<"enter the 4 digit number= "<<endl;
	cin>>num;
	int sum=0;
	while(num!=0){
		int digit=num%10;
		sum+=digit;
		num=num/10;
	}
	cout<<"the sum of digits of given number is "<<sum;
	return 0;
}
