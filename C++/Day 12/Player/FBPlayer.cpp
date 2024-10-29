#include "FBPlayer.h"
#include<iostream>
using namespace std;
FBPlayer::FBPlayer():goals(0){
	cout<<"FBPlayer::FBPlayer()"<<endl;
}
FBPlayer::FBPlayer(string name, int age, int goals):Player(name,age),goals(goals){
	cout<<"FBPlayer::FBPlayer(name,age,goals)"<<endl;
}

void FBPlayer::Accept(){
	Player::Accept();
	cout<<"Enter goals: ";
	cin>>goals;
}

void FBPlayer::Display(){
	Player::Display();
	cout<<"Goals are: "<<goals<<endl;
}
