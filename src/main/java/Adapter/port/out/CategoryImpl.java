package Adapter.port.out;

import Adapter.port.out.jpa.CategoryEntity;
import Adapter.port.out.jpa.CategoryMapper;
import Adapter.port.out.jpa.JpaCategoryRepository;
import Business.model.Category;
import Business.port.out.CategoryOutPort;
import org.springframework.stereotype.Component;

@Component
public class CategoryImpl implements CategoryOutPort {

    private final JpaCategoryRepository jpaCategoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryImpl(JpaCategoryRepository jpaCategoryRepository, CategoryMapper categoryMapper) {
        this.jpaCategoryRepository = jpaCategoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public Category findById(Long id) {
        CategoryEntity entity =  jpaCategoryRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Category not found"));

        return CategoryMapper.mapCategoryEntityToCategory(entity);
    }
}
