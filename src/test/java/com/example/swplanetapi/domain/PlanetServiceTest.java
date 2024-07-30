package com.example.swplanetapi.domain;

import static com.example.swplanetapi.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {
  @Autowired
  private PlanetService planetService;

  @Test // nome do método = operacao_estado_retorno
  public void creatPlanet_WithValidData_ReturnsPlanet() {
    // sut = system under test
    Planet sut = planetService.create(PLANET);
    assertThat(sut).isEqualTo(PLANET);
  }
}
