package A8;

import M1.InterfaceC0394i;
import android.content.Context;
import j8.InterfaceC1387b;
import t8.C2034c;

/* renamed from: A8.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049m implements D8.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f700a;

    /* renamed from: b, reason: collision with root package name */
    public final Cb.a f701b;

    public /* synthetic */ C0049m(Cb.a aVar, int i7) {
        this.f700a = i7;
        this.f701b = aVar;
    }

    @Override // Cb.a
    public final Object get() {
        Cb.a aVar = this.f701b;
        switch (this.f700a) {
            case 0:
                return new C0048l((InterfaceC1387b) ((D8.c) aVar).f3288a);
            case 1:
                Y6.i firebaseApp = (Y6.i) ((D8.c) aVar).f3288a;
                kotlin.jvm.internal.l.e(firebaseApp, "firebaseApp");
                S s3 = S.f580a;
                return S.a(firebaseApp);
            case 2:
                Context appContext = (Context) ((D8.c) aVar).f3288a;
                kotlin.jvm.internal.l.e(appContext, "appContext");
                return Q1.f.a(new C2034c(C0053q.f711b), new r(appContext, 0));
            case 3:
                Context appContext2 = (Context) ((D8.c) aVar).f3288a;
                kotlin.jvm.internal.l.e(appContext2, "appContext");
                return Q1.f.a(new C2034c(C0053q.f712c), new r(appContext2, 1));
            case 4:
                return new i0((Context) ((D8.c) aVar).f3288a);
            case 5:
                return new E8.a((Context) ((D8.c) aVar).f3288a);
            default:
                return new E8.n((InterfaceC0394i) aVar.get());
        }
    }
}
