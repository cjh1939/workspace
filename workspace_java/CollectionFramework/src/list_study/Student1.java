package list_study;

public class Student1 {

  String name;
  int gu;
  int en;
  int mt;
  int cj;

  public Student1(String name, int gu, int en, int mt, int cj) {
    this.name = name;
    this.gu = gu;
    this.en = en;
    this.mt = mt;
    this.cj = cj;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGu() {
    return gu;
  }

  public void setGu(int gu) {
    this.gu = gu;
  }

  public int getEn() {
    return en;
  }

  public void setEn(int en) {
    this.en = en;
  }

  public int getMt() {
    return mt;
  }

  public void setMt(int mt) {
    this.mt = mt;
  }

  public int getCj() {
    return cj;
  }

  public void setCj(int cj) {
    this.cj = cj;
  }

  @Override
  public String toString() {
    return "Student1{" +
            "name='" + name + '\'' +
            ", gu=" + gu +
            ", en=" + en +
            ", mt=" + mt +
            ", cj=" + cj +
            '}';
  }
}
