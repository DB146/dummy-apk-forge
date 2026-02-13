package q9;

import java.util.Comparator;
import p9.r;

/* loaded from: classes2.dex */
public final class k implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f23589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f23590b;

    public k(l lVar, r rVar) {
        this.f23590b = lVar;
        this.f23589a = rVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        r rVar = this.f23589a;
        l lVar = this.f23590b;
        return Float.compare(lVar.a((r) obj2, rVar), lVar.a((r) obj, rVar));
    }
}
