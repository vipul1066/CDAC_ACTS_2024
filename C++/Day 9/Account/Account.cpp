#include<iostream>
#include"Account.h"
using namespace std;


    	Account::Account(): acc_no(cnt++), name("NA"), balance(0){ }
	Account::Account(string nm,int bal): acc_no(cnt),name(nm),balance(bal) {
                cnt++;
        }
        int Account::getaccno(){
                return acc_no;
        }

        void Account::deposit()
        {
                int dep;
                cout<<"enter amount to deposite:";
                cin>>dep;
                this->balance = this->balance + dep;
		  cout<<"Total balance: "<<this->balance<<endl;
        }

        void Account::withdraw()
        {
                int wit;
                cout<<"enter amount to withdraw:";
                cin>>wit;
                this->balance = this->balance - wit;
		cout<<"Total balance: "<<this->balance<<endl;
        }

        void Account::display()
        {
                cout<<"account NO.="<<acc_no<<endl;
                cout<<"account holder="<<name<<endl;
                cout<<"account balance="<<balance<<endl;
        }

