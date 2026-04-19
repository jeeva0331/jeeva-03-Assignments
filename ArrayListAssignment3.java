import java.util.*;

class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5)
        );

        int k = 2;

        for (int i = 0; i < k; i++) {
            int last = list.remove(list.size() - 1);
            list.add(0, last);
        }

        System.out.println(list); // [4, 5, 1, 2, 3]
    }
}
