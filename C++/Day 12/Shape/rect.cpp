#include "rect.h"

float Rect::Area(){
	float area = length*bredth;
	return area;
}

float Rect::Peri(){
	float peri = 2*(length*breadth);
	return peri;
}

void Rect::Accept(){
	cout<<"Enter length: ";
	cin>>length;
	cout<<"Enter bredth: ";
	cin>>bredth;
}
void Rect::Display(){
	cout<<"Length is: "<<length<<endl;
	cout<<"Bredth is: "<<bredth<<endl;
}
