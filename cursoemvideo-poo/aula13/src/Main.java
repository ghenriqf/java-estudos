public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 1 de Python");
        v[2] = new Video("Aula 1 de Python");

        Gafanhoto g = new Gafanhoto("Gabriel",19,'M',"gabrielhenrique@gmail.com");

        System.out.println(v[0].toString());
        System.out.println(g.toString());
    }
}