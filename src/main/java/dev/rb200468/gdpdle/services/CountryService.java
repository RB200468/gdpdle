package dev.rb200468.gdpdle.services;

import dev.rb200468.gdpdle.api.models.Country;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class CountryService {

  private List<Country> countryList;

  public CountryService() {
    this.countryList = new ArrayList<Country>();

    Country country1 = new Country(1, "United Kingdom", 1000, "Pound (GBP)");
    Country country2 = new Country(2, "France", 800, "Euro");
    Country country3 = new Country(3, "Spain", 750, "Euro");
    Country country4 = new Country(4, "United States of America (USA)", 2000, "Dollar (USD)");
    Country country5 = new Country(5, "Canada", 1000, "Dollar (CAD)");

    countryList.addAll(Arrays.asList(country1,country2,country3,country4,country5));
  }
  

  public Optional<Country> getCountry(Integer id) {
    Optional<Country> optional = Optional.empty();
    for (Country country : countryList) {
      if (country.getId() == id) {
        optional = Optional.of(country);
        return optional;
      }
    }
    return optional;
  }
}
