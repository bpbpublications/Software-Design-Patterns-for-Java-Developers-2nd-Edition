package edu.immune.sw.pattern.pipeline.stream;

import edu.immune.sw.pattern.pipeline.Task;

import java.io.*;

public class FileReaderTask implements Task<File, StringBuilder> {

    @Override
    public StringBuilder execute(File input) {
        System.out.println("Reading file content into a buffer");
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
            String line;
            while((line = reader.readLine()) != null)
                result.append(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
