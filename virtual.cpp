#include<iostream>
using namespace std;
class shape
{
    public:
    double *h,*w;
    //double *x,*y;
    //x=&h;
    //y=&w;
    void getdata()
    {
        cout<<"\nenter x:";
        cin>>*h;
        cout<<"\nenter y:";
        cin>>*w;
       
    }
    virtual void display_area()
    {
        cout<<"\nthe area is x*y for rectangle and 1/2*x*y for triangle";
    }
};
class rectan:public shape
{
    //double res1=(h)*(w);
    public:
    void display_area()
    {
        
        cout<<"'nx="<<h<<"\ny="<<w;
      //  cout<<"\nthe area of rectangle is "<<res1;
    }
}; 
class triagle:public shape
{
    //double res=(h)*(w)*(1/2);
    public:
    void display_area()
    {
        cout<<"\nx="<<h<<"\ny="<<w;
        //cout<<"\nthe area of triagle is "<<res;
    }
}; 
int main()
{
    shape S,*s;
    rectan R;
    triagle T;

    cout<<"\nbase class";
    S.getdata();
    S.display_area();
    //S=R;
    R.display_area();
    /*s=&S;
    s->getdata();
    s->display_area();
    cout<<"\nderieved1 class";
    s=&R;
    s->display_area();
    cout<<"\nderieved2 class";
    s=&T;
    s->display_area();
    */
    return 0;
}
