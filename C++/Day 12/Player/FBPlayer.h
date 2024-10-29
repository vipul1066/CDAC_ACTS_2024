#include "Player.h"

class FBPlayer:public Player {
	private:
		int goals;
	public:
	FBPlayer();
	FBPlayer(string name,int age,int goals);
	void Accept();
	void Display();
};	
