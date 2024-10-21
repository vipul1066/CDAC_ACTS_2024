#include<iostream>
#include"Complex.h"
using namespace std;

    Complex:: Complex(): real(0) , imag (0)
	{
           cnt++;
	       cout<<"no of time ctor call :"<<endl;
    }
    
	Complex:: Complex(int rn,int in):real(rn) ,imag(in)
	{
		cnt++;
		cout<<"no of time ctor call :"<<endl;
	}

	void  Complex:: display()
        {
		cout<<"\nreal ="<<real;
		cout<<"   imag ="<<imag<<"j";
        }

	void  Complex::count()
	{
		cout<<"\ncount = "<<cnt;
	}

