package ua.training;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

import static ua.training.MultiLang.Messages.*;

@WebServlet(name = "ServletController", urlPatterns = {"/ServletController"})
public class ServletController extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        Model model = new Model();
        View view = new View();
        UtilityController utilityController = new UtilityController();
        utilityController.createAppliances(model);

        PrintWriter out = response.getWriter();

        //Button handlers:
        if (request.getParameter("Calculate") != null) {
            view.printLnMessage(messagesBundle.getString(TOTAL_POWER_CONSUMPTION) + model.calculateTotalPowerConsumption(), out);
        }
        else if (request.getParameter("Sort") != null) {
            view.printLnMessage(messagesBundle.getString(APPLIANCES_SORTED_BY_POWER_CONSUMPTION), out);

            model.sortByPowerConsumption();
            for (ElectricalAppliance curAppliance : model.getAppliancesList()) {
                view.printLnMessage(curAppliance.toString(), out);
            }
        }
        else if (request.getParameter("Find") != null) {
            view.printLnMessage(messagesBundle.getString(APPLIANCE_FOUND_BY_NAME), out);
            view.printLnMessage(model.findApplianceByName("Philips"), out);
        }
        out.close();
    }
}
