package com.zafiru.weapons;

public class NormalHitBehaviour implements IWeaponBehaviour{

    @Override
    public void hit() {
        System.out.println("Normal Hit");
    }
}
