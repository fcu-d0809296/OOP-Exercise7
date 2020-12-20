/**
 * 
 */
package oop.hw;

/**
 * @author Jiannwey
 *
 */
public class Charmander extends Pokemon implements Fightable {

  /**
   * @param nickName
   * @param type
   * @param cp
   */
  public Charmander(String nickName, PokemonType type, int cp) {
    super(nickName, type, cp);
    // TODO Auto-generated constructor stub
  }
  public void attack() {
    System.out.print("Ember");
  }
}
