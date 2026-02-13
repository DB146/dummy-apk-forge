package E;

import B0.C0170c0;
import Q.W;
import android.os.Build;
import android.os.Trace;
import h3.C1240b;
import i3.C1340B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import y0.AbstractC2322G;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3464a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f3467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(W w10, ArrayList arrayList, List list, boolean z8) {
        super(1);
        this.f3466c = w10;
        this.f3467d = arrayList;
        this.f3468e = list;
        this.f3465b = z8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h3.y yVar, boolean z8, String str, C1340B c1340b) {
        super(1);
        this.f3466c = yVar;
        this.f3465b = z8;
        this.f3467d = str;
        this.f3468e = c1340b;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        String str;
        switch (this.f3464a) {
            case 0:
                AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
                C0170c0 c0170c0 = new C0170c0((ArrayList) this.f3467d, (List) this.f3468e, this.f3465b);
                abstractC2322G.f26553a = true;
                c0170c0.invoke(abstractC2322G);
                abstractC2322G.f26553a = false;
                ((W) this.f3466c).getValue();
                return Db.q.f3365a;
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof i3.r) {
                    ((h3.y) this.f3466c).f17720c.compareAndSet(-256, ((i3.r) th).f18386a);
                }
                if (this.f3465b && (str = (String) this.f3467d) != null) {
                    C1340B c1340b = (C1340B) this.f3468e;
                    C1240b c1240b = c1340b.f18322e;
                    int hashCode = c1340b.f18318a.hashCode();
                    c1240b.f17677m.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        Z2.a.b(hashCode, vc.i.I(str));
                    } else {
                        String I6 = vc.i.I(str);
                        try {
                            if (vc.i.f25481d == null) {
                                vc.i.f25481d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            vc.i.f25481d.invoke(null, Long.valueOf(vc.i.f25478a), I6, Integer.valueOf(hashCode));
                        } catch (Exception e2) {
                            vc.i.v("asyncTraceEnd", e2);
                        }
                    }
                }
                return Db.q.f3365a;
        }
    }
}
