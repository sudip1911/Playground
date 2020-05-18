#include<iostream>
using namespace std;
struct convert
{
  int inch;
  float feet;
}obj1,obj2,obj3;  
int main()
{
  //Type your code here.
  cin>>obj1.inch>>obj1.feet>>obj2.inch>>obj2.feet;
  
  if( (obj1.feet + obj2.feet) > 10.0 )
  {
    	obj3.inch=obj1.inch + obj2.inch +1;
    	obj3.feet = obj1.feet + obj2.feet - 12 ; 
  }
  else
  {
    	obj3.inch=obj1.inch + obj2.inch;
    	obj3.feet = obj1.feet + obj2.feet;
  }
  cout<<obj3.inch<<"\'-"<<obj3.feet<<"\"";
}