package com.DSTeam;

public class UnlockController extends Controller{

    @Override
    public void handleRequest(DoorData doorData, String inputCode) {

        if(nextController!=null) {
                if (doorData.isLocked() && (inputCode == doorData.getUnlockCode())) {
                    nextController.handleRequest(doorData, inputCode);
                } else if (!doorData.isLocked() && (inputCode == doorData.getOpenCode() || inputCode == doorData.getFireAlarmCode())) {
                    nextController.handleRequest(doorData, inputCode);
                } else if (doorData.isLocked()) {
                    System.out.println("La puerta está bloqueada");
                } else {
                    doorData.sumNumTrials();
                    System.out.println("Error en el código, número de intentos:" + doorData.getNumTrials());
                }

        }
    }

    @Override
    public void nextController(Controller nextController) {
        if(nextController!=null)
            this.nextController = nextController;
    }
}
