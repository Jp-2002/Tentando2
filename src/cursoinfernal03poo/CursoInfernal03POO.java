/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoinfernal03poo;

/**
 *
 * @author joaop
 */
public class CursoInfernal03POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco b1 = new Banco();       
        b1.setDono("João");
        b1.setNumConta(442145);
        b1.abrirConta("CP");
        b1.sacar(150);
        b1.estadoAtual();
        System.out.println("");
    }    
}
