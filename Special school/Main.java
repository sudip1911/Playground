#include<iostream>
#include<cstring>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
	char arr1[50],arr2[50];
  	cin.getline(arr1,50);
  	cin.getline(arr2,50);
  
  	int count =strlen(arr1);
  	int flag=0;
 
  	for(int i=0,j=count-1;j>=0,i<count;j--,i++)
    {
      if(arr1[i]!=arr2[j])
      {  	flag=1;
      		break;
   	 	}
    } 
  	if(flag==0)
      	cout<<"It is correct";
  	else
      	cout<<"It is wrong";
}