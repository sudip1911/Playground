#include<iostream>
using namespace std;
struct employee
{
  char name[20],designation[30];
  int id,age;
  float sal;
};
int main()
{
  employee obj1;
  //Type your code here.
  cout<<"Enter name:"<<endl;
  cin>>obj1.name;
  cout<<"Enter ID:"<<endl;
  cin>>obj1.id;
  cout<<"Enter age:"<<endl;
  cin>>obj1.age;
  cout<<"Enter designation:"<<endl;
  cin>>obj1.designation;
  cout<<"Enter Salary:"<<endl;
  cin>>obj1.sal;
  
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<obj1.name<<endl;
  cout<<"ID of the Employee : "<<obj1.id<<endl;
  cout<<"Age of the Employee : "<<obj1.age<<endl;
  cout<<"Designation of the Employee : "<<obj1.designation<<endl;
  cout<<"Salary of the Employee : "<<obj1.sal<<endl;
  
  return 0;
}