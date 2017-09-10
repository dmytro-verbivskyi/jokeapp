package com.dverbivskyi.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JokeServiceTest {

    private JokeService service;

    @Before
    public void setUp() throws Exception {
        service = new JokeService(new ChuckNorrisQuotes());
    }

    @Test
    public void testLibraryFromSpringGuru() throws Exception {
        String joke = service.getJoke();

        assertThat(joke).isNotEmpty();
        System.out.println(joke);
    }
}
