package Oct_2023.oct25;

public class kth_grammer {

    public int kthGrammar(int n, int k) {
        if(n==1)
            return 0;
        int len = 1 << (n-2);
        if(k<=len){
            return kthGrammar(n-1, k);
        }else {
            return 1-kthGrammar(n-1, k-len);
        }
    }

    public static void main(String[] args) {
        kth_grammer kthGrammer = new kth_grammer();
        System.out.println(kthGrammer.kthGrammar(1, 1));
    }
}
