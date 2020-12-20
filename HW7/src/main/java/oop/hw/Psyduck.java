package oop.hw;

public class Psyduck extends Pokemon implements Fightable {

  public Psyduck(String nickName, PokemonType type, int cp) {
    super(nickName, type, cp);
    // TODO Auto-generated constructor stub
  }
  public void attack() {
    System.out.print("Aqua Tail");
  }
}
