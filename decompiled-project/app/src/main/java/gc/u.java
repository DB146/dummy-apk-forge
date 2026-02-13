package gc;

import A0.J;
import A8.H;
import fc.InterfaceC1161h;
import fc.InterfaceC1162i;

/* loaded from: classes2.dex */
public final class u extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public ec.h f17550a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f17551b;

    /* renamed from: c, reason: collision with root package name */
    public int f17552c;

    /* renamed from: d, reason: collision with root package name */
    public int f17553d;

    /* renamed from: e, reason: collision with root package name */
    public int f17554e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f17555f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1161h[] f17556u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J f17557v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H f17558w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162i f17559x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(InterfaceC1161h[] interfaceC1161hArr, J j, H h10, InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        super(2, dVar);
        this.f17556u = interfaceC1161hArr;
        this.f17557v = j;
        this.f17558w = h10;
        this.f17559x = interfaceC1162i;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        H h10 = this.f17558w;
        u uVar = new u(this.f17556u, this.f17557v, h10, this.f17559x, dVar);
        uVar.f17555f = obj;
        return uVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ec.d] */
    /* JADX WARN: Type inference failed for: r11v1, types: [ec.h, ec.t] */
    /* JADX WARN: Type inference failed for: r11v2, types: [ec.h, ec.t] */
    /* JADX WARN: Type inference failed for: r11v4, types: [ec.h] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ea -> B:11:0x0085). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
