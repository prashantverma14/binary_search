public class updated_binary_search {
    public static void main(String[] args) {
        //int[] arr  = {23,34,54,65,67,78,85,98,99};
        int[] arr = {98,87,76,64,52,49,38,27,11};
        int target = 49;
        int ans = updatebinarysearch(arr,target);
        System.out.println(ans);
    }

    // this is the program where array is sorted but it is not given whether it is ascending or descending
    static int updatebinarysearch(int[] arr,int target){
        int index =-1;
        int start =0;
        int end = arr.length-1;

        boolean isasc = arr[start] < arr[end];


        while(start <=end){
            int mid = (start + end)/2;
            if(target == arr[mid]){
                return mid;
            }

            if(isasc){
                if(target < arr[mid]){
                    end = mid-1;
                }else if(target > arr[mid]){
                    start = mid +1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }else if(target < arr[mid]){
                    start = mid +1;
                }
            }

        }
        return index;
    }
}
