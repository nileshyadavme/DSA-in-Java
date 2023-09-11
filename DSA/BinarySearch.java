package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,2,3,4,5,6,7,8,9,14,15};
        int target = 115;
        int ans = BinarySearchAlgorithm(arr, target);
        if(ans==-1){
            System.out.println("not found !");
        }
        else{
            System.out.println("found it ! index = "+ans);
        }
    }
    static int BinarySearchAlgorithm(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int middle = (start+end)/2;
            // target<m;start stay same,end = m;
            if(target<arr[middle]){
                end = middle-1;
            }
            if(target>arr[middle]){
                start = middle+1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
