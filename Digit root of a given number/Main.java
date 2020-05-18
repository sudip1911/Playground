#include<iostream>
using namespace std;
int main(){
  
  int num,temp,sum=0,ans=0;
  cin>>num;
 
  temp=num;
  while(temp!=0)
  {
    sum = sum + temp %10;
    temp=temp / 10;
  }
  while(sum !=0)
  {
    	ans=ans+ sum %10;
    	sum=sum/10;
  }  
  cout<<ans;
}