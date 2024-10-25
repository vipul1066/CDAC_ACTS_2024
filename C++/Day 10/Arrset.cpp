#include<iostream>
using namespace std;

class Array{
	int *p;
	int s;
	public:
	Array(int size){
	cout<<"para ctor called"<<endl;
		s=size;
		p=new int[s];
	}
	Array(const Array& x)
	{
	    cout<<"copy constructor called"<<endl;
		s=x.s;
		p=new int[s];
		for(int i=0;i<s;i++){
			p[0]=x.p[0];
		}
		
	}

	int& operator[](int index) {
            return p[index];
    }
    
	void setAtIndex(int index, int value){
		p[index]=value;
	}
	int getAtIndex(int index){
		return p[index];
	}
	~Array(){
		cout<<"dtor is called"<<endl;
		delete[] p;
	}
};

int main(){
	Array a(2);
	a.setAtIndex(0,10);
	a.setAtIndex(1,20);
	cout<<a.getAtIndex(0)<<endl;
	cout<<a.getAtIndex(1)<<endl;
	
	cout<<a[0]<<endl;
    cout<<a[1]<<endl;

	{
		Array b(a);
		cout<<b.getAtIndex(0)<<endl;
		cout<<b.getAtIndex(1)<<endl;
	}
	cout<<a.getAtIndex(0)<<endl;
	cout<<a.getAtIndex(1)<<endl;
    
    

	return 0;
}
