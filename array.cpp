#include<iostream>
using namespace std;

int fun(int* a)//fun(int a[])no pointer
{
    int i,sum=0;
    for(i=0;i<5;i++)
    {
    cout<<a[i];
    sum+=a[i];
    }
    
    return sum;
    
}
int main()
{
    int res;
    int a[5],i;
    for(i=0;i<5;i++)
    cin>>a[i];
    res=fun(a);
    cout<<"\nthe sum is "<<res;
    return 0;

}