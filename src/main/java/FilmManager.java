public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
      this.limit = 5;
    }

    public FilmManager(int limit) {
      this.limit = limit;
    }


    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;

    }

    public String[] filmLast() {
        int resultlength;
        if (films.length < limit) {
            resultlength = films.length;
        } else {
            resultlength = limit;
        }
        String[] ans = new String[resultlength];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = films[films.length - 1 - i];
        }
        return ans;
    }
}
