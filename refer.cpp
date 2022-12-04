#include<iostream>
using namespace std;
#define pi 3.14;
int squarearea(int &);//returning the reference of the variable
int circlearea(int &);
int squarearea(int &a)
{
    return a;
}
int circlearea(int &r)
{
    float a;
     r=r*r*pi;
     
     return r;
}
int main()
{
    int a=10;
    cout<<"square area(a) "<<squarearea(a);
    cout<<"\ncircle area(a) "<<circlearea(a);
    return 0;

}

