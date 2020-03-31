package com.hlovex.compound;

public class ThingOne {

    private Fred fred;

    public ThingOne(){
        fred = new Fred();
    }

    public Fred getFred() {
        return fred;
    }

    public void setFred(Fred fred) {
        this.fred = fred;
    }
}
