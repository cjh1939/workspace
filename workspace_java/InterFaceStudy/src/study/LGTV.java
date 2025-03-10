package study;

public class LGTV implements TV {

  @Override
  public void turnOn() {
    System.out.println("엘지티비 - 전원켬");
  }

  @Override
  public void turnOff() {
    System.out.println("엘지티비 - 전원끔");
  }

  @Override
  public void volumeUp() {
    System.out.println("엘지티비 - 소리올림");
  }

  @Override
  public void volumedown() {
    System.out.println("엘지티비 - 소리내림");
  }
}
