#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

void solve() {
	int n;
	cin >> n;
	//count the frequency of each number
	vector<int> f(11, 0);
	for(int i=0; i<n; ++i) {
		int a;
		cin >> a;
		f[a]++;
	}
	//count the frequency of the each frequency of each number
	vector<int> ff(10001, 0);
	for(int i=1; i<=10; ++i)
		if(f[i])
			ff[f[i]]++;
	//locate the largest frequency of each frequency
	//if there are multiple large frequencies, then find the smallest frequency
	int mx=0, id=-1;
	for(int i=1; i<=10000; ++i)
		if(ff[i]>mx) {
			mx=ff[i];
			id=i;
		}
	cout << id << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--)
		solve();
}
