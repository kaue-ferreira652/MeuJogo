public class Jogador implements Acao{
    private String nome;
    public int vida;
    public int sanidade;
    public int Defesa;
    public int movimento;

    public Jogador(String nome, int vida, int sanidade, int defesa, int movimento) {
        this.nome = nome;
        this.vida = vida;
        this.sanidade = sanidade;
        Defesa = defesa;
        this.movimento = movimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getSanidade() {
        return sanidade;
    }

    public void setSanidade(int sanidade) {
        this.sanidade = sanidade;
    }

    public int getDefesa() {
        return Defesa;
    }

    public void setDefesa(int defesa) {
        Defesa = defesa;

    }

    public int getMovimento() {
        return movimento;
    }

    public void setMovimento(int movimento) {
        this.movimento = movimento;
    }

    @Override
    public void atacar(int ataque) {
        Acao.super.atacar(ataque);
        vida = vida - ataque;
    }

    @Override
    public void bloqueio(int defesa) {
        Acao.super.bloqueio(defesa);
        vida = vida - defesa;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", sanidade=" + sanidade +
                ", Defesa=" + Defesa +
                ", movimento=" + movimento +
                '}';
    }
}
