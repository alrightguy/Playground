#include <bits/stdc++.h>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
cin.getline(str,100);
stack<char>s;
for(i =0;str[i]!='\0';i++)
{
  s.push(str[i]);
}
  int k = 0;
while(s.empty()==false)
{
  rev[k++] = s.top();
  s.pop();
}
 rev[k]='\0'; 
std::cout<<rev;
}