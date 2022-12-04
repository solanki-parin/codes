#include<iostream>
using namespace std;
int main()
{
    char *ch[20]={"hello","world","working but warnings ahead"};
    int i;
    for(i=0;i<3;i++)
    {
        cout<<"\n"<<ch[i];
    }
}