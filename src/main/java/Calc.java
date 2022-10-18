public class Calc {

    //to do test driven development.
    //first write a test
    //have the fail
    //implemet the test to pass
    //if it fails, Refactor
    // - RED, GREEN, REFACTOR;

    public double add(double x, double y){
        return x + y;
    }

    public double canAreaOfCircle(){
        return 0.0;
    }
    public Double checkIfParameterIsNull(Double number){
        if(number != null){
            return number;

        }
        return null;
    }
    public boolean isGreater(int x, int y){
        if(x>y){
            return true;
        }

        return false;
    }

    public int[] multiplyArrayElementsByNumberGiven(int [] array, int number){
       int[] total= new int[array.length];
        for(int x = 0; x<array.length; x++){
        total[x] =  array[x]*number;
      }
        return total;
    }
}
