import java.util.Random;

public class ComputeMethods {

    //method
    public double fToC(double degreesF){
        return (degreesF - 32) * 5 / 9;
    }

    public double hypotenuse(int a, int b){
        return Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2));
    }

    public int roll(){
        Random rnd2Dice = new Random();
        return rnd2Dice.nextInt(12)+1;
    }
}
