package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
public class FacturaController {
	@Autowired
    private FacturaRepository facturaRepository;
	
	
	
	
    @GetMapping(path = "/facturas")
    public List<Factura> getFacturas() {
    	facturaRepository.findAll().forEach(System.out::println);
        return (List<Factura>) facturaRepository.findAll();
    }
 
    @PostMapping(path ="/facturas")
    void addFactura(@RequestBody  Factura factura) {
    	
    	
    	facturaRepository.save(factura);
    }

	

	

	
    
    
}
