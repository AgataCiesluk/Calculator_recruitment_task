import org.apache.commons.math3.util.Precision;

public class Calculator {

    public static double addAndConvert (double val1, String val1Unit, double val2, String val2Unit, String resultUnit){
        double sum = converter(val1, val1Unit, resultUnit) + converter(val2, val2Unit, resultUnit);
        return Precision.round(sum,2);
    }

    public static double subtractAndConvert (double val1, String val1Unit, double val2, String val2Unit, String resultUnit) {
        double difference = converter(val1, val1Unit, resultUnit) - converter(val2, val2Unit, resultUnit);
        return Precision.round(difference,2);
    }

    public static double multiplyAndConvert (double val1, String val1Unit, double val2, String val2Unit, String resultUnit) {
        double product = converter(val1, val1Unit, resultUnit) * converter(val2, val2Unit, resultUnit);
        return Precision.round(product,2);
    }

    public static double divideAndConvert (double val1, String val1Unit, double val2, String val2Unit, String resultUnit) {
        if (val2 == 0) {
            throw new IllegalArgumentException("Do not divide by 0.");
        } else {
            double quotient = converter(val1, val1Unit, resultUnit) / converter(val2, val2Unit, resultUnit);
            return Precision.round(quotient, 2);
        }
    }

    public static double converter (double value, String valueUnit, String convertToUnit) {
        double convertedValue;

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
                switch (valueUnit) {
                    case "m":
                        convertedValue = value * 3.2808399;
                        break;
                    case "NM":
                        convertedValue = value * 6076.1155;
                        break;
                    case "ft":
                        convertedValue = value;
                        break;
                    default:
                        throw new IllegalArgumentException("Available units are: m (meters), ft (feet), NM (nautical miles).");
                }
                break;
            default:
                throw new IllegalArgumentException("Available units are: m (meters), ft (feet), NM (nautical miles).");

        }
        return convertedValue;
    }
}
