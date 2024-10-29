#include "Player.h"

class CktPlayer: public Player{
	private:
		int runs;
	public:
	CktPlayer();
	CktPlayer(string name,int age,int runs);
	void Accept();
	void Display();
};	
