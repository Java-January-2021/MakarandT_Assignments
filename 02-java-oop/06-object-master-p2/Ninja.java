public class Ninja extends Human {
    public int stealth = 10;

    // Ninja: Add a method steal(Human) that takes the amount of stealth the ninja
    // has, removes it from the other human's health, and adds it to the ninja's
    public void steal(Human victim) {
        victim.health -= this.stealth;
        this.health += this.stealth;
    }

    // Ninja: Add a method runAway() that decreases their health by 10
    public void runAway() {
        this.health -= 10;
    }

}
