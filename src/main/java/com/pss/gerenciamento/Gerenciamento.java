/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pss.gerenciamento;

import DataBase.ClienteDAO;
import DataBase.ClienteDAOSQLite;
import static DataBase.CreateNewTable.createNewTable;
import Model.Cliente;
import Presenter.GerenciadorClienteService;
import java.util.List;

/**
 *
 * @author Eriani M
 */
public class Gerenciamento {

    public static void main(String[] args) {
        createNewTable();
        
       ClienteDAO clienteDAO = new ClienteDAOSQLite();
       GerenciadorClienteService gerenciadorClientes = new GerenciadorClienteService(clienteDAO);
       // Adicionando clientes
       gerenciadorClientes.adicionarCliente("João Silva", "joao.silva@email.com");
       gerenciadorClientes.adicionarCliente("Maria Pereira", "maria.pereira@email.com");

       //Listando todos os clientes;
       List<Cliente> clientes = gerenciadorClientes.listarClientes();
       System.out.println("Clientes cadastrados:");
       for (Cliente cliente : clientes) {
           System.out.println(cliente.getId()+ " - " + cliente.getNome() + " - " + cliente.getEmail());
       }
       // Buscando um cliente pelo ID
       Cliente clienteEncontrado = gerenciadorClientes.buscarClientePorId(2);
       if (clienteEncontrado != null) {
           System.out.println("Cliente encontrado: " + clienteEncontrado.getNome());
       } else {
           System.out.println("Cliente não encontrado.");
       }

       // Atualizando informações do cliente
       Cliente clienteParaAtualizar = new Cliente(1, "João Carlos Silva", "joao.silva@email.com");;
       gerenciadorClientes.atualizarCliente(clienteParaAtualizar);

//       // Deletando cliente pelo ID
       gerenciadorClientes.deletarCliente(2);

    }
}
