package Oct_2023.oct16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Pascal_Triangle {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> triangle = new ArrayList<Integer>(rowIndex);
        long prev = 1;
        triangle.add(1);;
        for (int columnIndex = 1; columnIndex <= rowIndex; columnIndex++) {
            long columnValue = prev * (rowIndex-columnIndex+1)/columnIndex;
            triangle.add((int) columnValue);
            prev = columnValue;
        }
        return triangle;
    }

    public static void main(String[] args) {
        Pascal_Triangle pascalTriangle = new Pascal_Triangle();
        System.out.println(pascalTriangle.getRow(5));
    }
}
