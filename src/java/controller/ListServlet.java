package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ListServlet", urlPatterns = {"/list"})
public class ListServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num_raw = request.getParameter("num");
        int num;
        try {
            num = Integer.parseInt(num_raw); // Sửa thành Integer
            List<Student> list = new ArrayList<>();
            int id;
            String name, dob;
            boolean gender;
            Random r = new Random();
            for (int i = 0; i < num; i++) {
                id = i + 1;
                gender = r.nextBoolean();
                if (gender) {
                    name = "Mr" + id;
                } else {
                    name = "Miss" + id;
                }
                dob = "2002"; // Thêm dấu chấm phẩy
                Student s = new Student(id, name, dob, gender);
                list.add(s);
            }
            request.setAttribute("data", list);
            request.getRequestDispatcher("list.jsp").forward(request, response); // Sửa lại đường dẫn JSP
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
