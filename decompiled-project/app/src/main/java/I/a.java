package I;

import Db.q;
import K0.F;
import Q.C0480b;
import Q.C0506o;
import Rb.e;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class a extends m implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0.m f4946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f4947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4949f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4950u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4951v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4952w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, c0.m mVar, F f4, int i7, boolean z8, int i10, int i11, int i12, int i13) {
        super(2);
        this.f4944a = i13;
        this.f4945b = str;
        this.f4946c = mVar;
        this.f4947d = f4;
        this.f4948e = i7;
        this.f4949f = z8;
        this.f4950u = i10;
        this.f4951v = i11;
        this.f4952w = i12;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4944a) {
            case 0:
                ((Number) obj2).intValue();
                int u3 = C0480b.u(this.f4952w | 1);
                int i7 = this.f4950u;
                int i10 = this.f4951v;
                O5.b.a(this.f4945b, this.f4946c, this.f4947d, this.f4948e, this.f4949f, i7, i10, (C0506o) obj, u3);
                return q.f3365a;
            default:
                ((Number) obj2).intValue();
                int u10 = C0480b.u(this.f4952w | 1);
                boolean z8 = this.f4949f;
                int i11 = this.f4950u;
                O5.b.b(this.f4945b, this.f4946c, this.f4947d, this.f4948e, z8, i11, this.f4951v, (C0506o) obj, u10);
                return q.f3365a;
        }
    }
}
