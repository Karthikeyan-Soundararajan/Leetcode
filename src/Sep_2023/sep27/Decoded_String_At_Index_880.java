package Sep_2023.sep27;

public class Decoded_String_At_Index_880 {

    public String decodeAtIndex(String s, int k) {
        long finalLength = 0;
        for (Character c:s.toCharArray()) {
            if(Character.isDigit(c)){
                finalLength *= (c-'0');
            }else{
                finalLength++;
            }
        }
        for (int i = s.length()-1; i >=0 ; i--) {
            if (Character.isDigit(s.charAt(i))){
                finalLength /= (s.charAt(i)-'0');
                k %= finalLength;
            }else{
                if(k==0 || k==finalLength){
                    return String.valueOf(s.charAt(i));
                }
                finalLength--;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Decoded_String_At_Index_880 decodedStringAtIndex880 = new Decoded_String_At_Index_880();
        System.out.println(decodedStringAtIndex880.decodeAtIndex("a2345678999999999999999",1));
    }
}
