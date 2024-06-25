package devdojo.poo.test;

import devdojo.poo.constructors.Anime;

public class AnimeTest {

    public static void main(String[] args) {

        Anime anime = new Anime("One Piece");

        Anime anime2 = new Anime();

        anime2.printAtributtes();

        anime.printAtributtes();

        anime.setEpisodes(1231);

        anime.printAtributtes();

        Anime.print();

        Anime.setValue(15);

        Anime.print();

    }
}
