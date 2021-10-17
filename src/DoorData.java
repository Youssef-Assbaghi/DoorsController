package com.DSTeam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.*;
import org.javatuples.Pair;

public class DoorData {

  public static int MaxNumTrials = 3;

  private String id;
  private int numTrials;
  private String openCode;
  private String unlockCode;
  private String fireAlarmCode;
  private boolean doorblocked;
  private String unlockdooro;

  List<Pair> records = new ArrayList<>();
  Pair<String, String> record = new Pair<String, String>("","");

  public DoorData(String id, String openC, String fireC, String unlockC,String unlockdoor){
    this.id = id;
    numTrials = 0;
    openCode = openC;
    fireAlarmCode = fireC;
    unlockCode = unlockC;
    doorblocked=false;
    unlockdooro=unlockdoor;
  }

  public void recordEnteredCode(String inputCode) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formatDateTime = LocalDateTime.now().format(formatter);

    record = new Pair<String, String>(inputCode, formatDateTime);
    records.add(record);
  }

  public static int getMaxNumTrials() {
    return MaxNumTrials;
  }

  public String getFireAlarmCode() {
    return fireAlarmCode;
  }

  public String getOpenCode() {
    return openCode;
  }

  public String getUnlockCode() {
    return unlockCode;
  }

  public int getNumTrials() {
    return numTrials;
  }

  public boolean isLocked() {
    return numTrials >= MaxNumTrials;
  }

  public String getId() {
    return id;
  }

  public void sumNumTrials() {
    this.numTrials++;
  }

  public void resetTrials() {
    this.numTrials = 0;
  }

  public void setblockeddoor(String  b){
    unlockCode=b;
  }

}
