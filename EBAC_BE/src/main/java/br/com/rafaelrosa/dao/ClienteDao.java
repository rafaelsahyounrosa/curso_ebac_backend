package br.com.rafaelrosa.dao;

import br.com.rafaelrosa.domain.Cliente;
import br.com.rafaelrosa.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDao implements IClienteDao{


    @Override
    public Integer cadastrar(Cliente cliente) throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO tb_cliente (id, nome, codigo) VALUES (nextval('sq_cliente'), ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCodigo());
            return stmt.executeUpdate();
        }
        catch (Exception e){
            throw e;
        }
        finally {
            if (stmt != null && !stmt.isClosed()) stmt.close();
            if (conn != null && !conn.isClosed()) conn.close();
        }
    }

    @Override
    public Cliente consultar(String codigo) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente cliente = null;

        try{
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM tb_cliente WHERE codigo = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, codigo);

            rs = stmt.executeQuery();

            if(rs.next()){
                cliente = new Cliente();
                cliente.setId(rs.getLong("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCodigo(rs.getString("codigo"));

            }
            return cliente;
        }
        catch (Exception e){
            throw e;
        }
        finally {
            if (stmt != null || !stmt.isClosed()) stmt.close();
            if (conn != null || !conn.isClosed()) conn.close();
        }
    }

    @Override
    public Integer excluir(Cliente clienteBD) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try{
            conn = ConnectionFactory.getConnection();
            String sql = "DELETE FROM tb_cliente WHERE codigo = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, clienteBD.getCodigo());

            return stmt.executeUpdate();

        }
        catch (Exception e){
            throw e;
        }
        finally {
            if (stmt != null && !stmt.isClosed()) stmt.close();
            if (conn != null && !conn.isClosed()) conn.close();
        }
    }
}
