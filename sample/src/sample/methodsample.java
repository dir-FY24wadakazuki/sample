package sample;

import javax.naming.spi.DirStateFactory.Result;

public class methodsample {

    public static void main(String[] args) {
        var number1 = 100;
        var number2 = 10;
        
        sumMethod(number1, number2);
    }
    
    public static void sumMethod(int num1, int num2) {
        var result = num1 +num2;
        System.out.println("sumMethodの結果は" + result);
    }

}
