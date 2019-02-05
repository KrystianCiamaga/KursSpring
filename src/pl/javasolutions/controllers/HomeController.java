package pl.javasolutions.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.javasolution.pojo.Product;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home(Model model) {
		
		List<Product> products = getProducts();
		
		model.addAttribute("products",products);
		model.addAttribute("nick", "Jan");
		return "home";
	}
	
	private List<Product> getProducts() {
		
		List<Product> products = new ArrayList<>();
		Product prod = new Product("koszulki","Koszulka1");
		Product secondProd = new Product("koszulki", "Koszulka2");
		Product thirdProd = new Product("spodnie","Spodnie1");
		Product forthProd = new Product("spodnie", "Spodnie2");
		products.add(prod);
		products.add(secondProd);
		products.add(thirdProd);
		products.add(forthProd);
		return products;
	}
}
