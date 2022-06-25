
package br.com.Projeto.dao;

import br.com.Projeto.jdbc.ConnectionFactory;
import br.com.Projeto.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class UsuarioDao {
    

    private Connection con;
    
    public UsuarioDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void salvarUsuario(Usuario use){
        try {
            String sql = "insert into cadastro_usuario(nome, sobrenome, email, senha, confirmar_senha)" +
                            " values(?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, use.getNome());
            stmt.setString(2, use.getSobrenome());
            stmt.setString(3, use.getEmail());
            stmt.setString(4, use.getSenha());
            stmt.setString(5, use.getConfirmarsenha());
            
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " +e);
        }
    } 
    
       
      
    
}
