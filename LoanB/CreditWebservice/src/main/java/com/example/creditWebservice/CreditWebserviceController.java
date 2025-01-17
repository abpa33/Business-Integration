package com.example.creditWebservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditWebserviceController {
	
	@GetMapping("/credit-score/{userId}")
    public ResponseEntity<Integer> calculateCreditScore(@PathVariable String userId) {
        int score = 424242424;
        // Rückgabe des LoanQuote-Objekts im Response Body als JSON
        return ResponseEntity.ok(score);
    }
	

}
