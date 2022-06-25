
package br.com.Projeto.dao;

import br.com.Projeto.jdbc.ConnectionFactory;
import br.com.Projeto.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VendaDao {
    
    private Connection con;
    
    public VendaDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void salvarVenda(Venda vend){
        try {
            String sql = "insert into cadastro_vendas(cliente, produto, quantidade, dat, pagamento, tipopagamento)" +
                            " values(?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, vend.getCliente());
            stmt.setString(2, vend.getProduto());
            stmt.setInt(3, vend.getQuantidade());
            stmt.setString(4, vend.getDat());
            stmt.setString(5, vend.getPagamento());
            stmt.setString(6, vend.getTipopagamento());
              
              
             
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Venda efetuada com Sucesso!");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " +e);
        }
    } 
    
         public void editarVenda(Venda vend){
        try {
            String sql = "UPDATE cadastro_vendas set produto=?, quantidade=?,"
                    + " dat=?, pagamento=?, tipopagamento=?"
                    + " WHERE cliente = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            
            stmt.setString(1, vend.getProduto());
            stmt.setInt(2, vend.getQuantidade());
            stmt.setString(3, vend.getDat());
            stmt.setString(4, vend.getPagamento());
            stmt.setString(5, vend.getTipopagamento());
            stmt.setString(6, vend.getCliente());
            

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Venda Alterado com Sucesso!");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " +e);
        }
    }
     
         public void excluirVenda(Venda vend){
        try {
            String sql = "DELETE from cadastro_vendas WHERE cliente= ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, vend.getCliente());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Venda Excluida com Sucesso!");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " +e);
        }
    }
    
    
       public List<Venda> listarVendas(){
             try {
                 List<Venda> vendas = new ArrayList<>();
                 
                 String sql = "select * from cadastro_vendas";
                 PreparedStatement stmt = con.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery();
                  
                 while(rs.next()){
                    Venda vend = new Venda();
                    
                    vend.setCliente(rs.getString("cliente"));
                    vend.setProduto(rs.getString("produto"));
                    vend.setQuantidade(rs.getInt("quantidade"));
                    vend.setDat(rs.getString("dat"));
                    vend.setPagamento(rs.getString("pagamento"));
                    vend.setTipopagamento(rs.getString("tipopagamento"));
                        
                    vendas.add(vend);
                 }
                 
                 return vendas;
                 
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, "Erro ao executar cosulta" +e);
                 return null;
             }

    }

        public List<Venda> buscarClientePorCliente(String cliente) {
             try {
                 List<Venda> vendas = new ArrayList<>();
                 
                 String sql = "select * from cadastro_vendas where cliente like ?";
                 PreparedStatement stmt = con.prepareStatement(sql);
                 stmt.setString(1, cliente);
                 ResultSet rs = stmt.executeQuery();
                  
                 while(rs.next()){
                    Venda vend = new Venda();
                    
                    vend.setCliente(rs.getString("cliente"));
                    vend.setProduto(rs.getString("produto"));
                    vend.setQuantidade(rs.getInt("quantidade"));
                    vend.setDat(rs.getString("dat"));
                    vend.setPagamento(rs.getString("pagamento"));
                    vend.setTipopagamento(rs.getString("tipopagamento"));
                        
                    vendas.add(vend);
                 }
                  
                 return vendas;
                 
             } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, "Erro ao executar cosulta" +e);
                 return null;
             }
        }

    
}
