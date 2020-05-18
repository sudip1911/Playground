#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun,mon,tue,wed,thu,fri,sat;
  int total_hr,extra,salary;
  cin>>sun;
  cin>>mon;
  cin>>tue;
  cin>>wed;
  cin>>thu;
  cin>>fri;
  cin>>sat;
  
  if(sun ==0 && sat ==0)
  {
  		total_hr=sun+mon+tue+wed+thu+fri+sat;
    	extra = (total_hr - 40 )*25;
  }
  else
  {
    	sat=(sat*100);
    	sat=sat + (sat*25/100);
    	sun=(sun*100);
    	sun=sun + (sun*50/100);
  }
  if(mon > 8)
  		mon=mon*100 + ( mon - 8 )*15;
  else
    	mon=mon*100;
  if(tue > 8)
  		tue=tue*100 + ( tue - 8 )*15;
  else
    	tue=tue*100;
   if(wed > 8)
  		wed=wed*100 + ( wed - 8 )*15;
  else
    	wed=wed*100;
   if(thu > 8)
  		thu=thu*100 + ( thu - 8 )*15;
  else
    	thu=thu*100;
    if(fri > 8)
  		fri=fri*100 + ( fri - 8 )*15;
  	else
    	fri=fri*100;
  
  	salary=sun+mon+tue+wed+thu+fri+sat;	
	cout<<salary;
  return 0;
}
