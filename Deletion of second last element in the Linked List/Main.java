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
			newNode->prev = pre;
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
	if (temp != NULL)
	{
		while (temp->next != NULL)
			temp = temp->next;
	}
	if (temp == NULL || temp->prev == NULL)
	{
		cout << "Deletion of second last element is not possible" << endl;
		return 0;
	}
	else
	{
		node * t = (temp->prev)->prev;
		if (t != NULL)
		{
			t->next = (t->next)->next;
		}
		else
		{
			root = temp;
		}
		temp->prev = t;
		temp = root;
		while (temp != NULL)
		{
			cout << temp->value << " ";
			temp = temp->next;
		}
	}
	return 0;
}