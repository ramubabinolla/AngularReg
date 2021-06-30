package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.ProductModel;

@Repository
public interface ProductModelRepository extends JpaRepository<ProductModel, Long>{

}
