package util;

public class Const {


 public enum microGreenURL {
  BASE_URL("https://www.microgreen-shop.com/en/");
  private String url;

  microGreenURL(String url) {
   this.url = url;
  }

  public String getBaseUrl() {
   return url;
  }
 }

}
