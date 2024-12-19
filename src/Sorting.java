public class Sorting {

    public void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int k=0;k<arr.length-1-i;k++){
                if(arr[k]>arr[k+1]){
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }


    public void selection_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            boolean found=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                    found=true;
                }
            }

            if(found){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;

            }

        }


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public void insertion_sort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;


        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For a new line after the print
    }


    public void mergeSortInPlace(String[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }

    public void mergeInPlace(String[] arr, int s, int m, int e) {
        String[] mix = new String[e - s+1];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i].charAt(0) < arr[j].charAt(0)) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }


    }


    public void mergeSort(String[] names,int start,int end){
        if(start>=end){
            return;
        }

        int mid=(start+end)/2;

        mergeSort(names,start,mid);
        mergeSort(names,mid+1,end);
        merg(names,start,mid,end);

    }

    public void merg(String[] arr,int start,int mid, int end){
        String[] merge=new String[end-start+1];
        int index1=start;
        int index2=mid+1;
        int x=0;


        while(index1<=mid && index2<=end){

            if(arr[index1].compareTo(arr[index2])>0){
                merge[x++]=arr[index2++];
            }
            else{
                merge[x++]=arr[index1++];
            }
        }

        while(index1<=mid){
            merge[x++]=arr[index1++];
        }

        while(index2<=end){
            merge[x++]=arr[index2++];

        }

        for(int i=0,j=start;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }

    }


    public void Sort_name(String name){
        char[] name_arr=name.toCharArray();

        for(int i=0;i<name_arr.length;i++){
            for(int j=i+1;j<name_arr.length;j++){
                if(name_arr[i]>name_arr[j]){
                    char temp=name_arr[i];
                    name_arr[i]=name_arr[j];
                    name_arr[j]=temp;
                }
            }
        }

        for(int i=0;i< name_arr.length;i++){
            System.out.print(name_arr[i]);
        }
    }

    public int helperQuick(int[] arr,int low,int high){
        int i=low-1;
        int pivot=arr[high];

        for(int j=low;j<high;j++){
            if(pivot>arr[j]){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;

        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;

        return i;


    }

    public void quickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }

        int pivot=helperQuick(arr,low,high);

        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);


    }


}
