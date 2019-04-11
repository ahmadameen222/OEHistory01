package com.alameen.dell.ertugrul01;

class EventClass {


    private String lifeEventName;
    private String lifeEventDesc;
    private int Thumbnail;



    public EventClass(String lifeEventName, String lifeEventDesc, int thumbnail) {
        this.lifeEventName = lifeEventName;
        this.lifeEventDesc = lifeEventDesc;
        Thumbnail = thumbnail;
    }


    public String getLifeEventName() {
        return lifeEventName;
    }

    public void setLifeEventName(String lifeEventName) {
        this.lifeEventName = lifeEventName;
    }

    public String getLifeEventDesc() {
        return lifeEventDesc;
    }

    public void setLifeEventDesc(String lifeEventDesc) {
        this.lifeEventDesc = lifeEventDesc;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }




}
