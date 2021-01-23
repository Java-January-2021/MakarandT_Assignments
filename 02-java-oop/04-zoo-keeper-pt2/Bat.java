public class Bat extends Mammal {
    // public int energyLevel;
    // Create a Bat class that can fly(), eatHumans(), and attackTown() and has a
    // default energy level of 300.

    public Bat(int energyLevel) {
        // this.energyLevel = energyLevel;
        super(energyLevel);
    }

    public int fly() {
        System.out.println("Bat fly and lost 50 energy points");
        energyLevel = energyLevel - 50;
        return energyLevel;
    }

    public int eatHumans() {
        System.out.println("Bat eatHumans and gain 25 energy points");
        energyLevel = energyLevel + 25;
        return energyLevel;
    }

    public int attackTown() {
        System.out.println("Bat attackTown and lost 100 energy points");
        energyLevel = energyLevel - 100;
        return energyLevel;
    }

}
