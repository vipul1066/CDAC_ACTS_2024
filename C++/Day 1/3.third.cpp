#include <iostream>
#include <cmath> // For pow function
using namespace std;

// Function to calculate power
double powNum(double base, int exp) {
    return pow(base, exp); // Using the standard library pow function
}

int main() {
    double principal, rate;
    int time;
    
    cout << "Enter principal: ";
    cin >> principal;
    
    cout << "Enter rate (in %): ";
    cin >> rate;
    
    cout << "Enter time (in years): ";
    cin >> time;
    
    // Calculate compound interest
    double amount = principal * powNum(1 + rate / 100.0, time);
    double compoundInterest = amount - principal;
    
    cout << "Calculating the CI for the given details: " << compoundInterest << endl;
    
    return 0;
}
