 
package br.com.Projeto.dao;

import br.com.Projeto.jdbc.ConnectionFactory;
import br.com.Projeto.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProdutoDao {
    private Connection con;
    
    public ProdutoDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void salvarProduto(Produto pro){
        try {
            String sql = "insert into cadastro_produto(lote, sabor, quantidade, fabricacao, validade, preco)" +
                            " values(?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, pro.getLote());
            stmt.setString(2, pro.getSabor());
            stmt.setInt(3, pro.getQuantidade());
            stmt.setString(4, pro.getFabricacao());
            stmt.setString(5, pro.getValidade());
            stmt.setString(6, pro.getPreco());
            
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " +e);
        }
    } 
    
    public void editarProduto(Produto pro){
        try {
            String sql = "UPDATE cadastro_produto set sabor=?, quantidade=?, fabricacao=?,"
                    + " validade=?, preco=?"
                    + " WHERE lote = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
           stmt.setString(1, pro.getSabor());
           stmt.setInt(2, pro.getQuantidade());
           stmt.setString(3, pro.getFabricacao());
           stmt.setString(4, pro.getValidade());
           stmt.setString(5, pro.getPreco());
           stmt.setInt(6, pro.getLote());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso!");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " +e);
        }
    }
     
         public void excluirProduto(Produto pro){
        try {
            String sql = "DELETE from cadastro_produto WHERE lote = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, pro.getLote());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto Excluido com Sucesso!");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " +e);
        }
    }
    
    
       public List<Produto> listarProdutos(){
             try {
                 List<Produto> produtos = new ArrayList<>();
                 
                 String sql = "select * from cadastro_produto";
                 PreparedStatement stmt = con.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery();
                  
                 while(rs.next()){
                    Produto pro = new Produto();
                    pro.setLote(rs.getInt("lote"));
                    pro.setSabor(rs.getString("sabor"));
                    pro.setQuantidade(rs.getInt("quantidade"));
                    pro.setFabricacao(rs.getString("fabricacao"));
                    pro.setValidade(rs.getString("validade"));
                    pro.setPreco(rs.getString("preco"));
                        
                    produtos.add(pro);
                 }
                 
                 return produtos;
                 
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, "Erro ao execultar cosulta" +e);
                 return null;
             }
    } 
 
    public List<Produto> buscarProdutoPorSabor(String sabor){
        try {
                 List<Produto> produtos = new ArrayList<>();
                 
                 String sql = "select * from cadastro_produto where sabor like ?";
                 PreparedStatement stmt = con.prepareStatement(sql);
                 stmt.setString(1, sabor);
                 ResultSet rs = stmt.executeQuery();
                  
                 while(rs.next()){
                    Produto pro = new Produto();
                    pro.setLote(rs.getInt("lote"));
                    pro.setSabor(rs.getString("sabor"));
                    pro.setQuantidade(rs.getInt("quantidade"));
                    pro.setFabricacao(rs.getString("fabricacao"));
                    pro.setValidade(rs.getString("validade"));
                    pro.setPreco(rs.getString("preco"));
                        
                    produtos.add(pro);
                 }
                 
                 return produtos;
                 
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, "Erro ao execultar cosulta" +e);
                 return null;
             }
    }
  
}
         