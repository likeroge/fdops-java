package ru.egodev21.fdops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("rest")
public class HomeRestController {
    @GetMapping
    public String getUsers() throws URISyntaxException, IOException, InterruptedException {
        var resp = HttpClient.newBuilder()
                .build()
                .send(HttpRequest.newBuilder()
                        .uri(new URI("https://jsonplaceholder.typicode.com/users"))
                        .build(), HttpResponse.BodyHandlers.ofString());
        return resp.body();
    }
}
