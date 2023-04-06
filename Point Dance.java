//in c++

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define ll long long
int main() {
	// Your code here
    ll n, m, ans, i, j, k;

    cin>>n>>m;

    ll p[m], q[m-1];

    for(i=0; i<m; i++)
    {
        cin>>p[i];
    }

    sort(p, p+m);

    for(i=1; i<m; i++){
        q[i-1]=p[i]-p[i-1];
    }

    sort(q, q+m-1);

    k=max(0ll, m-n);

    ans=0;
    for(i=0; i<k; i++){
        ans=ans+q[i];
    }

    cout<<ans;
    return 0;
}