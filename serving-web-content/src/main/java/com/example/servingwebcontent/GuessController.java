package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GuessController {

    private int targetNumber;
    private int prizeAmount;

    @GetMapping("/guess")
    public String showGuessForm(Model model) {
        targetNumber = (int) (Math.random() * 10) + 1;
        prizeAmount = 100000;
        model.addAttribute("prizeAmount", prizeAmount);
        return "guess";
    }

    @PostMapping("/guess")
    public String processGuess(int userNumber, Model model) {
        if (userNumber == targetNumber) {
            model.addAttribute("message", "¡Felicidades! Ganaste $" + prizeAmount);
        } else {
            prizeAmount -= 10000;
            model.addAttribute("message", "Intenta de nuevo. Saldo: $" + prizeAmount);
        }
        return "guess";
    }

    @GetMapping("/guess/reset")
    public String resetGame() {
        return "redirect:/guess";
    }
}
