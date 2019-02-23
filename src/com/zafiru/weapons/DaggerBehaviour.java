package com.zafiru.weapons;

public class DaggerBehaviour implements IWeaponBehaviour {

    @Override
    public void hit() {
        System.out.println("Applies 4 damage");
    }
}
