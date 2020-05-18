#include<iostream>
int main()
{
  // Type your code here
  long int num,temp,count=0;
  
  std::cin>>num;
  temp=num;
  do{
    count=count+1;
    temp=temp/10;  
  }while(temp >0);
    
  std::cout<<count;
  return 0;
}