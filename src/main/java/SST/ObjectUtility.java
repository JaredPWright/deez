package SST;

public interface ObjectUtility {
    public boolean isInRange(int range, MapDesignation object1, MapDesignation object2);

    public MapDesignation compareMapDesignations(char operation, MapDesignation leftTerm, MapDesignation rightTerm);
}
