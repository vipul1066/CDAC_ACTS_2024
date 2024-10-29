#include "shape.h"

class Rect:public Shape{
	private:
		int length;
		int bredth;
	public:
		void Accept();
		void Display();
		void Area();
		void Peri();
};
