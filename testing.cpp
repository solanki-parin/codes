#include<iostream>
#include<cmath>
#include<string.h>
using namespace std;

class a
{
    static int b;
    int i;
    
};
int a::b;
class A
{
    public:
    int a=10;
    void disp()
    {
        a++;
    }
};
int  sum(int a)
{
    return a++;

}
int main()
{
    A x;
    x.disp();
    x.disp();
    int i=sum(x.a);
    cout<<x.a<<"\n"<<i;
   /*const char* c="abc";
   const char* d="abc";
    int k=strcmp(d,c);
    cout<<"res="<<k;*/
    /*float n=2,r=0.12,P=2000,V,R;
    int i;
    cout<<pow(1.12,2);*/
    /*int a[5];
    for(int i=1;i<0;i++)
    {
        cout<<a[i]<<endl;
    }*/
    //display(5);
    return 0;
}