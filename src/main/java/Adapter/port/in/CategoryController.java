package Adapter.port.in;

import Adapter.port.CategoryWebMapper;
import Business.model.Category;
import Business.port.in.CategoryUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryUseCase categoryUseCase;
    public CategoryController(CategoryUseCase categoryUseCase) {
        this.categoryUseCase = categoryUseCase;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryWebModel>findById(@PathVariable Long id){

        Category category = categoryUseCase.findById(id);
        CategoryWebModel result = CategoryWebMapper.mapCategoryToCategoryWebModel(category);

        return ResponseEntity.ok(result);

    }
}
