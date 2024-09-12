package application.controller;

import java.util.Optional;

import org.stringframework.beans.factory.annotation.Autowired;
import org.stringframework.stereotype.Controller;
import org.stringframework.ui.Model;
import org.stringframework.web.bind.annotation.RequestMapping;
import org.stringframework.web.bind.annotation.RequestMethod;
import org.stringframework.web.bind.annotation.RequestParam;

import application.model.Categoria;
import application.repository.CategoriaRepository;

@Controller
@RequestMapping ("/categoria")
public class CategoriaController{
    @Autowired
    private CategoriaRepository categoriaRepo;

    @RequestMapping("/list")
    public string list (Model ui) {
        ui.addAttribute("categorias", categoriaRepo.findAll());
        return "categoria/list";
    }

    @RequestMapping("/insert")
    public String insert(){
        return "categoria/insert";
    }

    @RequestMapping(value= "/insert", method = RequestMethod.POST)
    public string 
}