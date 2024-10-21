#include<iostream>
#include"Empclass.h"
#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cout<<"enter the number of employees";
	cin>>n;
	Employ *empArr=new Employ[n];
	for(int i=0;i<n;i++){
		empArr[i].setdata();
	}
	for(int i=0;i<n;i++){
		empArr[i].getdata();
	}
	cout<<endl;
	return 0;
}

