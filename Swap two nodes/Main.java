// Swap two nodes
// Given a linked list and two values p and q, write a function to swap nodes containing the two values (i.e., p and q). Note that nodes should be swapped by changing the links, and any change in data of the nodes is not allowed.
// For example:

// If the following is the given linked list.

// 10->20->30->40->50

// And p=20, q=40. Then, the resultant linked list should be:

// 10->40->30->20->50

// Function Specification:

// void swapNodes (Node **head_ref, int p, intq);

// This function should swap nodes containing two given values (i.e., p and q)

// Input Format

// The input is being fetched from command line arguments. First argument is the number of nodes in the linked list followed by the arguments representing values of nodes in the list, and last two arguments are p and q.

// Output Format

// Correct Solution will be printed if the solution is correct, otherwise Incorrect Solution will be printed.

// Refer the Sample output for formatting

// Sample Input:

// 5

// 10 20 30 40 50

// 20

// 40

// Sample Output:

// 10 40 30 20 50

// Case 1
// Input (stdin)
// 5
// 10 20 30 40 50
// 20
// 40

// Output (stdout)
// 10 40 30 20 50
#include<iostream>
using namespace std;
class node{
  public:
  node*next=NULL;
  int data;
};
int main()
{
  int n,i;
  cin>>n;
  node * head=NULL;
  node*prev=NULL;
  for(i = 0;i<n;i++)
  {
    int temp;
    cin>>temp;
     node * newnode = new node();
     newnode->data = temp;
    if(prev==NULL)
    {
      head = newnode;
      prev = head;
    }
    else
    {
      prev->next = newnode;
      prev= newnode;
    }
  }
  int a,b;
  cin>>a>>b;
  node*prev1=NULL;
  node*prev2=NULL;
  node * temp = head;
  node * p = NULL;
  while(temp!=NULL && (temp->data!=a))
  {
    p = temp;
    temp = temp->next;
  }
  if(temp!=NULL && temp->data==a)
  {
    prev1 = p;
  }
  temp = head;
  while(temp!=NULL && (temp->data!=b))
  {
    p = temp;
    temp = temp->next;
  }
  if(temp!=NULL && temp->data==b)
  {
    prev2 = p;
  }
  node * t1 = NULL;
  if(prev1!=NULL && prev2!=NULL)
  {
   t1 = prev1->next;
  prev1->next = prev2->next;
  prev2->next = t1;
  
  t1 = (prev1->next)->next;
  (prev1->next)->next = (prev2->next)->next;
  (prev2->next)->next = t1;
  }
  else
  {
    node * h;
    node *op;
    if(prev1==NULL)
    {
       h = head;
       op = prev2;
    }
    else
    {
      h = head;
      op = prev1;
    }
    head = op->next;
    op->next = h;
    node * t2 =  head->next;
    head->next = (op->next)->next;
    (op->next)->next  = t2;
  }
  t1 = head;
  while(t1!=NULL)
  {
    cout<<t1->data<<" ";
    t1 = t1->next;
  }
  return 0;
}