#include<iostream>
#include<cmath>
using namespace std;
void rootofEquation(float a,float b, float c){

	float total =( b*b)-4*a*c;
	float z = sqrt(abs(total));

	if(total>0){
		cout<<"Roots are real and distinct";
		cout<<(-b+z) / 2*a <<","<<(-b-z) / 2*a;
	}
	else if(total==0){
		cout<<"Roots are real and equal";
		cout<<-b/2*a<<","<<-b/2*a;
	}
	else{
		cout<<"Roots are imaginary";
		cout<<(-b/2*a)<<"+i"<<(z/2*a)<<","<<(-b/2*a)<<"-i"<<(z/2*a);
	}
}
int main(){
	float a,b,c;
	cout<<"Enter the value of a=";
	cin>>a;
	cout<<"Enter the value of b=";
	cin>>b;
	cout<<"Enter the value of c=";
	cin>>c;
	rootofEquation(a,b,c);
	return 0;
}

