#include<iostream>
using namespace std;

int main()
{
    //fill your code
    int n;
    cout<<"Enter the number of elements in the array";
    cin >> n;
    int arr[n];
    cout<<"\nEnter the elements in the array";
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int i;
    int odd = 0, even = 0;
    for(i = 0; i < n; i++)
    {
        if(arr[i] % 2 == 1)
            odd++;
        if(arr[i] % 2 == 0)
            even++;
    }
    if(odd == n)
        cout <<"\nThe array is Odd";
    else if(even == n)
        cout <<"\nThe array is Even";
    else
        cout <<"\nThe array is Mixed";
    return 0;
}