#include<iostream>
#include<cmath>
using namespace std;

main()
{
    double n=1.0,r=0.11,P=1000.0,V,R,R1;
    int i;
    for(i=0;i<10;i++)
    {
        R=(1.0+r);
        R1=pow(R,n);
        V=P*R1;
        cout<<"\nthe equation is "<<V;
        //cout<<"\n"<<P<<"\n"<<r<<"\n"<<n;
        P+=1000.0;
        r+=0.01;
        n+=1.0;
        V=P*(1.0+r);
        P=V;

    }
    return 0;
}