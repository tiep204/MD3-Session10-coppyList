import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,6,3,6,32,6,2));
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(list);
        System.out.println(integerList);
    }
}