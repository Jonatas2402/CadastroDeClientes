package br.com.api.CadastroDeClientes.clientes.model;

import br.com.api.CadastroDeClientes.produtos.model.ProdutosModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma a classe em uma entidade do BD.
@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private List<ProdutosModel> produtos;

    public ClienteModel() {
    }

    public ClienteModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
