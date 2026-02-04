package com.ferreteria.productos.controller;

import com.ferreteria.productos.model.Productos;
import com.ferreteria.productos.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    private ProductosRepository productosRepository;

    // 1️⃣ Crear un producto con stock
    @PostMapping("/crear")
    public Productos crearProducto(
            @RequestParam String nombre,
            @RequestParam BigDecimal precio,
            @RequestParam int stock) {
        Productos producto = new Productos(nombre, precio, stock);
        return productosRepository.save(producto);
    }

    // 2️⃣ Listar todos los productos
    @GetMapping("/listar")
    public List<Productos> listarProductos() {
        return productosRepository.findAll();
    }

    // 3️⃣ Actualizar stock de un producto
    @PutMapping("/actualizarStock/{id}")
    public Productos actualizarStock(
            @PathVariable Long id,
            @RequestParam int nuevoStock) {
        Productos producto = productosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        producto.setStock(nuevoStock);
        return productosRepository.save(producto);
    }
}
