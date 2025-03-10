package list_study;

public class Emp {
  int sa;
  String name;
  String qs;
  String tel;
  int gel;


  public Emp(int sa, String name, String qs, String tel, int gel) {
    this.sa = sa;
    this.name = name;
    this.qs = qs;
    this.tel = tel;
    this.gel = gel;
  }

  public int getSa() {
    return sa;
  }

  public void setSa(int sa) {
    this.sa = sa;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getQs() {
    return qs;
  }

  public void setQs(String qs) {
    this.qs = qs;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public int getGel() {
    return gel;
  }

  public void setGel(int gel) {
    this.gel = gel;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "사번 :" + sa +
            ", 이름 :'" + name + '\'' +
            ", 부서명 :'" + qs + '\'' +
            ", 연락처 :'" + tel + '\'' +
            ", 월급 :" + gel +
            '}';
  }
}
