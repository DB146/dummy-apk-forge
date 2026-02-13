package d9;

import P8.m;
import P8.n;
import e9.C1105e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class g extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final h[] f16591c = new h[0];

    /* renamed from: d, reason: collision with root package name */
    public static final k[] f16592d = new k[0];

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16593a;

    /* renamed from: b, reason: collision with root package name */
    public final h[] f16594b;

    public g(EnumMap enumMap, int i7) {
        this.f16593a = i7;
        switch (i7) {
            case 1:
                Collection collection = enumMap == null ? null : (Collection) enumMap.get(P8.d.f8197c);
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(P8.a.f8187v)) {
                        arrayList.add(new e(0));
                    } else if (collection.contains(P8.a.f8176C)) {
                        arrayList.add(new e(3));
                    }
                    if (collection.contains(P8.a.f8186u)) {
                        arrayList.add(new e(2));
                    }
                    if (collection.contains(P8.a.f8177D)) {
                        arrayList.add(new e(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new e(0));
                    arrayList.add(new e(2));
                    arrayList.add(new e(1));
                }
                this.f16594b = (k[]) arrayList.toArray(f16592d);
                return;
            default:
                Collection collection2 = enumMap == null ? null : (Collection) enumMap.get(P8.d.f8197c);
                boolean z8 = (enumMap == null || enumMap.get(P8.d.f8201u) == null) ? false : true;
                ArrayList arrayList2 = new ArrayList();
                if (collection2 != null) {
                    if (collection2.contains(P8.a.f8187v) || collection2.contains(P8.a.f8176C) || collection2.contains(P8.a.f8186u) || collection2.contains(P8.a.f8177D)) {
                        arrayList2.add(new g(enumMap, 1));
                    }
                    if (collection2.contains(P8.a.f8182c)) {
                        arrayList2.add(new C1061c(z8));
                    }
                    if (collection2.contains(P8.a.f8183d)) {
                        arrayList2.add(new C1062d());
                    }
                    if (collection2.contains(P8.a.f8184e)) {
                        arrayList2.add(new Object());
                    }
                    if (collection2.contains(P8.a.f8188w)) {
                        arrayList2.add(new f());
                    }
                    if (collection2.contains(P8.a.f8181b)) {
                        arrayList2.add(new C1059a());
                    }
                    if (collection2.contains(P8.a.f8174A)) {
                        arrayList2.add(new C1105e());
                    }
                    if (collection2.contains(P8.a.f8175B)) {
                        arrayList2.add(new f9.c());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new g(enumMap, 1));
                    arrayList2.add(new C1061c(false));
                    arrayList2.add(new C1059a());
                    arrayList2.add(new C1062d());
                    arrayList2.add(new Object());
                    arrayList2.add(new f());
                    arrayList2.add(new C1105e());
                    arrayList2.add(new f9.c());
                }
                this.f16594b = (h[]) arrayList2.toArray(f16591c);
                return;
        }
    }

    @Override // d9.h
    public final n b(int i7, V8.a aVar, EnumMap enumMap) {
        boolean z8;
        switch (this.f16593a) {
            case 0:
                for (h hVar : this.f16594b) {
                    try {
                        return hVar.b(i7, aVar, enumMap);
                    } catch (m unused) {
                    }
                }
                throw P8.j.a();
            default:
                int[] m10 = k.m(aVar);
                for (k kVar : (k[]) this.f16594b) {
                    try {
                        n k = kVar.k(i7, aVar, m10, enumMap);
                        P8.a aVar2 = k.f8233d;
                        P8.a aVar3 = P8.a.f8187v;
                        String str = k.f8230a;
                        boolean z10 = aVar2 == aVar3 && str.charAt(0) == '0';
                        Collection collection = enumMap == null ? null : (Collection) enumMap.get(P8.d.f8197c);
                        P8.a aVar4 = P8.a.f8176C;
                        if (collection != null && !collection.contains(aVar4)) {
                            z8 = false;
                            if (!z10 && z8) {
                                n nVar = new n(str.substring(1), k.f8231b, k.f8232c, aVar4);
                                nVar.a(k.f8234e);
                                return nVar;
                            }
                        }
                        z8 = true;
                        return !z10 ? k : k;
                    } catch (m unused2) {
                    }
                }
                throw P8.j.a();
        }
    }

    @Override // d9.h, P8.l
    public final void reset() {
        switch (this.f16593a) {
            case 0:
                for (h hVar : this.f16594b) {
                    hVar.reset();
                }
                return;
            default:
                for (k kVar : (k[]) this.f16594b) {
                    kVar.getClass();
                }
                return;
        }
    }
}
