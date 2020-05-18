#include<iostream>
int fib(int n) 
{ 
    if (n <= 1) 
        return n;
    return fib(n-1) + fib(n-2); 
} 
int main()
{
  //Type your code here.
  int num;
  std::cin>>num;
  int ans=fib(num-1);
  std::cout<<"The term "<<num<<" in the fibonacci series is "<<ans;
  return 0;
}

