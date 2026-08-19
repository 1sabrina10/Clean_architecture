package Adapter.port;

import Adapter.port.in.CategoryWebModel;
import Business.model.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryWebMapper {

    public static CategoryWebModel mapCategoryToCategoryWebModel(Category category){
        CategoryWebModel webModel = new CategoryWebModel();

        webModel.setId(category.getId());
        webModel.setName(category.getName());

        return webModel;
    }
}
