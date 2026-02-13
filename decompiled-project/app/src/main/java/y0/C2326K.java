package y0;

import A0.T;
import C.C0225j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2326K extends A0.G {

    /* renamed from: a, reason: collision with root package name */
    public static final C2326K f26564a = new Object();

    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(T t5, List list, long j) {
        int size = list.size();
        Eb.w wVar = Eb.w.f3892a;
        if (size == 0) {
            return t5.Q(V0.a.j(j), V0.a.i(j), wVar, C2324I.f26560c);
        }
        if (size == 1) {
            AbstractC2323H b2 = ((z) list.get(0)).b(j);
            return t5.Q(V0.b.f(b2.f26554a, j), V0.b.e(b2.f26555b, j), wVar, new C0225j(b2, 9));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            AbstractC2323H b10 = ((z) list.get(i11)).b(j);
            i7 = Math.max(b10.f26554a, i7);
            i10 = Math.max(b10.f26555b, i10);
            arrayList.add(b10);
        }
        return t5.Q(V0.b.f(i7, j), V0.b.e(i10, j), wVar, new Z0.d(2, arrayList));
    }
}
