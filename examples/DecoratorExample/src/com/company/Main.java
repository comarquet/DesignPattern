package com.company;

public class Main {

    public static void main(String[] args) {
        // create a new window
        System.out.println("Rendering my simple window : ");


        AbstractWindow window = new SimpleWindow(50);
        window.renderWindow();


        // at some point later, we want to add a functionality, add a header
        // to some windows, without modifying the SimpleWidow class

        // The behaviour must be modified at runtime
        System.out.println("\n\n\n\n");
        AbstractWindow windowWithHeader = new WindowWithHeader(window, "My application");
        windowWithHeader.renderWindow();


    }











    /** Solution main */
//    public static void main(String[] args) {
//        // create a new window
//
//        System.out.println("Rendering my simple window : ");
//        AbstractWindow window = new SimpleWindow(50);
//        window.renderWindow();
//
//
//        // at some point later, we want to add a functionality, add a header
//        // to some windows, without modifying the SimpleWidow class
//
//
//        // decorate old window
//        System.out.println("Rendering my window, decorated with a header : \n");
//        window = new WindowWithHeader(window, "My Application");
//
//        //  now window object
//        // has additional behavior / state
//
//        window.renderWindow();
//    }
}


