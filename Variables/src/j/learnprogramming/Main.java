package j.learnprogramming;

public class Main{

    public static void main(String[] args){
        System.out.println("This is a program demonstration variables");

        int myFirstNumber = (10+5)+(2*7);
        int mySecondNumber = 23;
        int myThirdNumber = myFirstNumber*3;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        //Challenge
        int myLastOne = 1000-myTotal;
        System.out.println(myLastOne);
    }
}