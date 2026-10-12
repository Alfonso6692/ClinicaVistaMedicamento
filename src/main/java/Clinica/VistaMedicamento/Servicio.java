/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.VistaMedicamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Servicio {
    @Autowired
    private RestTemplate rt;
    
    public void grabar(Medicamento m){
        rt.postForObject("http://localhost:8081/medicamento/grabar", m, void.class);
    }
}
