#include<iostream>
using namespace std;
int power(int base, int a) ;
int main()
{
  //Type your code here.
  int a,n,ans;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;  
  
  ans=power(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<ans;
  
}
int power(int base, int a) {
    if (a != 0)
        return (base * power(base, a - 1));
    else
        return 1;
} 