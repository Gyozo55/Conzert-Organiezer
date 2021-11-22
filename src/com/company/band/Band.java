package com.company.band;

public class Band {
    private Style bandStyle;
    private boolean mainBandType;
    private String name;

    public Band(Style bandStyle, boolean mainBandType, String name) {
        this.bandStyle = bandStyle;
        this.mainBandType = mainBandType;
        this.name = name;
    }

    public Style getBandStyle() {
        return bandStyle;
    }

    public boolean isMainBandType() {
        return mainBandType;
    }

    public String getName() {
        return name;
    }
}
