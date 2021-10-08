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
public class CarrosConsignados extends Carros{

    //constrtor
    public CarrosConsignados(String modelo, String placa, double preco, int anoFabricacao){
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
           System.out.println("Veiculo Consignado se encontra disponível." + "Status: " + disponivel);
           return true;
       }else{
           System.out.println("Carro Consignado não está disponível!" + "Status: " + disponivel);
           return false;
       }
    }

    @Override
    public boolean oferta(double valor) {      
        if(valor >= preco * 0.10){
            //System.out.println("Valor aceitável para o Carro Consignado.");         
            return true;
        }else{
            System.out.println("Valor baixo para o carro consignado, não aceito!");           
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
        double taxa = valor * 0.10;
        //System.out.println("Valor aki: " + taxa);
        if(valor < preco + taxa){
            System.out.println("Valor não aceitável para consignado!");
            return false;
        }else{           
            System.out.println("Vendido! " + "Vendedor: " + vendedor);
            this.vendedor = vendedor;
            disponivel = false;
            return true; 
        }
    }
    
}
