//Append without duplicates
// John assigned a roll number to each student in ascending order. Every time he assigns a number to a student he wants to check whether the number is already assigned to any other student to avoid the duplicates in the roll number. Add the number to the list only if the number is not present already. Implement this concept using a Linked List. If the list is empty, print "List is empty".
// Input Format

// The input consists of a list of integers, negative value indicates the end of the linked list.

// Output Format

// The output should be numbers in the list in separate line.

// Refer the sample input & output for formatting specifications.

// Sample Input

// 11

// 22

// 33

// 22

// 33

// 44

// -77

// Sample Output

// 11

// 22

// 33

// 44

// Case 1
// Case 2
// Input (stdin)
// -5

// Output (stdout)
// List is empty
#include<bits/stdc++.h>
using namespace std;
#define pb push_back
#define mp make_pair
#define f first
#define s second
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
typedef long long int ll;
class node {
public:
	int value;
	node*next = NULL;
	node *prev = NULL;
};
void insert_in(node**root)
{
	int temp;
	cin >> temp;
	node *pre = NULL;
  unordered_set<int>s;
	while (temp >= 0)
	{
        
        if(s.count(temp)==0)
        {
          s.insert(temp);
		node *newNode = new node();
		newNode->value = temp;
		if (*root == NULL)
		{
			*root = newNode;
			pre = (*root);
		}
		else
		{
			pre->next = newNode;
			newNode->prev = pre;
			pre = newNode;
		}
        }
		cin >> temp;
	}
}
int main()
{
	node * root = NULL;
	insert_in(&root);
	node * temp = root;
    if(temp!=NULL){
		while (temp != NULL)
		{
			cout << temp->value <<endl;
			temp = temp->next;
		}
    }
  else
  {
    cout<<"List is empty"<<endl;
    
  }
	return 0;
}