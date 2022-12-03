#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int m,n,i,j;
    int row[m],col[n];
    int data[m*n];
    cout<<"enter rows:";
    cin>>m;
    cout<<"\ncolumns:";
    cin>>n;
    cout<<"\nenter data:";
    for(i=0;i<(m*n);i++)
    {
        cin>>data[i];
    }
   
    for(i=0;i<(m*n);i++)
    {
        if(i%n==0)
        {
            cout<<endl;
        }
    cout<<data[i]<<" ";
    }

}