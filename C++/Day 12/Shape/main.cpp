#include "rect.h"
#include "circle.h"

int main(){
	Shape *s =NULL;
	Rect r;
	Circle c;
	s=&r;
	a->Accept();
	float a = s->Area();
	cout<<"Area is : "<<a;

	s=&c;
	s->Accept();
	float a=s->Area();
	cout<<"Area is: "<<a;
	return 0;
}
