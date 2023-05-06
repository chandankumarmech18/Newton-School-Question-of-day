//in c++

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define ll long long
int main() {
	// Your code here
    ll n, m, i, j;
    cin>>n>>m;

    string a[n];
    bool rows[n], cols[m];

    for(i=0; i<n; i++){
        rows[i]=false;
    }
    for(i=0; i<m; i++){
        cols[i]=false;
    }

    for(i=0; i<n; i++){
        cin>>a[i];
    }

    for(i=0; i<n; i++)
    {
        for(j=0; j<m; j++)
        {
            if(a[i][j]=='#'){
                rows[i]=true;
                cols[j]=true;
            }
        }
    }

    for(i=0; i<n; i++)
    {
        if(rows[i]==true){
        for(j=0; j<m; j++)
        {
            if(cols[j]==true){
                cout<<a[i][j];
            }
        }
        cout<<"\n";
        }
        
    }


    return 0;
}