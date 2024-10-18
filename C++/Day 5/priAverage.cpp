#include <iostream>
using namespace std;
double calculateAverage(int numbers[], int n) {
    double sum=0;
    for (int i=0; i<n; ++i) {
        sum += numbers[i];
    }
    return sum/n;
}

int main() {
    int n;
    cout << "Enter the number of elements=";
    cin >> n;
    int numbers[n];
    cout << "Enter " << n << " numbers:\n";
    for (int i = 0; i < n; ++i) {
        cin >> numbers[i];
    }
    double average = calculateAverage(numbers, n);
    cout << "The average is: " << average << endl;
    return 0;
}
