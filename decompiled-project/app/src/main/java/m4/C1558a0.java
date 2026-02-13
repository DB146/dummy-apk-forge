package m4;

import ha.C1265a;
import java.util.Collections;

/* renamed from: m4.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1558a0 implements InterfaceC1569g {

    /* renamed from: A, reason: collision with root package name */
    public static final String f20215A;

    /* renamed from: B, reason: collision with root package name */
    public static final C1265a f20216B;

    /* renamed from: u, reason: collision with root package name */
    public static final C1558a0 f20217u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f20218v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f20219w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f20220x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f20221y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f20222z;

    /* renamed from: a, reason: collision with root package name */
    public final String f20223a;

    /* renamed from: b, reason: collision with root package name */
    public final V f20224b;

    /* renamed from: c, reason: collision with root package name */
    public final U f20225c;

    /* renamed from: d, reason: collision with root package name */
    public final C1562c0 f20226d;

    /* renamed from: e, reason: collision with root package name */
    public final S f20227e;

    /* renamed from: f, reason: collision with root package name */
    public final W f20228f;

    /* JADX WARN: Type inference failed for: r4v0, types: [m4.Q, m4.S] */
    static {
        P p10 = new P();
        N6.F f4 = N6.H.f7232b;
        N6.t0 t0Var = N6.t0.f7341e;
        Collections.emptyList();
        N6.t0 t0Var2 = N6.t0.f7341e;
        f20217u = new C1558a0("", new Q(p10), null, new U(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C1562c0.f20268W, W.f20184c);
        int i7 = n5.D.f21141a;
        f20218v = Integer.toString(0, 36);
        f20219w = Integer.toString(1, 36);
        f20220x = Integer.toString(2, 36);
        f20221y = Integer.toString(3, 36);
        f20222z = Integer.toString(4, 36);
        f20215A = Integer.toString(5, 36);
        f20216B = new C1265a(17);
    }

    public C1558a0(String str, S s3, V v10, U u3, C1562c0 c1562c0, W w10) {
        this.f20223a = str;
        this.f20224b = v10;
        this.f20225c = u3;
        this.f20226d = c1562c0;
        this.f20227e = s3;
        this.f20228f = w10;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T4.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, m4.P] */
    public final L7.j a() {
        L7.j jVar = new L7.j(1);
        jVar.f6359e = new P();
        jVar.f6360f = new S2.b();
        jVar.g = Collections.emptyList();
        jVar.f6362i = N6.t0.f7341e;
        ?? obj = new Object();
        obj.f9310a = -9223372036854775807L;
        obj.f9311b = -9223372036854775807L;
        obj.f9312c = -9223372036854775807L;
        obj.f9313d = -3.4028235E38f;
        obj.f9314e = -3.4028235E38f;
        jVar.f6363l = obj;
        jVar.f6364m = W.f20184c;
        ?? obj2 = new Object();
        S s3 = this.f20227e;
        obj2.f20122a = s3.f20134a;
        obj2.f20123b = s3.f20135b;
        obj2.f20124c = s3.f20136c;
        obj2.f20125d = s3.f20137d;
        obj2.f20126e = s3.f20138e;
        jVar.f6359e = obj2;
        jVar.f6356b = this.f20223a;
        jVar.k = this.f20226d;
        jVar.f6363l = this.f20225c.a();
        jVar.f6364m = this.f20228f;
        V v10 = this.f20224b;
        if (v10 != null) {
            jVar.f6361h = v10.f20182f;
            jVar.f6358d = v10.f20178b;
            jVar.f6357c = v10.f20177a;
            jVar.g = v10.f20181e;
            jVar.f6362i = v10.f20183u;
            T t5 = v10.f20179c;
            jVar.f6360f = t5 != null ? t5.a() : new S2.b();
            jVar.j = v10.f20180d;
        }
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1558a0)) {
            return false;
        }
        C1558a0 c1558a0 = (C1558a0) obj;
        return n5.D.a(this.f20223a, c1558a0.f20223a) && this.f20227e.equals(c1558a0.f20227e) && n5.D.a(this.f20224b, c1558a0.f20224b) && n5.D.a(this.f20225c, c1558a0.f20225c) && n5.D.a(this.f20226d, c1558a0.f20226d) && n5.D.a(this.f20228f, c1558a0.f20228f);
    }

    public final int hashCode() {
        int hashCode = this.f20223a.hashCode() * 31;
        V v10 = this.f20224b;
        return this.f20228f.hashCode() + ((this.f20226d.hashCode() + ((this.f20227e.hashCode() + ((this.f20225c.hashCode() + ((hashCode + (v10 != null ? v10.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
