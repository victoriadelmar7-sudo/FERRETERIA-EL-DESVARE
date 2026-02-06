package com.ferreteria.eldesvare.productos.service;

import com.ferreteria.eldesvare.productos.model.Producto;
import com.ferreteria.eldesvare.productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}

