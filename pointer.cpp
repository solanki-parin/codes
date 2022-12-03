#include<iostream>
using namespace std;

int main()
{
    int a=206;
    int *p;//pointer int *p=&a;
    p=&a;//storing address
    
    //*p=8 //changing the value at the address
    cout<<*p;
    cout<<endl<<&a;
    cout<<endl<<a;
    *p=8; //changing the value at the address,dereferencing
    cout<<endl<<*p;
    cout<<endl<<&a;//prints address
    cout<<endl<<a;
    int b=20;
    *p=b;//only value change not the address
    //p=p+1 it will point the address of next integer it will skip remaining int bytes(4)
    /*cout<<"\n\n"<<*(p+1); 
    void *p0;
    p0=p;
    cout<<"\naddress=="<<p0;
    //cout<<"\nvalue=="<<&p0;
    */
   int **q;
   q=&p;
   cout<<"\n"<<p;
   cout<<"\n"<<*p;
   cout<<"\n"<<*q;
   cout<<"\n"<<**q;
    int i=1;
    cout<<"\n\ni="<<&i;//add & at any variable to print the addresss of that
    return 0;

}