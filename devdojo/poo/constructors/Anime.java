package devdojo.poo.constructors;

public class Anime {

    public int episodes;
    public String name;
    public String genre;
    private static int value = 12;

    public Anime(String name) {
        this.name = name;
    }

    public static void print() {
        System.out.println(Anime.value);
    }

    public static void setValue(int v) {
        Anime.value = v;
    }

    public Anime() {

    }

    public void printAtributtes() {
        System.out.println("name: " + this.name + " episodes: " + this.episodes + " genre: " + this.genre);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
