public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 1 de Python");
        v[2] = new Video("Aula 1 de Python");

        Gafanhoto g = new Gafanhoto("Gabriel",19,'M',"gabrielhenrique@gmail.com");

        System.out.println("-------------VÍDEOS-------------\n" + v[0].toString() + "\n" + v[1].toString());
        System.out.println("-----------GAFANHOTOS-----------\n" + g.toString());

        Visualizacao vis = new Visualizacao(g,v[0]);
        System.out.println(vis.toString());
    }
}