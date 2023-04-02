#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define ll long long
int main() {
	// Your code here
    ll n, k, ans=1000000000, i, t;

    cin>>n>>k;

    ll x[n];

    for(i=0; i<n; i++){
        cin>>x[i];
    }

    for(i=0; i+k-1<n; i++)
    {
        if(x[i]>=0){
            t=x[i+k-1];
        }else if(x[i+k-1]<=0){
            t=-x[i];
        }else{
            t=min(2*abs(x[i])+x[i+k-1], abs(x[i])+2*x[i+k-1]);
        }

        ans=min(ans, t);
    }

    cout<<ans;
    return 0;
}