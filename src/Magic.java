public class Magic extends Hero implements HavingSuperAbility {

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Magic применил способность CRITICAL DAMAGE "+superAbilityType);
    }
}

