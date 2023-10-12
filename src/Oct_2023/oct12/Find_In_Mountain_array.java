package Oct_2023.oct12;

class MountainArray {

    int[] mountainArray = new int[]{0,1,2,4,2,1};
    public  int get(int index) {
        return mountainArray[index];
    }
    public int length() {
        return mountainArray.length;
    }
}

public class Find_In_Mountain_array {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int firstSearch = initialSearch(mountainArr,target,0,peak);
        if(firstSearch==-1){
            return initialSearch(mountainArr,target,peak+1,mountainArr.length()-1);
        }
        return firstSearch;
    }

    private int initialSearch(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);
        if(isAsc){
            while (start<=end){
                int mid = (start+end) / 2 ;
                if(arr.get(mid)==target){
                    return mid;
                }else if(arr.get(mid)<target){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
            return -1;
        }else {
            while (start<=end){
                int mid = (start+end) / 2 ;
                if(arr.get(mid)==target){
                    return mid;
                }else if(arr.get(mid)>target){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    private int findPeak(MountainArray arr) {
        int start = 0;
        int end = arr.length()-1;
        int peak = -1;
        while (start<end){
            int mid = (start+end) / 2;
            if (start<mid && arr.get(mid)<arr.get(mid-1)){
                end = mid-1;
            } else if (mid<end && arr.get(mid)<arr.get(mid+1)) {
                start = mid+1;
            }else {
                peak = mid;
                break;
            }
        }
        if(peak==-1){
            peak = end;
        }
        return peak;
    }

    public static void main(String[] args) {
        Find_In_Mountain_array findInMountainArray = new Find_In_Mountain_array();
        System.out.println(findInMountainArray.findInMountainArray(3, new MountainArray()));
    }
}
