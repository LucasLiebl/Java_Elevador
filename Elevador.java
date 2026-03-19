public class Elevador {
    private int andar;
    private int MaxAndar;
    private int MinAndar;
    private boolean portaEstaAberta;

    public Elevador(int andar, int MaxAndar, int MinAndar, boolean portaEstaAberta) {
        this.andar = andar;
        this.MaxAndar = MaxAndar;
        this.MinAndar = MinAndar;
        this.portaEstaAberta = portaEstaAberta;
    }

    public void subir() {
        System.out.println("Andar atual: " + andar);
        if (andar >= MaxAndar) {
            System.out.println("Andar maximo é " + MaxAndar);
            return;
        }

        if (portaEstaAberta) {
            System.out.println("A porta está aberta, feche a porta para subir");
                return;
        }
        andar++;
        System.out.println("O elevador subiu para o andar " + andar);
    }

    public void descer() {
        System.out.println("Andar atual: " + andar);
        if (andar <= MinAndar) {
            System.out.println("Andar minimo é " + MinAndar);
            return;
        }
        if (portaEstaAberta) {
            System.out.println("A porta está aberta, feche a porta para descer");
                portaEstaAberta = false;
                System.out.println("A porta foi fechada");
                return;
        }

        andar--;
        System.out.println("O elevador desceu para o andar " + andar);
    }

    public void abrirPorta() {
        if (portaEstaAberta) {
            System.out.println("A porta ja esta aberta");
            return;
    }
        portaEstaAberta = true;
        System.out.println("A porta foi aberta");
    }


    public void fecharPorta(){
        if (!portaEstaAberta){
            System.out.println("A porta ja esta fechada");
            return;
        }
        portaEstaAberta = false;
        System.out.println("A porta foi fechada");
    }

    public void statusPorta() {
        System.out.println("Porta esta " + (portaEstaAberta ? "aberta" : "fechada"));
    }
}