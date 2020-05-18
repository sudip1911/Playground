#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,n;
  cin>>a>>b>>n;
  if(a > 0)
  {
    if(n < b)
      	cout<<"Yes";
    else
    {
      if(n % b ==1 || n %b ==0)
        	cout<<"Yes";
      else
        	cout<<"No";
    }
  }
  else
  {
    if(n % b ==1 || n %b ==0)
        	cout<<"Yes";
      else
        	cout<<"No";
  }  
    
  
}