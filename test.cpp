#include<iostream>
using namespace std;

class A
{
    
    public:
    int a;
    void disp()
    {   
        cin>>a;
        cout<<a<<endl;
    }
};

int main()
{
    A a,b,c;
    a.disp();
    //b.disp();
    //c.disp();
    
    cout<<a.a<<endl;
    cout<<b.a<<endl;
    cout<<c.a<<endl;
    
    return 0;
}