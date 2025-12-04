package pl.edu.upsanok.demolab.config;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class CorsFilterConfiguration {

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedMethods("GET", "POST", "DELETE")
            .allowedHeaders("Origin","Content-Type","Content-Length","Accept", "Accept-Encoding",
            "Accept-Language", "Connection", "Host", "User-Agent", "sec-ch-ua", "sec-ch-ua-mobile", "sec-ch-ua-platform")
            .allowedOrigins("https://secret-santa-production-cb6b.up.railway.app/");
      }
    };
  }
}