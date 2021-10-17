package com.DSTeam;

public class RecordController extends Controller {

  @Override
  public void handleRequest(DoorData doorData, String inputCode) {
    doorData.recordEnteredCode(inputCode);
    if(nextController != null)
      nextController.handleRequest(doorData, inputCode);
  }

  @Override
  public void nextController(Controller nextController) {
    if(nextController != null)
      this.nextController = nextController;
  }
}
