import java.util.Scanner;
import java.util.ArrayList;

public class april26 {
public static void main (String[] args) {
int number = 10;
System.out.println(number);

// Declaring, defining
// int[] scores;
String[] student_name;

// initializing
// scores = new int[30];
student_name = new String[5];

int[] numbers = {1,2,3,4,5};
String[] fruits = {"apple", "banana", "cherry"};

// access
// System.out.println(numbers[2]);
System.out.println(fruits[0]);
// parentheses ()
// squre brackets []
// Braces {}

// modify 
fruits[1] = "Blueberry";
System.out.println(fruits[1]);

// size of array.
int array_length = fruits.length;
System.out.println("Array length: " + array_length);

//loop
String[] fruits2 = {"Apple", "Banana", "Cherry", "Blueberry", "Rasberry", "peach"};

for(int i = 0; i < fruits2.length; i++){

  System.out.println("Fruit at index "+ i + " is: " + fruits2[i]);
}


int[] scores = {10,25,34,41,56};
int sum = 0;

for(int score : scores){
  System.out.println("score: "+ score);
  sum = sum + score;
}
System.out.println(sum);


char[][] board = {
  {'X', 'O', 'O'},
  {'O', 'X', 'X'},
  {'X', 'O', 'X'}
};
char middle = board[1][1];
System.out.println("middle is : " + middle);


/*
 * Data type: 
 * Primitive data type: int, dobule float, boolean, char.
 * Objects
 * 
 * 
 * 
 * 
 * 
 * 
 *  ARRAYLIST
 */


ArrayList<Integer> number_list = new ArrayList<>();
ArrayList<String> grocery_goods_List = new ArrayList<>();

// add element.
grocery_goods_List.add("Milk");
grocery_goods_List.add("Bread");
grocery_goods_List.add("butter");
grocery_goods_List.add(1, "Eggs");

// get element:

String second_element = grocery_goods_List.get(1);

System.out.println(second_element);

// set method/elements (modify values.)
grocery_goods_List.set(0, "potato");
String first_element = grocery_goods_List.get(0);
System.out.println(first_element);

// size:
System.out.println("size : "+ grocery_goods_List.size());

// remove 
grocery_goods_List.remove(3);

System.out.println("size : "+ grocery_goods_List.size());
grocery_goods_List.remove("potato");
System.out.println("size : "+ grocery_goods_List.size());


for (int i = 0; i < grocery_goods_List.size(); i++){
  System.out.println("index: " + i + " is " + grocery_goods_List.get(i));
}
}
}