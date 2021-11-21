package com.directi.training.ocp.exercice_refactored;

public interface Resource {
    public int findFreeSlot();

    public void markSlotBusy(int resourceId);

    public void markSlotFree(int resourceId);
}
