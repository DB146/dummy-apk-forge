package P4;

import java.io.IOException;
import m5.HandlerC1602F;

/* loaded from: classes.dex */
public final class Q implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f7908b;

    public Q(T t5, int i7) {
        this.f7908b = t5;
        this.f7907a = i7;
    }

    @Override // P4.d0
    public final void a() {
        T t5 = this.f7908b;
        t5.f7919G[this.f7907a].v();
        int d10 = t5.f7941d.d(t5.f7927P);
        m5.J j = t5.f7948y;
        IOException iOException = j.f20554c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC1602F handlerC1602F = j.f20553b;
        if (handlerC1602F != null) {
            if (d10 == Integer.MIN_VALUE) {
                d10 = handlerC1602F.f20539a;
            }
            IOException iOException2 = handlerC1602F.f20543e;
            if (iOException2 != null && handlerC1602F.f20544f > d10) {
                throw iOException2;
            }
        }
    }

    @Override // P4.d0
    public final boolean b() {
        T t5 = this.f7908b;
        return !t5.E() && t5.f7919G[this.f7907a].t(t5.f7936Y);
    }

    @Override // P4.d0
    public final int f(ha.g gVar, q4.g gVar2, int i7) {
        T t5 = this.f7908b;
        if (t5.E()) {
            return -3;
        }
        int i10 = this.f7907a;
        t5.A(i10);
        int y10 = t5.f7919G[i10].y(gVar, gVar2, i7, t5.f7936Y);
        if (y10 == -3) {
            t5.B(i10);
        }
        return y10;
    }

    @Override // P4.d0
    public final int h(long j) {
        T t5 = this.f7908b;
        if (t5.E()) {
            return 0;
        }
        int i7 = this.f7907a;
        t5.A(i7);
        c0 c0Var = t5.f7919G[i7];
        int q10 = c0Var.q(j, t5.f7936Y);
        c0Var.C(q10);
        if (q10 != 0) {
            return q10;
        }
        t5.B(i7);
        return q10;
    }
}
