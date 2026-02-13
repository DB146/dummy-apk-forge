package R;

import H2.C0305t;
import Q.C0;
import Q.InterfaceC0482c;
import java.util.List;

/* renamed from: R.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530g extends P8.h {

    /* renamed from: d, reason: collision with root package name */
    public static final C0530g f8759d = new P8.h(0, 2, 1);

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        int i7 = ((Y.g) c0305t.e(0)).f11046a;
        List list = (List) c0305t.e(1);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            int i11 = i7 + i10;
            interfaceC0482c.e(i11, obj);
            interfaceC0482c.j(i11, obj);
        }
    }
}
