package com.duoc.gestion.servicios;

import com.duoc.gestion.modelos.Producto;
import com.duoc.gestion.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repo;

    public Producto save(Producto p) { return repo.save(p); }

    public List<Producto> list() { return repo.findAll(); }

    public Optional<Producto> get(Long id) {
        return repo.findById(id);
    }

    public void delete(Long id) { repo.deleteById(id); }

    public Producto update(Long id, Producto p) {
        p.setId(id);
        return repo.save(p);
    }

}
