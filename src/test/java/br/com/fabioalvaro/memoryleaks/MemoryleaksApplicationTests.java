package br.com.fabioalvaro.memoryleaks;

import java.util.HashMap;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemoryleaksApplicationTests {

	@Test
	void contextLoads() {
	}

	// @Test
	// public void dadoUmMapaQuandoNaoEstaComEqualsEHashcode_entaoMemoryLeak() {
	// 	Map<Person, Integer> map = new HashMap<>();
	// 	for (int i = 0; i < 10000; i++) {
	// 		map.put(new Person("Fabão"), 1);
	// 	}
	// 	Assertions.assertThat(map.size()).isNotEqualTo(1);
	// }

	@Test
	public void dadoUmMapa_quandoComEqualsEHAshCode_entaoMemoryLeak() {
		Map<Person, Integer> map = new HashMap<>();
		for (int i = 0; i < 2; i++) {
			map.put(new Person("Fabão"), 1);
		}
		Assertions.assertThat(map.size() == 1);
	}

}
