/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DataBase;

import Model.Cliente;
import java.util.List;

/**
 *
 * @author Eriani M
 */
public interface ClienteDAO {
    
    void inserir ( Cliente cliente );
    Cliente buscarPorId ( int id);
    List<Cliente> listarTodos();
    void atualizar ( Cliente cliente );
    void deletar (int id);
    
}
