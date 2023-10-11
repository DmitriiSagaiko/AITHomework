package Lesson25.Task0;

public class AutoPilot {

  private String softwareVersion;


  public AutoPilot(String softwareVersion) {
    this.softwareVersion = softwareVersion;

  }

  public String toString() {
    return " { autopilot version " + softwareVersion + " }";
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

}
