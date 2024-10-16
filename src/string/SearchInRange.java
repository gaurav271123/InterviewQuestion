package string;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={14,5,7,8,4};
        int target=4;
        int from =0;
        int till =4;
        int i = inRange(arr, target, from, till);
        System.out.println(i);
    }
    public static int inRange(int [] arr, int target, int start, int end){
        for (int i = start; i <= end; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
