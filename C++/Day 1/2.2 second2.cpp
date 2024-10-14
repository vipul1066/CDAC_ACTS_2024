#include<iostream>
#include<math.h>
using namespace std;
int calculate(int num){
	int total=0;
	while(num>0){
		int i=0;
		int lastdigit= num%10;
		int digit= lastdigit * pow(2,i);
		total = total+digit;
		num=num/10;
		i++;
	}
	return total;
}

int main(){
	int first, second;
	cout<<"Enter first number";
	cin>>first;
	cout<<"Enter second number";
	cin>>second;
	int firstNumber= calculate(first);
	int secondNumber= calculate(second);
	cout<<firstNumber;
	cout<<secondNumber;
	return 0;
}
