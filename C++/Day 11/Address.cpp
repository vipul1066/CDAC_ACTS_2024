#include "address.h"
#include<string>
#include<iostream>
using namespace std;
Address::Address():FlatNo(""),Area(""),Pin(""){}
Address::Address(string a,string b,string c):FlatNo(a),Area(b),Pin(c){}
void Address::Accept()
{
    cout<<"Enter Flat No:"<<endl;
    cin>>FlatNo;
    cout<<"Enter the Area:"<<endl;
    cin>>Area;
    cout<<"Enter the pin:"<<endl;
    cin>>Pin;
}
void Address::Display()
{
    cout<<"Flat No:"<<FlatNo<<endl;
    cout<<"Area is:"<<Area<<endl;
    cout<<"Pin is:"<<Pin<<endl;
}
