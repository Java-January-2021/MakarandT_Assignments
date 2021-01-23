public class Human {
    // Add the strength, stealth, and intelligence attributes with a default of 3
    public int strength=3;
    public int stealth=3;
    public int intelligence=3;
    // Add the health attribute with a default of 100
    public int health =100;

    // Add the attack(Human) method that reduces the health of the attacked human by
    // the strength of the current human.

    public Human(){
        this.strength=strength;
        this.stealth=stealth;
        this.intelligence=intelligence;
        this.health= health;

    }
    // Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human.
    public int attack(Human victim){
        victim.health -= this.strength;
        return victim.health;
    }
    //DisplayHealth()
    public void displayHealth(){
        System.out.println("After attack victim health is =" +this.health);
    }


}

