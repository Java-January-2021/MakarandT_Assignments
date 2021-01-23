public class HumanTest {
    
    public static void main(String[] args) {

        //inti object 
        System.out.println("The humans can all select various classes (Wizard, Ninja, Samurai).");
        Human wizard = new Human();
        Human ninja = new Human();
        Human samurai = new Human();
        System.out.println(ninja.health);
        wizard.attack(ninja);
        System.out.println(ninja.health);
        samurai.attack(ninja);
        // System.out.println("Health = " + ninja.health);
        ninja.displayHealth();
        
    }
}
