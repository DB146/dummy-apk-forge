package Za;

import A4.s;
import N6.r;
import N6.y0;
import ab.C0794d;
import ab.InterfaceC0793c;
import c.AbstractActivityC0867k;
import c2.i;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l2.Q;
import l2.Y;
import l2.a0;
import oa.C1829d;
import oa.j;

/* loaded from: classes2.dex */
public final class d implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12329a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12330b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f12329a = i7;
        this.f12330b = obj;
    }

    public d(o2.e[] initializers) {
        this.f12329a = 2;
        l.e(initializers, "initializers");
        this.f12330b = initializers;
    }

    @Override // l2.a0
    public final Y b(Class cls, o2.d dVar) {
        Y y10;
        Y y11;
        o2.e eVar;
        Rb.c cVar;
        Object obj = this.f12330b;
        switch (this.f12329a) {
            case 0:
                final g gVar = new g();
                Q.b(dVar);
                ha.g gVar2 = (ha.g) obj;
                oa.l lVar = new oa.l((j) gVar2.f17915b, (C1829d) gVar2.f17916c);
                oa.l lVar2 = (oa.l) ((e) i.p(e.class, lVar));
                lVar2.getClass();
                r.e(6, "expectedSize");
                s sVar = new s(6);
                sVar.B("v9.b", lVar2.f22196b);
                sVar.B("va.e", lVar2.f22197c);
                sVar.B("wa.h", lVar2.f22198d);
                sVar.B("xa.n", lVar2.f22199e);
                sVar.B("Ba.h", lVar2.f22200f);
                sVar.B("ta.c", lVar2.g);
                Cb.a aVar = (Cb.a) sVar.g().get(cls.getName());
                Rb.c cVar2 = (Rb.c) dVar.f21663a.get(f.f12331d);
                ((e) i.p(e.class, lVar)).getClass();
                Object obj2 = y0.f7368u.get(cls);
                if (obj2 == null) {
                    if (cVar2 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (aVar == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    y10 = (Y) aVar.get();
                } else {
                    if (aVar != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (cVar2 == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    y10 = (Y) cVar2.invoke(obj2);
                }
                y10.addCloseable(new Closeable() { // from class: Za.c
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        g.this.a();
                    }
                });
                return y10;
            case 1:
                R7.a aVar2 = new R7.a(19);
                aVar2.f8927b = dVar;
                return new C0794d(new C1829d(((j) ((InterfaceC0793c) Q5.e.v((AbstractActivityC0867k) obj, InterfaceC0793c.class))).g), aVar2);
            default:
                kotlin.jvm.internal.e a9 = w.a(cls);
                o2.e[] eVarArr = (o2.e[]) obj;
                o2.e[] initializers = (o2.e[]) Arrays.copyOf(eVarArr, eVarArr.length);
                l.e(initializers, "initializers");
                int length = initializers.length;
                int i7 = 0;
                while (true) {
                    y11 = null;
                    if (i7 < length) {
                        eVar = initializers[i7];
                        if (!eVar.f21664a.equals(a9)) {
                            i7++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar != null && (cVar = eVar.f21665b) != null) {
                    y11 = (Y) cVar.invoke(dVar);
                }
                if (y11 != null) {
                    return y11;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + a9.b()).toString());
        }
    }
}
