package y0;

import java.util.Map;
import u.C2046I;

/* renamed from: y0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2350s implements InterfaceC2317B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2317B f26609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f26610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2317B f26612e;

    public /* synthetic */ C2350s(InterfaceC2317B interfaceC2317B, w wVar, int i7, InterfaceC2317B interfaceC2317B2, int i10) {
        this.f26608a = i10;
        this.f26610c = wVar;
        this.f26611d = i7;
        this.f26612e = interfaceC2317B2;
        this.f26609b = interfaceC2317B;
    }

    @Override // y0.InterfaceC2317B
    public final Map a() {
        switch (this.f26608a) {
            case 0:
                return this.f26609b.a();
            default:
                return this.f26609b.a();
        }
    }

    @Override // y0.InterfaceC2317B
    public final void b() {
        switch (this.f26608a) {
            case 0:
                w wVar = this.f26610c;
                wVar.f26624e = this.f26611d;
                this.f26612e.b();
                C2046I c2046i = wVar.f26631z;
                long[] jArr = c2046i.f24603a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                int i12 = (i7 << 3) + i11;
                                Object obj = c2046i.f24604b[i12];
                                InterfaceC2329N interfaceC2329N = (InterfaceC2329N) c2046i.f24605c[i12];
                                int i13 = wVar.f26617A.i(obj);
                                if (i13 < 0 || i13 >= wVar.f26624e) {
                                    interfaceC2329N.b();
                                    c2046i.k(i12);
                                }
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
                            return;
                        }
                    }
                    if (i7 == length) {
                        return;
                    } else {
                        i7++;
                    }
                }
                break;
            default:
                w wVar2 = this.f26610c;
                wVar2.f26623d = this.f26611d;
                this.f26612e.b();
                wVar2.a(wVar2.f26623d);
                return;
        }
    }

    @Override // y0.InterfaceC2317B
    public final Rb.c c() {
        switch (this.f26608a) {
            case 0:
                return this.f26609b.c();
            default:
                return this.f26609b.c();
        }
    }

    @Override // y0.InterfaceC2317B
    public final int getHeight() {
        switch (this.f26608a) {
            case 0:
                return this.f26609b.getHeight();
            default:
                return this.f26609b.getHeight();
        }
    }

    @Override // y0.InterfaceC2317B
    public final int getWidth() {
        switch (this.f26608a) {
            case 0:
                return this.f26609b.getWidth();
            default:
                return this.f26609b.getWidth();
        }
    }
}
