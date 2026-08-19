package Business.service;

import Business.model.Product;
import Business.port.in.ProductUseCase;
import Business.port.out.ProductOutPort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService implements ProductUseCase {

    private final ProductOutPort productOutPort;

    public ProductService(ProductOutPort productOutPort) {
        this.productOutPort = productOutPort;
    }

    @Override
    public List<Product> findProductsByPrice(double price) {
        return productOutPort.retrieve(price);
    }
}
