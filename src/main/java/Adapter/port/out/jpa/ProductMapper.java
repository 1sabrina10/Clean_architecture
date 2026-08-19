package Adapter.port.out.jpa;

import Business.model.Category;
import Business.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMapper {

    public static List<Product> mapProductEntityListToProductList(List<ProductEntity> productEntityList) {

        return productEntityList.stream()
                .map(ProductMapper::mapProductEntityToProduct)
                .toList();
    }
    private static Product mapProductEntityToProduct(ProductEntity entity) {

        Product product = new Product();
        product.setId(entity.getId());
        product.setName(entity.getName());
        product.setPrice(entity.getPrice());

        Category category = new Category();
        category.setId(entity.getCategory().getId());
        category.setName(entity.getCategory().getName());

        product.setCategory(category);
        return product;
    }
}
