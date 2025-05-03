/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package av1.GravacaoArquivo;

/**
 *
 * @author delmi
 */
import av1.Cliente.Cliente;
import av1.Fornecedor.Fornecedor;
import java.io.*;
import java.util.ArrayList;

public class ArquivoClienteFornecedor {

    public static void salvarClientesArquivo(ArrayList<Cliente> listaClientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.txt"))) {
            for (Cliente cliente : listaClientes) {
                writer.write(cliente.getNome() + "," + cliente.getTelefone() + "," + cliente.getEmail() + ","
                        + cliente.getCpf() + "," + cliente.getLogradouro() + "," + cliente.getNumero() + ","
                        + cliente.getComplemento() + "," + cliente.getBairro() + "," + cliente.getCidade() + ","
                        + cliente.getEstado() + "," + cliente.getCep());
                writer.newLine(); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cliente> carregarClientesArquivo() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        File arquivo = new File("clientes.txt");

        if (!arquivo.exists()) {
            return listaClientes; // Retorna lista vazia se o arquivo não existe ainda
        }   
        
        try (BufferedReader reader = new BufferedReader(new FileReader("clientes.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 11) {
                    Cliente cliente = new Cliente();
                    cliente.setNome(dados[0]);
                    cliente.setTelefone(dados[1]);
                    cliente.setEmail(dados[2]);
                    cliente.setCpf(dados[3]);
                    cliente.setLogradouro(dados[4]);
                    cliente.setNumero(dados[5]);
                    cliente.setComplemento(dados[6]);
                    cliente.setBairro(dados[7]);
                    cliente.setCidade(dados[8]);
                    cliente.setEstado(dados[9]);
                    cliente.setCep(dados[10]);
                    listaClientes.add(cliente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaClientes;
    }

    public static void salvarFornecedoresArquivo(ArrayList<Fornecedor> listaFornecedores) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("fornecedores.txt"))) {
            for (Fornecedor fornecedor : listaFornecedores) {
                writer.write(fornecedor.getNome() + "," + fornecedor.getTelefone() + "," + fornecedor.getEmail() + ","
                        + fornecedor.getCnpj() + "," + fornecedor.getLogradouro() + "," + fornecedor.getNumero() + ","
                        + fornecedor.getComplemento() + "," + fornecedor.getBairro() + "," + fornecedor.getCidade() + ","
                        + fornecedor.getEstado() + "," + fornecedor.getCep());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Fornecedor> carregarFornecedoresArquivo() {
        ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("fornecedores.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 11) {
                    Fornecedor fornecedor = new Fornecedor();
                    fornecedor.setNome(dados[0]);
                    fornecedor.setTelefone(dados[1]);
                    fornecedor.setEmail(dados[2]);
                    fornecedor.setCnpj(dados[3]);
                    fornecedor.setLogradouro(dados[4]);
                    fornecedor.setNumero(dados[5]);
                    fornecedor.setComplemento(dados[6]);
                    fornecedor.setBairro(dados[7]);
                    fornecedor.setCidade(dados[8]);
                    fornecedor.setEstado(dados[9]);
                    fornecedor.setCep(dados[10]);
                    listaFornecedores.add(fornecedor);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaFornecedores;
    }
}