package be.intecbrussel.model;

public interface EntityInterface {
    Object getId();
    Object setId(String id);
    void cloneFrom(EntityInterface object);
}
