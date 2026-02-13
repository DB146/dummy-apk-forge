package w;

import java.util.ArrayList;
import java.util.List;
import y0.AbstractC2323H;
import y0.InterfaceC2316A;
import y0.InterfaceC2317B;

/* renamed from: w.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2188o implements InterfaceC2316A {

    /* renamed from: a, reason: collision with root package name */
    public final C2193u f25594a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25595b;

    public C2188o(C2193u c2193u) {
        this.f25594a = c2193u;
    }

    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(A0.T t5, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC2323H b2 = ((y0.z) list.get(i11)).b(j);
            i7 = Math.max(i7, b2.f26554a);
            i10 = Math.max(i10, b2.f26555b);
            arrayList.add(b2);
        }
        boolean m10 = t5.m();
        C2193u c2193u = this.f25594a;
        if (m10) {
            this.f25595b = true;
            c2193u.f25617a.setValue(new V0.k((4294967295L & i10) | (i7 << 32)));
        } else if (!this.f25595b) {
            c2193u.f25617a.setValue(new V0.k((4294967295L & i10) | (i7 << 32)));
        }
        return t5.Q(i7, i10, Eb.w.f3892a, new Z0.d(1, arrayList));
    }
}
