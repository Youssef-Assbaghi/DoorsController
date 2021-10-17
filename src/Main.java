package com.DSTeam;

import org.javatuples.Pair;

public class Main {

    public static void main(String[] args) {
	      // write your code here

        RecordController recordController = new RecordController();
        LockController lockController = new LockController();
        OpenDoorController openDoorController = new OpenDoorController();
        CheckAlarmController checkAlarmController = new CheckAlarmController();
        UnlockController unlockController = new UnlockController();

        recordController.nextController(unlockController);
        unlockController.nextController(openDoorController);
        openDoorController.nextController(checkAlarmController);
        checkAlarmController.nextController(lockController);

        Door testDoor = new Door("1", "1234", "4321", "1111","55555");

        recordController.handleRequest(testDoor.doorData, "1234");
        recordController.handleRequest(testDoor.doorData, "2354");
        recordController.handleRequest(testDoor.doorData, "2343");
        recordController.handleRequest(testDoor.doorData, "4321");
        recordController.handleRequest(testDoor.doorData, "2432");
        recordController.handleRequest(testDoor.doorData, "3322");

        recordController.handleRequest(testDoor.doorData, "3322");

        recordController.handleRequest(testDoor.doorData, "1234");

        recordController.handleRequest(testDoor.doorData, "1111");
        recordController.handleRequest(testDoor.doorData, "1234");

        for (Pair tuple : testDoor.doorData.records){
            System.out.println(tuple.getValue0() + " - " + tuple.getValue1());
        }
    }
}
