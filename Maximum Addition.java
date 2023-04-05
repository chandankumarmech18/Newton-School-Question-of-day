// this code in c++


#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define ll long long 
int main() {
	// Your code here
    ll n, i, j, ans, sum, ma=0;

    cin>>n;

    ll a[n], pre[n];

    for(i=0; i<n; i++){
        cin>>a[i];
    }
    pre[0]=a[0];

    for(i=1; i<n; i++){
        pre[i]=pre[i-1]+a[i];
    }

    sum=0;
    for(i=0; i<n; i++)
    {
        sum=sum+pre[i];
        ma=max(ma, a[i]);
        ans=sum+(i+1)*ma;

        cout<<ans<<"\n";
    }

    return 0;
}