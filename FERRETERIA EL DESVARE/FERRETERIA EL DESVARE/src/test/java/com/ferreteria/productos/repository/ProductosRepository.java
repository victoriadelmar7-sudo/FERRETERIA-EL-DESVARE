package com.ferreteria.productos.repository
;
import com.ferreteria.productos.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface ProductosRepository extends JpaRepository<Productos, Long> {

}
