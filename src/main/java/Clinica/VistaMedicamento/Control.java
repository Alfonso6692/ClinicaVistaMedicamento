/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.VistaMedicamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Control {
    @Autowired
    private Servicio s;
    @GetMapping("/ver")
    public String ver(Model m){
        m.addAttribute("med",new Medicamento());
        return "grabar";
    }
    @PostMapping("/grabar")
    public String grabar(Medicamento m){
        s.grabar(m);
        return "redirect:/ver?success";
    }
    
}
