package com.langchain4j.example;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.loader.PdfDocumentLoader;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;

import java.nio.file.Paths;
import java.util.List;

public class PdfAssistantConfig {
    public interface Assistant {
        String chat(String message);
    }

    public static Assistant buildAssistant() {
        List<Document> documents = PdfDocumentLoader.loadDocuments(Paths.get("src/main/resources/sample.pdf"));
        Document merged = Document.merge(documents);

        return AiServices.builder(Assistant.class)
                .chatLanguageModel(OpenAiChatModel.withApiKey(System.getProperty("openai.api.key")))
                .document(merged)
                .build();
    }
}
