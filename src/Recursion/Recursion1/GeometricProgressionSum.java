package Recursion.Recursion1;

// Arithmetic Progression (AP), Geometric Progression (GP)
public class GeometricProgressionSum {
    public static double geometricSum(int k) {
        return helper(k);
    }

    static double helper(int k) {
        if (k==0) return 1;

        double val = 1/Math.pow(2,k);
        return helper(k-1)+ val;
    }


}
