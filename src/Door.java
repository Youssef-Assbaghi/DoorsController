package com.DSTeam;

public class Door {

  DoorData doorData;

  public Door(String id, String openC, String fireC, String unlockC,String unloockdoor) {
    doorData = new DoorData(id, openC, fireC, unlockC,unloockdoor);
  }
}

