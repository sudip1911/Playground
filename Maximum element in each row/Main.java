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
    int max=0;
    for(int j=0;j<n;j++)
    {
		if(arr[i][j] > max)
          	max=arr[i][j];
    }
    cout<<max<<endl;
  }
  
  
}