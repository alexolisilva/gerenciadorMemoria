
package gerenciadorMemoria;

import java.util.ArrayList;


/**
 *
 * @author aos
 */
public class GerenciadorMemoria {
    
    public static void main(String[] args) {
        
        Processo processo1 = new Processo();
        Processo processo2 = new Processo();
        Processo processo3 = new Processo();
        Processo processo4 = new Processo();
        Processo processo5 = new Processo();
        
        
        processo1.setNome("a");
        processo1.setTamanho(30);
        processo2.setNome("2");
        processo2.setTamanho(2);
        processo3.setNome("c");
        processo3.setTamanho(3);
        processo4.setNome("d");
        processo4.setTamanho(4);
        processo5.setNome("e");
        processo5.setTamanho(5);
        
        
        int memoria = 0;
        
        ArrayList<Processo> processos = new ArrayList();
        
        if((memoria + processo1.getTamanho()) <= 50){
            processos.add(processo1);
            processo1.setRegistradorBase(memoria);
            processo1.setRegistradorLimite((int) (memoria + processo1.getTamanho()));
            memoria = memoria+ processo1.getTamanho();
        }else{
            System.out.println("Erro, memória insuficiente!");
        }
        if(memoria <= 50){
            processos.add(processo2);
            processo2.setRegistradorBase(processo1.getRegistradorLimite());
            processo2.setRegistradorLimite((int) (memoria + processo2.getTamanho()));
            memoria = memoria+ processo2.getTamanho();
        }else{
            System.out.println("Erro, memória insuficiente!");
        }
        if(memoria <= 50){
            processos.add(processo3);
            processo3.setRegistradorBase(processo2.getRegistradorLimite());
            processo3.setRegistradorLimite((int) (memoria + processo3.getTamanho()));
            memoria = memoria+ processo3.getTamanho();
        }else{
            System.out.println("Erro, memória insuficiente!");
        }
        if(memoria <= 50){
            processos.add(processo4);
            processo4.setRegistradorBase(processo3.getRegistradorLimite());
            processo4.setRegistradorLimite((int) (memoria + processo4.getTamanho()));
            memoria = memoria+ processo4.getTamanho();
        }else{
            System.out.println("Erro, memória insuficiente!");
        }
        if(memoria <= 50){
            processos.add(processo5);
            processo5.setRegistradorBase(processo4.getRegistradorLimite());
            processo5.setRegistradorLimite((int) (memoria + processo5.getTamanho()));
            memoria = memoria+ processo5.getTamanho();
        }else{
            System.out.println("Erro, memória insuficiente!");
        }
        
        System.out.println("Tamanho coupado na memória = " + memoria + "\n"+ "Processos armazenados na memória:\n" + processos);
        
        
    }
}
