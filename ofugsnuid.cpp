#include <iostream>
using namespace std;
int main(){

     int n,a;
   cin>>n;
    int arr[n];
    for(int i=0;i<=n-1;i++){
       cin>>arr[i];   
     }
      for(int p=n-1;p>=0;p--){
        cout<<arr[p]<<endl;
      }
}
