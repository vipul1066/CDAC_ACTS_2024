#include<iostream>
#include<string>
using namespace std;
void reverse(string &str,int start,int end){
	if(start>=end){
		return;
	}
	char temp=str[start];
	str[start]=str[end];
	str[end]=temp;
	reverse(str,start+1,end-1);
}


int main(){
	string str;
	cin>>str;
	cout<<"Entered String="<<str<<endl;
	int size = str.length();
	int start=0;
	int end=size-1;
	reverse(str,start,end);
	cout<<"Reversed String="<<str;
	return 0;
}
