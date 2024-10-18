#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of characters=";
    cin >> n;

    cin.get();
    string result;

    cout << "Enter " << n << " characters: ";
    for (int i = 0; i < n; ++i) {
        char ch;
        cin >> ch;
        result += ch;
    }

    cout << "The entered string is=" << result <<endl;
    return 0;
}
