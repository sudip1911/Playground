#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char arr[200];
  int v,c,w,d,s;
  v=c=w=d=s=0;
  cin.getline(arr,200);
  
  for(int i=0;i<strlen(arr);i++)
  {
    if(arr[i]=='A' ||arr[i]=='E' ||arr[i]=='I' ||arr[i]=='O' ||arr[i]=='U' ||arr[i]=='a' ||arr[i]=='e' ||arr[i]=='o' ||arr[i]=='i' ||arr[i]=='u')
    		v=v+1;
    else if( (arr[i] >= 'A' && arr[i]<='Z' ) || (arr[i] >= 'a' && arr[i]<='z' ) )
      		c=c+1;
    else if(arr[i] == ' ')
      		w=w+1;
    else if(arr[i]>='0' & arr[i]<='9')
      		d=d+1;
    else
      		s=s+1;
  }
  cout<<"Vowels:"<<v<<endl;
  cout<<"Consonants:"<<c<<endl;
  cout<<"White Spaces:"<<w<<endl;
  cout<<"Digits:"<<d<<endl;
  cout<<"Symbols:"<<s<<endl;
  
}