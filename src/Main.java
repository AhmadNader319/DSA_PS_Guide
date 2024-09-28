import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;


public class Main {
    static FileHandler fileHandler;
    static FileReader fileReader;
    static BufferedReader bufferedReader;
    static FileHandler fileWriter;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[] pathFuntions = new String[3];
        ArrayList<String> arraysProblems;
        ArrayList<String> listProblems;
        ArrayList<String> OOPProblems;

    }
    public static ArrayList<String> getArrayProblems(String path) throws IOException {
        ArrayList<String> problems = new ArrayList<>();
        fileReader = new FileReader(path);
        return problems;
    }
}