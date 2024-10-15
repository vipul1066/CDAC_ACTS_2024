#include <iostream>
using namespace std;
void binaryEquivalent(int n) {
    if (n > 1)
        binaryEquivalent(n/2);
    cout << n % 2;
}
int main() {
    int num;
    cout << "Enter a number=";
    cin >> num;

    cout << "Binary equivalent of" << num << " is: ";
    binaryEquivalent(num);
    cout << endl;
    return 0;
}
