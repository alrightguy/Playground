#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int nod = 0;
  	int temp = n;
  while(temp>0)
  {
    temp = temp/10;
    nod++;
  }
  temp = n;
  int sum = 0;
  while(temp>0)
  {
    int d = temp%10;
    sum += power(d,nod);
    temp = temp/10;
  }
  if(sum==n)
    return 1;
  else
    return 0;
  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}