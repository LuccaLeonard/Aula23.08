package programas;

import entidades.Aluno;
import javax.swing.JOptionPane;

public class UsaAluno {
    
    static Aluno [] tabAluno;
    static int n = 0;  
    static int linha = -1;
    
    static void addNewReg () {
        linha ++;
        
        if (linha >= n){
            JOptionPane.showMessageDialog(null, "Você não pode inserir linhas a mais que " + n);
            
            return;
        }
        
        tabAluno [ linha ] = new Aluno();
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do Aluno: ");
        tabAluno[linha].setNome(nome);
        
        double av1 = Double.parseDouble(
          JOptionPane.showInputDialog(null,"Digite a AV1: ")
        );
        tabAluno[linha].setAv1(av1);
        
        double ado = Double.parseDouble(
          JOptionPane.showInputDialog(null,"Digite a ADO: ")
        );
        tabAluno[linha].setAdo(ado);
        
        tabAluno[linha].setMedia();
    }
    
    static void listar () {
        String saida = "";
        for (int i = 0; i <= linha; i++) {
            saida += String.format(" %s %.2f %.2f %.2f \n", tabAluno[i].getNome(),
                                                                  tabAluno[i].getAv1(),
                                                                  tabAluno[i].getAdo(),
                                                                  tabAluno[i].getMedia());
        }
        
        int i = 0;
        JOptionPane.showMessageDialog(null, saida);
        JOptionPane.showMessageDialog(null, "Sua média é: " + tabAluno[i].getMedia());        
    }
    
    public static void main (String[] args) {
        
        
        n = Integer.parseInt (JOptionPane.showInputDialog(null,"Quantos alunos deseja cadastrar?"));
        tabAluno = new Aluno [n];
       
        addNewReg();
        listar();
    }
}
