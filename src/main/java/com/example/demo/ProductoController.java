package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepository;
 
    @GetMapping(path = "/productos")
    public List<Producto> getUsers() {
    	productoRepository.findAll().forEach(System.out::println);
        return (List<Producto>) productoRepository.findAll();
    }
 
    @PostMapping(path ="/productos")
    void addProducto(@RequestBody Producto producto) {
    	
    	System.out.println(producto.toString());
    	productoRepository.save(producto);
    }
    
    @PostMapping(path ="/eliminarProducto")
    void eliminarProducto(@RequestBody Producto producto) {
    	
    	System.out.println(producto.toString()+"eliminar");
    	productoRepository.delete(producto);
    }
    
    
   
    
}
