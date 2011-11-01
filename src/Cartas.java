/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SARAVIA
 */
public class Cartas {

    protected String color;
    protected int valor;

    public Cartas(String c, int v){
        color = c;
        valor = v;
    }

    public String getColor(){
        return color;
    }

    public int getValor(){
        return valor;
    }

}
