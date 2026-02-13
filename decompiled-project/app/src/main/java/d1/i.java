package d1;

import e1.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f16481q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f16482r0 = 0;

    public final void R(int i7, n nVar, ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f16482r0; i10++) {
            d dVar = this.f16481q0[i10];
            ArrayList arrayList2 = nVar.f16694a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i11 = 0; i11 < this.f16482r0; i11++) {
            e1.h.b(this.f16481q0[i11], i7, arrayList, nVar);
        }
    }

    public void S() {
    }
}
