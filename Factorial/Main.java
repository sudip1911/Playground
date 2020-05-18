#include<iostream>
using namespace std;
int recursive(int );
int main()
{
  //Type your code here.
  int num;
  cin>>num;
  int ans=recursive(num);
  cout<<"The factorial of "<<num<<" is "<<ans;
    
}
int recursive(int num)
  {
    	if(num ==1 || num==0)
          		return 1;
        else  
         return num*recursive(num-1); 
  }