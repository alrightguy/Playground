// Permutations - All of Them
// "I'm not a fan of having kids memorize formulas, and I'm even less of a fan of pushing them to learn those formulas," says Mr. John, 7th grade Math teacher. Maybe he has got a point. He believes in teaching the logic rather than the formula. Anyway, we aren't here to weigh/debate about his opinions. All we gotta do is help Mr. John and his students by writing an algorithm that can calculate & print all the permutations of a given number in strictly sorted order. Remember, Mr. John is gonna use your algorithm to demonstrate permutations in his next class.
// Input Format

// The input consists of a string

// Output Format

// Print all the permutations of the given string

// Refer the sample output for formatting

// Sample Input:

// abc

// Sample Output:

// abc

// acb

// bac

// bca

// cab

// cba
#include<bits/stdc++.h>
using namespace std;
void print_all(string s,int i,string new_string)
{
    if(i==s.size())
        cout<<new_string<<endl;
    else
    {
        int j;
        for(j = i;j<s.size();j++)
        {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            print_all(s,i+1,new_string + s[i]);
        }
    }
}
int main()
{
    string s;
    cin>>s;
    sort(s.begin(),s.end());
    string new_string = "";
    print_all(s,0,new_string);
    return 0;
}