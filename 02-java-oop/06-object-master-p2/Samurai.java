public class Samurai extends Human {

    public int health = 200;

    public Samurai() { // TODO do I need int health?
        // this.health = health;
        noOfSamurai++;
    }

    // Samurai: Add a method deathBlow(Human) that kills the other human, but
    // reduces the Samurai's health by half
    public void deathBlow(Human victim) {
        victim.health = 0; // victim.health
        this.health = this.health / 2;
    }

    // Samurai: Add a method meditate() that heals the Samurai for half of their
    // current health.
    public void meditate() {
        this.health = this.health * 2;
    }

    // Samurai: Add a method howMany() that returns the total current number of
    // Samurai.
    public void howMany() {
        System.out.println("Number of samurai = " + noOfSamurai);
    }
}
