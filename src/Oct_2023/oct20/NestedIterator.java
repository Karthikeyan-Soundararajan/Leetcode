package Oct_2023.oct20;

import java.util.*;

class NestedInteger {

      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger(){
          return true;
      }

      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger(){
          return 0;
      }

      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return empty list if this NestedInteger holds a single integer
      public List<NestedInteger> getList(){
          return  new ArrayList<>();
      }
  }

public class NestedIterator  implements Iterator<Integer> {

    Deque<Integer> deque = new ArrayDeque<Integer>();

    public NestedIterator(List<NestedInteger> nestedList) {
            prepareStack(nestedList);
    }

    private void prepareStack(List<NestedInteger> nestedInteger) {
        for (int i = 0; i < nestedInteger.size(); i++) {
            if(nestedInteger.get(i).isInteger()){
                deque.add(nestedInteger.get(i).getInteger());
            }else {
                prepareStack(nestedInteger.get(i).getList());
            }
        }
    }

    @Override
    public Integer next() {
        return deque.remove();
    }

    @Override
    public boolean hasNext() {
        return !deque.isEmpty();
    }

    public static void main(String[] args) {
        NestedInteger nestedInteger1 = new NestedInteger();
//        NestedInteger nestedInteger2 = new NestedInteger();
        List<NestedInteger> nestedList = new ArrayList<NestedInteger>();
        nestedList.add(nestedInteger1);
//        nestedList.add(nestedList);
        NestedIterator i = new NestedIterator(nestedList);
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
