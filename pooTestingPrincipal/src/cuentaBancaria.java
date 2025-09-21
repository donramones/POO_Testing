/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */
public class cuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    
    public void mostrarDatos(){
        System.out.println(this);//Pasamos a si mismo por parametro
                                   // a otro metodo
        System.out.println(CBU + " " + alias + " " + saldo);
    }
    
    public String getCBU(){
        return CBU;
    }
    
    public String getAlias(){
        return alias; // Aqui no existe ambiguedad por lo q no hace falta usar el this
    }
    
    
    public void setAlias(String alias) {
        if (alias != null){
            this.alias = alias;//Existe ambiguedad en las asignacianos
            // doble nombre alias por eso usamos this
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double monto){
        if (monto > 0 ){//como no existe variables monto no debemos usar this.monto ya que es para recibir 
            saldo = saldo + monto; // saldo + manto
            
        }
    }
    
    
}
