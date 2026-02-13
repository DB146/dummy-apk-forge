package y;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.B0;
import A0.C0018g0;
import A0.E0;
import Y5.C0658x;
import android.view.ViewGroup;
import android.view.ViewParent;
import x0.AbstractC2256a;
import z.C2544a0;

/* renamed from: y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2295c extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public A.k f26453a;

    /* renamed from: b, reason: collision with root package name */
    public int f26454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f26455c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A.i f26457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2295c(r rVar, long j, A.i iVar, Hb.d dVar) {
        super(2, dVar);
        this.f26455c = rVar;
        this.f26456d = j;
        this.f26457e = iVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2295c(this.f26455c, this.f26456d, this.f26457e, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2295c) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0108  */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [S.e] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [S.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z8;
        boolean z10;
        C0018g0 c0018g0;
        A.k kVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26454b;
        r rVar = this.f26455c;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            rVar.getClass();
            ?? obj2 = new Object();
            C0658x c0658x = C2544a0.f27958D;
            f0.e eVar = new f0.e(obj2);
            if (!rVar.f14113a.f14112B) {
                AbstractC2256a.b("visitAncestors called on an unattached node");
            }
            c0.l lVar = rVar.f14113a.f14117e;
            A0.L t5 = AbstractC0017g.t(rVar);
            loop0: while (t5 != null) {
                if ((((c0.l) t5.f60S.f229f).f14116d & 262144) != 0) {
                    while (lVar != null) {
                        if ((lVar.f14115c & 262144) != 0) {
                            AbstractC0025n abstractC0025n = lVar;
                            ?? r14 = 0;
                            while (abstractC0025n != 0) {
                                if (abstractC0025n instanceof E0) {
                                    E0 e02 = (E0) abstractC0025n;
                                    if (!(c0658x.equals(e02.j()) ? ((Boolean) eVar.invoke(e02)).booleanValue() : true)) {
                                        break loop0;
                                    }
                                } else {
                                    if (((abstractC0025n.f14115c & 262144) != 0) && (abstractC0025n instanceof AbstractC0025n)) {
                                        c0.l lVar2 = abstractC0025n.f269D;
                                        int i10 = 0;
                                        abstractC0025n = abstractC0025n;
                                        r14 = r14;
                                        while (lVar2 != null) {
                                            if ((lVar2.f14115c & 262144) != 0) {
                                                i10++;
                                                r14 = r14;
                                                if (i10 == 1) {
                                                    abstractC0025n = lVar2;
                                                } else {
                                                    if (r14 == 0) {
                                                        r14 = new S.e(new c0.l[16]);
                                                    }
                                                    if (abstractC0025n != 0) {
                                                        r14.b(abstractC0025n);
                                                        abstractC0025n = 0;
                                                    }
                                                    r14.b(lVar2);
                                                }
                                            }
                                            lVar2 = lVar2.f14118f;
                                            abstractC0025n = abstractC0025n;
                                            r14 = r14;
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                }
                                abstractC0025n = AbstractC0017g.e(r14);
                            }
                        }
                        lVar = lVar.f14117e;
                    }
                }
                t5 = t5.t();
                lVar = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
            }
            if (!obj2.f19130a) {
                int i11 = AbstractC2310s.f26525b;
                ViewParent parent = AbstractC0017g.v(rVar).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.shouldDelayChildPressedState()) {
                        z10 = true;
                        break;
                    }
                    parent = viewGroup.getParent();
                }
                z10 = false;
                if (!z10) {
                    z8 = false;
                    if (z8) {
                        long j = AbstractC2310s.f26524a;
                        this.f26454b = 1;
                        if (cc.F.l(j, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            }
            z8 = true;
            if (z8) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = this.f26453a;
                com.bumptech.glide.c.c0(obj);
                rVar.L = kVar;
                return Db.q.f3365a;
            }
            com.bumptech.glide.c.c0(obj);
        }
        kVar = new A.k(this.f26456d);
        this.f26453a = kVar;
        this.f26454b = 2;
        if (this.f26457e.a(kVar, this) == aVar) {
            return aVar;
        }
        rVar.L = kVar;
        return Db.q.f3365a;
    }
}
