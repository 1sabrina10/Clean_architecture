package Business.port.in;

import Business.model.Product;
import java.util.List;

public interface ProductUseCase {

    List<Product> findProductsByPrice(double price);
}
