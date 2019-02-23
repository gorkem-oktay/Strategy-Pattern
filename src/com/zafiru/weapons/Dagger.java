package com.zafiru.weapons;

public class Dagger extends IWeapon {

    public Dagger(){
        setBehaviour(new NormalHitBehaviour());
    }
}
