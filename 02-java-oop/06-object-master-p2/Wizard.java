public class Wizard extends Human {
    // public int wizardhealth =50;
    // public int wizardintelligence =8;

    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }

    // Wizard: Add a method heal(Human) that heals the other human by the wizard's
    // intelligence
    public void heal(Human victim) {
        victim.health += this.intelligence;
    }

    // Wizard: Add a method fireball(Human) that decreases the other human's health
    // by the wizard's intelligence * 3
    public void fireball(Human victim) {
        victim.health = victim.health - (this.intelligence * 3);

    }

}
