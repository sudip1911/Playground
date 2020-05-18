#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,arr[20],loc,val;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
    	cin>>arr[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>loc;
  
  if(loc <= n)
  {  
    cout<<"Enter the value to insert"<<endl;
    cin>>val;
    n++;
    for(int i=n;i>=loc;i--)
    {
      	arr[i]=arr[i-1];
    }
    arr[loc-1]=val;
    cout<<"Array after insertion is"<<endl;
    for(int i=0;i<n;i++)
    {
      cout<<arr[i]<<endl;
    }  
  }
  else{
    	cout<<"Invalid Input";
  }
  
}