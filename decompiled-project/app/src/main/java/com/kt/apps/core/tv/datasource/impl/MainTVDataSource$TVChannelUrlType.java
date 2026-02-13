package com.kt.apps.core.tv.datasource.impl;

import Kb.a;
import Z9.x;
import androidx.annotation.Keep;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes2.dex */
public final class MainTVDataSource$TVChannelUrlType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MainTVDataSource$TVChannelUrlType[] $VALUES;
    public static final MainTVDataSource$TVChannelUrlType STREAM = new MainTVDataSource$TVChannelUrlType("STREAM", 0, "streaming");
    public static final MainTVDataSource$TVChannelUrlType WEB_PAGE = new MainTVDataSource$TVChannelUrlType("WEB_PAGE", 1, "web");
    private final String value;

    private static final /* synthetic */ MainTVDataSource$TVChannelUrlType[] $values() {
        return new MainTVDataSource$TVChannelUrlType[]{STREAM, WEB_PAGE};
    }

    static {
        MainTVDataSource$TVChannelUrlType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = x.k($values);
    }

    private MainTVDataSource$TVChannelUrlType(String str, int i7, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MainTVDataSource$TVChannelUrlType valueOf(String str) {
        return (MainTVDataSource$TVChannelUrlType) Enum.valueOf(MainTVDataSource$TVChannelUrlType.class, str);
    }

    public static MainTVDataSource$TVChannelUrlType[] values() {
        return (MainTVDataSource$TVChannelUrlType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
