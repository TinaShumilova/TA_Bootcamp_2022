import com.bootcampexcercise.module10.Calculator;

public class Main {
    public static void main(String[] args) {

        Main obj = new Main();

        System.out.println(obj.getQuotient(2,20));
        System.out.println(obj.sum2(5, 10));

    }
    public String getQuotient(int a, int b) {
        double result = 0.0;
        if (a == 0 || b == 0) {
            try {
                return String.valueOf(a / b);
            } catch (ArithmeticException e) {
                return "Division by zero is not allowed";
            }
        } else  {
            double c = Double.valueOf(a);
            double d = Double.valueOf(b);
            result = (c / d);
            return String.valueOf(result);
        }
    }

    public String sum2 (double a, double b){
        return String.valueOf(a/b);
    }
}