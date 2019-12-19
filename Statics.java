package be.intecbrussel.model.entities;

import be.intecbrussel.model.EntityInterface;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Statics implements EntityInterface {

    @Id
     private int  staticsId;

    @NotNull
    private Integer counter;




    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    @Override
    public Object getId() {
        return null;
    }

    @Override
    public Object setId(String id) {
        return null;
    }

    @Override
    public void cloneFrom(EntityInterface object) {

    }
}