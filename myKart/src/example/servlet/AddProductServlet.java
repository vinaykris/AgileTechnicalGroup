package example.servlet;

import example.Product;
import example.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AddProductServlet extends HttpServlet {


    ProductService productService = new ProductService();

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        String category = request.getParameter("category");
        String priceStr = request.getParameter("price");
        String manufacturer = request.getParameter("manufacturer");
        Double price = Double.parseDouble(priceStr);
        Product product = new Product(fullName, category, price, manufacturer);
        productService.addProduct(product);
        List<Product> products = productService.getProducts();
        request.setAttribute("products", products);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
        requestDispatcher.forward(request,response);


    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    }
}
