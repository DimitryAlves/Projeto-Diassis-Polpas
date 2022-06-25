package br.com.Projeto.dao;

import br.com.Projeto.jdbc.ConnectionFactory;
import br.com.Projeto.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDao {

    private Connection con;

    public ClienteDao() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void salvarCliente(Cliente cli) {
        try {
            String sql = "insert into cadastro_cliente(nome, nascimento, email, cpf, celular, endereco, numero, bairro, complemento, cidade, estado)"
                    + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getNascimento());
            stmt.setString(3, cli.getEmail());
            stmt.setString(4, cli.getCpf());
            stmt.setString(5, cli.getCelular());
            stmt.setString(6, cli.getEndereco());
            stmt.setInt(7, cli.getNumero());
            stmt.setString(8, cli.getBairro());
            stmt.setString(9, cli.getComplemento());
            stmt.setString(10, cli.getCidade());
            stmt.setString(11, cli.getEstado());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " + e);
        }
    }

    public void editarCliente(Cliente cli) {
        try {
            String sql = "UPDATE cadastro_cliente set nome=?, nascimento=?, email=?, celular=?,"
                    + " endereco=?, numero=?, bairro=?, complemento=?, cidade=?, estado=?"
                    + " WHERE cpf = ?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, cli.getNome());
            stmt.setString(2, cli.getNascimento());
            stmt.setString(3, cli.getEmail());
            stmt.setString(4, cli.getCelular());
            stmt.setString(5, cli.getEndereco());
            stmt.setInt(6, cli.getNumero());
            stmt.setString(7, cli.getBairro());
            stmt.setString(8, cli.getComplemento());
            stmt.setString(9, cli.getCidade());
            stmt.setString(10, cli.getEstado());
            stmt.setString(11, cli.getCpf());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cliente Alterado com Sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " + e);
        }
    }

    public void excluirCliente(Cliente cli) {
        try {
            String sql = "DELETE from cadastro_cliente WHERE cpf = ?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, cli.getCpf());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cliente Excluido com Sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo aconteceu: " + e);
        }
    }

    public List<Cliente> listarClientes() {
        try {
            List<Cliente> clientes = new ArrayList<>();

            String sql = "select * from cadastro_cliente";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setNome(rs.getString("nome"));
                cli.setNascimento(rs.getString("nascimento"));
                cli.setEmail(rs.getString("email"));
                cli.setCpf(rs.getString("cpf"));
                cli.setCelular(rs.getString("celular"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setNumero(rs.getInt("numero"));
                cli.setBairro(rs.getString("bairro"));
                cli.setComplemento(rs.getString("complemento"));
                cli.setCidade(rs.getString("cidade"));
                cli.setEstado(rs.getString("estado"));

                clientes.add(cli);
            }

            return clientes;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar cosulta" + e);
            return null;
        }
 
    }

    public List<Cliente> buscarClientePorNome(String nome) {
        try {
            List<Cliente> clientes = new ArrayList<>();

            String sql = "select * from cadastro_cliente where nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setNome(rs.getString("nome"));
                cli.setNascimento(rs.getString("nascimento"));
                cli.setEmail(rs.getString("email"));
                cli.setCpf(rs.getString("cpf"));
                cli.setCelular(rs.getString("celular"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setNumero(rs.getInt("numero"));
                cli.setBairro(rs.getString("bairro"));
                cli.setComplemento(rs.getString("complemento"));
                cli.setCidade(rs.getString("cidade"));
                cli.setEstado(rs.getString("estado"));

                clientes.add(cli);
            }

            return clientes;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar cosulta" + e);
            return null;
        }
    }

}
