import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class MainCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operation = req.getParameter("operation");
        double val1 = Double.parseDouble(req.getParameter("val1"));
        String val1Unit = req.getParameter("val1Unit");
        double val2 = Double.parseDouble(req.getParameter("val2"));
        String val2Unit = req.getParameter("val2Unit");
        String resultUnit = req.getParameter("resultUnit");

        if (val1 > 0 && val2 > 0) {
            switch (operation) {
                case "add":
                    double sum = Calculator.addAndConvert(val1, val1Unit, val2, val2Unit, resultUnit);
                    resp.getWriter().printf("Sum = %.2f %s", sum, resultUnit);
                    break;
                case "subtract":
                    double difference = Calculator.subtractAndConvert(val1, val1Unit, val2, val2Unit, resultUnit);
                    resp.getWriter().printf("Difference = %.2f %s", difference, resultUnit);
                    break;
                case "multiply":
                    double product = Calculator.multiplyAndConvert(val1, val1Unit, val2, val2Unit, resultUnit);
                    resp.getWriter().printf("Product = %.2f %s", product, resultUnit);
                    break;
                case "divide":
                    double quotient = Calculator.divideAndConvert(val1, val1Unit, val2, val2Unit, resultUnit);
                    resp.getWriter().printf("Quotient = %.2f %s", quotient, resultUnit);
                    break;
                default:
                    throw new IllegalArgumentException("Available options are: add, subtract, multiply, divide.");
            }
        } else {
            throw new IllegalArgumentException("Expecting values greater than 0.00.");
        }

    }
}
