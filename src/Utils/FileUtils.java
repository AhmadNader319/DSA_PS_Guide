package Utils;

import Model.Difficulty;
import Model.Problem;
import Model.Status;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;

public class FileUtils {

    public List<Problem> readProblems(String fileName) throws FileNotFoundException {
        List<Problem> problems = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String problem;
            while((problem = reader.readLine()) != null){
                String[] parts = problem.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                Difficulty difficulty = Difficulty.valueOf(parts[2]);
                Status status = Status.valueOf(parts[3]);
                String[] tags = parts[4].split(",");
                List<String> tagList = new ArrayList<>();
                for(String tag : tags){
                    tagList.add(tag);
                }
                problems.add(new Problem(id, name, difficulty, status, tagList));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return problems;
    }

    public void updateProblem(String fileName, Problem updatedProblem) throws IOException {
        List<String> lines = new ArrayList<>();//contains the file problems
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);//lines added in the arrayList
            }
        }

        // Update the specific problem
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                String[] parts = line.split("\\|");
                if (parts.length > 0 && Integer.parseInt(parts[0]) == updatedProblem.getId()) {
                    // This is the line for the problem we want to update
                    line = String.format("%d|%s|%s|%s|%s",
                            updatedProblem.getId(),
                            updatedProblem.getName(),
                            updatedProblem.getDifficulty().name(),
                            updatedProblem.getStatus().name(),
                            String.join(",", updatedProblem.getTags())
                    );
                }
                writer.write(line);
                writer.newLine();
            }
        }
    }
    public void deleteProjectByID(List<Problem> problems, String fileName) throws IOException {

    }
    public void addProblem(Problem problem, String fileName) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            String updatedProblem = String.format("%d|%s|%s|%s|%s",
                    problem.getId(),
                    problem.getName(),
                    problem.getDifficulty().name(),
                    problem.getStatus().name(),
                    String.join(",", problem.getTags())
            );
            writer.write(updatedProblem);
            writer.newLine();
        }
    }
}
