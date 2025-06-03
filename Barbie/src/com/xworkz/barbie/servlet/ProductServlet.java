package com.xworkz.barbie.servlet;

import com.xworkz.barbie.dto.ProductDto;
import com.xworkz.barbie.repository.ProductRepository;
import com.xworkz.barbie.repository.ProductRepositoryImpl;
import com.xworkz.barbie.service.ProductImplementation;
import com.xworkz.barbie.service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product")
    public class ProductServlet extends HttpServlet {
    private ProductService productService;
        public ProductServlet() {
            System.out.println("ProductServlet Constructor");
        }

    @Override
    public void init() {
        System.out.println("init method in product servlet");
        ProductRepository productRepository = new ProductRepositoryImpl();
        this.productService = new ProductImplementation();
    }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ServletException, IOException {

            System.out.println("doPost method in ProductServlet");

            String name = req.getParameter("name");
            String type = req.getParameter("type");
            String incomingPrice = req.getParameter("incomingPrice");
            String sellingPrice = req.getParameter("sellingPrice");
            String mrp = req.getParameter("mrp");
            String description = req.getParameter("description");
            String brand = req.getParameter("brand");
            String quantity = req.getParameter("quantity");
            String color = req.getParameter("color");
            String weight = req.getParameter("weight");
            String manufDate = req.getParameter("manufDate");
            String warranty = req.getParameter("warranty");
            String returnPolicy = req.getParameter("returnPolicy");

            ProductDto productDto = new ProductDto();
            productDto.setName(name);
            productDto.setType(type);
            productDto.setIncomingPrice(incomingPrice);
            productDto.setSellingPrice(sellingPrice);
            productDto.setMrp(mrp);
            productDto.setDescription(description);
            productDto.setBrand(brand);
            productDto.setQuantity(quantity);
            productDto.setColor(color);
            productDto.setWeight(weight);
            productDto.setManufDate(manufDate);
            productDto.setWarranty(warranty);
            productDto.setReturnPolicy(returnPolicy != null);

            ProductService productService = new ProductImplementation();
            boolean saved = productService.save(productDto);

            if (saved) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("ProductSuccess.jsp");
                req.setAttribute("productDto", productDto);
                dispatcher.forward(req, resp);
            } else {
                RequestDispatcher dispatcher = req.getRequestDispatcher("Product.jsp");
                req.setAttribute("message", "Saving Product Failed");
                dispatcher.forward(req, resp);
            }
        }
    }

