package com.kt.apps.core.tv.model;

import Kb.a;
import Z9.x;
import androidx.annotation.Keep;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes2.dex */
public final class TVDataSourceFrom {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TVDataSourceFrom[] $VALUES;

    /* renamed from: V, reason: collision with root package name */
    public static final TVDataSourceFrom f16152V = new TVDataSourceFrom("V", 0);

    /* renamed from: F, reason: collision with root package name */
    public static final TVDataSourceFrom f16151F = new TVDataSourceFrom("F", 1);
    public static final TVDataSourceFrom VG = new TVDataSourceFrom("VG", 2);
    public static final TVDataSourceFrom VTC_BACKUP = new TVDataSourceFrom("VTC_BACKUP", 3);
    public static final TVDataSourceFrom VTV_BACKUP = new TVDataSourceFrom("VTV_BACKUP", 4);
    public static final TVDataSourceFrom HTV_BACKUP = new TVDataSourceFrom("HTV_BACKUP", 5);
    public static final TVDataSourceFrom VOV_BACKUP = new TVDataSourceFrom("VOV_BACKUP", 6);
    public static final TVDataSourceFrom VOH_BACKUP = new TVDataSourceFrom("VOH_BACKUP", 7);
    public static final TVDataSourceFrom GG = new TVDataSourceFrom("GG", 8);
    public static final TVDataSourceFrom SCTV = new TVDataSourceFrom("SCTV", 9);
    public static final TVDataSourceFrom MAIN_SOURCE = new TVDataSourceFrom("MAIN_SOURCE", 10);
    public static final TVDataSourceFrom HY = new TVDataSourceFrom("HY", 11);
    public static final TVDataSourceFrom ON_LIVE = new TVDataSourceFrom("ON_LIVE", 12);

    private static final /* synthetic */ TVDataSourceFrom[] $values() {
        return new TVDataSourceFrom[]{f16152V, f16151F, VG, VTC_BACKUP, VTV_BACKUP, HTV_BACKUP, VOV_BACKUP, VOH_BACKUP, GG, SCTV, MAIN_SOURCE, HY, ON_LIVE};
    }

    static {
        TVDataSourceFrom[] $values = $values();
        $VALUES = $values;
        $ENTRIES = x.k($values);
    }

    private TVDataSourceFrom(String str, int i7) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static TVDataSourceFrom valueOf(String str) {
        return (TVDataSourceFrom) Enum.valueOf(TVDataSourceFrom.class, str);
    }

    public static TVDataSourceFrom[] values() {
        return (TVDataSourceFrom[]) $VALUES.clone();
    }
}
