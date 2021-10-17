package com.DSTeam;

public class LockController extends Controller {

  @Override
  public void handleRequest(DoorData doorData, String inputCode) {


        doorData.setblockeddoor(inputCode);
        System.out.println("La contraseña ha sido cambiada");


  }

  @Override
  public void nextController(Controller nextController) {
    if(nextController!=null)
      this.nextController = nextController;
  }
}
