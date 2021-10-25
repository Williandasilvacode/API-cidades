package com.github.williandasilvacode.cities.api.countries.repository;

import com.github.williandasilvacode.cities.api.countries.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public Page<Country> cities(final Pageable page) {

        return repository.findAll(page);
    }
}
