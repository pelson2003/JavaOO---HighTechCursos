package Annotations;

import java.io.Serializable;

@SuppressWarnings("serial")
@CabecalhoXTI(
		criador = "Ricardo Lopes", 
		dataCria��o = "08/10/2011", 
		instituicao = "Universidade XTI", 
		projeto = "Sistema de Avalia��es",
		revisao = 2
	)


@ErrosCorrigidos("0001")
public class AnnotationsXTI implements Serializable {
	public static void main(String[] args) {
	}
	
	@Deprecated
	public void metodoaserdescontinuado(){
		System.out.println("Usar a anota��o @Deprecated");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
