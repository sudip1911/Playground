#include<iostream>
using namespace std;
int main()
{
int r, c, i, j;
cin >> r >> c;
int a[r][c], b[r][c], d[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
std::cin>>a[i][j];
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
std::cin>>b[i][j];
}
for(i = 0; i < r; i++)
{
for(j = 0; j < c; j++)
{
d[i][j] = a[i][j] + b[i][j];
std::cout<<d[i][j]<<" ";
}
std::cout<<endl;
}
}
