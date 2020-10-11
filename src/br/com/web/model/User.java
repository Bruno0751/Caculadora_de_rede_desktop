package br.com.web.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2
 * @since 11/10/2020
 */
public class User {
    
    String stringIp;
    byte byteBits;
    Object objDO = null;

    public User() {
    }

    public String getStringIp() {
        return stringIp;
    }

    public void setStringIp(String stringIp) {
        this.stringIp = stringIp;
    }

    public byte getByteBits() {
        return byteBits;
    }

    public void setByteBits(byte byteBits) {
        this.byteBits = byteBits;
    }

    public Object getObjDO() {
        return objDO;
    }

    public void setObjDO(Object objDO) {
        this.objDO = objDO;
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
    
    
}
