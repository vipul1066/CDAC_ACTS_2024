#include<iostream>
using namespace std;
int main(){
	int num,n;
	cout<<"enter the number= ";
	cin>>num;
	cout<<"enter the power of number to be calculated= ";
	cin>>n;
	int ans=1;
	for(int i=0;i<n;i++){
		ans=ans*num;
	}
	cout<<ans;
	return 0;
}
