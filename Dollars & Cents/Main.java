#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,dollar,cent;
  
  cin>>d1>>c1;
  cin>>d2>>c2;
  
  if( (c1 + c2)> 100)
  {
    	cent=c1+c2 -100;
    	dollar=d1+d2+1;
  }
  else
  {
    	cent=c1+c2;
    	dollar=d1+d2;
  }
  cout<<dollar<<endl;
  cout<<cent<<endl;
}