#include <iostream>
using namespace std;

class Account {
private:
    const int accNo;   
    string accName;
    double balance;
    static double nextAcc;
public:
    Account() : accNo(nextAcc++), accName("Unknown"), balance(0.0) {
    }
    Account(string name, double initialBalance): accNo(nextAcc++), accName(name), balance(initialBalance) {
    }
    void AcceptData() {
        cout << "Enter Account Holder Name: ";
        cin.ignore();
        getline(cin, accName);
        cout << "Enter Initial Balance: ";
        cin >> balance;
    }

    void DisplayData() const {
        cout << "Account Number: " << accNo 
             << ", Account Holder Name: " << accName 
             << ", Balance: " << balance << endl;
        cout << "This pointer inside DisplayData: " << this << endl;
    }
    void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "Deposit successful. New Balance: " << balance << endl;
        } else {
            cout << "Invalid deposit amount!" << endl;
        }
    }
    void Withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            cout << "Withdrawal successful. New Balance: " << balance << endl;
        } else {
            cout << "Invalid or insufficient funds for withdrawal!" << endl;
        }
    }
    void Transfer(Account& destinationAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            destinationAccount.Deposit(amount);
            cout << "Transfer successful. New Balance: " << balance << endl;
        } else {
            cout << "Invalid or insufficient funds for transfer!" << endl;
        }
    }
    int GetAccountNumber() const {
        return accNo;
    }
};

double Account::nextAcc = 1234500001;

void DisplayMenu() {
    cout << "\nMenu:\n";
    cout << "1. Open a new account\n";
    cout << "2. Display all accounts\n";
    cout << "3. Deposit money\n";
    cout << "4. Withdraw money\n";
    cout << "5. Transfer money\n";
    cout << "6. Exit\n";
    cout << "Enter your choice: ";
}

int main() {
    const int MAX_ACCOUNTS = 100;
    Account* accounts[MAX_ACCOUNTS];
    int numAccounts = 0;
    int choice;
    do {
        DisplayMenu();
        cin >> choice;
        switch (choice) {
            case 1: {
                if (numAccounts < MAX_ACCOUNTS) {
                    accounts[numAccounts] = new Account();
                    accounts[numAccounts]->AcceptData();
                    numAccounts++;
                } else {
                    cout << "Account limit reached!" << endl;
                }
                break;
            }
            case 2: {
                for (int i = 0; i < numAccounts; i++) {
                    accounts[i]->DisplayData();
                }
                break;
            }
            case 3: {
                int accNo;
                double amount;
                cout << "Enter Account Number for Deposit: ";
                cin >> accNo;
                bool found = false;
                for (int i = 0; i < numAccounts; i++) {
                    if (accounts[i]->GetAccountNumber() == accNo) {
                        cout << "Enter amount to deposit: ";
                        cin >> amount;
                        accounts[i]->Deposit(amount);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    cout << "Account not found!" << endl;
                }
                break;
            }
            case 4: {
                int accNo;
                double amount;
                cout << "Enter Account Number for Withdrawal: ";
                cin >> accNo;

                bool found = false;
                for (int i = 0; i < numAccounts; i++) {
                    if (accounts[i]->GetAccountNumber() == accNo) {
                        cout << "Enter amount to withdraw: ";
                        cin >> amount;
                        accounts[i]->Withdraw(amount);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    cout << "Account not found!" << endl;
                }
                break;
            }
            case 5: {
                int srcAccNo, destAccNo;
                double amount;
                cout << "Enter Source Account Number: ";
                cin >> srcAccNo;
                cout << "Enter Destination Account Number: ";
                cin >> destAccNo;
                Account *srcAccount = nullptr, *destAccount = nullptr;
                for (int i = 0; i < numAccounts; i++) {
                    if (accounts[i]->GetAccountNumber() == srcAccNo) {
                        srcAccount = accounts[i];
                    }
                    if (accounts[i]->GetAccountNumber() == destAccNo) {
                        destAccount = accounts[i];
                    }
                }
                if (srcAccount && destAccount) {
                    cout << "Enter amount to transfer: ";
                    cin >> amount;
                    srcAccount->Transfer(*destAccount, amount);
                } else {
                    cout << "Invalid account numbers provided!" << endl;
                }
                break;
            }
            case 6: {
                cout << "Exiting program." << endl;
                break;
            }
            default: {
                cout << "Invalid choice! Please try again." << endl;
                break;
            }
        }
    } while (choice != 6);
    
    for (int i = 0; i < numAccounts; i++) {
        delete accounts[i];
    }
    return 0;
}
