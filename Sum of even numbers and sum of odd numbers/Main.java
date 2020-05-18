#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,even=0,odd=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
    {
      even=even+a[i];
    }
    else
    {
      odd=odd+a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;
}