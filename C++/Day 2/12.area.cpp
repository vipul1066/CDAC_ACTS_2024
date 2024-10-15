#include <iostream>
using namespace std;
const double PI = 3.14159;
double areaOfCircle(double radius) {
    return PI * radius * radius;
}
double areaOfRectangle(double length, double width) {
    return length * width;
}
double areaOfSquare(double side) {
    return side * side;
}
int main() {
    double radius, length, width, side;
    cout << "Enter radius of circle=";
    cin >> radius;
    cout << "Area of Circle=" << areaOfCircle(radius) << endl;

    cout << "Enter length and width of rectangle=";
    cin >> length >> width;
    cout << "Area of Rectangle=" << areaOfRectangle(length, width) << endl;

    cout << "Enter side of square=";
    cin >> side;
    cout << "Area of Square=" << areaOfSquare(side) << endl;

    return 0;
}
