package Z0;

import A0.T;
import Eb.w;
import java.util.ArrayList;
import java.util.List;
import y0.AbstractC2323H;
import y0.InterfaceC2316A;
import y0.InterfaceC2317B;
import y0.z;

/* loaded from: classes.dex */
public final class e implements InterfaceC2316A {

    /* renamed from: a, reason: collision with root package name */
    public static final e f12111a = new Object();

    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(T t5, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC2323H b2 = ((z) list.get(i11)).b(j);
            i7 = Math.max(i7, b2.f26554a);
            i10 = Math.max(i10, b2.f26555b);
            arrayList.add(b2);
        }
        if (list.isEmpty()) {
            i7 = V0.a.j(j);
            i10 = V0.a.i(j);
        }
        return t5.Q(i7, i10, w.f3892a, new d(0, arrayList));
    }
}
