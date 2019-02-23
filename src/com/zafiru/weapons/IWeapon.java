package com.zafiru.weapons;

public abstract class IWeapon {

    IWeaponBehaviour behaviour;

    public void setBehaviour(IWeaponBehaviour behaviour){
        this.behaviour = behaviour;
    }

    public IWeaponBehaviour getBehaviour(){
        return behaviour;
    }

    public void hit(){
        getBehaviour().hit();
    }
}
