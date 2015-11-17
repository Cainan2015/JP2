
package televisao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TvRepositorio {
    
    private List<Televisao> repositorio;
    public TvRepositorio(){
        repositorio = new ArrayList<Televisao>();
    }
    
    public void cadastrar(Televisao televisao){
        repositorio.add(televisao);
    }
        public String listar(){
        String valoresConcatenadosLista = "Codigo      Marca      modelo \n";
        for(Televisao linha: repositorio){
        valoresConcatenadosLista = valoresConcatenadosLista+"      "+linha.getId()+"             "+linha.getMarca()+"            "+linha.getModelo()+"\n";
    }
        return valoresConcatenadosLista;
    }
    String televisaoParaDeletar;
    
    Boolean isTelevisaoExiste = false;
public void deletar(int codigoParaAlterar) { 
		
		Televisao tvParaExcluir = new Televisao();
		
		for (Televisao linha : repositorio){
			if(linha.getId() == codigoParaAlterar)
			{
				tvParaExcluir = linha;
			}
		}
		if(tvParaExcluir.getId() != 0){
			repositorio.remove(tvParaExcluir);
		
			JOptionPane.showMessageDialog(null, "Tv deletada com Sucesso");
		
		}
			
	
	}
public String consultar(int televisaoParaAchar) { 

		Televisao tvParaAchar = new Televisao();

		for (Televisao linha : repositorio) {
			if (linha.getId() == televisaoParaAchar) {
				tvParaAchar = linha;
			}
		}
		String televisaoConsulta ="   "+tvParaAchar.getId()+"  "+
				tvParaAchar.getMarca()+"  "+
				tvParaAchar.getModelo()+"  "+
				tvParaAchar.getNumeroSerie()+"  "+
				tvParaAchar.getTamanho()+"  "+
				tvParaAchar.getVoltagem();	
		
		return televisaoConsulta;
	}
public void alterar() { 
		Televisao tvParaExcluir = new Televisao();
		Televisao novaTv = new Televisao();

		int codigoParaAlterar = Integer.parseInt(JOptionPane
				.showInputDialog("Qual o codigo da televisao que você deseja alterar? "));
		for (Televisao linha : repositorio) {
			if (linha.getId() == codigoParaAlterar) {
				tvParaExcluir = linha;
			}
		}
		if (tvParaExcluir.getId() != 0) {
			repositorio.remove(tvParaExcluir);

			novaTv.setId(Integer.parseInt(JOptionPane
					.showInputDialog("Qual o codigo da televisao ? ")));
			novaTv.setMarca(JOptionPane
					.showInputDialog("Qual a marca da televisao ? "));
			novaTv.setModelo(JOptionPane
					.showInputDialog("Qual o modelo da televisao ? "));
			novaTv.setVoltagem(JOptionPane
					.showInputDialog("Qual a voltagem da televisao ? "));
			repositorio.add(novaTv);

			JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

		} else {
			System.err.println("Esse cara não existe na lista");
		}
	}

    
}
