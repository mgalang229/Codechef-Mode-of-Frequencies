#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

void solve() {
	int n;
	cin >> n;
	map<int, int> mp;
	//count the frequency of each number
	for(int i=0; i<n; ++i) {
		int a;
		cin >> a;
		mp[a]++;
	}
	//count the frequency of the each frequencies of every number
	map<int, int> cnt;
	for(auto x : mp)
		cnt[x.second]++;
	int mx=0;
	//store the largest frequency in 'mx'
	for(auto x : cnt)
		mx=max(mx, x.second);
	int mn=INT_MAX;
	//check if the frequency of the frequency matches the largest frequency
	//if it matches get the smallest frequency
	for(auto x : cnt)
		if(x.second==mx)
			mn=min(mn, x.first);
	cout << mn << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--)
		solve();
}
