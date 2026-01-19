import java.util.ArrayList;

class ArrayLists{
    public static void main(String [] args){
        ArrayList<String> items= new ArrayList<>();
        items.add("apple");
        items.add("cherry");
        items.add(0,"mulberry");

        System.out.println(items);

    }
}