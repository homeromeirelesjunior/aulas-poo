
package br.edu.fatecfranca.l3.exe2;

public class Carrinho {
    
    private int codigo;
    private float valor;
    // associação
    private ItemCarrinho item;

    public Carrinho() {
    }
    
    // composição -> ItemCarrinho não pode vir criado, ele precisa ser criado
    public Carrinho(int codigo, float valor, String produto, int qtde, float preco) {
        this.codigo = codigo;
        this.valor = valor;
        // composição -> ItemCarrinho criado dentro do Carrinho
        this.item = new ItemCarrinho(produto, qtde, preco);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public ItemCarrinho getItem() {
        return item;
    }

    public void setItem(ItemCarrinho item) {
        this.item = item;
    }
    
    
}
