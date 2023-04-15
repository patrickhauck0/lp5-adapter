package adapter;

public class PacoteTamanho implements IPacote {
    private String tamanho;

    @Override
    public String getPacote() {
        return this.tamanho;
    }

    @Override
    public void setPacote(String tamanho) {
        this.tamanho = tamanho;
    }
}
