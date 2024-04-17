package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Automovil;
import java.util.List;

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        
        autoJpa.create(auto);
       
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }

  
    
}
