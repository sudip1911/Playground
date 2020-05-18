#include<iostream>
using namespace std;

int main(){
  int n;
  float t,ft;
  cin>>n>>t;
  
  switch(n)
  {
    case 1:
      		ft=t;
      		cout<<ft;
      		break;
    case 2:
      		ft=t+ 0.50*t;
      		cout<<ft;
      		break;
      case 3:
      		ft=2*t;
      		cout<<ft;
      		break;
    default:
      		cout<<"Number of items is more";
  }  
}