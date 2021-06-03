package self.learning.edu.basma_online_Store.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import self.learning.edu.basma_online_Store.models.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Long>{
Categories findByCname(String c_name);

}
