package sabourin;
import sabourin.compute.Computor;
import sabourin.exceptions.MonException;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class App 
{
    //DONE TODO 5 Dans le main, il faut toujours catch parce qu'on est la dernière méthode de la pile
    // si ce n'est pas nous qui attrape, c'est personne ==> l'application crash
    public static void main( String[] args ) {
        try {
            new Computor();
        } catch(MonException e){
            System.out.println("Erreur: " + e.getMessage());
        } catch (ParseException e){
            System.out.println("Erreur d'interpretation: " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Erreur Arithmetique");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erreur Index dépassé");
        } catch (FileNotFoundException e) {
            System.out.println("Erreur fichier inexistant");
        } finally{
            System.out.println("Finally du main, c'est toujours exécuté");
        }
    }
}
