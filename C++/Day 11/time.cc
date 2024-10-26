#include <iostream>
using namespace std;
class Time {
private:
	int HR, MIN, SEC;
public:
	void setTime(int x, int y, int z)
	{
		HR = x;
		MIN = y;
		SEC = z;
	}
	void setTime(int x, int y)
	{
		HR=x;
		MIN=y;
		SEC=0;
	}
	void showTime()
	{
		cout << endl
			<< HR << ":" << MIN << ":" << SEC;
	}
	Time operator+(Time t)
	{
		Time temp;
		temp.SEC = SEC + t.SEC;
		temp.MIN = MIN + t.MIN;
		temp.HR = HR + t.HR;
		return (temp);
	}
	Time operator - (int y)
	{
		 Time temp;
                temp.SEC = SEC-y;
                temp.MIN = MIN-y;
                temp.HR = HR-y;
                return (temp);
	}

};

int main()
{
	Time t1, t2, t3;
	t1.setTime(5, 50, 30);
	t2.setTime(7, 20, 34);
	Time t4,t5,t6;
	t4.setTime(12,12);
	t5.setTime(10,10);
	t6=t4+t5;
	t6.showTime();
	t3 = t1 + t2;
	t3.showTime();
	return 0;
}

