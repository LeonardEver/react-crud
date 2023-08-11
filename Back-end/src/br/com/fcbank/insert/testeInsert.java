package br.com.fcbank.insert;

import java.sql.SQLException;

import br.com.fcbank.dao.EmpresaDAO;
import br.com.fcbank.model.Empresa;


public class testeInsert {
	   public static void main(String[] args) {

	        EmpresaDAO empresaDao = new EmpresaDAO();

	        try {

	            Empresa empresa = new Empresa();
	            empresa.setId(2); 
	            empresa.setNome("Fcamara");
	            empresa.setCnpj("1234567899");
	            empresa.setEndereco("Rua Bela Cintra");
	            empresa.setTelefone("11900000000");
	            empresa.setVagas_carro(20);
	            empresa.setVagas_moto(30);

	            empresaDao.insert(empresa);

	            System.out.println("Empresa inserida com sucesso!");
	        } catch (SQLException e) {
	            System.out.println("Erro ao inserir a empresa: " + e.getMessage());
	        }
	    }
	}

