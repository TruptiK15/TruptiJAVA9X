package October.ex_15102024_Ternary;

public class Operator_Ternary_grades {
    public static void main(String[] args) {

        //Nested Ternary
        //Syntax --> result = condition1 ? expression1 : condition2 ? expression2 : expression3
        /*
        Grade - score >= 90 - A
        Grade - score >= 80 - B
        Grade - score >= 70 - C
        Grade - score >= 60 - D
        Grade - score < 60 - F
        */
        int score = 77;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score > 70) ? "C" : (score >= 60) ? "D" : (score < 60 && score > 0) ? "F" : "Invalid no";
        System.out.println("Your grade is: " + grade);
        System.out.printf("Your grade is  %s", grade);
    }
}
