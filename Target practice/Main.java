#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
	int target,sum=0,num,count=0;
  	cin>>target;
  	
  	while(sum <target)
    {
      	cin>>num;
      	sum=sum+num;
      	count=count+1;
    } 
  	cout<<"The number of turns is "<<count;
}