import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> array = new ArrayList<>() {
            {
                add("maçã");
                add("manga");
                add("laranja");
            }
        };
        List<String> array2 = new ArrayList<>() {
            {
                add("maçã");
                add("uva");
                add("mexerica");
            }
        };
        List<String> array3 = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array2.contains(array.get(i))) {
                array3.add(array.get(i));
            }
        }

        for (String frutas : array3) {
            System.out.println(frutas);
        }
    }
}
