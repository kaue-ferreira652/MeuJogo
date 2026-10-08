void main() {
    Jogador player = new Jogador("Apollo", 25, 30,
            2, 9);
    player.setNome("Apollo");
    player.setVida(25);
    player.setSanidade(30);
    player.setMovimento(9);
    player.atacar(+4);
    player.bloqueio(-2);
    IO.println(player);

    Inimigos zumbiSangue = new Inimigos("Zumbi de Sangue", 250,
            0,25, 9);
    zumbiSangue.atacar(+26);
    zumbiSangue.bloqueio(-25);
    IO.println(zumbiSangue);

    Npc larissa = new Npc("Larissa pingu", 9, 25,
            0, 6);
    larissa.atacar(0);
    larissa.bloqueio(0);
    IO.println(larissa);

    Boss tetéia = new Boss("tetéia", 2000, 1000, 500, 100);
    tetéia.atacar(+100);
    tetéia.bloqueio(500);
    IO.println(tetéia);

}