package br.edu.utfpr.dv.sireata.factory;
import java.sql.SQLException;

import br.edu.utfpr.dv.sireata.model.Usuario;

  public interface UsuarioFactory {
    public int salvar(Usuario usuario) throws SQLException;
  
    public Usuario buscarPorLogin(String login) throws SQLException;
   
    public String[] buscarEmails(int[] id) throws SQLException;
  
    public Object buscarPorId(int id) throws SQLException;
  
    public boolean podeCriarAta(int id) throws SQLException;
  }