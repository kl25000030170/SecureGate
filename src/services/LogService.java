package services;

import datastructures.LogLinkedList;
import models.LogEntry;
import utils.DateTimeUtil;

public class LogService {

    private LogLinkedList logList = new LogLinkedList();

    public void recordLog(String userId, String zoneId, boolean granted) {
        String time = DateTimeUtil.getCurrentTimestamp();
        LogEntry log = new LogEntry(userId, zoneId, time, granted);
        logList.addLog(log);
    }

    public void showLogs() {
        logList.displayLogs();
    }
}