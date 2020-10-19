/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author Franz
 */
public class ProsesInput {
    public static String VariabelString(){
int variabelstring; String str=""; boolean programberakhir = false; String perulangan="";
while(!programberakhir){
try{
variabelstring=System.in.read();
if(variabelstring<0||(char)variabelstring=='\n')programberakhir=true;
else if((char) variabelstring != '\r') str = str + (char) variabelstring; }
catch(java.io.IOException e){
System.err.println("Periksa Kembali Inputan Anda");
programberakhir=true; }}
return str; }
}
