package com.duoc.producto.controladores;


import com.duoc.producto.modelos.Producto;
import com.duoc.producto.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService service;

    @PostMapping
    public Producto crear(@RequestBody Producto p) {
        return service.save(p); }

    @GetMapping
    public List<Producto> verTodos() {
        return service.list(); }

    @GetMapping("/{id}")
    public Optional<Producto> verProducto(@PathVariable Long id){
        return service.get(id);
    }

    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto p) {
        return service.update(id, p);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        service.delete(id); }
}
