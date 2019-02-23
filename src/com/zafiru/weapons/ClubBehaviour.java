package com.zafiru.weapons;

public class ClubBehaviour implements IWeaponBehaviour{

    @Override
    public void hit() {
        System.out.println("Applies 8 damage");
    }
}
