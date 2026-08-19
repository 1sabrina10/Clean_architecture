package Business.port.out;

import Business.model.Product;
import java.time.LocalDate;
import java.util.List;

public interface ProductOutPort {

   List<Product> retrieve(double price);
}
