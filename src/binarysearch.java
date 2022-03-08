public class binarysearch {
    public static void main(String[] args){
        int[] arr = {23,45,56,65,76,77,79,83,93,100};
        int target = 98;
        int ans = binary_search(arr,target);
        System.out.println(ans);

    }
    static int binary_search(int[] arr,int target){
        int index =-1;
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid =(start + end)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return index;
    }
}
