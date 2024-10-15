#include <iostream>
using namespace std;
int main() {
    char ch;
    cout << "Enter a character";
    cin >> ch;
    if (ch >= 'a' && ch <= 'z')
        cout <<"character is a lowercase letter." << endl;
    else if (ch >= 'A' && ch <= 'Z')
        cout <<"character is an uppercase letter." << endl;
    else
        cout <<"character is not a letter." << endl;
    return 0;
}
