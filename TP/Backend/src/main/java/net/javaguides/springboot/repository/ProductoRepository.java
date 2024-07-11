package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // all crud database methods
}


