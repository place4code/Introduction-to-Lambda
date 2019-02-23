package com.company;

//############################################
interface InterLambda {
    int getValue(int n);
}

interface InterLambda2<T> {
    T genInter(T t);
}

interface StringFunc {
    String func(String s);
}
//############################################
public abstract class Main {

    public static void main(String[] args) {

        InterLambda interLambda = (n) -> 123 * n;
        InterLambda interLambda2 = (n) -> 143 * n;

        InterLambda2<Integer> genLambda = (val) -> {
            //...
            return val * 2;
        };

        System.out.println(interLambda.getValue(5));
        System.out.println(interLambda2.getValue(7));
        System.out.println(genLambda.genInter(5));

        String inString = "String in";

        String lambdaString = stringOp((str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = inString.length()-1; i >= 0; i--) {
                result.append(inString.charAt(i));
            }
            return result.toString();
        }, inString);

        System.out.println(lambdaString);

    }

    private static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }



}
