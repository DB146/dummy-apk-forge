package e1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f16690a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f16691b;

    public static long a(f fVar, long j) {
        o oVar = fVar.f16682d;
        if (oVar instanceof j) {
            return j;
        }
        ArrayList arrayList = fVar.k;
        int size = arrayList.size();
        long j10 = j;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) arrayList.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f16682d != oVar) {
                    j10 = Math.min(j10, a(fVar2, fVar2.f16684f + j));
                }
            }
        }
        if (fVar != oVar.f16706i) {
            return j10;
        }
        long j11 = oVar.j();
        long j12 = j - j11;
        return Math.min(Math.min(j10, a(oVar.f16705h, j12)), j12 - r9.f16684f);
    }

    public static long b(f fVar, long j) {
        o oVar = fVar.f16682d;
        if (oVar instanceof j) {
            return j;
        }
        ArrayList arrayList = fVar.k;
        int size = arrayList.size();
        long j10 = j;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) arrayList.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f16682d != oVar) {
                    j10 = Math.max(j10, b(fVar2, fVar2.f16684f + j));
                }
            }
        }
        if (fVar != oVar.f16705h) {
            return j10;
        }
        long j11 = oVar.j();
        long j12 = j + j11;
        return Math.max(Math.max(j10, b(oVar.f16706i, j12)), j12 - r9.f16684f);
    }
}
