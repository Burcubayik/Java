package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products") //böyle bir isttk gelirse bu class  krşılayacak
public class ProductsController { // dış dünyanın sistemle iletişim kurduğu yer
	
	private ProductService productService;
	@Autowired //newlemeyi yapıyor
	public ProductsController(ProductService productService) {
	super();
	this.productService = productService;
}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
		}
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
		
	}

}
