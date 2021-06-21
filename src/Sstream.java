import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sstream {
    public static void main(String[] args ){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(35);
        al.add(40);
        al.add(45);
        al.add(50);
        al.add(55);
        al.add(60);
        System.out.println(al);

        Stream<Integer> stream1 = al.stream();
        Function<Integer, Integer> fn = n->2*n;
//        Predicate<Integer> p = n -> n%2 ==0;
        Stream <Integer>stream2 = stream1.map(fn);
        List<Integer> list1 = (List<Integer>) stream2.collect(Collectors.toList());
        System.out.println(list1);

//      List l= al.stream().filter(n -> n%2==0).collect(Collectors.toList());
//      System.out.println(l);


    }
}
