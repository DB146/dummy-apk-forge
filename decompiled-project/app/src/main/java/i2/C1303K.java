package i2;

import android.util.Property;

/* renamed from: i2.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1303K extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final int f18219a;

    public C1303K(String str, int i7) {
        super(Integer.class, str);
        this.f18219a = i7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((C1322j) obj).f18269c[this.f18219a]);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((C1322j) obj).c(this.f18219a, ((Integer) obj2).intValue());
    }
}
