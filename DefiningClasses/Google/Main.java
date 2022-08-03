package DefiningClassesExercise.Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String line = scanner.nextLine();
        Map<String,Person> persons = new LinkedHashMap<>();
         while (!line.equals("End")){
             String [] information = line.split(" ");
             String name = information[0];
             persons.putIfAbsent(name,new Person(name));
             switch (information[1]){


                 case "car":
                     String carModel = information[2];
                     int carSpeed = Integer.parseInt(information[3]);
                     //JohnJohnson car Trabant 30
                     Car car = new Car(carModel,carSpeed);
                     persons.get(name).setCar(car);

                     break;
                 case "pokemon":
                     //PeterSmith pokemon Pikachu Electricity
                     String pokemonName = information[2];
                     String pokemonType = information[3];
                     Pokemons pokemon = new Pokemons(pokemonName,pokemonType);
                     persons.get(name).addPokemon(pokemon);
                     break;
                 case "parents":
                     String parentName = information[2];
                     String parentBirthay = information[3];
                     Parents parent = new Parents(parentName,parentBirthay);
                     persons.get(name).addParents(parent);


                     break;
                 case "company":
                     String companyName = information[2];
                     String department = information[3];
                     double salary = Double.parseDouble(information[4]);
                     Company company = new Company(companyName,department,salary);
                     persons.get(name).setCompany(company);
                     break;
                 case "children":
                     //GeorgeJohnson children SamJohnson 01/01/2001
                     String childName = information[2];
                     String childBirthay = information[3];
                     Children children = new Children(childName,childBirthay);
                     persons.get(name).addChildren(children);
                     break;
             }


         }
         String name = scanner.nextLine();

        System.out.println();


    }
}
