import org.apache.commons.math3.util.Precision;

public class MainCodeChecks {
    public static void main(String[] args) {
        System.out.println(Precision.round(Calculator.converter(800.00,"m","NM"),2));

    }
}
