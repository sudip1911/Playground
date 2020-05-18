#include<iostream>
using namespace std;
int hcf(int n1, int n2);
int main()
{
  //Type your code here.
  int num1,num2,ans;
  cin>>num1;
  cin>>num2;
  ans=hcf(num1,num2);
  cout<<"G.C.D of "<<num1<<" and "<<num2<<" = "<<ans;
}
int hcf(int n1, int n2) {
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;
}