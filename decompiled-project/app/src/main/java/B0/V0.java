package B0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class V0 implements A0.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1798a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1799b;

    /* renamed from: c, reason: collision with root package name */
    public Float f1800c = null;

    /* renamed from: d, reason: collision with root package name */
    public Float f1801d = null;

    /* renamed from: e, reason: collision with root package name */
    public H0.g f1802e = null;

    /* renamed from: f, reason: collision with root package name */
    public H0.g f1803f = null;

    public V0(int i7, ArrayList arrayList) {
        this.f1798a = i7;
        this.f1799b = arrayList;
    }

    @Override // A0.u0
    public final boolean r() {
        return this.f1799b.contains(this);
    }
}
