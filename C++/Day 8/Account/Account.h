class Account
{
    private:
	std::string name;
    int balance;
    static int cnt;
    int acc_no;
public:
        Account();
        Account(std::string ,int);
        int getaccno();
        void deposit();
        void withdraw();
	    void display();


};
