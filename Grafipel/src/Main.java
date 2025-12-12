public class Main {
    public static void main(String[] args) {

        Pessoa[]p = new Pessoa[2];
        Livro[]l = new Livro[4];

        p[0] = new Pessoa("Lais", 17, "F");
        p[1] = new Pessoa("Brian", 17, "M");

        l[0] = new Livro("Verity", "Colleen Hoover", 320, p[0]);

//        l[0].abrir();
        l[0].folhear(330);
        System.out.println(l[0].detalhes());
    }
}