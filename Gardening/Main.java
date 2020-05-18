#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,col,tree,total=0;
  cin>>row>>col>>tree;
  total = row*col;
  if( (tree<= total - row && tree >= total - (2*row) ) ) 
  {
    cout<<"It is a mango tree";
  }
  else if(tree > row && tree <= 2*row)
    	cout<<"It is a mango tree";
  else
    	cout<<"It is not a mango tree";
}