/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av1.Fornecedor;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ckenn
 */
public class ModeloTabelaFornecedor extends AbstractTableModel {
    private static final int COLUNA_NOME = 0;
    private static final int COLUNA_TELEFONE = 1;
    private static final int COLUNA_CNPJ = 2;
    private static final int COLUNA_EMAIL = 3;
    private static final int COLUNA_CEP = 4;
    private static final int COLUNA_ESTADO = 5;
    private static final int COLUNA_CIDADE = 6;
    private static final int COLUNA_BAIRRO = 7;
    private static final int COLUNA_LOGRADOURO = 8;
    private static final int COLUNA_NUMERO = 9;
    private static final int COLUNA_COMPLEMENTO = 10;


   
   private String colunas[] = new String[]{"Nome","Telefone", "Cnpj", "Email", "Cep", "Estado", "Cidade", "Bairro", "Logradouro", "Numero", "Complemento"};
   private ArrayList<Fornecedor> fornecedores;
   
   public ModeloTabelaFornecedor(ArrayList<Fornecedor> fornecedores){
       this.fornecedores = new ArrayList<Fornecedor>(fornecedores);
   }
   
   @Override
   public int getColumnCount(){
       return colunas.length;
   }
   
   @Override
   public int getRowCount(){
       return fornecedores.size();
   }
   
   @Override
   public String getColumnName(int indiceColuna){
       return colunas[indiceColuna];
   }
   
   @Override
   public boolean isCellEditable(int indiceLinha, int indiceColuna){
       return false;
   }
   
   @Override
   public Object getValueAt(int indiceLinha, int indiceColuna){
       Fornecedor fornecedor = fornecedores.get(indiceLinha);
       switch (indiceColuna){
        case COLUNA_NOME:
            return fornecedor.getNome();
        case COLUNA_TELEFONE:
            return fornecedor.getTelefone();
        case COLUNA_CNPJ:
            return fornecedor.getCnpj();
        case COLUNA_EMAIL:
            return fornecedor.getEmail();
        case COLUNA_LOGRADOURO:
            return fornecedor.getLogradouro();
        case COLUNA_NUMERO:
            return fornecedor.getNumero();
        case COLUNA_COMPLEMENTO:
            return fornecedor.getComplemento();
        case COLUNA_BAIRRO:
            return fornecedor.getBairro();
        case COLUNA_CIDADE:
            return fornecedor.getCidade();
        case COLUNA_ESTADO:
            return fornecedor.getEstado();
        case COLUNA_CEP:
            return fornecedor.getCep();
        default:
            return "";
       }
   }
   
    @Override
    public void setValueAt(Object valor, int indiceLinha, int indiceColuna) {
        Fornecedor fornecedor = fornecedores.get(indiceLinha);
        switch (indiceColuna) {
            case COLUNA_NOME:
                fornecedor.setNome(valor.toString());
                break;
            case COLUNA_TELEFONE:
                fornecedor.setTelefone(valor.toString());
                break;
            case COLUNA_CNPJ:
                fornecedor.setCnpj(valor.toString());
                break;
            case COLUNA_EMAIL:
                fornecedor.setEmail(valor.toString());
                break;
            case COLUNA_LOGRADOURO:
                fornecedor.setLogradouro(valor.toString());
                break;
            case COLUNA_NUMERO:
                fornecedor.setNumero(valor.toString());
                break;
            case COLUNA_COMPLEMENTO:
                fornecedor.setComplemento(valor.toString());
                break;
            case COLUNA_BAIRRO:
                fornecedor.setBairro(valor.toString());
                break;
            case COLUNA_CIDADE:
                fornecedor.setCidade(valor.toString());
                break;
            case COLUNA_ESTADO:
                fornecedor.setEstado(valor.toString());
                break;
            case COLUNA_CEP:
                fornecedor.setCep(valor.toString());
                break;
        }
    }

   public Fornecedor obterFornecedor(int indiceFornecedor){
       return fornecedores.get(indiceFornecedor);
   }
   
   public void incluirPessoa(Fornecedor fornecedor){
       fornecedores.add(fornecedor);
       int ultimo = getRowCount()-1;
       fireTableRowsInserted (ultimo, ultimo);
   }
   
   public void atualizarPessoa(int indiceFornecedor, Fornecedor fornecedor){
       fornecedores.set(indiceFornecedor, fornecedor);
       fireTableRowsUpdated(indiceFornecedor,indiceFornecedor);
   }
   
   public void excluirPessoa(int indiceFornecedor){
       fornecedores.remove(indiceFornecedor);
       fireTableRowsDeleted(indiceFornecedor, indiceFornecedor);
   }
   
      public ArrayList<Fornecedor> getListaFornecedores() {
       return fornecedores;
   }
}
