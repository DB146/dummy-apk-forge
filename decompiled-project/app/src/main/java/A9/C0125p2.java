package A9;

import android.util.Property;

/* renamed from: A9.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0125p2 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final int f1342a;

    /* renamed from: b, reason: collision with root package name */
    public int f1343b;

    /* renamed from: c, reason: collision with root package name */
    public float f1344c;

    public C0125p2(String str, int i7) {
        super(Integer.class, str);
        this.f1342a = i7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((C0115n0) obj).f1293c[this.f1342a]);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((C0115n0) obj).d(this.f1342a, ((Integer) obj2).intValue());
    }
}
