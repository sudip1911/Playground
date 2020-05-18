#include<iostream>
using namespace std;
int main()
{
 int n,a=0;
  cin>>n;
  cout<<n<<"\n";
 
  do
  {
     if(n==1)
     break;
   
     
    else if(n%2==0)
    {
      n=n/2;
      cout<<n<<"\n";
      a++;
    }
    else
    {
      n=3*n+1;
      cout<<n<<"\n";
      a++;
    }
  }
    while(n>1);
  cout<<a;
    
}