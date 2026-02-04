package com.ferreteria.eldesvare.Productos.Controller;


import com.ferreteria.eldesvare.Productos.Model.Producto;
import com.ferreteria.eldesvare.Productos.Service.ProductoService;
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
}