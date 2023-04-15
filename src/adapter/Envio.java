package adapter;

public class Envio {
    IPacote pacote;
    PacoteAdapter persistencia;

    public Envio() {
        pacote = new PacoteTamanho();
        persistencia = new PacoteAdapter(pacote);
    }

    public void setPacote(String tamanho) {
        pacote.setPacote(tamanho);
        persistencia.salvarPacote();
    }

    public String getPacote() {
        return persistencia.recuperarPacote();
    }

    public float getPreco() {
        return persistencia.getPreco();
    }
}
