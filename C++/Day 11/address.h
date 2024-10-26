#include<string>
using namespace std;
class Address
{
    private:
    string FlatNo;
    string Area;
    string Pin;
    public:
    Address();
    Address(string a,string b,string c);
    void Accept();
    void Display();
};
