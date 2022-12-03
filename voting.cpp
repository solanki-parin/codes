#include<iostream>
using namespace std;

int main()
{
    int cand[5]={0},i;
    int spb[5]={0};
    bool vote=true;
    char ch;

    while(vote)
    {
        cout<<"\nenter your vote:\nfor candidate 1 press 1\nfor candidate 2 press 2\nfor candidate 3 press 3\nfor candidate 4 press 4\nfor candidate 5 press 5\n";
        cin>>ch;
        switch (ch)
        {
        case '1':
            cand[0]++;
            if(cand[0]>5)
            {
                spb[0]++;
            }
            break;
        case '2':
            cand[1]++;
            if(cand[1]>5)
            {
                spb[1]++;
            }
            break;
        case '3':
            cand[2]++;
            if(cand[2]>5)
            {
                spb[2]++;
            }
            break;
        case '4':
            cand[3]++;
            if(cand[3]>5)
            {
                spb[3]++;
            }
            break;
        case '5':
            cand[4]++;
            if(cand[4]>5)
            {
                spb[4]++;
            }
            break;
        default:
        cout<<"\nsomething is wrong!!try again later";
            break;
        }
        char ch2;
        cout<<"\nvote again?y=yes\n";
        cin>>ch2;
        if(tolower(ch2)=='y')
            vote=true;
        else
            vote=false;
    }
    for(i=0;i<5;i++)
    {
        cout<<"\nvote for candidate  "<<i+1<<" is "<<cand[i]<<" and spoiled ballot is "<<spb[i];

    }
    return 0;
}