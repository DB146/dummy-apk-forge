package d;

import Db.q;
import Q.C0480b;
import Q.C0506o;
import c2.i;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class h extends m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.e f16296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z8, Rb.e eVar, int i7) {
        super(2);
        this.f16295a = z8;
        this.f16296b = eVar;
        this.f16297c = i7;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int u3 = C0480b.u(this.f16297c | 1);
        i.c(this.f16295a, this.f16296b, (C0506o) obj, u3);
        return q.f3365a;
    }
}
