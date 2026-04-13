package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
	exclude = {
			//org.springframework.ai.model.openai.autoconfigure.OpenAiEmbeddingAutoConfiguration.class,
			org.springframework.ai.model.openai.autoconfigure.OpenAiChatAutoConfiguration.class
})
public class SpringOllamaAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOllamaAiApplication.class, args);
	}

}
