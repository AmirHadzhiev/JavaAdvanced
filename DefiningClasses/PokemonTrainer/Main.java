package DefiningClassesExercise.PokemonTrainer;


import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Map<String,Trainer> trainersMap = new LinkedHashMap<>();


        String line = scanner.nextLine();

        while (!line.equals("Tournament")){
            String[] data = line.split(" ");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);
            Pokemon pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);

              Trainer trainer = new Trainer(trainerName, new ArrayList<>());


              trainer.pokemons.add(pokemon);
              if (trainersMap.containsKey(trainerName)){
                  trainersMap.get(trainerName).pokemons.add(pokemon);

              } else {
              trainersMap.put(trainerName,trainer);}

            line= scanner.nextLine();
        }

        String elements = scanner.nextLine();
        while (!elements.equals("End")){
            if (elements.equals("Fire")){
                for (Trainer trainer : trainersMap.values()) {
                    boolean havePokemo = false;
                    for (Pokemon pokemon : trainer.pokemons) {
                        if (pokemon.getElement().equals("Fire")){
                            int numberOfBadges = trainer.getNumberOfBadges();
                            trainer.setNumberOfBadges(numberOfBadges+1);
                            havePokemo=true;
                        }
                    }
                    if (!havePokemo) {
                        if (trainer.getPokemons().size() > 0){
                            for (Pokemon pokemon : trainer.getPokemons()) {
                                int health = pokemon.getHealth();
                                if (health > 0) {
                                    pokemon.setHealth(health - 10);
                                }
                                if (pokemon.getHealth() <= 0) {
                                    trainer.pokemons.remove(pokemon);
                                    break;
                                }
                            }
                        }
                    }
                }

            } else if (elements.equals("Water")){
                for (Trainer trainer : trainersMap.values()) {
                    boolean havePokemo = false;
                    for (Pokemon pokemon : trainer.pokemons) {
                        if (pokemon.getElement().equals("Water")){
                            int numberOfBadges = trainer.getNumberOfBadges();
                            trainer.setNumberOfBadges(numberOfBadges+1);
                            havePokemo=true;
                        }
                    }
                    if (!havePokemo) {
                        if (trainer.getPokemons().size() > 0){
                            for (Pokemon pokemon : trainer.getPokemons()) {
                                int health = pokemon.getHealth();
                                if (health > 0) {
                                    pokemon.setHealth(health - 10);
                                }
                                if (pokemon.getHealth() <= 0) {
                                    trainer.pokemons.remove(pokemon);
                                    break;
                                }
                            }
                        }
                    }
                }

            } else if (elements.equals("Electricity")){
                for (Trainer trainer : trainersMap.values()) {
                    boolean havePokemo = false;
                    for (Pokemon pokemon : trainer.pokemons) {
                        if (pokemon.getElement().equals("Electricity")){
                            int numberOfBadges = trainer.getNumberOfBadges();
                            trainer.setNumberOfBadges(numberOfBadges+1);
                            havePokemo=true;
                        }
                    }
                    if (!havePokemo) {
                        if (trainer.getPokemons().size() > 0){
                            for (Pokemon pokemon : trainer.getPokemons()) {
                                int health = pokemon.getHealth();
                                if (health > 0) {
                                    pokemon.setHealth(health - 10);
                                }
                                if (pokemon.getHealth() <= 0) {
                                    trainer.pokemons.remove(pokemon);
                                    break;
                                }
                            }
                    }
                    }
                }

            }


            elements= scanner.nextLine();
        }

       trainersMap.values().stream().sorted(Comparator.comparing(Trainer::getNumberOfBadges).reversed())
               .forEach(n-> System.out.println(n.getName()+" "+n.getNumberOfBadges()+" "+n.pokemons.size()));


      //  for (Trainer treiner : trainersMap.values()) {
        //    System.out.println(treiner.getName()+" "+treiner.getNumberOfBadges()+" "+treiner.pokemons.size());
        //}


    }
}
