package W4;

import F.C0257a;
import P4.C0474w;
import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import n5.AbstractC1705a;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* renamed from: W4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589g implements InterfaceC1982j {

    /* renamed from: a, reason: collision with root package name */
    public final X4.h f10692a;

    /* renamed from: b, reason: collision with root package name */
    public final n5.v f10693b;

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f10694c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10695d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10696e;

    /* renamed from: f, reason: collision with root package name */
    public final k f10697f;
    public InterfaceC1984l g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10698h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f10699i;
    public volatile int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f10700l;

    /* renamed from: m, reason: collision with root package name */
    public long f10701m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C0589g(l lVar, int i7) {
        char c10;
        X4.h dVar;
        X4.h hVar;
        this.f10695d = i7;
        String str = lVar.f10722c.f20096z;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                dVar = new X4.d(lVar, 0);
                hVar = dVar;
                break;
            case 1:
                dVar = new X4.e(lVar, 1);
                hVar = dVar;
                break;
            case 2:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                dVar = new X4.c(lVar);
                hVar = dVar;
                break;
            case 3:
                dVar = lVar.f10724e.equals("MP4A-LATM") ? new X4.f(lVar) : new X4.a(lVar);
                hVar = dVar;
                break;
            case 4:
                dVar = new X4.b(lVar);
                hVar = dVar;
                break;
            case 5:
            case '\f':
            case '\r':
                dVar = new X4.i(lVar);
                hVar = dVar;
                break;
            case 6:
                dVar = new C0474w(lVar);
                hVar = dVar;
                break;
            case 7:
                dVar = new X4.e(lVar, 0);
                hVar = dVar;
                break;
            case '\t':
                dVar = new X4.g(lVar);
                hVar = dVar;
                break;
            case '\n':
                dVar = new X4.j(lVar);
                hVar = dVar;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                dVar = new X4.d(lVar, 1);
                hVar = dVar;
                break;
            default:
                hVar = null;
                break;
        }
        hVar.getClass();
        this.f10692a = hVar;
        this.f10693b = new n5.v(65507);
        this.f10694c = new n5.v();
        this.f10696e = new Object();
        this.f10697f = new k();
        this.f10699i = -9223372036854775807L;
        this.j = -1;
        this.f10700l = -9223372036854775807L;
        this.f10701m = -9223372036854775807L;
    }

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        synchronized (this.f10696e) {
            try {
                if (!this.k) {
                    this.k = true;
                }
                this.f10700l = j;
                this.f10701m = j10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, W4.h] */
    @Override // s4.InterfaceC1982j
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        this.g.getClass();
        int D10 = interfaceC1983k.D(this.f10693b.f21229a, 0, 65507);
        if (D10 == -1) {
            return -1;
        }
        if (D10 == 0) {
            return 0;
        }
        this.f10693b.G(0);
        this.f10693b.F(D10);
        n5.v vVar = this.f10693b;
        C0591i c0591i = null;
        if (vVar.a() >= 12) {
            int v10 = vVar.v();
            byte b2 = (byte) (v10 >> 6);
            byte b10 = (byte) (v10 & 15);
            if (b2 == 2) {
                int v11 = vVar.v();
                boolean z8 = ((v11 >> 7) & 1) == 1;
                byte b11 = (byte) (v11 & 127);
                int A10 = vVar.A();
                long w10 = vVar.w();
                int h10 = vVar.h();
                byte[] bArr = C0591i.g;
                if (b10 > 0) {
                    byte[] bArr2 = new byte[b10 * 4];
                    for (int i7 = 0; i7 < b10; i7++) {
                        vVar.f(i7 * 4, bArr2, 4);
                    }
                }
                byte[] bArr3 = new byte[vVar.a()];
                vVar.f(0, bArr3, vVar.a());
                ?? obj = new Object();
                obj.f10707f = bArr;
                obj.f10702a = z8;
                obj.f10703b = b11;
                AbstractC1705a.h(A10 >= 0 && A10 <= 65535);
                obj.f10704c = 65535 & A10;
                obj.f10705d = w10;
                obj.f10706e = h10;
                obj.f10707f = bArr3;
                c0591i = new C0591i(obj);
            }
        }
        if (c0591i == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - 30;
        k kVar = this.f10697f;
        synchronized (kVar) {
            if (kVar.f10716a.size() >= 5000) {
                throw new IllegalStateException("Queue size limit of 5000 reached.");
            }
            int i10 = c0591i.f10710c;
            if (!kVar.f10719d) {
                kVar.d();
                kVar.f10718c = O5.b.y(i10 - 1);
                kVar.f10719d = true;
                kVar.a(new j(c0591i, elapsedRealtime));
            } else if (Math.abs(k.b(i10, C0591i.a(kVar.f10717b))) >= 1000) {
                kVar.f10718c = O5.b.y(i10 - 1);
                kVar.f10716a.clear();
                kVar.a(new j(c0591i, elapsedRealtime));
            } else if (k.b(i10, kVar.f10718c) > 0) {
                kVar.a(new j(c0591i, elapsedRealtime));
            }
        }
        C0591i c10 = this.f10697f.c(j);
        if (c10 == null) {
            return 0;
        }
        if (!this.f10698h) {
            if (this.f10699i == -9223372036854775807L) {
                this.f10699i = c10.f10711d;
            }
            if (this.j == -1) {
                this.j = c10.f10710c;
            }
            this.f10692a.b(this.f10699i);
            this.f10698h = true;
        }
        synchronized (this.f10696e) {
            try {
                if (this.k) {
                    if (this.f10700l != -9223372036854775807L && this.f10701m != -9223372036854775807L) {
                        this.f10697f.d();
                        this.f10692a.a(this.f10700l, this.f10701m);
                        this.k = false;
                        this.f10700l = -9223372036854775807L;
                        this.f10701m = -9223372036854775807L;
                    }
                }
                do {
                    n5.v vVar2 = this.f10694c;
                    byte[] bArr4 = c10.f10713f;
                    vVar2.getClass();
                    vVar2.E(bArr4.length, bArr4);
                    this.f10692a.c(this.f10694c, c10.f10711d, c10.f10710c, c10.f10708a);
                    c10 = this.f10697f.c(j);
                } while (c10 != null);
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f10692a.d(interfaceC1984l, this.f10695d);
        interfaceC1984l.f();
        interfaceC1984l.i(new C1986n(-9223372036854775807L));
        this.g = interfaceC1984l;
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
