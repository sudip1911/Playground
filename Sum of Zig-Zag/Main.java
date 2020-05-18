#include<iostream>
using namespace std;

int sumZigZag(int r, int c, int **arr){
  int sum = 0, x = 1;
  for(int i = 0; i < c; i++)
    sum += arr[0][i];
  for(int i = 0; i < c; i++)
    sum += arr[r - 1][i];
  r--;
  c--;
  while(true) {
    if(!(x < r && x < c))
      break;
    sum += arr[x][x];
    x++;
  }
  return sum;
}

int main() {
  int r,c,**arr;
  cin>>r>>c;
  arr = (int **)malloc(r * sizeof(int));
  for(int i = 0; i < r; i++)
    arr[i] = (int *)malloc(c*sizeof(int));
  
  for(int i = 0; i < r; i++)
    for(int j = 0; j < c; j++)
      cin>>arr[i][j];
  cout<<"Sum of Zig-Zag pattern is "<<sumZigZag(r,c,arr);
}