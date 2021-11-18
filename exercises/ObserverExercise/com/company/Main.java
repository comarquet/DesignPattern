package com.company;


/**
 *  Problème : transformer le code suivant pour que le couplage entre le
 *  modèle (OsbservableCalculator) et les vues  (XXXDisplay) soit moins fort
 *  (le lien entre vues et modèles est codé en dur dans le modèle,
 *  le modèle sait et décide unilatéralement des informations à communiquer aux instances des vues.)
 *
 *
 *  Déroulement :
 *  - Ajouter une interface StateObserver qui sera implémentée par les classes OctDisplay, Roman Display,
 *    et HexDisplay
 *  - Créer une classe abstraite AbstractObservable qui implémente le mécanisme de base d'un observable,
 *    à savoir attacher et detacher des observateurs avec les méthodes attach(), detach(), et notifier
 *    tous les observateurs d'un nouvel état (une valeur int) avec une méthode notifyObservers(int value).
 *  - Réfactorer la classe ObservableCalculator pour qu'elle n'ait plus de couplage direct avec
 *    les observers OctDisplay, RomanDisplay, HexDisplay. Lui faire implémenter le pattern Observable
 *  - Refactorer le main pour attacher les observers OctDisplay, HexDisplay et RomanDisplay à l'instance
 *    de ObservableCalculator, et obtenir la même sortie du programme qu'avant notre refactor
 *
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ObservableCalculator calculator = new ObservableCalculator();

        /* Input buffer from standard input */
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Input a new value to the calculator (enter \"q\" to exit) : ");

            /** Check for quit command */
            String strValue = stdin.readLine();
            if (strValue.equals("q")) {
                break;
            }

            /** Get int value from the user input */
            int value;
            try {
                value = Integer.parseInt(strValue);
            } catch (NumberFormatException e) {
                System.out.println("You must enter a valid integer number, or \"q\" to exit the program\n");
                continue;
            }

            /** Set the value to the calculator */
            calculator.setState(value);
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
