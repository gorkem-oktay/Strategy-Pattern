package com.zafiru.weapons;

public class Club implements IWeaponBehaviour{

    @Override
    public void hit() {
        System.out.println("Applies 8 damage");
    }
}
