import java.util.*;
class Reverse {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int n,a;
    n=kbd.nextInt();
    int[] arr= new int[n];
     for(int i=0;i<=n-1;i++){
       arr[i]=kbd.nextInt();  
     }
      for(int p=n-1;p>=0;p--){
        System.out.println(arr[p]);
      }
      
  }
}