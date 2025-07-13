import java.util.ArrayList;
import java.util.Iterator;
public static void main (String[] args){
ArrayList<String> shopping_list=new ArrayList<>();
shopping_list.add("Milk");
shopping_list.add("Bread");
shopping_list.add("Eggs");
if (shopping_list.contains("Bread")){
    System.out.println("We have bread");
}
// for (int i = 0; i < shopping_list.size(); i++){
// if (shopping_list.get(i).equals("Bread")){
//     System.out.println("We have Bread");
// }
// }
System.out.println(shopping_list);
}
// {
// ArrayList<Double> grade_list = new ArrayList<>();
// grade_list.add(88.5);
// grade_list.add(92.0);
// grade_list.add(75.5);
// grade_list.add(50.0);
// grade_list.add(65.5);
// for (int i = 0; i < grade_list.size(); i++){
//     grade_list.set(i,grade_list.get(i)+5);
// }
// System.out.println(grade_list);
// for (int i = grade_list.size() - 1; i >= 0; i--) {
//     if (grade_list.get(i)<60){
//         grade_list.remove(i);
//     }

// }
// System.out.println(grade_list);
// }

