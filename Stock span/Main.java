#include<iostream>
using namespace std;
void stockSpan(int n, int *p){
int s=0;
cout<<1<<endl;
for(int i=1;i<n;i++){
if(p[i]>p[i-1]){
s+=2;
cout<<s<<endl;
}
else
cout<<1<<endl;
}
}
int main()
{
int n;
cin>>n;
int price[n];
for(int i=0;i<n;i++)
{
cin>>price[i];
}
//Type your code here.
stockSpan(n,price);
}
