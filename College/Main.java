#include<iostream>
#include <bits/stdc++.h>
#include<string.h>
using namespace std;
struct Student
{
char name[30];
char city[20];
int year;
float per;
}s[10];
int main()
{
//Type your code here.
struct Student t;
int n;
cout<<"Enter the number of colleges"<<endl;
cin>>n;
for(int i=0;i<n;i++)
{
cout<<"Enter the details of college "<<i+1<<endl;
cout<<"Enter name"<<endl;
cin>>s[i].name;
cout<<"Enter city"<<endl;
cin>>s[i].city;
cout<<"Enter year of establishment"<<endl;
cin>>s[i].year;
cout<<"Enter pass percentage"<<endl;
cin>>s[i].per;
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(strcmp(s[i].name,s[j].name)>0)
{
t=s[i];
s[i]=s[j];
s[j]=t;
}
}
}
cout<<"Details of colleges"<<endl;
for(int i=0;i<n;i++)
{
cout<<"College:"<<i+1<<endl;
cout<<"Name:"<<s[i].name<<endl;
cout<<"City:"<<s[i].city<<endl;
cout<<"Year of establishment:"<<s[i].year<<endl;
cout<<"Pass percentage:"<<s[i].per<<endl;
}
return 0;
}