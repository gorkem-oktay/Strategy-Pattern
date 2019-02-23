package com.zafiru.characters;

import com.zafiru.weapons.IWeapon;
import com.zafiru.weapons.IWeaponBehaviour;

public abstract class ICharacter {

    private String mName;
    private IWeaponBehaviour mWeaponBehaviour;
    private IWeapon mWeapon;
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

    public IWeapon getWeapon(){
        return mWeapon;
    }

    public void setWeapon(IWeapon weapon){
        this.mWeapon = weapon;
    }

    public void hit(){
        getWeapon().hit();
    }
}
