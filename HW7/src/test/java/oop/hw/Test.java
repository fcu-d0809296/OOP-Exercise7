package oop.hw;

import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class Test {

  @org.junit.Test
  public void test() {
    Bulbasaur pkm1 = new Bulbasaur("I am Bulbasaur", PokemonType.GRASS, 123);
    
    assertEquals("I am Bulbasaur",pkm1.getNickName());
    assertEquals(PokemonType.GRASS,pkm1.getType());
    assertEquals(123,pkm1.getCp());
  }
  
  @org.junit.Test
  public void test2() {
    Charmander pkm2 = new Charmander("I am Charmander", PokemonType.FIRE, 456);
    
    assertEquals("I am Charmander",pkm2.getNickName());
    assertEquals(PokemonType.FIRE,pkm2.getType());
    assertEquals(456,pkm2.getCp()); 
  }
  
  @org.junit.Test
  public void test3() {
    Psyduck pkm3 = new Psyduck("I am Psyduck", PokemonType.WATER, 89);
    
    assertEquals("I am Psyduck",pkm3.getNickName());
    assertEquals(PokemonType.WATER,pkm3.getType());
    assertEquals(89,pkm3.getCp()); 
  }

}
