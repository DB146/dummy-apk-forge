package P4;

import android.util.Pair;
import ea.C1111f;
import java.io.IOException;
import m4.C1584n0;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f7851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0474w f7852c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f7853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7855f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7856u;

    public /* synthetic */ E(Object obj, Object obj2, r rVar, C0474w c0474w, IOException iOException, boolean z8, int i7) {
        this.f7850a = i7;
        this.f7855f = obj;
        this.f7856u = obj2;
        this.f7851b = rVar;
        this.f7852c = c0474w;
        this.f7853d = iOException;
        this.f7854e = z8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, P4.I] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7850a) {
            case 0:
                A4.s sVar = (A4.s) this.f7855f;
                int i7 = sVar.f470a;
                this.f7856u.e(i7, (B) sVar.f471b, this.f7851b, this.f7852c, this.f7853d, this.f7854e);
                return;
            default:
                n4.f fVar = (n4.f) ((C1584n0) ((C1111f) this.f7855f).f16838c).f20449i;
                Pair pair = (Pair) this.f7856u;
                fVar.e(((Integer) pair.first).intValue(), (B) pair.second, this.f7851b, this.f7852c, this.f7853d, this.f7854e);
                return;
        }
    }
}
