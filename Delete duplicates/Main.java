// Delete duplicates
// Write a program to remove the duplicate elements in a linked list.
// Input Format

// The input consists of a list of integers, negative value indicates the end of the linked list.

// Output Format

// The output should be numbers in the list in separate line.

// Refer the sample input & output for formatting specifications.

// Sample Input

// 1

// 2

// 3

// 3

// 2

// 1

// -5

// Sample Output

// Linked list before removal of duplicates

// 1

// 2

// 3

// 3

// 2

// 1

// Linked list after removal of duplicates

// 1

// 2

// 3

// Case 1
// Case 2
// Input (stdin)
// 1
// 2
// 3
// 3
// 2
// 1
// -5

// Output (stdout)
// Linked list before removal of duplicates
// 1
// 2
// 3
// 3
// 2
// 1
// Linked list after removal of duplicates
// 1
// 2
// 3
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
};
void insert_in(node**root)
{
	int temp;
	cin >> temp;
	node *pre = NULL;
	unordered_set<int>s;
	while (temp >= 0)
	{
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
			pre = newNode;
		}
		cin >> temp;
	}
}
int main()
{
	node * root = NULL;
	insert_in(&root);
	node * temp = root;
	cout << "Linked list before removal of duplicates" << endl;
	while (temp != NULL)
	{
		cout << temp->value << endl;
		temp = temp->next;
	}
	unordered_set<int>s;
	cout << "Linked list after removal of duplicates" << endl;
	node *pre = NULL;
	temp = root;
	while (temp != NULL)
	{
		if (s.count(temp->value) == 0)
		{
			s.insert(temp->value);
			//cout << s.size();
			pre = temp;
			temp = temp->next;
		}
		else
		{
			temp = temp->next;
			pre->next = temp;
		}

	}
	temp = root;
	while (temp != NULL)
	{
		cout << temp->value << endl;
		temp = temp->next;
	}

	return 0;
}