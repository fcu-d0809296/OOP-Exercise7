package oop.hw;

public class Pokemon implements Fightable {
  private String nickName;
  private PokemonType type;
  private int cp;
  
  @Override
  public void attack() {
    // TODO Auto-generated method stub
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public PokemonType getType() {
    return type;
  }

  public int getCp() {
    return cp;
  }

  public void setCp(int cp) {
    this.cp = cp;
  }
  //Constructor
  public Pokemon(String nickName, PokemonType type, int cp) {
    super();
    this.nickName = nickName;
    this.type = type;
    this.cp = cp;
  }
  
}
