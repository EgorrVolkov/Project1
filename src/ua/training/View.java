package ua.training;

import java.io.PrintWriter;

class View {

    void printLeftBrace(PrintWriter out) {
        out.print("<h1>");
    }

    void printRightBrace(PrintWriter out) {
        out.print("</h1>");
    }

    void printMessage(String message, PrintWriter out) {
        out.print(message);
    }

    void printLnMessage(String message, PrintWriter out) {
        out.print(message+"<br>");
    }
}
