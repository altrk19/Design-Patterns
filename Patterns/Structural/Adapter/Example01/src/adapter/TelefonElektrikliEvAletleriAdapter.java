package adapter;

public class TelefonElektrikliEvAletleriAdapter implements ElektrikliEvAletleri{
    private Telefon telefon;

    public TelefonElektrikliEvAletleriAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
}
