package com.mycompany.automovil;

import com.mycompany.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
        
        //Llamamos y hacemos visible a nuestra IGU
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
    }
}
