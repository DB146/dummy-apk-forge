package G7;

import L7.C0385e;
import T7.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f4353a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4354b;

    public a(d dVar, m mVar) {
        this.f4353a = mVar;
        this.f4354b = dVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataSnapshot { key = ");
        C0385e c0385e = this.f4354b.f4360b;
        sb2.append(c0385e.isEmpty() ? null : c0385e.z().f9331a);
        sb2.append(", value = ");
        sb2.append(this.f4353a.f9350a.x(true));
        sb2.append(" }");
        return sb2.toString();
    }
}
