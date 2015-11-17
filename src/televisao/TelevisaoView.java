
package televisao;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class TelevisaoView {
    
    private static Integer menu;
    
    public static void mostrarMenu(){
        TvRepositorio repositorio = new TvRepositorio();
 
        do{
	menu = Integer.parseInt(JOptionPane
	.showInputDialog("Selecionar um valor no menu:"
	+ "\n 1)Cadastrar " + "\n 2)Listar "
        + "\n 3)Deletar " + "\n 4)Consultar "
	+ "\n 5)Alterar " + "\n 6)Sair"));
               
        
        if (menu == 1) {
            Televisao tv = new Televisao(); 
            tv.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o Id da Televisão: ")));
            tv.setMarca(JOptionPane.showInputDialog("Digite a Marca da Televisão: "));
            tv.setModelo(JOptionPane.showInputDialog("Digite o Modelo da Televisão: "));
            tv.setTamanho(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da Televisão: ")));
            tv.setVoltagem(JOptionPane.showInputDialog("Digite a voltagem da Televisão: "));
            tv.setNumeroSerie(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de série da Televisão: ")));
            repositorio.cadastrar(tv);
            JOptionPane.showMessageDialog(null,"Televisão cadastrada com Sucesso!");
        }
        else if (menu == 2){
            
            JOptionPane.showMessageDialog(null,repositorio.listar());
           
        } 
        else if (menu == 3){
            int codigoParaAlterar = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de série da televisao a ser deletado?"));
            repositorio.deletar(codigoParaAlterar);
        }
else if (menu == 4) {
	int televisaoParaAchar = Integer
	.parseInt(JOptionPane
	.showInputDialog(" Qual numero de serie da Televisão Procurada ?"));
	JOptionPane.showMessageDialog(null, repositorio.consultar(televisaoParaAchar));}
        else if (menu == 5){
            repositorio.alterar();
        }}while
         (menu != 6);
                }


    
  public static void main(String[] args) {
    mostrarMenu();
    }
   
    
}
