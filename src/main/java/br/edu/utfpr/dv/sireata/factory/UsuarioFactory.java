package br.edu.utfpr.dv.sireata.factory;
import java.sql.SQLException;

  public interface UsuarioFactory {
    public int salvar(Object obj) throws SQLException;
  
    public boolean excluir(int id) throws SQLException;
    public void listarTodos(boolean apenasAtivos) throws SQLException;
  
    public Object buscarPorId(int id) throws SQLException;
  
    public Object listarPorAta(int idAta) throws SQLException;
  }