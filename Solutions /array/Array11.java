import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array11 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
         ArrayList<String> ans = new ArrayList<String>();
         int count=0,category;

        String ruleKey ="color";
        String ruleValue = "silver";

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
         category = "color".equals(ruleKey) ? 1: "type".equals(ruleKey) ? 0:2;

         for (List<String> row : items) {
           if(ruleValue.equals(row.get(category))){
            count++;
           }
        }
        System.out.println(count);

    }
}
