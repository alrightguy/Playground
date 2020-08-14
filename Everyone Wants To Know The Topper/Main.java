#include<iostream>
using namespace std;
int main()
{
  int n;
    cin>>n;
    int i;
    int temp1,m=-1;
    for(i=0;i<n;i++)
    {
    	cin>>temp1;
    	if(temp1>m)
    		m = temp1;

    }
    cout<<m<<endl;
}