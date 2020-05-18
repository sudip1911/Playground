#include<iostream>
using namespace std;
int main()
{
int n,i,x,temp;
std::cin>>n;
x=6;
std::cout<<x<<" ";
temp=x;
for(i=1;i<n;i++)
{
temp=temp+(5*i);
std::cout<<temp<<" ";
}
}
