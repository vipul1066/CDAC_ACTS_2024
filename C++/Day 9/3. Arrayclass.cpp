#include <iostream>
using namespace std;
class Array{
    int size;
    int *ptr;
    public:
    Array(){
        size=0;
        ptr=NULL;
    }
    Array(int n){
        size = n;
        ptr = new int[size];
    }
    void Accept(){
        cout<<"Enter the number: ";
        cin>>size;
        for(int i=0;i<size;i++){
            cin>>ptr[i];
        }
    }
    void Display(){
        for(int i=0;i<size;i++){
            cout<<ptr[i]<<" ";
        }
    }
    ~Array(){
        delete[] ptr;
    }
};

int main() {
    Array a(5);
    a.Accept();
    a.Display();

    return 0;
}