package P8;

import b9.C0848a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import l9.C1515a;

/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final l[] f8221c = new l[0];

    /* renamed from: a, reason: collision with root package name */
    public EnumMap f8222a;

    /* renamed from: b, reason: collision with root package name */
    public l[] f8223b;

    @Override // P8.l
    public final n a(b bVar, EnumMap enumMap) {
        c(enumMap);
        return b(bVar);
    }

    public final n b(b bVar) {
        l[] lVarArr = this.f8223b;
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                if (Thread.currentThread().isInterrupted()) {
                    throw j.a();
                }
                try {
                    return lVar.a(bVar, this.f8222a);
                } catch (m unused) {
                }
            }
            EnumMap enumMap = this.f8222a;
            if (enumMap != null && enumMap.containsKey(d.f8206z)) {
                V8.b a9 = bVar.a();
                int length = a9.f10197d.length;
                for (int i7 = 0; i7 < length; i7++) {
                    int[] iArr = a9.f10197d;
                    iArr[i7] = ~iArr[i7];
                }
                for (l lVar2 : this.f8223b) {
                    if (Thread.currentThread().isInterrupted()) {
                        throw j.a();
                    }
                    try {
                        return lVar2.a(bVar, this.f8222a);
                    } catch (m unused2) {
                    }
                }
            }
        }
        throw j.a();
    }

    public final void c(EnumMap enumMap) {
        this.f8222a = enumMap;
        boolean z8 = enumMap != null && enumMap.containsKey(d.f8198d);
        Collection collection = enumMap == null ? null : (Collection) enumMap.get(d.f8197c);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z10 = collection.contains(a.f8176C) || collection.contains(a.f8177D) || collection.contains(a.f8187v) || collection.contains(a.f8186u) || collection.contains(a.f8181b) || collection.contains(a.f8182c) || collection.contains(a.f8183d) || collection.contains(a.f8184e) || collection.contains(a.f8188w) || collection.contains(a.f8174A) || collection.contains(a.f8175B);
            if (z10 && !z8) {
                arrayList.add(new d9.g(enumMap, 0));
            }
            if (collection.contains(a.f8191z)) {
                arrayList.add(new C1515a());
            }
            if (collection.contains(a.f8185f)) {
                arrayList.add(new Y8.a());
            }
            if (collection.contains(a.f8180a)) {
                arrayList.add(new Object());
            }
            if (collection.contains(a.f8190y)) {
                arrayList.add(new Object());
            }
            if (collection.contains(a.f8189x)) {
                arrayList.add(new C0848a());
            }
            if (z10 && z8) {
                arrayList.add(new d9.g(enumMap, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z8) {
                arrayList.add(new d9.g(enumMap, 0));
            }
            arrayList.add(new C1515a());
            arrayList.add(new Y8.a());
            arrayList.add(new Object());
            arrayList.add(new Object());
            arrayList.add(new C0848a());
            if (z8) {
                arrayList.add(new d9.g(enumMap, 0));
            }
        }
        this.f8223b = (l[]) arrayList.toArray(f8221c);
    }

    @Override // P8.l
    public final void reset() {
        l[] lVarArr = this.f8223b;
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                lVar.reset();
            }
        }
    }
}
