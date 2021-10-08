/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_store;
import java.text.NumberFormat;
/**
 *
 * @author bruno
 */
public class CarrosProprios extends Carros {
    
    //constrtor
    public CarrosProprios(String modelo, String placa, double preco, int anoFabricacao){
    this.disponivel = true;
    this.vendedor = "";
    this.modelo = modelo;
    this.placa = placa;
    this.preco = preco;
    this.anoFabricacao = anoFabricacao;
}

    
    
    @Override
    public boolean disponivel() {
       if(disponivel == true){
           System.out.println("Veiculo da loja se encontra disponível." + "Status: " + disponivel);
           return true;
       }else{
           System.out.println("Veículo da loja não está disponível!" + "Status: " + disponivel);
           return false;
       }
    }

    @Override
    public boolean oferta(double valor) {
        if(valor >= preco * 0.05){
            System.out.println("Valor aceitável para o Carro da Loja.");
            oferta = valor;
            return true;
        }else{
            System.out.println("Valor baixo, não aceito!");
            oferta = valor;
            return false;         
        }
    }

    @Override
    public void imprime() {
        System.out.println("Info: " + "Carro Disponível: " + disponivel);
        System.out.println("Nome Vendedor: " + vendedor);
        System.out.println("Dados Veiculo: " + "Modelo: " + modelo + "Placa: " + placa + "Ano: " + anoFabricacao);
    }

    @Override
    public boolean venderCarro(String vendedor, double valor) {
        double taxa = valor * 0.05;
        //System.out.println("Valor aki: " + taxa);
        if(valor < preco + taxa){
            System.out.println("Valor não aceitável para carro da loja!");
            return false;
        }else{           
            System.out.println("Vendido! " + "Vendedor: " + vendedor);
            this.vendedor = vendedor;
            disponivel = false;
            return true; 
        }
             
    }
    
}
