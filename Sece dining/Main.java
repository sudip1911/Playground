#include<iostream>
using namespace std;
int main(){
  
  string str;
  int n;
  cin>>str>>n;
  if(str=="front")
  {
    if(n==1)
      	cout<<"Left Handed";
    else
      	cout<<"Right Handed";
  }
  else
  {
    if(n==1)
      	cout<<"Right Handed";
    else
      	cout<<"Left Handed";
  }  
}