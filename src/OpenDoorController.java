package com.DSTeam;

public class OpenDoorController extends Controller {

  @Override
  public void handleRequest(DoorData doorData, String inputCode) {
    System.out.println("La puerta se ha abierto");
    doorData.resetTrials();

    if (nextController != null && !doorData.isLocked() && inputCode == doorData.getFireAlarmCode()) {
       nextController.handleRequest(doorData, inputCode);
    }
  }

  @Override
  public void nextController(Controller nextController) {
    if(nextController != null)
      this.nextController = nextController;
  }
}
