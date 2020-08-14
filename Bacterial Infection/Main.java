// Bacterial Infection
// You have a hospital with M X N number of rooms. Suddenly bacterial infection occurs in one room and it starts spreading in North, South, West, East directions and only to its adjacent room. Find how long would it take for the bacteria to be spread to the entire hospital.

// 1) Get the Size of an array: 3 4

// 2) Get the infection_location: 1 2

// 3) Output : 4


// Case 1
// Case 2
// Case 3
// Input (stdin)
// 3 4
// 1 2

// Output (stdout)
// 4
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int r, c;
  cin >> r >> c;
  int t = 1;
  int num = r * c - 1;
  int i, j;
  cin >> i >> j;
  queue< pair<int, int> >q;
  vector< vector<int> >vis(r, vector<int>(c, -1));
  vis[i][j] = 0;
  q.push({i, j});
  while (!q.empty())
  {
    if (num == 0)
      break;
    int size = q.size();
    t++;
    for (int k = 0; k < size; k++)
    {
      pair<int, int>temp = q.front();
      q.pop();
      int x1[] = {0, 1, 0, -1};
      int y1[] = {1, 0, -1, 0};
      for (int q1 = 0; q1 < 4; q1++)
      {
        int x = temp.first + x1[q1];
        int y = temp.second + y1[q1];
        if (x >= 0 && x < r && y >= 0 && y < c && vis[x][y] == -1 )
        {
          num--;
          q.push({x, y});
          vis[x][y] = 0;
        }
      }
    }
  }
  cout << t << endl;
}