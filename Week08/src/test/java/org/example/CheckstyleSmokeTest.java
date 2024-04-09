package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckstyleSmokeTest {

    @Test
    public void checkstyleRulesAreEnforced() throws IOException {
        // Specify the path to the source code directory
        final String sourceDirectory = "src/main/java/org/example";

        // Create a temporary Java source code file with violations for each Checkstyle rule
        createJavaSourceFileWithViolations(sourceDirectory, "IndentationViolation.java",
                "public class IndentationViolation {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        System.out.println(\"Hello, world!\");\n" +
                        "        }\n" +
                        "}\n");


        // Run Checkstyle analysis on the source code directory
        final String checkstyleOutput = runCheckstyle(sourceDirectory);

        // Assert that there are Checkstyle violations
        assertFalse(checkstyleOutput.isEmpty(), "Checkstyle violations found:\n" + checkstyleOutput);
    }

    private void createJavaSourceFileWithViolations(String directory, String fileName, String content) throws IOException {
        // Create the directory if it doesn't exist
        Files.createDirectories(Paths.get(directory));

        // Write the content to the file
        Files.write(Paths.get(directory, fileName), content.getBytes(StandardCharsets.UTF_8));
    }

    private String runCheckstyle(String sourceDirectory) throws IOException {
        // Execute Checkstyle command and capture output
        Process process = Runtime.getRuntime().exec("mvn checkstyle:check -Dcheckstyle.config.location=checkstyle.xml", null, new File(sourceDirectory));
        try (OutputStream outputStream = process.getOutputStream();
             ByteArrayOutputStream errorStream = new ByteArrayOutputStream()) {

            // Read standard error
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = process.getErrorStream().read(buffer)) != -1) {
                errorStream.write(buffer, 0, bytesRead);
            }

            // Wait for the process to finish
            int exitCode = process.waitFor();

            // Throw an exception if the process exited with a non-zero exit code
            if (exitCode != 0) {
                throw new RuntimeException("Checkstyle execution failed with exit code " + exitCode + ". Error output: " + errorStream.toString());
            }

            return errorStream.toString();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Checkstyle execution was interrupted", e);
        }
    }
}
