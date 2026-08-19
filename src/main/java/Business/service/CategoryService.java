package Business.service;

import Business.model.Category;
import Business.port.in.CategoryUseCase;
import Business.port.out.CategoryOutPort;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements CategoryUseCase {

    private final CategoryOutPort categoryOutPort;
    public CategoryService(CategoryOutPort categoryOutPort) {
        this.categoryOutPort = categoryOutPort;
    }

    @Override
    public Category findById(Long id) {
        return categoryOutPort.findById(id);
    }
}
