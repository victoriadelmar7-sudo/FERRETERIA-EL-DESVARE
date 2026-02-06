package com.ferreteria.eldesvare.config;

import com.ferreteria.eldesvare.productos.model.Producto;
import com.ferreteria.eldesvare.productos.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitData {

    @Bean
    CommandLineRunner initDatabase(ProductoRepository productoRepository) {
        return args -> {

            Producto martillo = new Producto();
            martillo.setNombre("Martillo");
            martillo.setPrecio(25000.0);
            martillo.setStock(10);

            Producto taladro = new Producto();
            taladro.setNombre("Taladro");
            taladro.setPrecio(120000.0);
            taladro.setStock(5);

            Producto destornillador = new Producto();
            destornillador.setNombre("Destornillador");
            destornillador.setPrecio(8000.0);
            destornillador.setStock(20);

            productoRepository.save(martillo);
            productoRepository.save(taladro);
            productoRepository.save(destornillador);

            System.out.println("Productos iniciales cargados ✅");
        };
    }
}

