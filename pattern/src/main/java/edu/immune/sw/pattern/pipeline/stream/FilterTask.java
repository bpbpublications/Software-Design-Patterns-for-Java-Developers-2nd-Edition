package edu.immune.sw.pattern.pipeline.stream;

import edu.immune.sw.pattern.pipeline.Task;

public class FilterTask implements Task<StringBuilder, String> {

    @Override
    public String execute(StringBuilder input) {
        System.out.println("Filtering non alphabetic characters");
        if(input == null || input.isEmpty())
            return "";

        StringBuilder result = new StringBuilder();
        for(int i= 0; i<input.length(); i++) {
            if((input.charAt(i) >= 65 && input.charAt(i) <= 90)
                || (input.charAt(i) >= 97 && input.charAt(i) <= 122)
                || input.charAt(i) == 32)
                    result.append(input.charAt(i));
        }

        return result.toString();
    }
}
