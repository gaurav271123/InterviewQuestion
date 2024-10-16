package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={0,1,2,2,3,0,4,2};
        int num = 2;
        int count=0;

       int[] temp = new int [arr.length];

       int j = 0;
        for (int i=0;i<=arr.length-1;i++){
            if(arr[i] != num){
                temp[j] = arr[i];
                j++;
            }else {
                count++;
            }
        }
        System.out.println(count);

        for(int i = 0; i < j; i++){
            System.out.print(temp[i]);
        }
    }
}
