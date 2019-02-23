package com.zafiru.weapons;

public class Sword extends IWeapon {

    public Sword(){
        setBehaviour(new CriticalStrikeBehaviour());
    }
}
