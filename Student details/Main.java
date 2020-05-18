#include <iostream>
#include <string.h>
#include<math.h>
using namespace std;
struct Student
{
char name[30];
char department[20];
int yearOfStudy;
float cgpa;
};
int main()
{
struct Student t;
int i = 0,j =0,n;
cout<<"Enter the number of students"<<endl;
cin>>n;
struct Student S1[n];
for(int i=0;i<n;i++)
{
cout<<"Enter the details of student "<<i+1<<endl;
cout<<"Enter name"<<endl;
cin>>S1[i].name;
cout<<"Enter department"<<endl;
cin>>S1[i].department;
cout<<"Enter year of study"<<endl;
cin>>S1[i].yearOfStudy;
cout<<"Enter cgpa"<<endl;
cin>>S1[i].cgpa;
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(strcmp(S1[i].name,S1[j].name)>0)
{
t=S1[i];
S1[i]=S1[j];
S1[j]=t;
}
}
}
cout<<"Details of students"<<endl;
for(int i=0;i<n;i++)
{
cout<<"Student "<<i+1<<endl;
cout<<"Name:"<<S1[i].name<<endl;
cout<<"Department:"<<S1[i].department<<endl;
cout<<"Year of study:"<<S1[i].yearOfStudy<<endl;
cout<<"CGPA:"<<S1[i].cgpa<<endl;
}
return 0;
}
