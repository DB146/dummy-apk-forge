package i3;

import Y5.J0;
import android.os.Build;
import cc.E;
import cc.F;

/* renamed from: i3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339A extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f18314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1340B f18315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3.y f18316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3.o f18317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339A(C1340B c1340b, h3.y yVar, r3.o oVar, Hb.d dVar) {
        super(2, dVar);
        this.f18315b = c1340b;
        this.f18316c = yVar;
        this.f18317d = oVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C1339A(this.f18315b, this.f18316c, this.f18317d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1339A) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f18314a;
        C1340B c1340b = this.f18315b;
        h3.y yVar = this.f18316c;
        q3.p pVar = c1340b.f18318a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            q3.i iVar = c1340b.f18321d;
            this.f18314a = 1;
            String str = r3.m.f23680a;
            boolean z8 = pVar.f23416q;
            Object obj2 = Db.q.f3365a;
            if (z8 && Build.VERSION.SDK_INT < 31) {
                J0 j02 = (J0) iVar.f23385d;
                kotlin.jvm.internal.l.d(j02, "taskExecutor.mainThreadExecutor");
                Object K10 = F.K(F.o(j02), new r3.l(yVar, pVar, this.f18317d, c1340b.f18319b, null), this);
                if (K10 == aVar) {
                    obj2 = K10;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    com.bumptech.glide.c.c0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        String str2 = AbstractC1341C.f18328a;
        h3.z.e().a(str2, "Starting work for " + pVar.f23405c);
        a1.l b2 = yVar.b();
        this.f18314a = 2;
        obj = AbstractC1341C.a(b2, yVar, this);
        return obj == aVar ? aVar : obj;
    }
}
