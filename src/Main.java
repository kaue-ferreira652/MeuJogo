void main() {
    Jogador player = new Jogador("Apollo", 25, 30,
            2, 9);
    player.setNome("Apollo");
    player.setVida(25);
    player.setSanidade(30);
    player.setMovimento(9);
    player.atacar(+10);
    player.bloqueio(-2);
    IO.println(player);

    Inimigos zumbiSangue = new Inimigos("Zumbi de Sangue", 50,
            0,3, 9);
    zumbiSangue.setNome("Zumbi de Sangue");
    zumbiSangue.setVida(50);
    zumbiSangue.setSanidade(0);
    zumbiSangue.setMovimento(9);
    zumbiSangue.atacar(+10);
    zumbiSangue.bloqueio(-3);
    IO.println(zumbiSangue);

    Npc ivete = new Npc("Ivete", 10, 25,
            0, 6);
    ivete.atacar(0);
    ivete.bloqueio(0);
    IO.println(ivete);

    Boss kian = new Boss("Kian", 2000, 1000, 500, 100);
    kian.atacar(+60);
    kian.bloqueio(-35);
    IO.println(kian);

}