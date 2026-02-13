package androidx.work;

import E6.b;
import Hb.g;
import android.content.Context;
import cc.C0943l0;
import cc.F;
import h3.C1244f;
import h3.C1245g;
import h3.C1246h;
import h3.y;
import kotlin.jvm.internal.l;
import q3.f;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends y {

    /* renamed from: e, reason: collision with root package name */
    public final WorkerParameters f13731e;

    /* renamed from: f, reason: collision with root package name */
    public final C1244f f13732f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        l.e(appContext, "appContext");
        l.e(params, "params");
        this.f13731e = params;
        this.f13732f = C1244f.f17690c;
    }

    @Override // h3.y
    public final a1.l a() {
        C0943l0 c10 = F.c();
        C1244f c1244f = this.f13732f;
        c1244f.getClass();
        return f.t(b.w(c1244f, c10), new C1245g(this, null));
    }

    @Override // h3.y
    public final a1.l b() {
        C1244f c1244f = C1244f.f17690c;
        g gVar = this.f13732f;
        if (l.a(gVar, c1244f)) {
            gVar = this.f13731e.f13736d;
        }
        l.d(gVar, "if (coroutineContext != …rkerContext\n            }");
        return f.t(b.w(gVar, F.c()), new C1246h(this, null));
    }

    public abstract Object c(C1246h c1246h);
}
