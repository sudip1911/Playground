#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int row,col;
  cin>>row>>col;
  int arr[row][col],rowsum[row],colsum[col];
  
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<row;j++)
      		cin>>arr[i][j];
  }
  
  for(int i=0;i<row;i++)
  {
    	int rsum=0;
    	int csum=0;
  		for(int j=0;j<row;j++)
        {
        	rsum=rsum+arr[i][j];
          	csum=csum+arr[j][i];
        }
    	rowsum[i]=rsum;
    	colsum[i]=csum;
  }
  	int pos,max=0;
 	cout<<"Sum of rows is ";
  	for(int i=0;i<row;i++){
    	cout<<rowsum[i]<<" ";
      	
      	if( rowsum[i] > max )
        {
            pos=i+1;
          	max=rowsum[i];          	
        }  
      
    	} 
  	cout<<endl;
  	cout<<"Row "<<pos<<" has maximum sum"<<endl;
  	cout<<"Sum of columns is ";	
  	int pos1=0,max1=0;
  	for(int i=0;i<col;i++)
    {	cout<<colsum[i]<<" ";
     	if( colsum[i] > max1 )
        {
            pos1=i+1;
          	max1=colsum[i];          	
        }
    }
  	cout<<endl;
  cout<<"Column "<<pos1<<" has maximum sum";
}