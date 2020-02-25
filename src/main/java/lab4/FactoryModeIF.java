package lab4;

public interface FactoryModeIF {
   public abstract WeaponIF createWeapon(String weapon);
   public abstract CharacterIF createCharacter(String character);
}