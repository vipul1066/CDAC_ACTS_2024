#include<iostream>
using namespace std;
void sortArr(int arr[],int n){
	for(int i=0;i<=n-2;i++){
		for(int j=i+1;j<=n-1;j++){
			if(arr[i]>arr[j]){
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
}

void displaySort(int arr[],int n){
	for(int k=0;k<n;k++){
		cout<<arr[k]<<" ";
	}
}

int main(){
	int n;
	cout<<"Enter number="<<endl;
	cin>>n;
	int *arr = new int[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	sortArr(arr,n);
	displaySort(arr,n);
	return 0;
}
