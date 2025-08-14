public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Gabriel",19,'M');
        p[1] = new Pessoa("Laura", 18, 'F');

        l[0] = new Livro("Curso de POO com Java","Gustavo",300,p[0]);
        l[1] = new Livro("Curso de Python","Guanabara",540,p[1]);
        l[2] = new Livro("Curso de HTML5 e CSS3","Gustavo Guanabara",540,p[0]);

        l[0].detalhes();
        System.out.println(p[0].toString());

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        l[0].detalhes();

    }
}
