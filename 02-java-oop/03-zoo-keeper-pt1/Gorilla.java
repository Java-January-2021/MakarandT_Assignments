public class Gorilla extends Mammal {

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    // Create a separate class Gorilla that can throwSomething(), eatBananas(), and
    // climb()
    public int throwSomething() {
        System.out.println("Gorilla thrown barrel and lost 5 energy points");
        energyLevel = energyLevel - 5;
        return energyLevel;
    }

    public int eatBananas() {
        System.out.println("Gorilla eating banana and got 10 energy points");
        energyLevel = energyLevel + 10;
        return energyLevel;
    }

    public int climb() {
        System.out.println("Gorilla climb up and lost 10 energy points");
        energyLevel = energyLevel - 10;
        return energyLevel;
    }

   
}
