
public class Tabuada {
	
    private int numeroTabuada;
    
    
    public void gerarTabuada (){
    	int contador =0;
    	while(contador <=10) {
    		System.out.println(contador * numeroTabuada);
    		contador++;
    	}
    }
    public void gerarTabuadaCompleta() {
    	int contador = 0;
    	int tabuada = 0;
    	while(tabuada <=10) {
    		while(contador <=10) {
    			System.out.println(tabuada * contador);
    			contador++;
    		}
    		contador=0;
    		tabuada++;
    	}
    }
    public void setNumeroTabuada(int numero) {
    	this.numeroTabuada = numero;
    }
}
