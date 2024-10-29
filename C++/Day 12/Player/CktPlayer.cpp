#include "CktPlayer.h"
#include<iostream>
using namespace std;

CktPlayer::CktPlayer():runs(0){
	cout<<"CktPlayer::CktPlayer()"<<endl;
}
CktPlayer::CktPlayer(string name, int age,int runs):Player(name,age),runs(runs){
	cout<<"CktPlayer::CktPlayer(string,int,int)"<<endl;
}
void CktPlayer::Accept(){
/*	cout<<"Enter name: ";
	cin>>name;
	cout<<"Enter age: ";
	cin>>age;
*/
	Player::Accept();
	cout<<"Enter Runs: ";
	cin>>runs;
}

void CktPlayer::Display(){
/*	cout<<"The name of player: "<<name<<endl;
	cout<<"The age of Player: "<<age<<endl;
*/
	Player::Display();
	cout<<"The Runs are: " <<runs<<endl;
}
