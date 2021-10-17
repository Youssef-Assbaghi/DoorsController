package com.DSTeam;

public class CheckAlarmController extends Controller {

  @Override
  public void handleRequest(DoorData doorData, String inputCode) {
    if(nextController != null && inputCode == doorData.getFireAlarmCode()){
      System.out.println("La alarma se ha activado");
      nextController.handleRequest(doorData, inputCode);
    }

  }

  @Override
  public void nextController(Controller nextController) {
    this.nextController = nextController;
  }
}
