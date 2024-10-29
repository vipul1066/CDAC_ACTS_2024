#include "shape.h"

class Circle:public Shape{
	private:
		int radius;
	public:
		void Accept();
		void Area();
		void Peri();
};
