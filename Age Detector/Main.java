#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy,age;
  
  cin>>by;
  cin>>cy;
  
  if(cy<=00)
  {
    if(cy==00)
    {
      age=100-by;
    }
    else
      	age=cy-by;
  }
  else
  {
    if(by > cy)
		age=cy+(100-by);
    else
      	age=cy-by;
  }  
  cout<<age;
}