package com.example.transaction_bff.api;

import com.example.transaction_bff.dto.RequestTransactionDto;
import com.example.transaction_bff.dto.TransactionDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> sendTransaction(final RequestTransactionDto requestTransactionDto) {
        return Mono.empty();
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> findTransaction(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> deleteTransaction(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }
    @PatchMapping(value = "/{id}/confirm")
    public Mono<TransactionDto> confirmTransaction(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }
}
