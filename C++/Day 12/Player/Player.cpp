#include "Player.h"
#include<iostream>
using namespace std;

        Player::Player():name(" "),age(0){
	cout<<"Player::Player()"<<endl;
	}
	Player::Player(string name,int age):name(name),age(age){
		cout<<"Player::Player(string,name)"<<endl;
	}
	void Player:: Accept(){
		cout<<"Enter name of player: ";
		cin>>name;
		cout<<"Enter age of Player: ";
		cin>>age;
	}
	void Player:: Display(){
		cout<<"The name of player is: "<<name<<endl;
		cout<<"The age is: "<<age<<endl;
	}
