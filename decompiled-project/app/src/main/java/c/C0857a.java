package c;

import android.window.BackEvent;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857a {

    /* renamed from: a, reason: collision with root package name */
    public final float f14016a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14017b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14019d;

    public C0857a(BackEvent backEvent) {
        kotlin.jvm.internal.l.e(backEvent, "backEvent");
        float k = C1.j.k(backEvent);
        float l10 = C1.j.l(backEvent);
        float h10 = C1.j.h(backEvent);
        int j = C1.j.j(backEvent);
        this.f14016a = k;
        this.f14017b = l10;
        this.f14018c = h10;
        this.f14019d = j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f14016a);
        sb2.append(", touchY=");
        sb2.append(this.f14017b);
        sb2.append(", progress=");
        sb2.append(this.f14018c);
        sb2.append(", swipeEdge=");
        return X.c.k(sb2, this.f14019d, '}');
    }
}
