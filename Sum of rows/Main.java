#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m;
  cin>>n;
  int arr[m][n];
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>arr[i][j];
    }  
  }
  for(int i=0;i<m;i++)
  {
    int sum=0;
    for(int j=0;j<n;j++)
    {
			sum=sum+arr[i][j];
    }
    cout<<sum<<endl;
  }
  
  
}