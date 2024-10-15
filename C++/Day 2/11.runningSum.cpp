#include <iostream>
using namespace std;
int runningSum(int n) {
    if (n==1)
        return 1;
    else
        return n + runningSum(n - 1);
}
int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    cout << "Running sum of numbers from 1 to" << n << " is:" << runningSum(n) << endl;
    return 0;
}
