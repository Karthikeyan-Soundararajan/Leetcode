package Sep_2023.sep8;

import java.util.ArrayList;
import java.util.List;

public class PascalsNumber {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalNos = new ArrayList<List<Integer>>(numRows);
        if(numRows<0)
            return pascalNos;
        List<Integer> firstList = new ArrayList<Integer>();
        firstList.add(1);
        pascalNos.add(firstList);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> newList = new ArrayList<Integer>(i);
            newList.add(1);
            List<Integer> previousList = pascalNos.get(i-2);
            for (int j = 0; j < previousList.size()-1; j++) {
                newList.add(previousList.get(j)+previousList.get(j+1));
            }
            newList.add(1);
            pascalNos.add(newList);
        }
        return pascalNos;
    }

    public static void main(String[] args) {
        PascalsNumber pascalsNumber = new PascalsNumber();
        System.out.println(pascalsNumber.generate(1));
    }
}
