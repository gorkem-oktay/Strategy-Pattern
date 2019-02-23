package com.zafiru.weapons;

public class SwordBehaviour implements IWeaponBehaviour {

    @Override
    public void hit() {
        System.out.println("Applies 10 damage");
    }
}
