package com.api.receiver.apireceiver.controller;

import com.api.receiver.apireceiver.data.DataPayload;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/receiver")
public class ReceiverController {

    @PostMapping
    public ResponseEntity<String> receiveData(@RequestBody DataPayload payload) {
        // Aqui, você pode processar os dados recebidos conforme necessário
        String message = "Dados recebidos com sucesso - Nome: " + payload.getName() + ", Código: " + payload.getCode();

        return ResponseEntity.ok(message);
    }
}
