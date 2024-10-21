#include<iostream>
#include"Complex.h"
using namespace std;

int Complex :: cnt = 0;

int main()
{
	Complex c1;
	c1.display();

    Complex c2(10,10);
	c2.display();

	Complex :: count();

	return 0;

}



