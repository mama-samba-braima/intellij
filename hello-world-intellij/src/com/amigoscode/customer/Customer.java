package com.amigoscode.customer;

import java.util.List;

public record Customer(
        Integer id,
        String name,
        List<String> programmingLanguages
) {
}
