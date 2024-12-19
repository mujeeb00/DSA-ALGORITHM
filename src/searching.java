public class searching {
    public int linear_search(int[] arr, int target){
        int index=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }

        return index;
    }

    public int binary_search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;

        while(true){
            if(target==arr[start]){
                return start;
            }
           if(target==arr[end]){
                return end;
            }
           if(target==arr[mid]){
                return mid;
            }

            if(target>arr[mid]){
                start=mid+1;
                mid=(start+end)/2;
            }
            if(target<arr[mid]){
                end=mid-1;
                mid=(start+end)/2;
            }
        }
    }
}
