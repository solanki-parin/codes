#include<iostream>
using namespace std;

void incr(int *p)//(int &p)returning by reference
{
    *p+=1;//*p=(*p)+1;//p+=1;
}

int main() 
{
    int a=10;
    cout<<"a="<<a;
    cout<<"\na="<<&a;
    incr(&a);//incr(a);reference
    cout<<"\nafter a="<<a;
    cout<<"\nafter a="<<&a;
    return 0;
}