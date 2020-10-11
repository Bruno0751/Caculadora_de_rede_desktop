/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 3/12/2019
 * @version beta 2 
 */
public class Main {
    String stringIp, stringClass, stringMask;
    byte byteBits;
    int intHost = 0, intSUBRedes = 0;
    Object objDO = null;

    public Main() {}

    public Main(String stringIp, String stringClass, String stringMask, byte byteBits) {
        this.stringIp = stringIp;
        this.stringClass = null;
        this.stringMask = stringMask;
        this.byteBits = byteBits;
    }

    public String getStringIp() {
        return stringIp;
    }

    public void setStringIp(String stringIp) {
        this.stringIp = stringIp;
    }

    public String getStringClass() {
        return stringClass;
    }

    public String getStringMask() {
        return stringMask;
    }

    public void setByteBits(byte byteBits) {
        this.byteBits = byteBits;
    }

    public byte getByteBits() {
        return byteBits;
    }

    public int getIntHost() {
        return intHost;
    }

    public int getIntSUBRedes() {
        return intSUBRedes;
    }
    
    public void finalizarIP(String ip){
        if (ip.equals("0")){
            JOptionPane.showMessageDialog(null, "Progrma Finalizado", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);    
        }
    }
    
    public void finalizarBITS(byte bits){
        if (bits == 0){
            JOptionPane.showMessageDialog(null, "Progrma Finalizado", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    public void verificarIP(String ip){
        finalizarIP(ip);
        if (ip.equals("0.0.0.0")){
            JOptionPane.showMessageDialog(null, "Seu Endereço de IP é Inválido", "Calculadora", JOptionPane.ERROR_MESSAGE);
            this.stringIp = JOptionPane.showInputDialog(null, "Digite Seu Endereço de IP: ", "Calculadora", JOptionPane.QUESTION_MESSAGE);
            verificarIP(this.stringIp);
        } else {
            JOptionPane.showMessageDialog(null, "Processando Seu IP...", "Calculadora", JOptionPane.DEFAULT_OPTION);
        }
    }

    public void verificarBITS(byte bits){
        finalizarBITS(bits);
        if (bits >= 8 && bits < 32){
            JOptionPane.showMessageDialog(null, "Processando Bits...", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Número de Bits Inválido", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
            this.byteBits = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite o Toptal de Bits do Seu IP: ", "Calculadora", JOptionPane.QUESTION_MESSAGE));
            verificarBITS(this.byteBits);
        }
        
    }
    
    public int calcularHOSTS(byte bits){
        switch(bits){       
                case 8: 
                    this.intHost = (int) Math.pow(2, 0);
                    break;
                case 9:
                    this.intHost = (int) Math.pow(2, 7);
                    break;
                case 10:
                    this.intHost = (int) Math.pow(2, 6);
                    break;
                case 11:
                    this.intHost = (int) Math.pow(2, 5);
                    break;
                case 12:
                    this.intHost = (int) Math.pow(2, 4);
                    break;
                case 13:
                    this.intHost = (int) Math.pow(2, 3);
                    break;
                case 14:
                    this.intHost = (int) Math.pow(2, 2);
                    break;
                case 15:
                    this.intHost = (int) Math.pow(2, 1);
                    break;
                case 16:
                    this.intHost = (int) Math.pow(2, 0);
                    break;
                case 17:
                    this.intHost = (int) Math.pow(2, 7);
                    break;
                case 18:
                    this.intHost = (int) Math.pow(2, 6);
                    break;
                case 19:
                    this.intHost = (int) Math.pow(2, 5);
                    break;
                case 20:
                    this.intHost = (int) Math.pow(2, 4);
                    break;
                case 21:
                    this.intHost = (int) Math.pow(2, 3);
                    break;
                case 22:
                    this.intHost = (int) Math.pow(2, 2);
                    break;
                case 23:
                    this.intHost = (int) Math.pow(2, 1);
                    break;
                case 24:
                    this.intHost = (int) Math.pow(2, 0);
                    break;
                case 25:
                    this.intHost = (int) Math.pow(2, 7);
                    break;
                case 26:
                    this.intHost = (int) Math.pow(2, 6);
                    break;
                case 27:
                    this.intHost = (int) Math.pow(2, 5);
                    break;
                case 28:
                    this.intHost = (int) Math.pow(2, 4);
                    break;
                case 29:
                    this.intHost = (int) Math.pow(2, 3);
                    break;
                case 30:
                    this.intHost = (int) Math.pow(2, 2);
                    break;
                case 31:
                    this.intHost = (int) Math.pow(2, 1);
                    break;
            }
        return this.intHost;
    }
    
    public int calcularSUBREDE(byte bits){
        switch(bits){       
                case 8: 
                    this.intSUBRedes = (int) Math.pow(2, 0);
                    break;
                case 9:
                    this.intSUBRedes = (int) Math.pow(2, 1);
                    break;
                case 10:
                    this.intSUBRedes = (int) Math.pow(2, 2);
                    break;
                case 11:
                    this.intSUBRedes = (int) Math.pow(2, 3);
                    break;
                case 12:
                    this.intSUBRedes = (int) Math.pow(2, 4);
                    break;
                case 13:
                    this.intSUBRedes = (int) Math.pow(2, 5);
                    break;
                case 14:
                    this.intSUBRedes = (int) Math.pow(2, 6);
                    break;
                case 15:
                    this.intSUBRedes = (int) Math.pow(2, 7);
                    break;
                case 16:
                    this.intSUBRedes = (int) Math.pow(2, 0);
                    break;
                case 17:
                    this.intSUBRedes = (int) Math.pow(2, 1);
                    break;
                case 18:
                    this.intSUBRedes = (int) Math.pow(2, 2);
                    break;
                case 19:
                    this.intSUBRedes = (int) Math.pow(2, 3);
                    break;
                case 20:
                    this.intSUBRedes = (int) Math.pow(2, 4);
                    break;
                case 21:
                    this.intSUBRedes = (int) Math.pow(2, 5);
                    break;
                case 22:
                    this.intSUBRedes = (int) Math.pow(2, 6);
                    break;
                case 23:
                    this.intSUBRedes = (int) Math.pow(2, 7);
                    break;
                case 24:
                    this.intSUBRedes = (int) Math.pow(2, 0);
                    break;
                case 25:
                    this.intSUBRedes = (int) Math.pow(2, 1);
                    break;
                case 26:
                    this.intSUBRedes = (int) Math.pow(2, 2);
                    break;
                case 27:
                    this.intSUBRedes = (int) Math.pow(2, 3);
                    break;
                case 28:
                    this.intSUBRedes = (int) Math.pow(2, 4);
                    break;
                case 29:
                    this.intSUBRedes = (int) Math.pow(2, 5);
                    break;
                case 30:
                    this.intSUBRedes = (int) Math.pow(2, 6);
                    break;
                case 31:
                    this.intSUBRedes = (int) Math.pow(2, 7);
                    break;
            }
        return this.intSUBRedes;
    
    }
    
    public String mostrarClasse(byte bits){
            if (bits >= 8 && bits <= 15){
                //classe A      
                this.stringClass = "A";
            } else if (bits >= 16 && bits <= 23){
                //classe B
                this.stringClass = "B";
            } else {
                    //classe C
                this.stringClass = "C";
            }
            return this.stringClass;
    }
    
    public String verificarMascara(byte bits){
        switch(bits){       
                case 8:
                    this.stringMask = "255.0.0.0";
                    break;
                case 9:
                    this.stringMask = "255.128.0.0";
                    break;
                case 10:
                    this.stringMask = "255.192.0.0";
                    break;
                case 11:
                    this.stringMask = "255.224.0.0";
                    break;
                case 12:
                    this.stringMask = "255.240.0.0";
                    break;
                case 13:
                    this.stringMask = "255.248.0.0";
                    break;
                case 14:
                    this.stringMask = "255.252.0.0";
                    break;
                case 15:
                    this.stringMask = "255.254.0.0";
                    break;
                case 16:
                    this.stringMask = "255.255.0.0";
                    break;
                case 17:
                    this.stringMask = "255.255.128.0";
                    break;
                case 18:
                    this.stringMask = "255.255.192.0";
                    break;
                case 19:
                    this.stringMask = "255.255.224.0";
                    break;
                case 20:
                    this.stringMask = "255.255.240.0";
                    break;
                case 21:
                    this.stringMask = "255.255.248.0";
                    break;
                case 22:
                    this.stringMask = "255.255.252.0";
                    break;
                case 23:
                    this.stringMask = "255.255.254.0";
                    break;
                case 24:
                    this.stringMask = "255.255.255.0";
                    break;
                case 25:
                    this.stringMask = "255.255.255.128";
                    break;
                case 26:
                    this.stringMask = "255.255.255.192";
                    break;
                case 27:
                    this.stringMask = "255.255.255.224";
                    break;
                case 28:
                    this.stringMask = "255.255.255.240";
                    break;
                case 29:
                    this.stringMask = "255.255.255.248";
                    break;
                case 30:
                    this.stringMask = "255.255.255.252";
                    break;
                case 31:
                    this.stringMask = "255.255.255.254";
                    break;
            }
        return this.stringMask;
    }
    
    @Override
    public String toString(){
        return "IP: " + getStringIp() + "\n"
                + "Classe: " + mostrarClasse(this.byteBits)+ "\n"
                + "Macara de Rede: " + verificarMascara(this.byteBits) + "\n"
                + "Hosts Válidos: " + calcularHOSTS(this.byteBits) + "\n"
                + "Sub-Redes: " + calcularSUBREDE(this.byteBits);     
    }
    
    public static void main(String[] args) {
        
        Main main = new Main();
        
        JOptionPane.showMessageDialog(null, "Calculadora", "Bem Vindo", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Para Calculo de Sub-Redes \n"
                + "     e \n"
                + "      Holts Validos", "Caculadora", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Digite: \n"
                + "0 - Para Sair a Qualquer Momento", "Calculadora", JOptionPane.PLAIN_MESSAGE);
        
        //ENTRADA DE DADOS
        main.setStringIp(JOptionPane.showInputDialog(null, "Digite Seu Endereço de IP: ", "Calculadora", JOptionPane.QUESTION_MESSAGE));
        main.finalizarIP(main.getStringIp());
        main.verificarIP(main.getStringIp());
        
        main.setByteBits(Byte.parseByte(JOptionPane.showInputDialog(null, "Digite o a Quantia de Bits do Seu IP: ", "Calculadora", JOptionPane.QUESTION_MESSAGE)));
        main.finalizarBITS(main.getByteBits());
        main.verificarBITS(main.getByteBits());
        
        //SAIDA DE DADOS
        JOptionPane.showMessageDialog(null, "DADOS: \n"
                + main.toString(), "Calculadora", JOptionPane.INFORMATION_MESSAGE);
            /*
                192.168.1.10
                
                REDE          |INICIAL     |FINAL         |BRODCAST
                192.168.1.10  |192.168.1.0 |192.168.1.254 |192.168.1.258
                              |            |              |
            */   
    }
}
