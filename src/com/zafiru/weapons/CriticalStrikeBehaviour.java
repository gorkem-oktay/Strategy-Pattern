package com.zafiru.weapons;

public class CriticalStrikeBehaviour implements IWeaponBehaviour {

    @Override
    public void hit() {
        System.out.println("Critical Strike!!");
    }
}
