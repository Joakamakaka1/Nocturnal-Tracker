/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.ArrayList;
import model.Partidas;

/**
 *
 * @author Joakamakaka
 */
public interface PartidasInterface {
    
    ArrayList<Partidas> listarPartidasPorId(Integer id);
    
    ArrayList<Partidas> listarPartidas();
}
