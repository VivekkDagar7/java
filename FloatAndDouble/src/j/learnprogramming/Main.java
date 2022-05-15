package j.learnprogramming;

public class Main{

    public static void main(String[] args){

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5d / 3d;
        System.out.println("MyIntValue: " + myIntVal);
        System.out.println("MyFloatValue: " + myFloatVal);
        System.out.println("MyDoubleValue: " + myDoubleVal);

        //Converting pound into kilograms
        double poundVal = 7d;
        double convertedKilograms = poundVal * 0.4539237d;
        System.out.println("Therefore, the kilograms value is: " + convertedKilograms);

        double pi = 3.1415927d;
        double something = 3_77.1_7d;
        System.out.println(pi);
        System.out.println(something);
    }
}