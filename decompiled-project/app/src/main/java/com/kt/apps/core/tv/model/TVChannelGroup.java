package com.kt.apps.core.tv.model;

import Kb.a;
import Z9.x;
import androidx.annotation.Keep;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes2.dex */
public final class TVChannelGroup {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TVChannelGroup[] $VALUES;
    private final String value;
    public static final TVChannelGroup VTV = new TVChannelGroup("VTV", 0, "VTV");
    public static final TVChannelGroup HTV = new TVChannelGroup("HTV", 1, "HTV");
    public static final TVChannelGroup VTC = new TVChannelGroup("VTC", 2, "VTC");
    public static final TVChannelGroup HTVC = new TVChannelGroup("HTVC", 3, "HTVC");
    public static final TVChannelGroup THVL = new TVChannelGroup("THVL", 4, "THVL");
    public static final TVChannelGroup DiaPhuong = new TVChannelGroup("DiaPhuong", 5, "Địa phương");
    public static final TVChannelGroup AnNinh = new TVChannelGroup("AnNinh", 6, "An Ninh");
    public static final TVChannelGroup VOV = new TVChannelGroup("VOV", 7, "VOV");
    public static final TVChannelGroup VOH = new TVChannelGroup("VOH", 8, "VOH");
    public static final TVChannelGroup Intenational = new TVChannelGroup("Intenational", 9, "Quốc tế");
    public static final TVChannelGroup SCTV = new TVChannelGroup("SCTV", 10, "SCTV");
    public static final TVChannelGroup Kid = new TVChannelGroup("Kid", 11, "Trẻ em");
    public static final TVChannelGroup Radio = new TVChannelGroup("Radio", 12, "Radio");
    public static final TVChannelGroup VTVCAB = new TVChannelGroup("VTVCAB", 13, "VTVCAB");
    public static final TVChannelGroup Music = new TVChannelGroup("Music", 14, "Âm nhạc");

    private static final /* synthetic */ TVChannelGroup[] $values() {
        return new TVChannelGroup[]{VTV, HTV, VTC, HTVC, THVL, DiaPhuong, AnNinh, VOV, VOH, Intenational, SCTV, Kid, Radio, VTVCAB, Music};
    }

    static {
        TVChannelGroup[] $values = $values();
        $VALUES = $values;
        $ENTRIES = x.k($values);
    }

    private TVChannelGroup(String str, int i7, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static TVChannelGroup valueOf(String str) {
        return (TVChannelGroup) Enum.valueOf(TVChannelGroup.class, str);
    }

    public static TVChannelGroup[] values() {
        return (TVChannelGroup[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
