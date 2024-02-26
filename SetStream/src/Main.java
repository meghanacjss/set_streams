import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    HashSet<Integer>set = new HashSet<>();

    public void lambdaFunction(){

        set.add(2);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(11);


      int count = (int) set.stream().count();
      System.out.println("elements in hashset:"+count);

        Set<Integer> num = set.stream()
                .filter(number -> number > 2)
                .collect(Collectors.toSet());
        System.out.println(" numbers from the Set:");
        num.forEach(System.out::println);

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        Main mainclass = new Main();
        mainclass.lambdaFunction();
    }
}