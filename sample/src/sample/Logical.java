package sample;

public class Logical {

    public static void main(String[] args) {
        int score = 59;  // 成績
        
     // and:scoreが40以上、かつ50以下
        System.out.print("socoreが４０以上、かつ５０以下");
        System.out.println(score >= 40 && score <= 50 );
        
     // or:scoreが40以上、または50以下
        System.out.print("socoreが４０以上、または５０以下");
        System.out.println(score >= 40 || score <= 50 );
        
     // not:scoreが60以上ではない
        System.out.print("socoreが60以上でない");
        System.out.println( !(score >= 60));
        

    }

}
