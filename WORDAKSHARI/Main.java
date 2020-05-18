#include<iostream>
using namespace std;
int main()
{
  string s;
  char prev,x;
  cin>>s;
  prev = s.back();
  cout<<s<<endl;
  while(s != "####") {
   cin>>s;
    if(s.front() == prev) {
      cout<<s<<endl;
      prev = s.back();
    }
  }
}