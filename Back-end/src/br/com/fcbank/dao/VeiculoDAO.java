package br.com.fcbank.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import br.com.fcbank.factory.ConnectionFactory;
import br.com.fcbank.model.Veiculo;


public class VeiculoDAO {
	private Connection conexao;

    public VeiculoDAO() {
        this.conexao = new ConnectionFactory().conectar();
    }
    
    public void insert(Veiculo veiculo) throws SQLException{
    	String sql = "INSERT INTO VEICULO (marca, modelo, cor, placa, tipo) VALUES (?, ?, ?, ?, ?)";
    	PreparedStatement stmt = conexao.prepareStatement(sql);
    	
    	stmt.setString(1, veiculo.getMarca());
    	stmt.setString(2, veiculo.getModelo());
    	stmt.setString(3, veiculo.getCor());
    	stmt.setString(4, veiculo.getPlaca());
    	
    	stmt.execute();
    	stmt.close();
    }
    
    public List<Veiculo> getAll() throws SQLException {
        List<Veiculo> veiculoList = new ArrayList<>();

        String sql = "SELECT * FROM VEICULO";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

            while (result.next()) {
            	Veiculo veiculo = new Veiculo();
            	stmt.setString(1, veiculo.getMarca());
            	stmt.setString(2, veiculo.getModelo());
            	stmt.setString(3, veiculo.getCor());
            	stmt.setString(4, veiculo.getPlaca());
				veiculoList.add(veiculo);
            }
        
    	stmt.close();
        result.close();
        return veiculoList;
    }
    
    public Veiculo selectById(Long id) throws SQLException{
    	Veiculo veiculo = null;

        String sql = "SELECT * FROM VEICULO where PLACA=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1, id);
        ResultSet result = stmt.executeQuery();

            while (result.next()) {
            	veiculo = new Veiculo();
            	veiculo.setMarca(result.getString("marca"));
            	veiculo.setModelo(result.getString("modelo"));
            	veiculo.setCor(result.getString("cor"));
            	veiculo.setPlaca(result.getString("placa"));
            	veiculo.setTipo(result.getString("tipo"));
            }
        
    	stmt.close();
        result.close();
    	return veiculo;
    }
    
    public void delete(Long id) throws SQLException{

        String sql = "DELETE FROM VEICULO where PLACA=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1, id);
        stmt.execute();
    	stmt.close();
    	
    }
    
    public void update(Veiculo veiculo) throws SQLException{

        String sql = "UPDATE VEICULO SET MARCA=?, MODELO=?, COR=?, PLACA=?, TIPO=?, WHERE ID=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
    	stmt.setString(1, veiculo.getMarca());
    	stmt.setString(2, veiculo.getModelo());
    	stmt.setString(3, veiculo.getCor());
    	stmt.setString(4, veiculo.getPlaca());
    	stmt.setString(5, veiculo.getTipo());
        
    	stmt.execute();
    	stmt.close();
    	
    }
}


