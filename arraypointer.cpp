#include<iostream>
using namespace std;
int main()
{
    int num[]={1,2,3,4,5};
    int i,*ptr;
    for(i=0;i<5;i++)
    {
        cout<<"\n "<<num[i];
    }
    ptr=num;
    cout<<"\n "<<*ptr;
    ptr++;
    cout<<"\n "<<*ptr;
    ptr--;
    cout<<"\n "<<*ptr;
    return 0;
}