#include <iostream>
using namespace std;
void swap(int &a, int &b){
    int temp=a;
    a=b;
    b=temp;
}

int facto(const int &n){
    if(n==0 || n==1){
        return 1;
    }
    int sum = n*facto(n-1);
    return sum;
}

int main() {
    int a,b;
    cout<<"Enter value of a: ";
    cin>>a;
    cout<<"Enter value of: ";
    cin>>b;
    swap(a,b);
    cout<<"The value of a: "<<a<<" and b: "<<b<<endl;
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    cout<<facto(n);

    return 0;
}
