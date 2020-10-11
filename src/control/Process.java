package control;

import br.com.web.model.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2
 * @since 11/10/2020
 */
public class Process {
    
    private String stringMask, stringClass;
    private int intSUBRedes = 0, intHost = 0;
    private User user;
    
    public Process() {   
        this.user = new User();
    }
       
    public void verificarIP(String ip){
        user.finalizarIP(ip);
        if (ip.equals("0.0.0.0")){
            JOptionPane.showMessageDialog(null, "Seu Endereço de IP é Inválido", "Calculadora", JOptionPane.ERROR_MESSAGE);
            user.setStringIp(JOptionPane.showInputDialog(null, "Digite Seu Endereço de IP: ", "Calculadora", JOptionPane.QUESTION_MESSAGE));
            verificarIP(user.getStringIp());
        } else {
            JOptionPane.showMessageDialog(null, "Processando Seu IP...", "Calculadora", JOptionPane.DEFAULT_OPTION);
        }
    }
    
    public void verificarBITS(byte bits){
        user.finalizarBITS(bits);
        if (bits >= 8 && bits < 32){
            JOptionPane.showMessageDialog(null, "Processando Bits...", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Número de Bits Inválido", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
            user.setByteBits(Byte.parseByte(JOptionPane.showInputDialog(null, "Digite o Toptal de Bits do Seu IP: ", "Calculadora", JOptionPane.QUESTION_MESSAGE)));
            verificarBITS(user.getByteBits());
        }
        
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

}
