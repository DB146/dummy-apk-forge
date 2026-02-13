package P4;

import W4.C0591i;
import java.util.Locale;
import n5.AbstractC1705a;
import s4.InterfaceC1984l;

/* renamed from: P4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474w implements X4.h {

    /* renamed from: a, reason: collision with root package name */
    public int f8150a;

    /* renamed from: b, reason: collision with root package name */
    public long f8151b;

    /* renamed from: c, reason: collision with root package name */
    public int f8152c;

    /* renamed from: d, reason: collision with root package name */
    public long f8153d;

    /* renamed from: e, reason: collision with root package name */
    public int f8154e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8155f;

    /* renamed from: u, reason: collision with root package name */
    public Object f8156u;

    public C0474w(int i7, int i10, m4.L l10, int i11, Object obj, long j, long j10) {
        this.f8150a = i7;
        this.f8152c = i10;
        this.f8155f = l10;
        this.f8154e = i11;
        this.f8156u = obj;
        this.f8151b = j;
        this.f8153d = j10;
    }

    public C0474w(W4.l lVar) {
        this.f8155f = lVar;
        this.f8151b = -9223372036854775807L;
        this.f8152c = -1;
    }

    @Override // X4.h
    public void a(long j, long j10) {
        this.f8151b = j;
        this.f8153d = j10;
        this.f8154e = 0;
    }

    @Override // X4.h
    public void b(long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if ((r24.e() >> 6) == 0) goto L24;
     */
    @Override // X4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(n5.v vVar, long j, int i7, boolean z8) {
        int a9;
        int i10 = 1;
        AbstractC1705a.n((s4.v) this.f8156u);
        int i11 = this.f8152c;
        if (i11 != -1 && i7 != (a9 = C0591i.a(i11))) {
            int i12 = n5.D.f21141a;
            Locale locale = Locale.US;
            AbstractC1705a.S("RtpMpeg4Reader", A3.c.e(a9, i7, "Received RTP packet with unexpected sequence number. Expected: ", "; received: ", ". Dropping packet."));
        }
        int a10 = vVar.a();
        ((s4.v) this.f8156u).c(a10, vVar);
        if (this.f8154e == 0) {
            byte[] bArr = vVar.f21229a;
            byte[] bArr2 = {0, 0, 1, -74};
            Q5.e.m(bArr, "array");
            int i13 = 0;
            loop0: while (true) {
                if (i13 >= bArr.length - 3) {
                    i13 = -1;
                    break;
                }
                for (int i14 = 0; i14 < 4; i14++) {
                    if (bArr[i13 + i14] != bArr2[i14]) {
                        break;
                    }
                }
                break loop0;
                i13++;
            }
            if (i13 != -1) {
                vVar.G(i13 + 4);
            }
            i10 = 0;
            this.f8150a = i10;
        }
        this.f8154e += a10;
        if (z8) {
            if (this.f8151b == -9223372036854775807L) {
                this.f8151b = j;
            }
            ((s4.v) this.f8156u).e(Z9.x.U(this.f8153d, j, this.f8151b, 90000), this.f8150a, this.f8154e, 0, null);
            this.f8154e = 0;
        }
        this.f8152c = i7;
    }

    @Override // X4.h
    public void d(InterfaceC1984l interfaceC1984l, int i7) {
        s4.v u3 = interfaceC1984l.u(i7, 2);
        this.f8156u = u3;
        int i10 = n5.D.f21141a;
        u3.a(((W4.l) this.f8155f).f10722c);
    }
}
