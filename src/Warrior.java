public class Warrior extends Hero implements HavingSuperAbility{

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Warrior применил способность CRITICAL DAMAGE "+superAbilityType);
    }
}
