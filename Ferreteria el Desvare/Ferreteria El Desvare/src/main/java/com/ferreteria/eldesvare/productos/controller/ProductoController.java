package com.ferreteria.eldesvare.productos.controller;


import com.ferreteria.eldesvare.productos.model.Producto;
import com.ferreteria.eldesvare.productos.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/hola")
    public String hola() {
        return "Productos funcionando 🚀";
    }

    @GetMapping
    public List<Producto> listar() {
        return productoService.listarProductos();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }
}