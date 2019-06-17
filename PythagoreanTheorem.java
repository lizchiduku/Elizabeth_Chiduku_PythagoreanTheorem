import 
public class Pythagorean {
    public double calculateHypotenuse(int A, int B) {
        // the hypotenuse is the side across the right angle.
        double legA = A*A;
        double legB = B*B;
        // calculate the value of c given legA and legB
        double legC = Math.sqrt(legA + legB);
        return legC;
    }
}