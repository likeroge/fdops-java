package ru.egodev21.fdops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
public class HomeController {
    @GetMapping("home")
    public String homePage(Model model){
        model.addAttribute("name", "Developer");
        return "home";
    }
//    @GetMapping("welcome")
    @GetMapping("/")
    public String welcomePage(Model model) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://jsonplaceholder.typicode.com/users"))
                .build();
        HttpResponse<String> response = HttpClient.newBuilder().build()
                        .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        model.addAttribute("data", "Welcome!");
        return "welcome";
    }
}
