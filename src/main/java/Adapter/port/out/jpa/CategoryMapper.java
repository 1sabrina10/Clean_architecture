package Adapter.port.out.jpa;

import Business.model.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public  static Category mapCategoryEntityToCategory(CategoryEntity entity){
        Category category = new Category();

        category.setId(entity.getId());
        category.setName(entity.getName());

        return category;
    }

    public static CategoryEntity mapCategoryToCategoryEntity(Category category) {

        CategoryEntity entity = new CategoryEntity();

        entity.setId(category.getId());
        entity.setName(category.getName());

        return entity;
    }
}
