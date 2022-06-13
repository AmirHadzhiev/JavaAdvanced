package SetAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Set<Integer> furstDeck = Arrays.stream(scanner.nextLine()
                         .split(" "))
                 .map(Integer::parseInt)
                 .collect(Collectors.toCollection(LinkedHashSet::new));

         Set<Integer> secondDeck = Arrays.stream(scanner.nextLine()
                 .split(" "))
                 .map(Integer::parseInt)
                 .collect(Collectors.toCollection(LinkedHashSet::new));
         int counter = 1;
         while (secondDeck.size()>0 && furstDeck.size()>0 && counter<=50){
             int cardOne = furstDeck.iterator().next();
             furstDeck.remove(cardOne);
             int cardTwo = secondDeck.iterator().next();
             secondDeck.remove(cardTwo);
             if (cardOne>cardTwo){
                 furstDeck.add(cardOne);
                 furstDeck.add(cardTwo);
             }
             else if (cardTwo>cardOne){
                 secondDeck.add(cardOne);
                 secondDeck.add(cardTwo);
             }


             counter++;
         }
         if (furstDeck.size()>secondDeck.size()){
             System.out.println("First player win!");

         } else if (secondDeck.size()>furstDeck.size()){
             System.out.println("Second player win!");

         } else {
            System.out.println("Draw!");
         }

}
}
