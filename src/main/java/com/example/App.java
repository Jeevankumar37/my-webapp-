// src/main/java/com/example/App.java
package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class App extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("Hello from Maven Web App!");
    }
}

