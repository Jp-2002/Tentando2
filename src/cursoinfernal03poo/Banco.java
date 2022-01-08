
package cursoinfernal03poo;

/**
 *
 * @author joaop
 */
public class Banco {
   //Atributos 
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private String sts;
    
    //Construtor
    public Banco() {
       this.setSaldo(0);
       this.setStatus(false);
    }
   //Métodos
    public void estadoAtual() {
        if (this.isStatus() == true) {
            sts = "Aberta";
        } else {
            sts = "Fechada";
        }
        System.out.println("Status: " + this.sts);
        System.out.println("Dono: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());        
        System.out.println("Tipo da conta: " + this.tipo);
        System.out.printf("Saldo: R$%.2f", this.getSaldo());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
        System.out.println("------------------------------");
    }
    
    public void fecharConta() {
        if (this.getSaldo()>0) {
            System.out.println("A conta não pode ser fechada porque ainda tem saldo.");            
        } else if (this.getSaldo()<0) {
            System.out.println("A conta não pode ser fechada porque ainda tem débito.");
        } else {
            this.setStatus(false);
            System.out.println("Fechada com sucesso.");
        }
    }
    
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.printf("Depósito de R$%.2f realizado com sucesso ", v);
            System.out.println("na conta de " + this.getDono() + ".");
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
          if (this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo() - v);
            System.out.printf("Saque de R$%.2f realizado com sucesso.", v);
              System.out.println("");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    } else {
            System.out.println("Impossível sacar de uma conta fechada.");
    }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")){
            v = 20;
        }
        if (this.isStatus()) {
           if (this.getSaldo()>= v) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono() + ".");
           } else {
               System.out.println("Saldo insuficiente.");
           }
           } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }
    
    //Métodos Especiais
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;           
    }    
}
