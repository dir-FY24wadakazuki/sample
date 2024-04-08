package sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
        // 例外発生する可能性あるコード
            int a = 10/0;
            System.out.println(a);
        }catch (ArithmeticException e) {
         // ArithmeticExceptionが発生した場合の処理を書きます
            System.out.println("ArithmeticExceptionが発生: " + e.getMessage());
        }finally {
            System.out.println("割り算終了");
        }
    System.out.println("処理終了");
    }

}
