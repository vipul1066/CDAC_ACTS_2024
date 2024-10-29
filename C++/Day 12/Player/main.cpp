/* #include "Player.h"*/

#include "CktPlayer.h"
#include "FBPlayer.h"
#include<iostream>
using namespace std;

void Accept(Player* pp)
{
	pp->Accept();
}

void Display(Player& rp){
	rp.Display();
}
int main(){
	/*
	Player *pp=NULL;
	CktPlayer c;
	pp=&c;
	pp->Accept();
	pp->Display();
	*/

/*	
	Player p;
	p.Accept();
	p.Display();

	CktPlayer c("ajay",25,1000);
//	c.Accept();
	c.Display();

	FBPlayer f("akay",26,299);
	f.Display();
*/
	/*
	Player *pp=NULL;
	CktPlayer c;
	FBPlayer f;
	pp=&c;
	pp->Accept();
	pp->Display();

	pp=&f;
	pp->Accept();
	pp->Display();
	*/

	CktPlayer c;
	FBPlayer f;
	Accept(&c);
	Display(c);
	Accept(&f);
	Display(f);
	return 0;
}

