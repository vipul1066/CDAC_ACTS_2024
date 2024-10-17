#include<iostream>
using namespace std;
void printArr(string student[],int size){
        for(int i=0;i<size;i++){
        cout<<student[i]<<" ";
}
}

int main(){
        string student[]= {"vipul","ram","sham"};
	int size = sizeof(student)/sizeof(student[0]);
        printArr( student,size);
        return 0;
}

