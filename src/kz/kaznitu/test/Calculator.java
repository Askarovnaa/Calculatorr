package kz.kaznitu.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
try{
        Integer z = Integer.parseInt(req.getParameter("number1"));

        Integer h = Integer.parseInt(req.getParameter("number2"));

            String operator = req.getParameter("oper");
            Integer y = 0;

                String amal = new String();
                switch (operator) {
                    case "add":
                        y = z + h;
                        amal ="+";
                        break;
                    case "min":
                        y = z - h;
                        amal="-";
                        break;
                    case "umn":
                        y = z * h;
                        amal="*";
                        break;
                    case "del":
                        y = z / h;
                        amal="/";
                        break;
                }
                out.println("<h1>" + z + " " + amal + " " + h + " = " + y + "</h1>");
        }finally {
    out.close();
        }
        }
    }



