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
  for(int i=0;i<n;i++)
  {
    int max=arr[0][i];
    for(int j=1;j<m;j++)
    {
		if(arr[j][i] > max)
          	max=arr[j][i];
    }
    cout<<max<<endl;
  }
  
  
}