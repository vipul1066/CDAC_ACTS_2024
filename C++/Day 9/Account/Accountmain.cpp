#include<iostream>
#include"Account.h"
using namespace std;

int Account::cnt=1000;



int main(){
        int n;
        int count=0;
        cout<<"enter the number of accounts you want add: ";
        cin>>n;
        Account *Ac[n];
        bool flag=true;
        while(flag){
        cout<<"\nPlease select opration: \n";
        cout<<"1 --For Create new Account\n";
        cout<<"2 -- For display Account details\n";
        cout<<"3 --For do withdrow Transaction\n";
        cout<<"4 --For deposit money\n";
        cout<<"0 --For Exit\n";
        int sn;
        cin>>sn;
        switch(sn){
                case 1:{
                        string nm;
                        cout<<"enter your name: ";
                        cin>>nm;
                        int bal;
                        cout<<"enter the starting balance: ";
                        cin>>bal;
                        Ac[count]=new Account(nm,bal);
                        cout<<"this is your Account details: ";
                        Ac[count]->display();
                        count++;
                        break;
                       }

            case 2:{
                        cout<<"\nenter the account number: ";
                        int Acn;
                        cin>>Acn;
                        for(int i=0;i<count;i++){
                                if(Ac[i]->getaccno()==Acn){
                                           Ac[i]->display();
                                           break;
                                   }
                        }
                break;
            }
            case 3:{
                        cout<<"\nenter the account number: ";
                        int Acn;
                        cin>>Acn;
                        for(int i=0;i<count;i++){
                               if(Ac[i]->getaccno()==Acn){
                                        Ac[i]->withdraw();
                                        break;
                               }
                       }
                break;
       }
             case 4:{
                        cout<<"\nenter the account number: ";
                        int Acn;
                        cin>>Acn;
                        for(int i=0;i<count;i++){
                               if(Ac[i]->getaccno()==Acn){
                                       Ac[i]->deposit();
                                       break;
                               }
                        }
                        break;
            }
             case 5:{
                       cout<<"\nenter the account number: ";
                       int Acn;
                       cin>>Acn;
                        for(int i=0;i<count;i++){
                               if(Ac[i]->getaccno()==Acn){
                                       Ac[i]=NULL;
                                       break;
                               }
                        }
                        break;

                }
            case 0:{
                for(int i=0;i<count;i++){
                        delete Ac[i];
                }
                flag=false;
                break;
            }
        }
        }
        return 0;
}



