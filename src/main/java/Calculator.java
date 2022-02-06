import java.math.BigDecimal;

public class Calculator {

    public static double addAndConvert (double val1, double val2, String val1Unit, String val2Unit, String resultUnit){
        double sum = 0; //use Precision.round(sum,2) to get double value rounded to 2 decimal places


        return sum;
    }

    public static double converter (double value, String valueUnit, String convertToUnit) {
        double convertedValue = 0;

        switch (convertToUnit) {
            case "m":
                switch (valueUnit) {
                    case "m":
                        convertedValue = value;
                        break;
                    case "NM":
                        convertedValue = value * 1852;
                        break;
                    case "ft":
                        convertedValue = value * 0.3048;
                        break;
                    default:
                        throw new IllegalArgumentException("Available units are: m (meters), ft (feet), NM (nautical miles).");
                }
                break;
            case "NM":
                switch (valueUnit) {
                    case "m":
                        convertedValue = value * 0.0005399568;
                        break;
                    case "NM":
                        convertedValue = value;
                        break;
                    case "ft":
                        convertedValue = value * 0.000164578834;
                        break;
                    default:
                        throw new IllegalArgumentException("Available units are: m (meters), ft (feet), NM (nautical miles).");
                }
                break;
            case "ft":
                break;
            default:
                throw new IllegalArgumentException("Available units are: m (meters), ft (feet), NM (nautical miles).");

        }
        return convertedValue;
    }
}
