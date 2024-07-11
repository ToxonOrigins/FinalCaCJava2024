package net.javaguides.springboot.servingwebcontent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import net.javaguides.springboot.controller.ProductoController;
import net.javaguides.springboot.model.Producto;
import net.javaguides.springboot.repository.ProductoRepository;


@Controller
public class FrontController {
@Autowired
    private ProductoRepository ProductoRepository;
    ProductoController controller;
    @GetMapping("/producto")
	public String producto(@RequestParam(name="id", required=true, defaultValue="") String id, String nombre, String descripcion,String img, String precio, Model model) {
		@SuppressWarnings("deprecation")
        Producto mostrar= ProductoRepository.getById(Long.valueOf(id));
        model.addAttribute("nombre", mostrar.getNombre());
        model.addAttribute("precio", mostrar.getPrecio());
        model.addAttribute("descripcion", mostrar.getDescripcion());
        model.addAttribute("img", mostrar.getImg());
		return "producto";
	}

}
