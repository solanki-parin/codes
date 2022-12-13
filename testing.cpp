#include<iostream>
#include<cmath>
#include<vector>
#include<map>
#include<array>
#include <algorithm>
#include<random>
using namespace std;



int main()
{   
    vector<int> a={1,2,9,4,5};
    vector<vector<vector<int>>>v2;
    vector<int>::iterator it;
    map<char,int>mymap;
    mymap['a']=100;
    //cout<<mymap['a'];
    array<int,5>b{1,2,3,4,5};

    /*for(auto i:a)
    {
        cout<<i;
    }
    for(int i=0;i < a.size();i++)
    {

    }
    for(it=a.begin();it!=a.end();it++)
    {
        cout<<*it;
    }*/
    /*vector<int> v;
        int sum (0);
        for (int i=1;i<=10;i++) v.push_back(i);//create and initialize the vector
        while (!v.empty())//loop through until the vector tests to be empty
        {
        sum += v.back();//keep a running total
        v.pop_back();//pop out the element which removes it from the vector
        }
        std::cout << "total: " << sum << '\n';//output the total to the user
    */
    /*vector< char > v {'0','1'};
    do
    {
        for( int i = 0; i < v.size(); i += 1 )
        {
        cout << v[i];
        }
        cout << endl;

    }while(next_permutation( v.begin(), v.end() ) );
    */  
        random_device crypto_random_generator;
        uniform_int_distribution<int> int_distribution(0,9);

        int actual_distribution[10] = {0,0,0,0,0,0,0,0,0,0};

        for(int i = 0; i < 10000; i++) {
        int result = int_distribution(crypto_random_generator);
        actual_distribution[result]++;
        }
        for(int i = 0; i < 10; i++) {
        cout << actual_distribution[i] << " ";
        }

    return 0;
}