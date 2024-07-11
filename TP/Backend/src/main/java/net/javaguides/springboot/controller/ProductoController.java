package net.javaguides.springboot.controller;

import java.util.List;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Producto;
import net.javaguides.springboot.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/basejava/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository ProductoRepository;

    @GetMapping
    public List<Producto> todosproductos(){
        return ProductoRepository.findAll();
    }

    @PostMapping
    public Producto crearproducto(@RequestBody Producto employee) {
        return ProductoRepository.save(employee);
    }

    @GetMapping("{id}")
    public ResponseEntity<Producto> obterproducto(@PathVariable  long id){
        Producto producto = ProductoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe un producto con el id:" + id));
        return ResponseEntity.ok(producto);
    }

    @PutMapping("{id}")
    public ResponseEntity<Producto> actualizarproducto(@PathVariable long id,@RequestBody Producto productodetalle) {
        Producto actualizarproducto = ProductoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe un producto con el id: " + id));
                actualizarproducto.setNombre(productodetalle.getNombre());
                actualizarproducto.setDescripcion(productodetalle.getDescripcion());
                actualizarproducto.setImg(productodetalle.getImg());
                actualizarproducto.setPrecio(productodetalle.getPrecio());
                ProductoRepository.save(actualizarproducto);
        return ResponseEntity.ok(actualizarproducto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> borrarproducto(@PathVariable long id){
        Producto producto = ProductoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe un producto con el id: " + id));
                ProductoRepository.delete(producto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
