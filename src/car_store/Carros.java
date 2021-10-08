/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_store;

/**
 *
 * @author bruno
 */
public abstract class Carros {
    protected String vendedor;
    protected String modelo;
    protected String placa;
    protected boolean disponivel;
    protected double preco;
    protected int anoFabricacao;
    protected double oferta;
    
    
    //metodos
    public abstract boolean disponivel();
    public abstract boolean oferta(double valor);
    public abstract void imprime();
    public abstract boolean venderCarro(String vendedor, double valorVenda);
    
}
