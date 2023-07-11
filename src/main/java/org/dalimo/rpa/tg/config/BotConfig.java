package org.dalimo.rpa.tg.config;


import lombok.Data;

import lombok.Value;
import lombok.With;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Value
@PropertySource("application.properties")
public class BotConfig {
    @With("${bot.name}")
    String botName;
    @Value("${bot.token}")
    String token;
}