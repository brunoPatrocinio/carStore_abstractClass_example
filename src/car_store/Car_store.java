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
public class Car_store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instância dos objetos
        CarrosProprios c1 = new CarrosProprios("Gol", "cne02015", 22500, 2014);
        CarrosConsignados cs1 = new CarrosConsignados("Polo", "eip0293", 32500, 2014);
        
        System.out.println("Consignado 1 Disponível: " + cs1.disponivel());
        System.out.println("Da Loja Carro 1 Disponível: " + c1.disponivel());
                    
        c1.venderCarro("Bruno", 24500.0);
        cs1.venderCarro("Larissa", 36100.0);
        
        //imprimir
        c1.imprime();
        cs1.imprime();
    }
    
}
