package Nov_2023.nov16;

public class Find_Unique_Binary_String {

    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder(nums.length);
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i].charAt(i)=='0'?'1':'0');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Find_Unique_Binary_String findUniqueBinaryString = new Find_Unique_Binary_String();
        System.out.println(findUniqueBinaryString.findDifferentBinaryString(new String[]{"01","10"}));
    }
}
