#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char arr[200],ans[200];
  cin.getline(arr,200);
	int j=0;
  for(int i=0;i<strlen(arr);i++ )
  {
    	if( (arr[i] >='A' && arr[i] <='Z') || (arr[i] >='a' && arr[i] <='z')  )
        {
          	ans[j]=arr[i];
          	j++;
        }  
  }  
  cout<<ans;
}