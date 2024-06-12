/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.ArrayList;
import model.Personajes;

/**
 *
 * @author Joakamakaka
 */
public interface PersonajesInterface {
    
    Personajes buscarPorId(Integer id);
      
    ArrayList<Personajes> listarPersonajes();
}
