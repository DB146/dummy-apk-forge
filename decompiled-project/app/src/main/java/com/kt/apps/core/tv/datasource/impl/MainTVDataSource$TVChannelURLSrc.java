package com.kt.apps.core.tv.datasource.impl;

import Kb.a;
import Z9.x;
import androidx.annotation.Keep;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes2.dex */
public final class MainTVDataSource$TVChannelURLSrc {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MainTVDataSource$TVChannelURLSrc[] $VALUES;
    private final String value;

    /* renamed from: V, reason: collision with root package name */
    public static final MainTVDataSource$TVChannelURLSrc f16150V = new MainTVDataSource$TVChannelURLSrc("V", 0, "vieon");
    public static final MainTVDataSource$TVChannelURLSrc SCTV = new MainTVDataSource$TVChannelURLSrc("SCTV", 1, "sctv");
    public static final MainTVDataSource$TVChannelURLSrc HY = new MainTVDataSource$TVChannelURLSrc("HY", 2, "hy");
    public static final MainTVDataSource$TVChannelURLSrc VTV = new MainTVDataSource$TVChannelURLSrc("VTV", 3, "vtv");
    public static final MainTVDataSource$TVChannelURLSrc ON_LIVE = new MainTVDataSource$TVChannelURLSrc("ON_LIVE", 4, "on_live");
    public static final MainTVDataSource$TVChannelURLSrc VOV = new MainTVDataSource$TVChannelURLSrc("VOV", 5, "vov");
    public static final MainTVDataSource$TVChannelURLSrc HTV = new MainTVDataSource$TVChannelURLSrc("HTV", 6, "htv");
    public static final MainTVDataSource$TVChannelURLSrc VTC = new MainTVDataSource$TVChannelURLSrc("VTC", 7, "vtc");
    public static final MainTVDataSource$TVChannelURLSrc IPTV_BACKUP = new MainTVDataSource$TVChannelURLSrc("IPTV_BACKUP", 8, "iptv-backup");

    private static final /* synthetic */ MainTVDataSource$TVChannelURLSrc[] $values() {
        return new MainTVDataSource$TVChannelURLSrc[]{f16150V, SCTV, HY, VTV, ON_LIVE, VOV, HTV, VTC, IPTV_BACKUP};
    }

    static {
        MainTVDataSource$TVChannelURLSrc[] $values = $values();
        $VALUES = $values;
        $ENTRIES = x.k($values);
    }

    private MainTVDataSource$TVChannelURLSrc(String str, int i7, String str2) {
        this.value = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MainTVDataSource$TVChannelURLSrc valueOf(String str) {
        return (MainTVDataSource$TVChannelURLSrc) Enum.valueOf(MainTVDataSource$TVChannelURLSrc.class, str);
    }

    public static MainTVDataSource$TVChannelURLSrc[] values() {
        return (MainTVDataSource$TVChannelURLSrc[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
