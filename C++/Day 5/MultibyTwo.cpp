#include <iostream>
using namespace std;
void multiplyByTwo(int numbers[], int n) {
    for (int i = 0; i < n; ++i) {
        numbers[i] *= 2;
    }
}
int main() {
    int n;
    cout << "Enter the number of elements=";
    cin >> n;
    int numbers[n];
    cout << "Enter " << n << " numbers=\n";
    for (int i = 0; i < n; ++i) {
        cin >> numbers[i];
    }
    multiplyByTwo(numbers, n);
    cout << "Numbers multiplied by 2 are:\n";
    for (int i = 0; i < n; ++i) {
        cout << numbers[i] << " ";
    }
    cout << endl;
    return 0;
}
