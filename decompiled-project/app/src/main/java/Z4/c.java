package Z4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.L;

/* loaded from: classes.dex */
public final class c implements O4.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12165a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12166b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12167c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12168d;

    /* renamed from: e, reason: collision with root package name */
    public final a f12169e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f12170f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12171h;

    public c(int i7, int i10, long j, long j10, int i11, boolean z8, a aVar, b[] bVarArr) {
        this.f12165a = i7;
        this.f12166b = i10;
        this.g = j;
        this.f12171h = j10;
        this.f12167c = i11;
        this.f12168d = z8;
        this.f12169e = aVar;
        this.f12170f = bVarArr;
    }

    @Override // O4.a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            O4.b bVar2 = (O4.b) arrayList.get(i7);
            b bVar3 = this.f12170f[bVar2.f7473b];
            if (bVar3 != bVar && bVar != null) {
                arrayList2.add(bVar.a((L[]) arrayList3.toArray(new L[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar3.j[bVar2.f7474c]);
            i7++;
            bVar = bVar3;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((L[]) arrayList3.toArray(new L[0])));
        }
        return new c(this.f12165a, this.f12166b, this.g, this.f12171h, this.f12167c, this.f12168d, this.f12169e, (b[]) arrayList2.toArray(new b[0]));
    }
}
