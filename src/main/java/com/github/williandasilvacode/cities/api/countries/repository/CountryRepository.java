package com.github.williandasilvacode.cities.api.countries.repository;

import com.github.williandasilvacode.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

