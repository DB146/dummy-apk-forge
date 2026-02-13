package m0;

import Db.q;
import j0.n;
import l0.InterfaceC1445d;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532a extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final C1532a f19681b = new C1532a(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1532a f19682c = new C1532a(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19683a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1532a(int i7, int i10) {
        super(i7);
        this.f19683a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f19683a) {
            case 0:
                return q.f3365a;
            default:
                InterfaceC1445d.s((InterfaceC1445d) obj, n.f18552f, 0L, 0.0f, null, 126);
                return q.f3365a;
        }
    }
}
