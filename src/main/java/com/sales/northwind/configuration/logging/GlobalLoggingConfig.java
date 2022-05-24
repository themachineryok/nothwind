package com.sales.northwind.configuration.logging;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.BodyFilter;
import org.zalando.logbook.HeaderFilter;
import org.zalando.logbook.HeaderFilters;
import org.zalando.logbook.HttpRequest;
import org.zalando.logbook.json.JsonBodyFilters;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import static com.sales.northwind.constants.HttpHeaders.X_SAN_HEADER;
import static org.zalando.logbook.BodyFilter.merge;
import static org.zalando.logbook.BodyFilters.defaultValue;
import static org.zalando.logbook.Conditions.exclude;
import static org.zalando.logbook.Conditions.requestTo;


@Configuration
public class GlobalLoggingConfig {

    @Bean
    public BodyFilter bodyFilter() {

        Set<String> remplazar = new HashSet<>();
        remplazar.add("content");
        return merge(
                defaultValue(),
                JsonBodyFilters.replaceJsonStringProperty(remplazar, "xxxx"));
    }

    @Bean
    public Predicate<HttpRequest> condition() {

        return exclude(
                requestTo("**/health")
        );
    }

    @Bean
    public HeaderFilter headerFilters() {

        return HeaderFilters.removeHeaders(x -> !x.equalsIgnoreCase(X_SAN_HEADER));
    }

}
