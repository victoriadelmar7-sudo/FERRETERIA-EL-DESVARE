package com.ferreteria.productos.config;

import com.ferreteria.productos.model.Productos;
import com.ferreteria.productos.repository.ProductosRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class config {

    @Bean
    CommandLineRunner initDatabase(ProductosRepository productosRepository) {
        return args -> {
            Productos martillo = new Productos("Martillo", new BigDecimal("25000"), 10);
            Productos taladro = new Productos("Taladro", new BigDecimal("120000"), 5);
            Productos destornillador = new Productos("Destornillador", new BigDecimal("8000"), 20);

            productosRepository.save(martillo);
            productosRepository.save(taladro);
            productosRepository.save(destornillador);

            System.out.println("Productos de ejemplo cargados en la base de datos ✅");
        };
    }
}