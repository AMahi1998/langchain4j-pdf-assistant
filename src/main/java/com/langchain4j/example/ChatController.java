package com.langchain4j.example;

public class ChatController {
    private final PdfAssistantConfig.Assistant assistant;

    public ChatController() {
        this.assistant = PdfAssistantConfig.buildAssistant();
    }

    public String chat(String message) {
        return assistant.chat(message);
    }
}
