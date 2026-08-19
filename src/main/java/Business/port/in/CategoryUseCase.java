package Business.port.in;

import Business.model.Category;

public interface CategoryUseCase {

   Category findById(Long id);

}
