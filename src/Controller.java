package com.DSTeam;

public abstract class Controller {

  Controller nextController;

  public void setNextController(Controller nextController) {
    this.nextController= nextController;
  }

  public abstract void handleRequest(DoorData doorData, String inputCode);

  public abstract void nextController(Controller nextController);
}
