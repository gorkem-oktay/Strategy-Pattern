package com.zafiru.characters;

import com.zafiru.weapons.IWeaponBehaviour;

public abstract class ICharacter {

    private String mName;
    private IWeaponBehaviour mWeaponBehaviour;
    private String mType;

    public String getType() {
        return mType;
    }

    public void setType(String type){
        this.mType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public IWeaponBehaviour getWeaponBehaviour() {
        return mWeaponBehaviour;
    }

    public void setWeaponBehaviour(IWeaponBehaviour weaponBehaviour) {
        this.mWeaponBehaviour = weaponBehaviour;
    }

    public void hit(){
        this.getWeaponBehaviour().hit();
    }
}
