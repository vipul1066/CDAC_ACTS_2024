#include<iostream>
#include<fstream>
using namespace std;

class MobilePhone{
	public:
		char serialNo[20];
	    char modelNo[20];
		char brandName[20];
		double price;

	public:
	void Accept()
{	
	cin.get();
	cout<<"\n Enter serial no:"<<endl;
	cin.getline(serialNo,20);
	cout<<"\n enter the model no:"<<endl;
	cin.getline(modelNo,20);
	cout<<"\n enter the brand name:"<<endl;
	cin.getline(brandName,20);
	cout<<"\n Enter its price:"<<endl;
	cin>>price;
}

void Display()
{
cout<<"\n serialNo:"<<serialNo<<"\t"<<"modelNo:"<<modelNo<<"\t"<<"brandName:"<<brandName<<"\t"<<"price:"<<price<<endl;
}
};

int main(){
	int count=0; 
	 MobilePhone arr[10];
	do{
	int n;
		cout<<"1. Add the mobile phone to file"<<endl;
		cout<<"2. Read all the mobile phones from file"<<endl;
		cout<<"3. read all mobile phns from file and display sorted by price"<<endl;
		cout<<"0. exit"<<endl;
		
		cout<<"enter your choice: "<<endl;
		cin>>n;
		if(n==0){
			exit(0);
		}
		char fname[100];
        cout<<"\n Enter filename:";
        cin>>fname;


		switch(n){
			case 1:
				{
				MobilePhone mp;
				ofstream fout(fname,ios::app);
				if(!fout){
					cout<<"\n file not found";
					return -1;
				}
				mp.Accept();
				fout.write((char*)&mp,sizeof(MobilePhone));
				count++;
				fout.close();
		} break;
			case 2:
				{
				ifstream fin(fname,ios::binary);
				if(!fin)
					{
					cout<<"\n File Not found"<<endl;
						return -1;
						}
				cout<<"\n Mobile records from file"<<endl;
				MobilePhone mp;
				int k=0;
				while(fin.read((char*)&mp,sizeof(MobilePhone)))
				{
				mp.Display();
				arr[k++]=mp;	
				}
				fin.close();
		}    
		break;

			case 3:
		{
			for(int i=0;i<count-1;i++){
				for(int j=i+1;j<count;j++){
					if(arr[i].price >arr[j].price){
						MobilePhone temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			for(int i=0;i<count;i++){
				arr[i].Display();
				cout<<endl;
			}
		}
		break;

		default:
		{
		cout<<"enter valid option"<<endl;
		break;
	}
	}
	}while(1);
		return 0;
}
