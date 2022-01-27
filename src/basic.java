import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get element by index
        System.out.println(list.get(1));

        //add element by index
        list.add(1,1);
        System.out.println(list);

        //set element by index
        list.set(0,5);
        System.out.println(list);

        //remove element
        list.remove(0);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //by loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.add(0);
        System.out.println(list);
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
