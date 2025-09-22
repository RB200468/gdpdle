package dev.rb200468.gdpdle.api.models;


public class Country {
  private int id;
  private String name;
  private int gdp;
  private String currencyName;


  public Country(int id, String name, int gdp, String currencyName) {
    this.id = id;
    this.name = name;
    this.gdp = gdp;
    this.currencyName = currencyName;
  }


  public int getId() {
    return id;
  }


  public String getName() {
    return name;
  }


  public int getGdp() {
    return gdp;
  }


  public String getCurrencyName() {
    return currencyName;
  }


  public void setId(int id) {
    this.id = id;
  }


  public void setName(String name) {
    this.name = name;
  }


  public void setGdp(int gdp) {
    this.gdp = gdp;
  }


  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

}
