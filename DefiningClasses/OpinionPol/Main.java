package DefiningClassesExercise.OpinionPol;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Map<String, Person> persons = new TreeMap<>();
         int numberOfPersons  = Integer.parseInt(scanner.nextLine());
        while (numberOfPersons-- >0){
            String [] data = scanner.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Person person = new Person(name,age);
            persons.putIfAbsent(name,person);


        }
       persons.values().stream().filter(n-> n.age>30).forEach(n-> System.out.println(n.getName()+" - "+n.getAge()));


    }
}
