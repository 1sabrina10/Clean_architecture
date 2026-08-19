package Business.port.out;

import Business.model.Category;

public interface CategoryOutPort {

    Category findById(Long id);

}
