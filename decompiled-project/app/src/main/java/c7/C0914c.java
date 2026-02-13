package c7;

import P4.C0463k;
import Y5.A;
import android.os.Bundle;
import com.google.android.gms.common.internal.G;
import d7.AbstractC1054a;
import ha.g;
import java.util.concurrent.ConcurrentHashMap;
import m5.L;
import q3.l;

/* renamed from: c7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914c implements InterfaceC0913b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0914c f14437c;

    /* renamed from: a, reason: collision with root package name */
    public final X5.a f14438a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14439b;

    public C0914c(X5.a aVar) {
        G.g(aVar);
        this.f14438a = aVar;
        this.f14439b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (AbstractC1054a.a(str) && AbstractC1054a.b(str2, bundle) && AbstractC1054a.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f14438a.f10991a.zzi(str, str2, bundle);
        }
    }

    public final A b(String str, g gVar) {
        if (AbstractC1054a.a(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f14439b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                X5.a aVar = this.f14438a;
                L lVar = equals ? new l(aVar, gVar) : "clx".equals(str) ? new C0463k(aVar, gVar) : null;
                if (lVar != null) {
                    concurrentHashMap.put(str, lVar);
                    return new A(8);
                }
            }
        }
        return null;
    }
}
