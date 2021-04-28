
package br.edu.fatecfranca.l1.exe03;

public class Produto {
    // variaveis
    public int id;
    public String descricao;
    public int qtde;
    public float preco;
    
    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    public Produto () {}
    
    public void comprar(int x) {
        this.qtde += x;
    }
    
    public void vender(int x) {
        if (this.qtde > 0) {
            this.qtde -= x;
        }
        else {
            System.out.print("Produto indisponível.");
        }
        
    }
    
    public void subir(float x) {
        this.preco += x;
    }
    
    public void descer(float x) {
        if ((this.preco -= x) <= 0) {
            System.out.println("O preço não pode ser inferior a R$ 0,00");
        }
        else {
            this.preco -= x;
        }
    }
    
    public String mostra() {
        return "ID: " + this.id + " Descrição: " + this.descricao + " Quantidade: " + this.qtde + " Preço: R$" + this.preco;
    }
}
