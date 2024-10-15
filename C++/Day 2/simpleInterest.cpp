#include<iostream>
using namespace std;
int main(){
	float principal,rate,period;
	cout<<"Enter the principal=";
	cin>>principal;
	cout<<"Enter the rate of interest=";
	cin>>rate;
	cout<<"Enter the period=";
	cin>>period;
	cout<<"the Simple interest is="<<(principal*rate*period)/100;
	return 0;
}
