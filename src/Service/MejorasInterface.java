/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.ArrayList;
import model.Mejoras;

/**
 *
 * @author Joakamakaka
 */
public interface MejorasInterface {
    
    Mejoras buscarPorId(Integer id);
      
    ArrayList<Mejoras> listarMejoras();
}
