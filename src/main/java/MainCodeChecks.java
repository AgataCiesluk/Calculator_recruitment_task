import org.apache.commons.math3.util.Precision;

public class MainCodeChecks {
    public static void main(String[] args) {
        System.out.println(Calculator.converter(8000,"ft","m"));
        System.out.println(Calculator.converter(1,"NM","m"));
        System.out.println("Sum = " + Calculator.addAndConvert(8000,"ft",1,"NM","m"));
        System.out.println("Difference = " + Calculator.subtractAndConvert(8000,"ft",1,"NM","m"));
        System.out.println("Product = " + Calculator.multiplyAndConvert(8000,"ft",1,"NM","m"));
        System.out.println("Quotient = " + Calculator.divideAndConvert(8000,"ft",1,"NM","m"));
    }
}
