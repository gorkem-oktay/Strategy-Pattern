package com.zafiru.weapons;

public class Club extends IWeapon {

    public Club(){
        setBehaviour(new NormalHitBehaviour());
    }
}
