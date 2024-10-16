package Arrays;

public class HighestElement {
    public static void main(String[] args) {
        int[] arr ={1,27,4,8,12};
        int max = max(arr);
        System.out.println(max);
        int min = min(arr);
        System.out.println(min);
    }
    public static int max(int[] arr){
        int max=arr[0];
        for (int i=0; i< arr.length; i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min=arr[0];
        for (int i=0; i< arr.length; i++){
            if(arr[i]< min){
                min=arr[i];
            }
        }
        return min;
    }
}
