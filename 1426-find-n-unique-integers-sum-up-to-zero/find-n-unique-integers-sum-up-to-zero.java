class Solution {
    public int[] sumZero(int n) {
        if(n==1){
            return new int[] {0};
        }
        int[] arr=new int[n];

        int k=(-1)*n/2;

        for(int i=0;i<n;i++){
            arr[i]=k;
            k++;
        }
        if(n%2==0){
            arr[n/2]=n/2;
        }

        return arr;
    }
}