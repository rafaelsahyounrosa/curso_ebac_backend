package br.com.rafaelrosa.dao;

import br.com.rafaelrosa.domain.Produto;
import br.com.rafaelrosa.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoDao implements IProdutoDao{
    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = ConnectionFactory.getConnection();
            String sql = "insert into tb_produto (id, nome, codigo, preco) values (nextval('sq_produto'),?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getCodigo());
            ps.setDouble(3, produto.getPreco());

            return ps.executeUpdate();
        }
        catch(Exception e) {
            throw new Exception(e.getMessage());
        }
        finally {
            if(con != null || !con.isClosed()) con.close();
            if(ps != null || !ps.isClosed()) ps.close();
        }
    }

    @Override
    public Produto consultar(String codigo) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Produto produto = null;

        try {
            con = ConnectionFactory.getConnection();
            String sql = "select * from tb_produto where codigo = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            if (rs.next()) {
                produto = new Produto();
                produto.setCodigo(rs.getString("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setId(rs.getLong("id"));
            }

            return produto;
        }
        catch(Exception e) {
            throw new Exception(e.getMessage());
        }
        finally {
            if(con != null || !con.isClosed()) con.close();
            if(ps != null || !ps.isClosed()) ps.close();
        }

    }

    @Override
    public Integer excluir(Produto produto) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = ConnectionFactory.getConnection();
            String sql = "delete from tb_produto where codigo = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, produto.getCodigo());
            return ps.executeUpdate();
        }
        catch(Exception e) {
            throw new Exception(e.getMessage());
        }
        finally {
            if(con != null || !con.isClosed()) con.close();
            if(ps != null || !ps.isClosed()) ps.close();
        }
    }
}
