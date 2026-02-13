package C4;

import java.util.Collections;
import java.util.List;
import m4.K;
import n5.AbstractC1705a;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2738a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2739b;

    /* renamed from: c, reason: collision with root package name */
    public long f2740c;

    /* renamed from: d, reason: collision with root package name */
    public int f2741d;

    /* renamed from: e, reason: collision with root package name */
    public int f2742e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2743f;
    public Object g;

    public h() {
        this.f2738a = 1;
        this.f2743f = new n5.v(10);
        this.f2740c = -9223372036854775807L;
    }

    public h(List list) {
        this.f2738a = 0;
        this.f2743f = list;
        this.g = new s4.v[list.size()];
        this.f2740c = -9223372036854775807L;
    }

    @Override // C4.i
    public final void a() {
        switch (this.f2738a) {
            case 0:
                this.f2739b = false;
                this.f2740c = -9223372036854775807L;
                return;
            default:
                this.f2739b = false;
                this.f2740c = -9223372036854775807L;
                return;
        }
    }

    @Override // C4.i
    public final void b(n5.v vVar) {
        boolean z8;
        boolean z10;
        switch (this.f2738a) {
            case 0:
                if (this.f2739b) {
                    if (this.f2741d == 2) {
                        if (vVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (vVar.v() != 32) {
                                this.f2739b = false;
                            }
                            this.f2741d--;
                            z10 = this.f2739b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    if (this.f2741d == 1) {
                        if (vVar.a() == 0) {
                            z8 = false;
                        } else {
                            if (vVar.v() != 0) {
                                this.f2739b = false;
                            }
                            this.f2741d--;
                            z8 = this.f2739b;
                        }
                        if (!z8) {
                            return;
                        }
                    }
                    int i7 = vVar.f21230b;
                    int a9 = vVar.a();
                    for (s4.v vVar2 : (s4.v[]) this.g) {
                        vVar.G(i7);
                        vVar2.c(a9, vVar);
                    }
                    this.f2742e += a9;
                    return;
                }
                return;
            default:
                AbstractC1705a.n((s4.v) this.g);
                if (this.f2739b) {
                    int a10 = vVar.a();
                    int i10 = this.f2742e;
                    if (i10 < 10) {
                        int min = Math.min(a10, 10 - i10);
                        byte[] bArr = vVar.f21229a;
                        int i11 = vVar.f21230b;
                        n5.v vVar3 = (n5.v) this.f2743f;
                        System.arraycopy(bArr, i11, vVar3.f21229a, this.f2742e, min);
                        if (this.f2742e + min == 10) {
                            vVar3.G(0);
                            if (73 != vVar3.v() || 68 != vVar3.v() || 51 != vVar3.v()) {
                                AbstractC1705a.S("Id3Reader", "Discarding invalid ID3 tag");
                                this.f2739b = false;
                                return;
                            } else {
                                vVar3.H(3);
                                this.f2741d = vVar3.u() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.f2741d - this.f2742e);
                    ((s4.v) this.g).c(min2, vVar);
                    this.f2742e += min2;
                    return;
                }
                return;
        }
    }

    @Override // C4.i
    public final void c(int i7, long j) {
        switch (this.f2738a) {
            case 0:
                if ((i7 & 4) == 0) {
                    return;
                }
                this.f2739b = true;
                if (j != -9223372036854775807L) {
                    this.f2740c = j;
                }
                this.f2742e = 0;
                this.f2741d = 2;
                return;
            default:
                if ((i7 & 4) == 0) {
                    return;
                }
                this.f2739b = true;
                if (j != -9223372036854775807L) {
                    this.f2740c = j;
                }
                this.f2741d = 0;
                this.f2742e = 0;
                return;
        }
    }

    @Override // C4.i
    public final void d() {
        int i7;
        switch (this.f2738a) {
            case 0:
                if (this.f2739b) {
                    if (this.f2740c != -9223372036854775807L) {
                        for (s4.v vVar : (s4.v[]) this.g) {
                            vVar.e(this.f2740c, 1, this.f2742e, 0, null);
                        }
                    }
                    this.f2739b = false;
                    return;
                }
                return;
            default:
                AbstractC1705a.n((s4.v) this.g);
                if (this.f2739b && (i7 = this.f2741d) != 0 && this.f2742e == i7) {
                    long j = this.f2740c;
                    if (j != -9223372036854775807L) {
                        ((s4.v) this.g).e(j, 1, i7, 0, null);
                    }
                    this.f2739b = false;
                    return;
                }
                return;
        }
    }

    @Override // C4.i
    public final void e(InterfaceC1984l interfaceC1984l, F f4) {
        switch (this.f2738a) {
            case 0:
                int i7 = 0;
                while (true) {
                    s4.v[] vVarArr = (s4.v[]) this.g;
                    if (i7 >= vVarArr.length) {
                        return;
                    }
                    E e2 = (E) ((List) this.f2743f).get(i7);
                    f4.a();
                    f4.b();
                    s4.v u3 = interfaceC1984l.u(f4.f2683d, 3);
                    K k = new K();
                    f4.b();
                    k.f19976a = f4.f2684e;
                    k.k = "application/dvbsubs";
                    k.f19985m = Collections.singletonList(e2.f2679b);
                    k.f19978c = e2.f2678a;
                    h3.o.w(k, u3);
                    vVarArr[i7] = u3;
                    i7++;
                }
            default:
                f4.a();
                f4.b();
                s4.v u10 = interfaceC1984l.u(f4.f2683d, 5);
                this.g = u10;
                K k7 = new K();
                f4.b();
                k7.f19976a = f4.f2684e;
                k7.k = "application/id3";
                h3.o.w(k7, u10);
                return;
        }
    }
}
