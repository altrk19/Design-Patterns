package adapter;

public class __Main {
    public static void main(String[] args) {
        Priz priz = new Priz();
        Utu utu = new Utu();
        BuzDolabi buzDolabi = new BuzDolabi();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzDolabi);

        Telefon telefon = new Telefon();
        TelefonElektrikliEvAletleriAdapter adapter = new TelefonElektrikliEvAletleriAdapter(telefon);
        priz.elektrikVer(adapter);
    }
}
