package Oct_2023.oct9;

public class Find_First_And_last_position_of_sorted_array {

    public int[] searchRange(int[] nums, int target) {
        int firstIndex = -1, lastIndex = -1;
        for (int i = 0; i < nums.length && nums[i] <= target; i++) {
            if(nums[i]==target){
                if(firstIndex==-1)
                    firstIndex = i;
                lastIndex =i;
            }
        }
        return new int[]{firstIndex,lastIndex};
    }

    public static void main(String[] args) {
        Find_First_And_last_position_of_sorted_array findFirstAndLastPositionOfSortedArray = new Find_First_And_last_position_of_sorted_array();
        int[] out = findFirstAndLastPositionOfSortedArray.searchRange(new int[]{},0);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
