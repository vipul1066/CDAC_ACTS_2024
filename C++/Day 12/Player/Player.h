#ifndef _player_h
#define _player_h
#include<string>
using namespace std;
class Player{
	private:
		string name;
		int age;
	public:
	Player();
	Player(string name,int age);
	virtual	void Accept();
	virtual void Display();
};
#endif
