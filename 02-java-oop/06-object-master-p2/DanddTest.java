public class DanddTest {
    public static void main(String[] args) {
        Human h1 = new Human();
        Wizard w1 = new Wizard();
        Ninja n1 = new Ninja();
        Samurai s1 = new Samurai();
        Samurai s2 = new Samurai();
        Samurai s3 = new Samurai();
        Samurai s4 = new Samurai();
        // wizard heal
        System.out.println("Human Health before heal by wizard " + h1.health);
        w1.heal(h1);
        System.out.println("Human Health after heal by wizard " + h1.health);

        // wizard fireaball
        System.out.println("Human Health Before Fireball attack by wizard " + h1.health);
        w1.fireball(h1);
        System.out.println("Human Health After Fireball attack by wizard " + h1.health);
        // ninja steal(human)

        // ninja runaway

        System.out.println("Ninja Before runaway  " + n1.health);
        n1.runAway();
        System.out.println("Ninja Before runaway  " + n1.health);
        // ninja steal
        System.out.println("Human health before steal by ninja " + h1.health);
        System.out.println("Ninja health before steal " + n1.health);
        n1.steal(h1);
        System.out.println("Human health after steal by ninja " + h1.health);
        System.out.println("Ninja health after steal " + n1.health);

        // samurai deathblow
        System.out.println("Human health before deathBlow " + h1.health);
        System.out.println("Samurai health before deathBlow " + s1.health);
        s1.deathBlow(h1);
        System.out.println("Human health after deathBlow " + h1.health);
        System.out.println("Samurai health after deathBlow " + s1.health);

        // samurai meditate
        System.out.println("samurai health before meditate " + s1.health);
        s1.meditate();
        System.out.println("samurai health after meditate " + s1.health);

        // samurai howmany
        s1.howMany();
    }

}
