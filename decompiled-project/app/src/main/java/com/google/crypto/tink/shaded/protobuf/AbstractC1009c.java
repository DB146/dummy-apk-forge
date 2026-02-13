package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1009c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f15760a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f15761b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f15760a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f15761b = cls2 != null;
    }

    public static boolean a() {
        return (f15760a == null || f15761b) ? false : true;
    }
}
