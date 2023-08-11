package br.com.fcbank.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import br.com.fcbank.factory.ConnectionFactory;
import br.com.fcbank.model.Empresa;


public class EmpresaDAO {
	 private Connection conexao;

	    public EmpresaDAO() {
	        this.conexao = new ConnectionFactory().conectar();
	    }
	    
	    public void insert (Empresa empresa) throws SQLException{
	    	String sql = "insert into EMPRESA(id, nome, cnpj, endereco, telefone, vagas_carro, vagas_moto) values (?, ?, ?, ?, ?, ?, ?) ";
	    	PreparedStatement stmt = conexao.prepareStatement(sql);
	    	
	    	stmt.setInt(1, empresa.getId());
	    	stmt.setString(2, empresa.getNome());
	    	stmt.setString(3, empresa.getCnpj());
	    	stmt.setString(4, empresa.getEndereco());
	    	stmt.setString(5, empresa.getTelefone());
	    	stmt.setFloat(6, empresa.getVagas_carro());
	    	stmt.setFloat(7, empresa.getVagas_moto());

	    	
	    	stmt.execute();
	    	stmt.close();
	    }

	    public List<Empresa> getAll() throws SQLException {
	        List<Empresa> empresas = new ArrayList<>();

	        String sql = "SELECT * FROM EMPRESA";
	        PreparedStatement stmt = conexao.prepareStatement(sql);
	        ResultSet result = stmt.executeQuery();

	            while (result.next()) {
	            	Empresa empresa = new Empresa();
	            	empresa.setNome(result.getString("nome"));
	            	empresa.setCnpj(result.getString("cnpj"));
	            	empresa.setEndereco(result.getString("endereco"));
	            	empresa.setTelefone(result.getString("telefone"));
	            	empresa.setVagas_carro(result.getFloat("vagas_carro"));
	            	empresa.setVagas_moto(result.getFloat("vagas_moto"));


	                empresas.add(empresa);
	            }
	        
	    	stmt.close();
	        result.close();
	        return empresas;
	    }
	    
	    public Empresa selectById(int idEmpresa) throws SQLException{
	    	Empresa empresa = null;

	        String sql = "SELECT * FROM EMPRESA where ID=?";
	        PreparedStatement stmt = conexao.prepareStatement(sql);
	        ResultSet result = stmt.executeQuery();

	            while (result.next()) {
	            	empresa = new Empresa();
	            	empresa.setId(result.getInt("EMPRESA"));
	            	empresa.setNome(result.getString("nome"));
	            	empresa.setCnpj(result.getString("cnpj"));
	            	empresa.setEndereco(result.getString("endereco"));
	            	empresa.setTelefone(result.getString("telefone"));
	            	empresa.setVagas_carro(result.getFloat("vagas_carro"));
	            	empresa.setVagas_moto(result.getFloat("vagas_moto"));


	            }
	        
	    	stmt.close();
	        result.close();
	    	return empresa;
	    }
	    
	    public void delete(int id) throws SQLException{

	        String sql = "delete FROM EMPRESA where ID=?";
	        PreparedStatement stmt = conexao.prepareStatement(sql);
	        stmt.setInt(1, id);
	        stmt.execute();
	    	stmt.close();
	    	
	    }
	    
	    public void update(Empresa empresa) throws SQLException{

	        String sql = "update EMPRESA set nome=?, cnpj=?, endereco=?, telefone=?, vagas_carro=?, vagas_moto=?, where ID=?";
	        PreparedStatement stmt = conexao.prepareStatement(sql);
	        
	    	stmt.setInt(1, empresa.getId());
	    	stmt.setString(2, empresa.getNome());
	    	stmt.setString(3, empresa.getCnpj());
	    	stmt.setString(4, empresa.getEndereco());
	    	stmt.setString(5, empresa.getTelefone());
	    	stmt.setFloat(6, empresa.getVagas_carro());
	    	stmt.setFloat(7, empresa.getVagas_moto());

	        
	    	stmt.execute();
	    	stmt.close();
	    	
	    }
	}


