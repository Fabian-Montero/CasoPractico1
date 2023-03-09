package com.CasoPractico1.controller;

import com.CasoPractico1.entity.Pelicula;
import com.CasoPractico1.service.IPeliculaService;
import com.CasoPractico1.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeliculaController {
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/pelicula")
    public String getPeliculas(Model model){
        List<Pelicula> listaPeliculas = peliculaService.getAllPeliculas();
        model.addAttribute("peliculas", listaPeliculas);
        return "peliculas";
    }
    
    @GetMapping ("/peliculaN")
    public String crearPelicula(Model model){
        model.addAttribute("pelicula", new Pelicula());
        return"crearPelicula";
    }
    
    @PostMapping ("/savePelicula")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
    peliculaService.savePelicula(pelicula);
    return "redirect:/pelicula";
    }
    
    @GetMapping("delete/{id}")
    public String eliminarPelicula (@PathVariable("id") int idPelicula){
        peliculaService.deleletePeliculaById(idPelicula);
        return "redirect:/pelicula";
    }
    
    @GetMapping("/editPelicula/{id}")
    public String editarPelicula (@PathVariable("id") int idPelicula, Model model){
        Pelicula pelicula = peliculaService.getPeliculaById(idPelicula);
        model.addAttribute("pelicula", pelicula);
        return "crearPelicula";
    }
    
    
    
    

}
