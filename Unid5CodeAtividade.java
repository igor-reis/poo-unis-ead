package unid5codeatividade;

import javax.swing.JOptionPane;

/**
 *
 * @author igor
 */
public class Unid5CodeAtividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso, alturaM, alturaCM, IMC;
        String leitura;
        
        JOptionPane.showMessageDialog(null, "Calcular índice de massa corporal (IMC)");
        
        //leitura peso
        leitura = JOptionPane.showInputDialog("Digite o seu peso em KG: ");
        peso = Float.parseFloat(leitura);
        
        //leitura altura
        leitura = JOptionPane.showInputDialog("Digite sua altura em CM: ");
        alturaCM = Float.parseFloat(leitura);
        
        //converter alturaCM em alturaM
        alturaM = alturaCM/100;
        
        //calculo IMC
        IMC = peso/(alturaM*alturaM);
 
        //classificações grau de obesidade
        if(IMC < 16){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + ". Sua classificação: Magreza grave!");
        }else if((IMC >= 16) && (IMC < 17)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + ". Sua classificação: Magreza moderada!");
        }else if((IMC >= 17) && (IMC < 18.5)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + ". Sua classificação: Magreza leve!");
        }else if((IMC >= 18.5) && (IMC < 25)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + ". Sua classificação: Saudável!");
        }else if((IMC >= 25) && (IMC < 30)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + ". Sua classificação: Sobrepeso!");
        }else if((IMC >= 30) && (IMC < 35)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + ". Sua classificação: Obesidade Grau I!");
        }else if((IMC >= 35) && (IMC < 40)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + ". Sua classificação: Obesidade Grau II (severa)!");
        }else if(IMC > 40){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC + ". Sua classificação: Obesidade Grau III (mórbida)!");
        }
        
    }
    
}
