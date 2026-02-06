package com.ferreteria.eldesvare.productos.repository;

import com.ferreteria.eldesvare.productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}