package com.microservices.commandes.controller;

import com.microservices.commandes.model.Commande;
import com.microservices.commandes.repository.CommandeRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/commandes")
public class CommandeController {

    private final CommandeRepository commandeRepository;

    @Value("${mes-config-ms.commandes-last:10}")
    private int commandesLast;

    public CommandeController(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @GetMapping
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @GetMapping("/recent")
    public List<Commande> getRecentCommandes() {
        LocalDate startDate = LocalDate.now().minusDays(commandesLast);
        return commandeRepository.findByDateAfter(startDate);
    }

    @PostMapping
    public Commande createCommande(@RequestBody Commande commande) {
        return commandeRepository.save(commande);
    }

    @DeleteMapping("/{id}")
    public void deleteCommande(@PathVariable Long id) {
        commandeRepository.deleteById(id);
    }

    // Exemple avec fallback
    @GetMapping("/fallbackExample")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String riskyMethod() {
        throw new RuntimeException("Service temporairement indisponible");
    }

    // Méthode fallback qui sera appelée si la méthode riskyMethod échoue
    public String fallbackMethod() {
        return "Service indisponible, veuillez réessayer plus tard.";
    }
}
