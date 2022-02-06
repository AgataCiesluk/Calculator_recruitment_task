import org.apache.commons.math3.util.Precision;

public class MainCodeChecks {
    public static void main(String[] args) {
        System.out.println(Precision.round(Calculator.converter(8000,"m","NM"),2));
        System.out.println(Precision.round(Calculator.converter(8000,"ft","NM"),2));
        System.out.println(Calculator.addAndConvert(8000,"m",8000,"ft","NM"));
        System.out.println(Calculator.subtractAndConvert(8000,"m",8000,"ft","NM"));

    }
}
