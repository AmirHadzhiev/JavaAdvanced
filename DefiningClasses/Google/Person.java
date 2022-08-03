package DefiningClassesExercise.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    Company company;
    Car car;
    //parents, children, and pokemons.
    List<Parents> parentsList = new ArrayList<>();
    List<Children> childrenList = new ArrayList<>();
    List<Pokemons> pokemonsList = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

  public void addPokemon( Pokemons pokemon){
        this.pokemonsList.add(pokemon);

  }
    public void addParents( Parents parent){
        this.parentsList.add(parent);

    }
    public void addChildren( Children children){
        this.childrenList.add(children);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Parents> getParentsList() {
        return parentsList;
    }

    public void setParentsList(List<Parents> parentsList) {
        this.parentsList = parentsList;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Children> childrenList) {
        this.childrenList = childrenList;
    }

    public List<Pokemons> getPokemonsList() {
        return pokemonsList;
    }

    public void setPokemonsList(List<Pokemons> pokemonsList) {
        this.pokemonsList = pokemonsList;
    }
    //  @Override
    //public String toString(){
      //  return this.name + System.lineSeparator()+
        //        this.company.companyName+
    //}
}
