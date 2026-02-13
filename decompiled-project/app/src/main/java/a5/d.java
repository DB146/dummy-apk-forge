package a5;

import java.util.ArrayDeque;
import java.util.List;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class d extends q4.h implements g {

    /* renamed from: d, reason: collision with root package name */
    public g f12745d;

    /* renamed from: e, reason: collision with root package name */
    public long f12746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12747f;

    /* renamed from: u, reason: collision with root package name */
    public Object f12748u;

    public /* synthetic */ d() {
        this.f12747f = 2;
    }

    public /* synthetic */ d(h hVar, int i7) {
        this.f12747f = i7;
        this.f12748u = hVar;
    }

    @Override // q4.h
    public final void G() {
        switch (this.f12747f) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((R7.c) this.f12748u).f8934e;
                AbstractC1705a.m(arrayDeque.size() < 2);
                AbstractC1705a.h(!arrayDeque.contains(this));
                this.f368b = 0;
                this.f12745d = null;
                arrayDeque.addFirst(this);
                return;
            case 1:
                f fVar = (f) this.f12748u;
                synchronized (fVar.f12752b) {
                    this.f368b = 0;
                    this.f12745d = null;
                    int i7 = fVar.f12758v;
                    fVar.f12758v = i7 + 1;
                    fVar.f12756f[i7] = this;
                    if (!fVar.f12753c.isEmpty() && fVar.f12758v > 0) {
                        fVar.f12752b.notify();
                    }
                }
                return;
            default:
                b5.i iVar = (b5.i) ((Q9.a) this.f12748u).f8707b;
                iVar.getClass();
                this.f368b = 0;
                this.f12745d = null;
                iVar.f13969b.add(this);
                return;
        }
    }

    public final void H(long j, g gVar, long j10) {
        this.f23463c = j;
        this.f12745d = gVar;
        if (j10 != Long.MAX_VALUE) {
            j = j10;
        }
        this.f12746e = j;
    }

    @Override // a5.g
    public final int b(long j) {
        g gVar = this.f12745d;
        gVar.getClass();
        return gVar.b(j - this.f12746e);
    }

    @Override // a5.g
    public final long d(int i7) {
        g gVar = this.f12745d;
        gVar.getClass();
        return gVar.d(i7) + this.f12746e;
    }

    @Override // a5.g
    public final List j(long j) {
        g gVar = this.f12745d;
        gVar.getClass();
        return gVar.j(j - this.f12746e);
    }

    @Override // a5.g
    public final int o() {
        g gVar = this.f12745d;
        gVar.getClass();
        return gVar.o();
    }
}
