package jc;

import A8.F;
import Db.q;
import Hb.d;
import Jb.i;
import M1.C0405u;
import Rb.e;
import cc.E;
import java.util.concurrent.CancellationException;
import sb.C2010d;

/* renamed from: jc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1399c extends i implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f18678a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0405u f18680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2010d f18681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399c(C0405u c0405u, C2010d c2010d, d dVar) {
        super(2, dVar);
        this.f18680c = c0405u;
        this.f18681d = c2010d;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        C1399c c1399c = new C1399c(this.f18680c, this.f18681d, dVar);
        c1399c.f18679b = obj;
        return c1399c;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1399c) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        E e2;
        Throwable th;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f18678a;
        C2010d c2010d = this.f18681d;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            E e10 = (E) this.f18679b;
            try {
                C0405u c0405u = this.f18680c;
                F f4 = new F(c2010d, 4);
                this.f18679b = e10;
                this.f18678a = 1;
                if (c0405u.a(f4, this) == aVar) {
                    return aVar;
                }
                e2 = e10;
            } catch (Throwable th2) {
                e2 = e10;
                th = th2;
                if (!(th instanceof CancellationException)) {
                }
                return q.f3365a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e2 = (E) this.f18679b;
            try {
                com.bumptech.glide.c.c0(obj);
            } catch (Throwable th3) {
                th = th3;
                if (!(th instanceof CancellationException)) {
                    c2010d.a();
                } else if (!c2010d.e(th)) {
                    Y6.b.p(e2.l(), th);
                }
                return q.f3365a;
            }
        }
        c2010d.a();
        return q.f3365a;
    }
}
