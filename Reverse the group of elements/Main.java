//Reverse the group of elements
// Write a program to reverse a group of elements.
// Input Format

// The input consists of a list of integers, negative value indicates the end of the linked list.

// The last line consists of an integer to reverse the elements in group

// Output Format

// The output should be numbers in the list in separate line.

// Refer the sample input & output for formatting specifications.

// Sample Input

// 1

// 2

// 3

// 4

// 5

// 6

// -1

// 4

// Sample Output

// 4

// 3

// 2

// 1

// 6

// 5
#include<iostream>
using namespace std;
class node {
public:
  node*next = NULL;
  int data;
};
node * rev(node * head, int k)
{
  if (head == NULL)
    return NULL;
  int j = k;
  node * end = head;
  node * temp = head;
  node*prev = NULL;
  while (j-- && temp != NULL)
  {
    node * t = temp->next;
    temp->next = prev;
    prev = temp;
    temp = t;
  }
  //cout << "e data" << end->data << endl;
  //cout << temp->data << endl;
  end->next = rev(temp, k);
  //cout << prev->data << endl;
  return prev;
}
int main()
{
  node * head = NULL;
  node*prev = NULL;
  while (true)
  {
    int temp;
    cin >> temp;
    if (temp < 0)
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
  int k;
  cin >> k;
  head = rev(head, k);
  node * temp = head;
  while (temp != NULL)
  {
    cout << temp->data <<endl;
    temp = temp->next;
  }
  return 0;
}