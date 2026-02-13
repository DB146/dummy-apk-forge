package wc;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.function.Supplier;
import xc.p;
import xc.q;
import xc.r;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25875a;

    public /* synthetic */ d(int i7) {
        this.f25875a = i7;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f25875a) {
            case 0:
                return new byte[8192];
            case 1:
                return new SoftReference(new ArrayDeque());
            case 2:
                return new StringBuilder(1024);
            case 3:
                return new char[2];
            case 4:
                return new String[512];
            case 5:
                return new char[2048];
            case 6:
                return new ArrayList();
            case 7:
                return new IdentityHashMap();
            default:
                return new r(new p(""), q.class);
        }
    }
}
