package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.CategoryService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Category;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin
public class CategoryController {
	
	private CategoryService categoryService;
	
	@Autowired
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Category>> getAll(){
		return this.categoryService.getAll();
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<Category>> getAllByPage(int pageNo, int pageSize){
		return this.categoryService.getAllByPage(pageNo,pageSize);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Category category) {
		return this.categoryService.add(category);
	}
	
}
