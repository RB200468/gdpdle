package dev.rb200468.gdpdle.api.controllers;

import dev.rb200468.gdpdle.services.CountryService;
import dev.rb200468.gdpdle.api.models.Country;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
class CountryController {

  private CountryService countryService;


  @Autowired
  public CountryController(CountryService countryService) {
    this.countryService = countryService;
  }
  

  @GetMapping("/country")
  public Country getCountry(@RequestParam Integer id) {
    Optional<Country> country = countryService.getCountry(id);
    if (country.isPresent()) {
      return (Country) country.get();
    }
    return null;
  }
    
}
