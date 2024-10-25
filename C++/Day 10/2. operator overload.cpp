#include<iostream>
using namespace std;

class Complex{
	int real;
	int img;

	public:
	Complex():real(0),img(0){
	}

	Complex(int real,int img):real(real),img(img){
	}
/*	Complex add(const Complex& b){
		Complex res;
		res.real = this->real + b.real;
		res.img = this->img + b.img;
		return res;
	}
*/
	Complex operator+(const Complex& b){
                Complex res;
                res.real = this->real + b.real;
                res.img = this->img + b.img;
                return res;
        }

	Complex operator-(const Complex& b){
                Complex res;
                res.real = this->real - b.real;
                res.img = this->img - b.img;
                return res;
        }

	Complex operator*(const Complex& b){
                Complex res;
                res.real = (this->real*b.real)-(this->img * b.img);
                res.img = (this->real*b.img) + (this->img * b.real) ;
                return res;
        }


	void display(){
		cout<<"complex [real= "<<real;
		cout<<" img= "<<img<<"]"<<endl;
	}

};

int main(){
	Complex c1(3,2);
	Complex c2(1,4);
	Complex c3;
//	c3=c1.add(c2);
//	c3 = c1 + c2;
//	c3= c1 - c2;
	c3 = c1*c2;
	c3.display();

	return 0;
}

