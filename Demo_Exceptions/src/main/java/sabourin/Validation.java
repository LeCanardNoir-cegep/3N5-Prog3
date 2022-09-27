package sabourin;

public class Validation {

    public static void main( String[] args ) {
        try {
            // DONE TODO 1 Décommenter une seule ligne à la fois dans le try et exécuter chaque fois
            validerNomUtilisateur("dieu");
            //validerNomUtilisateur("                     ");
            //validerNomUtilisateur("    cour");
            //validerNomUtilisateur("ceci a l'air d'un nom correct");
            //validerNomUtilisateur("ceci a l'air d'un nom correct  d.,,basdkfhaskdkasdhfg;ka he;poieyrsoiffb^poajd;gkjnwpoeru=0SD9ÎAJD;TKJB  W;EO I9U8-0du ;WJEBRL KIDUF^PB0 9¸APOEHL wjehd^poad udrtjk;glakshd khad;;slaj ;lasd;fllkjas;ldfj;alsdjf;lask hpiwti HW;KEFNA;sdfjh;WNR`lkjpf 9¸-RYIO    IH3LK ju^fpoUI;EOH ;wkrh;aiodfi^hokN W.J HADFFH ");
        } catch (NomReserve e) {
            System.out.println("Dans ce catch, on peut indiquer pourquoi on refuse la valeur entrée: " + e.getMessage());
        } catch (NomTropCourt e) {
            System.out.println("Et en distinguant les cas, aider l'utilisateur à utiliser notre application");
        } catch (NomTropLong e) {
            System.out.println("Pour chaque cas à distinguer, on peut créer une classe. Ça rend le code lisible");
        }
    }

    public static void validerNomUtilisateur(String nom) throws NomReserve, NomTropCourt, NomTropLong {
        if (nom.equals("dieu")) {
            throw new NomReserve("dieu");
        } else if (nom.trim().length() < 5) {
            throw new NomTropCourt();
        } else if (nom.trim().length() > 255) {
            throw new NomTropLong();
        }
    }

    // DONE TODO 2 On peut définir des classes statiques dans une classe
    public static class NomReserve extends Exception{
        NomReserve(){}
        NomReserve(String str){
            super(str);
        }
    }
    public static class NomTropCourt extends Exception{}
    public static class NomTropLong extends Exception{}
}
