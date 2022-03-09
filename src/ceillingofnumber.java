public class ceillingofnumber {
    public static void main(String[] args) {
        int[] arr = {24,36,39,47,51,59,64,76};
        int target = 44;
        int ans = fun(arr,target);
        System.out.println(ans);
    }

    static int fun(int[] arr,int target){
        int start =0;

        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(target == arr[mid]){
                return target;
            }

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;



            }


        }
        return arr[end];
    }
}
