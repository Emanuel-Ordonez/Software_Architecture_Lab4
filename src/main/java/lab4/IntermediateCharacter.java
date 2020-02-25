package lab4;

public class IntermediateCharacter implements CharacterIF{
  private String name;

  @Override
  public String getCharacter() {return name;}
  
  @Override
  public void setCharacter(String name) {this.name = name;}
}
