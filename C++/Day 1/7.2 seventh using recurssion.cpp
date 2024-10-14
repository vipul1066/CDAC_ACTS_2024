#include<iostream>
using namespace std;
int sumOfDigits(int num){
	if(num==0)
		return 0;
	int ans=num%10 +sumOfDigits(num/10);
	return ans;
}
int main(){
	int num;
	cout<<"enter the 4 digit number= "<<endl;
	cin>>num;
	cout<<"the sum of digits of the given number is "<<sumOfDigits(num);
	return 0;
}

