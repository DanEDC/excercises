import java.time.LocalDate;

public class Pet {

  private String animalType;
  private String raceType;
  private LocalDate checkInDate;
  private LocalDate checkOutDate;
  private boolean additionalService;
  private Service service;

  public Pet(String animalType, String raceType, LocalDate checkInDate,
      LocalDate checkOutDate, boolean additionalService, Service service) {
    this.animalType = animalType;
    this.raceType = raceType;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
    this.additionalService = additionalService;
    this.service = service;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getRaceType() {
    return raceType;
  }

  public void setRaceType(String raceType) {
    this.raceType = raceType;
  }

  public LocalDate getCheckInDate() {
    return checkInDate;
  }

  public void setCheckInDate(LocalDate checkInDate) {
    this.checkInDate = checkInDate;
  }

  public LocalDate getCheckOutDate() {
    return checkOutDate;
  }

  public void setCheckOutDate(LocalDate checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  public boolean isAdditionalService() {
    return additionalService;
  }

  public void setAdditionalService(boolean additionalService) {
    this.additionalService = additionalService;
  }

  public Service getService() {
    return service;
  }

  public void setService(Service service) {
    this.service = service;
  }
}
