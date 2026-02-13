package x;

import Q.C0479a0;
import Q.C0480b;
import mc.C1659d;

/* loaded from: classes.dex */
public final class F extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public C1659d f25914a;

    /* renamed from: b, reason: collision with root package name */
    public O f25915b;

    /* renamed from: c, reason: collision with root package name */
    public int f25916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f25917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f25919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Hb.d dVar, Object obj, O o10, i0 i0Var) {
        super(2, dVar);
        this.f25917d = o10;
        this.f25918e = obj;
        this.f25919f = i0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new F(dVar, this.f25918e, this.f25917d, this.f25919f);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7 A[RETURN] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1659d c1659d;
        O o10;
        Object P10;
        D d10;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25916c;
        Db.q qVar = Db.q.f3365a;
        Object obj2 = this.f25918e;
        O o11 = this.f25917d;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                Object value = o11.f25964b.getValue();
                if (!obj2.equals(value)) {
                    O.K(o11);
                    o11.T(0.0f);
                    i0 i0Var = this.f25919f;
                    i0Var.p(obj2);
                    i0Var.n(0L);
                    o11.D(value);
                    o11.f25964b.setValue(obj2);
                }
                c1659d = o11.f25972x;
                this.f25914a = c1659d;
                this.f25915b = o11;
                this.f25916c = 1;
                if (c1659d.n(this) == aVar) {
                    return aVar;
                }
                o10 = o11;
            } else {
                if (i7 != 1) {
                    if (i7 == 2) {
                        com.bumptech.glide.c.c0(obj);
                        this.f25916c = 3;
                        if (O.O(o11, this) == aVar) {
                            return aVar;
                        }
                        if (!kotlin.jvm.internal.l.a(o11.f25965c.getValue(), obj2)) {
                        }
                        return qVar;
                    }
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.c.c0(obj);
                            o11.T(0.0f);
                            return qVar;
                        }
                        com.bumptech.glide.c.c0(obj);
                        o11.D(obj2);
                        this.f25916c = 5;
                        if (O.N(o11, this) == aVar) {
                            return aVar;
                        }
                        o11.T(0.0f);
                        return qVar;
                    }
                    com.bumptech.glide.c.c0(obj);
                    if (!kotlin.jvm.internal.l.a(o11.f25965c.getValue(), obj2)) {
                        C0479a0 c0479a0 = o11.f25970v;
                        if (c0479a0.e() < 1.0f && ((d10 = o11.f25960B) == null || !kotlin.jvm.internal.l.a(null, d10.f25906b))) {
                            s0 s0Var = d10 != null ? d10.f25906b : null;
                            C2239i c2239i = O.f25958G;
                            C2239i c2239i2 = O.f25957F;
                            if (s0Var != null) {
                                long j = d10.f25905a;
                                C2239i c2239i3 = d10.f25910f;
                                c2239i2 = (C2239i) s0Var.d(j, d10.f25909e, c2239i, c2239i3 == null ? c2239i2 : c2239i3);
                            } else if (d10 != null && d10.f25905a != 0) {
                                long j10 = d10.g;
                                if (j10 == Long.MIN_VALUE) {
                                    j10 = o11.f25968f;
                                }
                                float f4 = ((float) j10) / 1.0E9f;
                                if (f4 > 0.0f) {
                                    c2239i2 = new C2239i(1.0f / f4);
                                }
                            }
                            if (d10 == null) {
                                d10 = new D();
                            }
                            d10.f25906b = null;
                            d10.f25907c = false;
                            d10.f25908d = c0479a0.e();
                            d10.f25909e.e(0, c0479a0.e());
                            long j11 = o11.f25968f;
                            d10.g = j11;
                            d10.f25905a = 0L;
                            d10.f25910f = c2239i2;
                            d10.f25911h = Tb.a.G((1.0d - c0479a0.e()) * j11);
                            o11.f25960B = d10;
                        }
                        this.f25914a = null;
                        this.f25915b = null;
                        this.f25916c = 4;
                        if (O.M(o11, this) == aVar) {
                            return aVar;
                        }
                        o11.D(obj2);
                        this.f25916c = 5;
                        if (O.N(o11, this) == aVar) {
                        }
                        o11.T(0.0f);
                    }
                    return qVar;
                }
                o10 = this.f25915b;
                c1659d = this.f25914a;
                com.bumptech.glide.c.c0(obj);
            }
            Object obj3 = o10.f25966d;
            c1659d.l(null);
            if (!obj2.equals(obj3)) {
                this.f25914a = null;
                this.f25915b = null;
                this.f25916c = 2;
                if (o11.f25974z != Long.MIN_VALUE ? (P10 = o11.P(this)) != aVar : (P10 = C0480b.m(getContext()).n(o11.f25961C, this)) != aVar) {
                    P10 = qVar;
                }
                if (P10 == aVar) {
                    return aVar;
                }
                this.f25916c = 3;
                if (O.O(o11, this) == aVar) {
                }
            }
            if (!kotlin.jvm.internal.l.a(o11.f25965c.getValue(), obj2)) {
            }
            return qVar;
        } catch (Throwable th) {
            c1659d.l(null);
            throw th;
        }
    }
}
