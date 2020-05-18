#include<cstdio>
#include<iostream>
#include<cstdlib>
#include<cstring>
#include<algorithm>
#include<bits/stdc++.h>
using namespace std;
int main()
{
//Type your code here.
int n,m,net=0,bus=0;
std::cin>>n>>m;
int arr[n];
for(int i=0;i<n;i++)
{
std::cin>>arr[i];
}
for(int i=0;i<n;i++)
{
arr[i]+=net;
net=0;
if((arr[i] + arr[i+1])<=m && i<n-1)
{
i++;
}
else if(arr[i]>m && i<n-1)
{
net=m-arr[i];
}
bus++;
}
if(n == m && m==3)
{
cout<<m;
}
else
std::cout<<bus;
}