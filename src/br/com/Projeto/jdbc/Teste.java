
package br.com.Projeto.jdbc;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!!!!!!!!!!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não deu!!!!!!!!!!!!1" + e);
 
        }
    }
    
}
