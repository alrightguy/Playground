// Nth node from the end of the Linked List
// Write a program to find the nth node of a list from the end. If there is no nth node print "There is no nth node in the list", otherwise print the element at the nth node.
// Input Format

// The input consists of a list of integers, negative value indicates the end of the linked list.

// The last input denotes the value of 'n'

// Output Format

// Print the nth element from the end of the linked list

// Refer the sample input & output for formatting specifications.

// Sample Input 1

// 1

// -1

// 3

// Sample Output 1

// Enter the nth node:

// There is no nth node in the list

// Sample Input 2

// 1

// 2

// -1

// 1

// Sample Output 2

// Enter the nth node:

// 2 is the nth node element in the list

// Case 1
// Case 2
// Input (stdin)
// 1
// -1
// 3

// Output (stdout)
// Enter the nth node:
// There is no nth node in the list
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
	node *pre = NULL;
	while (true)
	{
        cin >> temp;
        if(temp<0)
          break;
		node *newNode = new node();
		newNode->value = temp;
		if ((*root) == NULL)
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
}

int main()
{
	node * root = NULL;
	insert_in(&root);
	int n;
	cout << "Enter the nth node:"<<endl;
	cin >> n;
	node * temp = root;
	if (temp != NULL)
	{
		while (temp->next != NULL)
			temp = temp->next;
	}
    else
    {
    cout << "There is no nth node in the list" ;
    return 0;
    }
    
	//cout << temp->value << endl;
	if (n<=0)
		cout << "There is no nth node in the list" ;
	else
	{
		int j;
		for (j = 1; temp != NULL && j < n; j++)
		{
			temp = temp->prev;
		}
		if (temp == NULL)
			cout << "There is no nth node in the list" ;
		else
			cout << (temp->value) << " is the nth node element in the list";

	}
	return 0;
}