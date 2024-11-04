package leetcode.binarySearch;

//  https://leetcode.com/problems/find-in-mountain-array/submissions/1437259371/

public class FindInMountainArray1095 {

    public static int findInMountainArray(int target, MountainArray mountainArr) {
       int end= mountainArr.length()-1;
       int start =0;

       while (start<end){
           int mid= start +(end-start)/2;
           int temp = mountainArr.get(mid);
           int temp2 = mountainArr.get(mid+1);

           if (temp>temp2){
               end=mid;
           }else{
               start= mid+1;
           }
       }

       int firstArray = binarySearch(mountainArr, target, 0, start);
       if (firstArray == -1) {
           return binarySearch(mountainArr, target, start+1, mountainArr.length()-1);
       } else {
           return firstArray;
       }

    }

    public static int binarySearch(MountainArray mountainArray, int target, int start, int end){


        if (mountainArray.get(start)<mountainArray.get(end)){
            while (start <= end){
                //  int mid = (s+e)/2 ;    // (s+e)/2 may exceed the limit
                int mid = start + (end-start)/2;
                if(target < mountainArray.get(mid)){
                    end = mid-1;
                } else if (target >mountainArray.get(mid)) {
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        }else{
            while (start <= end){
                int mid = start + (end-start)/2;
                if (target < mountainArray.get(mid)){
                    start = mid+1;
                } else if (target > mountainArray.get(mid)) {
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int target = 3;

       MountainArray mountainArray = new A();
        int i = findInMountainArray(target, mountainArray);
        System.out.println(i);
    }

}

 interface MountainArray{
     public int get(int index);
     public int length();
}

class A implements MountainArray{
    int[] array = {1,2,4,5,2,1};
    @Override
    public int get(int index) {
        return this.array[index];
    }

    @Override
    public int length() {
        return this.array.length;
    }
}