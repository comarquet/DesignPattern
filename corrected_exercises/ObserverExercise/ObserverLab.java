// Problème : transformer le code suivant pour que le couplage entre le 
// modèle et les vues soit moins fort (lien entre vues et modèles est 
// codé en dur dans le modèle, le modèle sait et décide unilatéralement
// des informations à communiquer aux instances des vues.) 
//
// Déroulement :
// o Ajouter une classe de base Observer dont dérivent les classes Hex, 
//   Oct, et Roman
// o Enlever les objets Observer de la classe Subject, et les remplacer
//   par un tableau de la classe de base Observer.
// o Ajouter une méthode "attach" au Subject pour que les objets Observer
//   puissent s'enregistrer eux mêmes auprès du Subject.
// o Ajouter une méthode "notifyObs" dans la classe Subject qui diffuse
//   à l'ensemble des observer le fait qu'un changement soit apparu.
// o Ajouter une méthode "getState" à la classe Subject pour que les objets
//   observer puissent utiliser l'état du Subject
// o Appeler la méthode notifyObs() au sein de la méthode setState() du 
//   Subject.
// o Ajouter un membre Subject dans la classe Observer.
// o Le constructeur d'un Observer doit avoir en paramètre un Subject.
// o Les objets Observer devraient s'attacher eux-mêmes à leur subject au 
//   sein de leur constructeur.
// o Modifier la métode "update" d'Observer pour qu'elle n'ait plus d'argument.

import java.io.*;


public class ObserverLab {

    public static void main(String[] args) throws IOException {
        OctObserver octObserver = new OctObserver();
        HexObserver hexObserver = new HexObserver();
        RomanObserver romanObserver = new RomanObserver();

        Subject subj = new Subject();

        subj.attach(octObserver);
        subj.attach(hexObserver);
        subj.attach(romanObserver);

        int value;

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input integer: ");

        while (true) {
            value = Integer.parseInt(stdin.readLine());
            if (value == 0) break;

            subj.setState(value);
            System.out.print("\nInput integer: ");
        }
    }
}

// Input integer: 31
// hex:   1f
// oct:   37
// roman: XXXI
// 
// Input integer: 32
// hex:   20
// oct:   40
// roman: XXXII
// 
// Input integer: 48
// hex:   30
// oct:   60
// roman: XLVIII
