package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    
     ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String matricula, int cantPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setMatricula(matricula);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil (auto);
        
    }

    public List<Automovil> traerAutos() {
        
      return controlPersis.traerAutos();
        
    }
    
  
    
}
