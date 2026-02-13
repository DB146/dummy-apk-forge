package b4;

import A9.S2;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import k4.InterfaceC1421a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0839j f13876e;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1421a f13877a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1421a f13878b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.c f13879c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.i f13880d;

    public p(InterfaceC1421a interfaceC1421a, InterfaceC1421a interfaceC1421a2, g4.c cVar, h4.i iVar, h4.k kVar) {
        this.f13877a = interfaceC1421a;
        this.f13878b = interfaceC1421a2;
        this.f13879c = cVar;
        this.f13880d = iVar;
        kVar.getClass();
        kVar.f17762a.execute(new S2(kVar, 27));
    }

    public static p a() {
        C0839j c0839j = f13876e;
        if (c0839j != null) {
            return (p) c0839j.f13867f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f13876e == null) {
            synchronized (p.class) {
                try {
                    if (f13876e == null) {
                        E3.e eVar = new E3.e();
                        context.getClass();
                        eVar.f3530b = context;
                        f13876e = eVar.f();
                    }
                } finally {
                }
            }
        }
    }

    public final o c(Z3.a aVar) {
        byte[] bytes;
        Set unmodifiableSet = aVar != null ? Collections.unmodifiableSet(Z3.a.f12138d) : Collections.singleton(new Y3.c("proto"));
        Q7.h a9 = C0838i.a();
        aVar.getClass();
        a9.f8695b = "cct";
        String str = aVar.f12141a;
        String str2 = aVar.f12142b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = A3.c.j("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a9.f8696c = bytes;
        return new o(unmodifiableSet, a9.n(), this);
    }
}
