package Adapter.port.in;

import Adapter.port.ProductWebMapper;
import Business.model.Product;
import Business.port.in.ProductUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductUseCase productUseCase;

    public ProductController(ProductUseCase productUseCase) {
        this.productUseCase = productUseCase;
    }

    @GetMapping
    public ResponseEntity<List<ProductWebModel>> findProducts(@RequestParam double price) {

        List<Product> products = productUseCase.findProductsByPrice(price);

        if (products.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        List<ProductWebModel> productWebModelList = ProductWebMapper.mapProductListToProductWebModelList(products);

        return ResponseEntity.ok(productWebModelList);
    }
}