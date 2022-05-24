package com.sales.northwind.service;

import com.sales.northwind.domain.Processed;
import com.sales.northwind.domain.RequestData;
import com.sales.northwind.repository.ProcessedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Instant;


@Service
public class MongoService {

    private final ProcessedRepository processedRepository;

    @Autowired
    public MongoService(ProcessedRepository processedRepository) {
        this.processedRepository = processedRepository;
    }


    public Mono<Processed> trace(RequestData req, String correlationId) {

        Processed p = new Processed();
        p.setCorrelationId(correlationId);
        req.setTimestamp(Instant.now().toEpochMilli());
        p.setDetails(req);
        return processedRepository.insert(p);
    }

}