#include "shape.h"

void Circle::Accept(){
	cout<<"Enter value of radius: ";
	cin>>radius;
}

float Circle::Area(){
	float area = 3.14*(radius*radius);
	return area;
}

float Circle:Peri(){
	float peri = 2 * 3.14 * radius;
	return peri;
}
