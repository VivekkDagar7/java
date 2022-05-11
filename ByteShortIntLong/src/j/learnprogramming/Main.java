package j.learnprogramming;

public class Main{

    public static void main(String[] args){

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Busted MAX Value: " + (myMaxIntValue+1));
        System.out.println("Busted MIN Value: " + (myMinIntValue-1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        /*Notice the 'L', it is important to specify that the value initialized must be treated as a long,
        by default it is treated as an int if we don't explicitly specify it*/
        long myLongValue =  100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        /*As by default it considers it to be an int and tries to assign the space required to store an int to a byte
        variable, it gives an error*/
        //byte myNewByteValue = (myMinByteValue/2);

        //Fix: casting
        byte myNewByteValue = (byte)(myMinByteValue/2);
        short myNewShortValue = (short)(myMinShortValue/2);
    }
}