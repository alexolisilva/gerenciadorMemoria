
package gerenciadorMemoria;

/**
 *
 * @author aos
 */
public class Processo {
 
    private String nome;
    private int tamanho;
    private int registradorBase;
    private int registradorLimite;

    
     public Processo() {
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getRegistradorBase() {
        return registradorBase;
    }

    public void setRegistradorBase(int reistradorBase) {
        this.registradorBase = reistradorBase;
    }

    public int getRegistradorLimite() {
        return registradorLimite;
    }

    public void setRegistradorLimite(int registradorLimite) {
        this.registradorLimite = registradorLimite;
    }

    @Override
    public String toString() {
        return "Processo{" + "nome=" + nome + ", tamanho=" + tamanho + ", registradorBase=" + registradorBase + ", registradorLimite=" + registradorLimite + '}';
    }
    
    
    
    
    
}
