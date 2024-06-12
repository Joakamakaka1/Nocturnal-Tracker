/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author Joakamakaka
 */
public interface ClienteInterface {

    Cliente buscarPorId(Integer id);

    void eliminar(Cliente usuario);

    ArrayList<Cliente> listarUsuarios();

    void guardarUsuario(Cliente cliente);

    void editarCliente(Cliente cliente);
}
