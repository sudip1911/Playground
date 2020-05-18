#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
   char text1[50],text2[50];
   cin.getline(text1,50);
   cin.getline(text2,50);
  
  if(strcmp(text1,text2))
    	cout<<"It is wrong";
  else
    	cout<<"It is correct";
}