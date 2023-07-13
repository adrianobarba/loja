package br.com.commerce.loja.controller;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@SpringBootTest
@AutoConfigureMockMvc
class ClienteControllerTest {
    @Autowired
    private MockMvc mvc;

   @Test
    @DisplayName("Deveria devolver codigo http 400 quando estao invalidas")
    void cadastro() throws Exception {
      var response = mvc.perform(post("/cliente"));

        assertThat(response.andReturn().getResponse()).isEqualTo(HttpStatus.BAD_REQUEST.value());
    }


}