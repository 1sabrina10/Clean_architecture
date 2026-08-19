package Adapter.port.out;

import Adapter.port.out.jpa.JpaProductRepository;
import Adapter.port.out.jpa.ProductEntity;
import Adapter.port.out.jpa.ProductMapper;
import Business.model.Product;
import Business.port.out.ProductOutPort;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.List;

@Component
public class ProductImpl implements ProductOutPort {

    private final JpaProductRepository jpaProductRepository;
    private final ProductMapper productMapper;

    public ProductImpl(JpaProductRepository jpaProductRepository, ProductMapper productMapper) {
        this.jpaProductRepository = jpaProductRepository;
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> retrieve(double price) {

        List<ProductEntity> productByPriceAndDate = jpaProductRepository.findProductByPriceAndDate(price);
        return ProductMapper.mapProductEntityListToProductList(productByPriceAndDate);
    }
}
