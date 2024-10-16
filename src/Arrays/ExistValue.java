package Arrays;

public class ExistValue {
    public static void main(String[] args) {
        int[] arr={14,5,4,7,18};
        boolean exist = isExist(arr);
        System.out.println(exist);
    }
    public static boolean isExist(int[] arr){
        int x=8;
        for (int i=0; i< arr.length; i++){
            if (arr[i]==x){
                x=arr[i];
                return true;
            }
        }
        return false;
    }
}
