public interface Acao {
    public default void atacar(int ataque){
        ataque = ataque;
    }

    public default void bloqueio(int defesa){
        defesa = defesa;
    }

}
