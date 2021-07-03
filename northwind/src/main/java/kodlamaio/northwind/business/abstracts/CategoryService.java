package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Category;

public interface CategoryService {
	DataResult<List<Category>> getAll();
	DataResult<List<Category>> getAllByPage(int pageNo, int pageSize);
	Result add(Category category);
}
