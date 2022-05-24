package com.sales.northwind.repository;

import com.sales.northwind.domain.Processed;
import org.springframework.data.mongodb.repository.CountQuery;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ProcessedRepository extends ReactiveMongoRepository<Processed, String> {

    @CountQuery("{\"details.type\": ?0, \"details.path\": ?1, \"details.statusCode\": ?2 }")
    Mono<Long> getCountByTypePathAndStatus(String method, String path, int status);

    @CountQuery("{ \"details.type\": ?0, \"details.path\": ?1, \"details.statusCode\": ?2, \"details.timestamp\": {$gte: ?3}}")
    Mono<Long> getCountByTypePathAndStatusInRange(String method, String path, int status, Long timestamp);

    @CountQuery("{ \"details.type\": ?0, \"details.path\": {$ne: ?1}, \"details.statusCode\": ?2, \"details.timestamp\": {$gte: ?3}}")
    Mono<Long> getDownloadCountByStatusInRange(String method, String pathExclusion, int status, Long timestamp);

}