package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterByAge {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
       int n = Integer.parseInt(scanner.nextLine());
       List<Person> people = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String [] data = scanner.nextLine().split(", ");

            String name = data[0];
            int  age = Integer.parseInt(data[1]);
            Person person = new Person(name,age);
            people.add(person);
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String [] conditionPrinting = scanner.nextLine().split(" ");

       people= filterByAgeCondition(people,condition,age);

        System.out.println();









    }

    private static List<Person> filterByAgeCondition(List<Person> people,String condition, int age ) {

        if (condition.equals("older")){
            return people.stream()
                    .filter(p-> p.age>= age)
                    .collect(Collectors.toList());
        }
        else {
           return people.stream()
                   .filter(p-> p.age<= age)
                   .collect(Collectors.toList());
        }
    }

    public static class Person{
        String name;
        int age;

      public Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public int getAge() {
          return age;
      }

      public void setAge(int age) {
          this.age = age;
      }
  }


}
