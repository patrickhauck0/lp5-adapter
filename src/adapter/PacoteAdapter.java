package adapter;

public class PacoteAdapter extends PacotePreco {
    private IPacote pacoteTamanho;

    public PacoteAdapter(IPacote pacoteTamanho) {
        this.pacoteTamanho = pacoteTamanho;
    }

    public String recuperarPacote() {
        if (this.getPreco() >= 40.0) {
            pacoteTamanho.setPacote("XG");
        }
        else
            if (this.getPreco() >= 25.0) {
                pacoteTamanho.setPacote("G");
            }
        else
            if (this.getPreco() >= 10.0) {
                pacoteTamanho.setPacote("M");
            }
        else
            pacoteTamanho.setPacote("P");

        return pacoteTamanho.getPacote();
    }

    public void salvarPacote() {
        if (pacoteTamanho.getPacote().equals("XG")) {
            this.setPreco(100.0f);
        }
        else
            if (pacoteTamanho.getPacote().equals("G")) {
                this.setPreco(50.0f);
            }
        else
            if (pacoteTamanho.getPacote().equals("M")) {
                this.setPreco(25.0f);
            }
        else
            this.setPreco(10.0f);
    }
}
