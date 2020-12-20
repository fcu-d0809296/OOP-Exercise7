package oop.hw;

public class Bulbasaur extends Pokemon implements Fightable {

  public Bulbasaur(String nickName, PokemonType type, int cp) {
    super(nickName, type, cp);
    // TODO Auto-generated constructor stub
  }
  public void attack() {
    System.out.print("Tackle");
  }
}
