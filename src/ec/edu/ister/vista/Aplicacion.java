/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

//import ec.edu.ister.modelo.TipoMetodos;
import ec.edu.ister.modelo.Persona;
import ec.edu.ister.modelo.TipoMetodos;
import static ec.edu.ister.modelo.TipoMetodos.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;


/**
 * @Instituto Rumiñahui
 * @author Paola
 */
public class Aplicacion {
    
    public static void main(String[] args) {
//        TipoMetodos.metodoStatic1();
//        TipoMetodos.metodoStatic2(4);
//        System.out.println(TipoMetodos.metodoStatic3(3));

//        metodoStatic1();
//        showMessageDialog(null, "null");
//        showMessageDialog(null, pow(2, 3));
        
//        TipoMetodos tp = new TipoMetodos();
//        tp.suma(6,7);
//        
//        Persona p = new Persona();
//        p.setCedula("123456789");
//        showMessageDialog(null, p.getCedula());

          FrmPersona frm1 = new FrmPersona();
          frm1.setVisible(true);
    }
    
}
