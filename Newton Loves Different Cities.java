// code in c++


#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define ll long long
    ll gcd(ll a, ll b)
{
    if((a%b)==0){
        return b;
    }else{
        return gcd(b, a%b);
    }
}
int main() {
	// Your code here
    ll n, x, ans, i, j;

    cin>>n>>x;

    ll a[n+1];

    for(i=0; i<n; i++)
    {
        cin>>a[i];
    }
    sort(a, a+n);

    a[n]=-1;  

    for(i=0; i<n; i++)
    {
        if(a[i]>x){
            for(j=n; j>i; j--)
            {
                a[j]=a[j-1];
            }
            a[i]=x;
        }
    }

    if(a[n]==-1){
        a[n]=x;
    }

    ans=a[1]-a[0];

    for(i=2; i<=n; i++)
    {
        if(a[i]-a[i-1]!=0)
        ans=gcd(max(ans, a[i]-a[i-1]), min(ans, a[i]-a[i-1]));
    }

    cout<<ans<<"\n";
    
    return 0;
}