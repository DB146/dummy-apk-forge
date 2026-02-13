package Q;

import fc.InterfaceC1162i;
import u.C2047J;
import w.C2190q;

/* loaded from: classes.dex */
public final class P0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public C2047J f8352a;

    /* renamed from: b, reason: collision with root package name */
    public Rb.c f8353b;

    /* renamed from: c, reason: collision with root package name */
    public ec.h f8354c;

    /* renamed from: d, reason: collision with root package name */
    public Q9.a f8355d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8356e;

    /* renamed from: f, reason: collision with root package name */
    public int f8357f;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8358u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2190q f8359v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(C2190q c2190q, Hb.d dVar) {
        super(2, dVar);
        this.f8359v = c2190q;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        P0 p02 = new P0(this.f8359v, dVar);
        p02.f8358u = obj;
        return p02;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        ((P0) create((InterfaceC1162i) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
        return Ib.a.f5345a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c0 A[LOOP:0: B:17:0x00d7->B:25:0x01c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0166 A[EDGE_INSN: B:26:0x0166->B:27:0x0166 BREAK  A[LOOP:0: B:17:0x00d7->B:25:0x01c0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0168 A[Catch: all -> 0x01a9, TRY_LEAVE, TryCatch #5 {all -> 0x01a9, blocks: (B:64:0x00e3, B:66:0x00f6, B:68:0x0102, B:70:0x010c, B:20:0x0157, B:23:0x0161, B:28:0x0168, B:35:0x0180, B:37:0x0189, B:73:0x0125, B:82:0x013c), top: B:63:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01a1 -> B:10:0x01a2). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.P0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
