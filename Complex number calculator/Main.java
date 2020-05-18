#include<iostream>
using namespace std;
struct complex{
  int real;
  int img;
};

int main(){
  
  complex obj1,obj2;
  int choice;
  cin>>choice;
  cin>>obj1.real;
  cin>>obj1.img;
  cin>>obj2.real;
  cin>>obj2.img;
  switch(choice)
  {
    case 1:
      		cout<<(obj1.real+obj2.real)<<"+"<<(obj1.img+obj2.img)<<"i";
      		break;
    case 2:
      		cout<<(obj1.real-obj2.real)<<"+"<<(obj1.img-obj2.img)<<"i";
      		break;
    case 3:
      		cout<<( (obj1.real*obj2.real) - (obj1.img*obj2.img) )<<( (obj1.real*obj2.img) + (obj2.real*obj1.img) )<<"i";
      		break;  
    default:
      		cout<<"Invalid choice";
  }
  return 0;
   
    
}