package com.langchain4j.example;

import java.util.Scanner;

public class PdfAssistantApplication {
    public static void main(String[] args) {
        ChatController controller = new ChatController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("PDF Assistant ready. Type 'exit' to quit.");
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) break;

            String response = controller.chat(input);
            System.out.println("Bot: " + response);
        }
    }
}
