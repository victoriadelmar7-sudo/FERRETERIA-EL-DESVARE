package com.ferreteria.eldesvare.Productos.Repository;

import com.ferreteria.eldesvare.Productos.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}