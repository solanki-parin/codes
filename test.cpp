#include<iostream>
using namespace std;
namespace fr
{
    class A
    {
        public:
        void fun()
        {
            cout<<"function in namespace\n";
        }
    };
}
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
    int* d=new int;
    fr::A nm;
    nm.fun();
    A a,b,c;
    a.disp();
    //b.disp();
    //c.disp();
    int i (1);
    cout<<"i="<<i<<endl;
    cout<<a.a<<endl;
    cout<<b.a<<endl;
    cout<<c.a<<endl;
    
    return 0;
}