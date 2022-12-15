#include<iostream>
using namespace std;
class shape
{
    public:
    static double h,w;
    
    void getdata()
    {
        
        cout<<"\nenter height:";
        cin>>h;
        cout<<"\nenter width:";
        cin>>w;
        
        //cout<<"\np="<<*p;
    }
    virtual void display_area()
    {
        cout<<"\nthe area is x*y for rectangle and 1/2*x*y for triangle";
    }
};
double shape::h;
double shape::w;




class rectan:public shape
{
    
    public:
    void display_area()
    {
        double res1=(shape::h)*(shape::w);
        cout<<"\nheight="<<shape::h<<"\nwidth="<<shape::w;
        cout<<"\nthe area of rectangle is "<<res1;
    }
}; 
class triagle:public shape
{
    
    public:
    void display_area()
    {   
        double res=(shape::h)*(shape::w)*(1.0/2.0);
        cout<<"\nheight="<<shape::h<<"\nwidth="<<shape::w;
        cout<<"\nthe area of triagle is "<<res;
    }
}; 
int main()
{
    shape S,*s;
    rectan R;
    triagle T;

    cout<<"\nbase class";
    S.getdata();
    s=&S;
    s->display_area();
    cout<<"\nderieved1 class";
    s=&R;
    s->display_area();
    cout<<"\nderieved2 class";
    s=&T;
    s->display_area();
    
    
    return 0;
}
