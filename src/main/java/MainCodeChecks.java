import org.apache.commons.math3.util.Precision;

public class MainCodeChecks {
    public static void main(String[] args) {
        System.out.println(Calculator.converter(8000,"m","NM"));
        System.out.println(Calculator.converter(8000,"ft","NM"));
        System.out.println("Sum = " + Calculator.addAndConvert(8000,"m",8000,"ft","NM"));
        System.out.println("Difference = " + Calculator.subtractAndConvert(8000,"m",8000,"ft","NM"));
        System.out.println("Product = " + Calculator.multiplyAndConvert(8000,"m",8000,"ft","NM"));
        System.out.println("Quotient = " + Calculator.divideAndConvert(8000,"m",0,"ft","NM"));
    }
}
