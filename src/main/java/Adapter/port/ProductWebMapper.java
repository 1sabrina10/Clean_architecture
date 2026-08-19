package Adapter.port;

import Adapter.port.in.ProductWebModel;
import Business.model.Product;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProductWebMapper {
    private final CategoryWebMapper categoryWebMapper;
    public ProductWebMapper(CategoryWebMapper categoryWebMapper) {
        this.categoryWebMapper = categoryWebMapper;
    }

    public static List<ProductWebModel> mapProductListToProductWebModelList(@NotEmpty List<Product> productList) {

        return productList.stream()
                .map(ProductWebMapper::mapProductToProductModel)
                .toList();
    }

    private static ProductWebModel mapProductToProductModel(Product product) {

        ProductWebModel model = new ProductWebModel();
        model.setName(product.getName());
        model.setPrice(product.getPrice());

        if(product.getCategory()!= null){
            model.setCategory(
                    CategoryWebMapper.mapCategoryToCategoryWebModel(
                            product.getCategory()
                    )
            );
        }

        return model;
    }
}
