package com.kt.apps.core.update;

import Kb.a;
import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class UpdatePriority {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UpdatePriority[] $VALUES;
    private final int value;
    public static final UpdatePriority NONE = new UpdatePriority("NONE", 0, -1);
    public static final UpdatePriority WARNING_BUTTON = new UpdatePriority("WARNING_BUTTON", 1, 1);
    public static final UpdatePriority NOTIFY_DIALOG = new UpdatePriority("NOTIFY_DIALOG", 2, 2);
    public static final UpdatePriority FORCE = new UpdatePriority("FORCE", 3, 5);

    private static final /* synthetic */ UpdatePriority[] $values() {
        return new UpdatePriority[]{NONE, WARNING_BUTTON, NOTIFY_DIALOG, FORCE};
    }

    static {
        UpdatePriority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = x.k($values);
    }

    private UpdatePriority(String str, int i7, int i10) {
        this.value = i10;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static UpdatePriority valueOf(String str) {
        return (UpdatePriority) Enum.valueOf(UpdatePriority.class, str);
    }

    public static UpdatePriority[] values() {
        return (UpdatePriority[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
