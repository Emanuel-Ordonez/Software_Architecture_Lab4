package lab4;

public class BeginnnerWeapon implements WeaponIF{
  private String name;

  @Override
  public String getWeapon() {return name;}
  
  @Override
  public void setWeapon(String name) {this.name = name;}  
}
