package leetcode;

public class EvenDigits {
    public static void main(String[] args) {
        int[] x ={12,34,2,16,7896};
        int num = findNum(x);
        System.out.println(num);
    }
    public static int findNum(int[] nums){
    int count= 0;
    for(int num: nums){
        if(even(num)){
            count++;
        }
    }
    return count;
    }

    public static boolean even(int num) {
        int digits = digits(num);
        return digits%2==0;
    }

    public static int digits(int num) {
        int count= 0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
