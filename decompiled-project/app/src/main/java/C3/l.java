package C3;

import A0.G0;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2573a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2574b;

    /* renamed from: c, reason: collision with root package name */
    public final O3.a f2575c;

    /* renamed from: d, reason: collision with root package name */
    public final Q7.h f2576d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2577e;

    public l(Class cls, Class cls2, Class cls3, List list, O3.a aVar, Q7.h hVar) {
        this.f2573a = cls;
        this.f2574b = list;
        this.f2575c = aVar;
        this.f2576d = hVar;
        this.f2577e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final A a(int i7, int i10, A3.l lVar, com.bumptech.glide.load.data.g gVar, q3.l lVar2) {
        A a9;
        A3.p pVar;
        int i11;
        boolean z8;
        boolean z10;
        boolean z11;
        boolean z12;
        A3.h fVar;
        Q7.h hVar = this.f2576d;
        List list = (List) hVar.h();
        try {
            A b2 = b(gVar, i7, i10, lVar, list);
            hVar.M(list);
            k kVar = (k) lVar2.f23392c;
            kVar.getClass();
            Class<?> cls = b2.get().getClass();
            A3.a aVar = A3.a.f345d;
            A3.a aVar2 = (A3.a) lVar2.f23391b;
            i iVar = kVar.f2561a;
            A3.o oVar = null;
            if (aVar2 != aVar) {
                A3.p e2 = iVar.e(cls);
                a9 = e2.a(kVar.f2568v, b2, kVar.f2572z, kVar.f2543A);
                pVar = e2;
            } else {
                a9 = b2;
                pVar = null;
            }
            if (!b2.equals(a9)) {
                b2.d();
            }
            if (iVar.f2527c.a().f14641d.b(a9.c()) != null) {
                com.bumptech.glide.i a10 = iVar.f2527c.a();
                a10.getClass();
                oVar = a10.f14641d.b(a9.c());
                if (oVar == null) {
                    throw new com.bumptech.glide.h(a9.c());
                }
                i11 = oVar.q(kVar.f2545C);
            } else {
                i11 = 3;
            }
            A3.h hVar2 = kVar.f2551I;
            ArrayList b10 = iVar.b();
            int size = b10.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z8 = false;
                    break;
                }
                if (((G3.r) b10.get(i12)).f4327a.equals(hVar2)) {
                    z8 = true;
                    break;
                }
                i12++;
            }
            switch (kVar.f2544B.f2581a) {
                default:
                    if (((!z8 && aVar2 == A3.a.f344c) || aVar2 == A3.a.f342a) && i11 == 2) {
                        z10 = true;
                        break;
                    }
                    break;
                case 0:
                case 1:
                    z10 = false;
                    break;
            }
            if (z10) {
                if (oVar == null) {
                    throw new com.bumptech.glide.h(a9.get().getClass());
                }
                int b11 = P.c.b(i11);
                if (b11 == 0) {
                    z11 = true;
                    z12 = false;
                    fVar = new f(kVar.f2551I, kVar.f2569w);
                } else {
                    if (b11 != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(i11 != 1 ? i11 != 2 ? i11 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z11 = true;
                    z12 = false;
                    fVar = new C(iVar.f2527c.f14625a, kVar.f2551I, kVar.f2569w, kVar.f2572z, kVar.f2543A, pVar, cls, kVar.f2545C);
                }
                z zVar = (z) z.f2644e.h();
                zVar.f2648d = z12;
                zVar.f2647c = z11;
                zVar.f2646b = a9;
                G0 g02 = kVar.f2566f;
                g02.f27b = fVar;
                g02.f28c = oVar;
                g02.f29d = zVar;
                a9 = zVar;
            }
            return this.f2575c.B(a9, lVar);
        } catch (Throwable th) {
            hVar.M(list);
            throw th;
        }
    }

    public final A b(com.bumptech.glide.load.data.g gVar, int i7, int i10, A3.l lVar, List list) {
        List list2 = this.f2574b;
        int size = list2.size();
        A a9 = null;
        for (int i11 = 0; i11 < size; i11++) {
            A3.n nVar = (A3.n) list2.get(i11);
            try {
                if (nVar.a(gVar.l(), lVar)) {
                    a9 = nVar.b(gVar.l(), i7, i10, lVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + nVar, e2);
                }
                list.add(e2);
            }
            if (a9 != null) {
                break;
            }
        }
        if (a9 != null) {
            return a9;
        }
        throw new v(this.f2577e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f2573a + ", decoders=" + this.f2574b + ", transcoder=" + this.f2575c + '}';
    }
}
