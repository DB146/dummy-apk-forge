package c;

import android.content.res.Resources;

/* renamed from: c.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855C extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0855C f14013a = new kotlin.jvm.internal.m(1);

    @Override // Rb.c
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        kotlin.jvm.internal.l.e(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
