package com.directi.training.ocp.exercice_refactored;

public class ResourceAllocator {
    public int allocate(Resource resource){
        int resourceId = resource.findFreeSlot();
        resource.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId){
        resource.markSlotFree(resourceId);
    }
}
