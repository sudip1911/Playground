#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x,ans;
  cin>>x;
  
    if(x < 0) return -1;
    if(x == 0 || x == 1) return x;

    int lowerbound = 1;
    int upperbound = x;
    int root = lowerbound + (upperbound - lowerbound)/2;

    while(root > x/root || root+1 <= x/(root+1)){
        if(root > x/root){
            upperbound = root;
        } else {
            lowerbound = root;
        }
        root = lowerbound + (upperbound - lowerbound)/2;
    }
  ans=x+ceil(root)+1;
  cout<<ans;
}