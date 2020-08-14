//Pairwise swap elements in linked list
// Given a linked list, write a program to swap elements pairwise. If the list is empty, print "List is empty".
// Input Format

// The input consists of a list of integers, negative value indicates the end of the linked list.

// Output Format

// The output should be numbers in the list in separate line.

// Refer the sample input & output for formatting specifications.

// Sample Input

// 10

// 20

// 20

// 10

// -30

// Sample Output

// 20

// 10

// 10

// 20

// Case 1
// Input (stdin)
// 10
// 20
// 20
// 10
// -30

// Output (stdout)
// 20
// 10
// 10
// 20
#include<iostream>
using namespace std;
class node {
public:
  node*next = NULL;
  int data;
};
int main()
{
  node * head = NULL;
  node*prev = NULL;
  while(true)
  {
    int temp;
    cin >> temp;
    if(temp<0)
      break;
    node * newnode = new node();
    newnode->data = temp;
    if (prev == NULL)
    {
      head = newnode;
      prev = head;
    }
    else
    {
      prev->next = newnode;
      prev = newnode;
    }
  }
  node* temp = head;
  if(head==NULL)
  {
    cout<<"List is empty"<<endl;
  }
  while(temp!=NULL && temp->next!=NULL)
  {
    int d = temp->data;
    temp->data = (temp->next)->data;
    (temp->next)->data = d;
    temp = (temp->next)->next;
  }
  temp = head;
  while(temp!=NULL)
  {
    cout<<temp->data<<endl;
    temp = temp->next;
  }
  return 0;
}