public class Npc extends Jogador implements Acao{
    public Npc(String nome, int vida, int sanidade, int defesa, int movimento) {
        super(nome, vida, sanidade, defesa, movimento);
    }

    @Override
    public void atacar(int ataque) {
        super.atacar(ataque);
        vida = vida - ataque;
    }

    @Override
    public void bloqueio(int defesa) {
        super.bloqueio(defesa);
        vida = vida - defesa;
    }
}
