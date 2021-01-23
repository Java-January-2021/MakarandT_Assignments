public class GorillaTest {
    public static void main(String[] args) {
         Gorilla g1 = new Gorilla(100);
        System.out.println(g1.energyLevel);
        g1.throwSomething();
        g1.throwSomething();
        g1.throwSomething();
        System.out.println(g1.energyLevel);
        g1.eatBananas();
        g1.eatBananas();
        System.out.println(g1.energyLevel);
       System.out.println("After 3 throw ,eating 2 banana and 1 climb Gorilla energy level is = " + g1.climb());;
        System.out.println(g1.energyLevel);


    }
    
}
