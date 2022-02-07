import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/multiply")
public class MultiplyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double val1 = Double.parseDouble(req.getParameter("val1"));
        String val1Unit = req.getParameter("val1Unit");
        double val2 = Double.parseDouble(req.getParameter("val2"));
        String val2Unit = req.getParameter("val2Unit");
        String resultUnit = req.getParameter("resultUnit");
        double product = Calculator.multiplyAndConvert(val1, val1Unit, val2, val2Unit, resultUnit);
        resp.getWriter().printf("Product = %.2f %s", product, resultUnit);
    }
}
