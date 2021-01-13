public class PythagoreanTest{
    public static void main (String[] args){
        Pythagorean py = new Pythagorean();
        Double hypotenuse = py.calculateHypotenuse(3,4);
        Double hypotenuse1 = py.calculateHypotenuse(5,12);
        System.out.println(hypotenuse);
        System.out.println(hypotenuse1);
    }
}