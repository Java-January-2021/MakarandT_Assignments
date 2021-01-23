public class BatTest {
    // Create a BatTest class to instantiate a bat and have it attack three towns,
    // eat two humans, and fly twice.
    public static void main(String[] args) {
        Bat b1 = new Bat(300);
        System.out.println(b1.energyLevel);
        b1.attackTown(); // -100
        b1.attackTown(); // -100
        b1.attackTown(); // -100
        System.out.println(b1.energyLevel);
        b1.eatHumans(); // +25
        b1.eatHumans(); // +25
        System.out.println(b1.energyLevel);
        b1.fly(); // -50
        b1.fly(); //// -50
        System.out.println(b1.energyLevel);

    }

}
