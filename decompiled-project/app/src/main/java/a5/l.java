package a5;

import N6.H;
import N6.t0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b5.C0843c;
import c5.C0907a;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import d5.C1051b;
import f5.C1135a;
import g5.C1198a;
import i5.C1347a;
import java.util.List;
import m4.AbstractC1565e;
import m4.C1549C;
import m4.L;
import m4.SurfaceHolderCallbackC1596z;
import n5.AbstractC1705a;
import n5.D;
import n5.o;

/* loaded from: classes.dex */
public final class l extends AbstractC1565e implements Handler.Callback {

    /* renamed from: C, reason: collision with root package name */
    public final Handler f12765C;

    /* renamed from: D, reason: collision with root package name */
    public final SurfaceHolderCallbackC1596z f12766D;

    /* renamed from: E, reason: collision with root package name */
    public final j f12767E;

    /* renamed from: F, reason: collision with root package name */
    public final ha.g f12768F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f12769G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12770H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f12771I;

    /* renamed from: J, reason: collision with root package name */
    public int f12772J;

    /* renamed from: K, reason: collision with root package name */
    public L f12773K;
    public h L;

    /* renamed from: M, reason: collision with root package name */
    public k f12774M;

    /* renamed from: N, reason: collision with root package name */
    public d f12775N;

    /* renamed from: O, reason: collision with root package name */
    public d f12776O;

    /* renamed from: P, reason: collision with root package name */
    public int f12777P;

    /* renamed from: Q, reason: collision with root package name */
    public long f12778Q;

    /* renamed from: R, reason: collision with root package name */
    public long f12779R;

    /* renamed from: S, reason: collision with root package name */
    public long f12780S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z, Looper looper) {
        super(3);
        Handler handler;
        j jVar = j.f12763a;
        this.f12766D = surfaceHolderCallbackC1596z;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = D.f21141a;
            handler = new Handler(looper, this);
        }
        this.f12765C = handler;
        this.f12767E = jVar;
        this.f12768F = new ha.g(3, false);
        this.f12778Q = -9223372036854775807L;
        this.f12779R = -9223372036854775807L;
        this.f12780S = -9223372036854775807L;
    }

    @Override // m4.AbstractC1565e
    public final int A(L l10) {
        this.f12767E.getClass();
        String str = l10.f20096z;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return AbstractC1565e.e(l10.f20083U == 0 ? 4 : 2, 0, 0);
        }
        return o.k(l10.f20096z) ? AbstractC1565e.e(1, 0, 0) : AbstractC1565e.e(0, 0, 0);
    }

    public final long C() {
        if (this.f12777P == -1) {
            return Long.MAX_VALUE;
        }
        this.f12775N.getClass();
        if (this.f12777P >= this.f12775N.o()) {
            return Long.MAX_VALUE;
        }
        return this.f12775N.d(this.f12777P);
    }

    public final long D(long j) {
        AbstractC1705a.m(j != -9223372036854775807L);
        AbstractC1705a.m(this.f12779R != -9223372036854775807L);
        return j - this.f12779R;
    }

    public final void E(c cVar) {
        H h10 = cVar.f12744a;
        SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = this.f12766D;
        surfaceHolderCallbackC1596z.f20525a.f19877z.e(27, new Kc.a(1, h10));
        C1549C c1549c = surfaceHolderCallbackC1596z.f20525a;
        c1549c.f19864r0 = cVar;
        c1549c.f19877z.e(27, new Q9.a(cVar, 21));
    }

    public final void F() {
        this.f12774M = null;
        this.f12777P = -1;
        d dVar = this.f12775N;
        if (dVar != null) {
            dVar.G();
            this.f12775N = null;
        }
        d dVar2 = this.f12776O;
        if (dVar2 != null) {
            dVar2.G();
            this.f12776O = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        E((c) message.obj);
        return true;
    }

    @Override // m4.AbstractC1565e
    public final String j() {
        return "TextRenderer";
    }

    @Override // m4.AbstractC1565e
    public final boolean l() {
        return this.f12770H;
    }

    @Override // m4.AbstractC1565e
    public final boolean m() {
        return true;
    }

    @Override // m4.AbstractC1565e
    public final void n() {
        this.f12773K = null;
        this.f12778Q = -9223372036854775807L;
        c cVar = new c(D(this.f12780S), t0.f7341e);
        Handler handler = this.f12765C;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            E(cVar);
        }
        this.f12779R = -9223372036854775807L;
        this.f12780S = -9223372036854775807L;
        F();
        h hVar = this.L;
        hVar.getClass();
        hVar.release();
        this.L = null;
        this.f12772J = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
    
        if (r6.equals("application/pgs") == false) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00e8. Please report as an issue. */
    @Override // m4.AbstractC1565e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(long j, boolean z8) {
        h c0907a;
        h c1051b;
        char c10 = 1;
        this.f12780S = j;
        c cVar = new c(D(this.f12780S), t0.f7341e);
        Handler handler = this.f12765C;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            E(cVar);
        }
        this.f12769G = false;
        this.f12770H = false;
        this.f12778Q = -9223372036854775807L;
        if (this.f12772J == 0) {
            F();
            h hVar = this.L;
            hVar.getClass();
            hVar.flush();
            return;
        }
        F();
        h hVar2 = this.L;
        hVar2.getClass();
        hVar2.release();
        this.L = null;
        this.f12772J = 0;
        this.f12771I = true;
        L l10 = this.f12773K;
        l10.getClass();
        this.f12767E.getClass();
        String str = l10.f20096z;
        if (str != null) {
            int i7 = l10.f20080R;
            List list = l10.f20065B;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1248334819:
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = 11;
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
                    c0907a = new C0907a(list);
                    c1051b = c0907a;
                    this.L = c1051b;
                    return;
                case 1:
                    c1051b = new C1051b();
                    this.L = c1051b;
                    return;
                case 2:
                    c1051b = new C0907a();
                    this.L = c1051b;
                    return;
                case 3:
                    c1051b = new j5.i();
                    this.L = c1051b;
                    return;
                case 4:
                    c0907a = new C1347a(list);
                    c1051b = c0907a;
                    this.L = c1051b;
                    return;
                case 5:
                    c0907a = new C1135a(list);
                    c1051b = c0907a;
                    this.L = c1051b;
                    return;
                case 6:
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    c1051b = new C0843c(str, i7);
                    this.L = c1051b;
                    return;
                case 7:
                    c1051b = new R7.c();
                    this.L = c1051b;
                    return;
                case '\t':
                    c0907a = new b5.g(i7, list);
                    c1051b = c0907a;
                    this.L = c1051b;
                    return;
                case '\n':
                    c1051b = new C1198a();
                    this.L = c1051b;
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    c1051b = new h5.d();
                    this.L = c1051b;
                    return;
            }
        }
        throw new IllegalArgumentException(X.c.t("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b5, code lost:
    
        if (r5.equals("application/dvbsubs") == false) goto L9;
     */
    @Override // m4.AbstractC1565e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(L[] lArr, long j, long j10) {
        h c0907a;
        h c1051b;
        this.f12779R = j10;
        char c10 = 0;
        L l10 = lArr[0];
        this.f12773K = l10;
        if (this.L != null) {
            this.f12772J = 1;
            return;
        }
        this.f12771I = true;
        l10.getClass();
        this.f12767E.getClass();
        String str = l10.f20096z;
        if (str != null) {
            int i7 = l10.f20080R;
            List list = l10.f20065B;
            switch (str.hashCode()) {
                case -1351681404:
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = 11;
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
                    c0907a = new C0907a(list);
                    break;
                case 1:
                    c1051b = new C1051b();
                    this.L = c1051b;
                    return;
                case 2:
                    c1051b = new C0907a();
                    this.L = c1051b;
                    return;
                case 3:
                    c1051b = new j5.i();
                    this.L = c1051b;
                    return;
                case 4:
                    c0907a = new C1347a(list);
                    break;
                case 5:
                    c0907a = new C1135a(list);
                    break;
                case 6:
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    c1051b = new C0843c(str, i7);
                    this.L = c1051b;
                    return;
                case 7:
                    c1051b = new R7.c();
                    this.L = c1051b;
                    return;
                case '\t':
                    c0907a = new b5.g(i7, list);
                    break;
                case '\n':
                    c1051b = new C1198a();
                    this.L = c1051b;
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    c1051b = new h5.d();
                    this.L = c1051b;
                    return;
            }
            c1051b = c0907a;
            this.L = c1051b;
            return;
        }
        throw new IllegalArgumentException(X.c.t("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x056e, code lost:
    
        if (r11.equals(r9) == false) goto L271;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:179:0x0574. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0157. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x040e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x040f A[EXC_TOP_SPLITTER, LOOP:1: B:127:0x040f->B:150:0x040f, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0407  */
    @Override // m4.AbstractC1565e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j, long j10) {
        boolean z8;
        boolean z10;
        j jVar;
        String str;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i7;
        int i10;
        String str3;
        int i11;
        h c0907a;
        h c1051b;
        Object obj5;
        long j11;
        long d10;
        char c10;
        char c11;
        h c0907a2;
        char c12;
        h c0907a3;
        h c1051b2;
        ha.g gVar = this.f12768F;
        this.f12780S = j;
        if (this.f20363z) {
            long j12 = this.f12778Q;
            if (j12 != -9223372036854775807L && j >= j12) {
                F();
                this.f12770H = true;
            }
        }
        if (this.f12770H) {
            return;
        }
        d dVar = this.f12776O;
        j jVar2 = this.f12767E;
        Handler handler = this.f12765C;
        if (dVar == null) {
            h hVar = this.L;
            hVar.getClass();
            hVar.e(j);
            try {
                h hVar2 = this.L;
                hVar2.getClass();
                this.f12776O = (d) hVar2.f();
            } catch (i e2) {
                AbstractC1705a.u("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f12773K, e2);
                c cVar = new c(D(this.f12780S), t0.f7341e);
                if (handler != null) {
                    handler.obtainMessage(0, cVar).sendToTarget();
                } else {
                    E(cVar);
                }
                F();
                h hVar3 = this.L;
                hVar3.getClass();
                hVar3.release();
                this.L = null;
                this.f12772J = 0;
                this.f12771I = true;
                L l10 = this.f12773K;
                l10.getClass();
                jVar2.getClass();
                String str4 = l10.f20096z;
                if (str4 != null) {
                    int i12 = l10.f20080R;
                    List list = l10.f20065B;
                    switch (str4.hashCode()) {
                        case -1351681404:
                            if (str4.equals("application/dvbsubs")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1248334819:
                            if (str4.equals("application/pgs")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1026075066:
                            if (str4.equals("application/x-mp4-vtt")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1004728940:
                            if (str4.equals("text/vtt")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 691401887:
                            if (str4.equals("application/x-quicktime-tx3g")) {
                                c12 = 4;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 822864842:
                            if (str4.equals("text/x-ssa")) {
                                c12 = 5;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 930165504:
                            if (str4.equals("application/x-mp4-cea-608")) {
                                c12 = 6;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1201784583:
                            if (str4.equals("text/x-exoplayer-cues")) {
                                c12 = 7;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1566015601:
                            if (str4.equals("application/cea-608")) {
                                c12 = '\b';
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1566016562:
                            if (str4.equals("application/cea-708")) {
                                c12 = '\t';
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1668750253:
                            if (str4.equals("application/x-subrip")) {
                                c12 = '\n';
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1693976202:
                            if (str4.equals("application/ttml+xml")) {
                                c12 = 11;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            c0907a3 = new C0907a(list);
                            c1051b2 = c0907a3;
                            this.L = c1051b2;
                            return;
                        case 1:
                            c1051b2 = new C1051b();
                            this.L = c1051b2;
                            return;
                        case 2:
                            c1051b2 = new C0907a();
                            this.L = c1051b2;
                            return;
                        case 3:
                            c1051b2 = new j5.i();
                            this.L = c1051b2;
                            return;
                        case 4:
                            c0907a3 = new C1347a(list);
                            c1051b2 = c0907a3;
                            this.L = c1051b2;
                            return;
                        case 5:
                            c0907a3 = new C1135a(list);
                            c1051b2 = c0907a3;
                            this.L = c1051b2;
                            return;
                        case 6:
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            c1051b2 = new C0843c(str4, i12);
                            this.L = c1051b2;
                            return;
                        case 7:
                            c1051b2 = new R7.c();
                            this.L = c1051b2;
                            return;
                        case '\t':
                            c0907a3 = new b5.g(i12, list);
                            c1051b2 = c0907a3;
                            this.L = c1051b2;
                            return;
                        case '\n':
                            c1051b2 = new C1198a();
                            this.L = c1051b2;
                            return;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            c1051b2 = new h5.d();
                            this.L = c1051b2;
                            return;
                    }
                }
                throw new IllegalArgumentException(X.c.t("Attempted to create decoder for unsupported MIME type: ", str4));
            }
        }
        Object obj6 = "application/pgs";
        Object obj7 = "application/x-mp4-vtt";
        if (this.f20358u != 2) {
            return;
        }
        if (this.f12775N != null) {
            long C2 = C();
            z8 = false;
            while (C2 <= j) {
                this.f12777P++;
                C2 = C();
                z8 = true;
            }
        } else {
            z8 = false;
        }
        d dVar2 = this.f12776O;
        if (dVar2 != null) {
            str = "Subtitle decoding failed. streamFormat=";
            if (!dVar2.i(4)) {
                z10 = z8;
                jVar = jVar2;
                str2 = "Attempted to create decoder for unsupported MIME type: ";
                obj = "application/dvbsubs";
                obj2 = "text/vtt";
                obj3 = "application/x-mp4-cea-608";
                if (dVar2.f23463c <= j) {
                    d dVar3 = this.f12775N;
                    if (dVar3 != null) {
                        dVar3.G();
                    }
                    this.f12777P = dVar2.b(j);
                    this.f12775N = dVar2;
                    this.f12776O = null;
                    z10 = true;
                }
                if (z10) {
                }
                if (this.f12772J == 2) {
                }
            } else {
                if (!z8 && C() == Long.MAX_VALUE) {
                    if (this.f12772J == 2) {
                        F();
                        h hVar4 = this.L;
                        hVar4.getClass();
                        hVar4.release();
                        this.L = null;
                        this.f12772J = 0;
                        this.f12771I = true;
                        L l11 = this.f12773K;
                        l11.getClass();
                        jVar2.getClass();
                        String str5 = l11.f20096z;
                        if (str5 != null) {
                            z10 = z8;
                            int i13 = l11.f20080R;
                            List list2 = l11.f20065B;
                            switch (str5.hashCode()) {
                                case -1351681404:
                                    jVar = jVar2;
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    if (str5.equals(obj)) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1248334819:
                                    jVar = jVar2;
                                    obj2 = "text/vtt";
                                    if (!str5.equals(obj6)) {
                                        obj6 = obj6;
                                        obj = "application/dvbsubs";
                                        c10 = 65535;
                                        break;
                                    } else {
                                        obj6 = obj6;
                                        obj = "application/dvbsubs";
                                        c10 = 1;
                                        break;
                                    }
                                case -1026075066:
                                    jVar = jVar2;
                                    obj2 = "text/vtt";
                                    if (!str5.equals(obj7)) {
                                        obj7 = obj7;
                                        obj = "application/dvbsubs";
                                        c10 = 65535;
                                        break;
                                    } else {
                                        obj7 = obj7;
                                        obj = "application/dvbsubs";
                                        c10 = 2;
                                        break;
                                    }
                                case -1004728940:
                                    jVar = jVar2;
                                    if (!str5.equals("text/vtt")) {
                                        obj2 = "text/vtt";
                                        obj = "application/dvbsubs";
                                        c10 = 65535;
                                        break;
                                    } else {
                                        obj2 = "text/vtt";
                                        obj = "application/dvbsubs";
                                        c10 = 3;
                                        break;
                                    }
                                case 691401887:
                                    jVar = jVar2;
                                    if (str5.equals("application/x-quicktime-tx3g")) {
                                        obj = "application/dvbsubs";
                                        obj2 = "text/vtt";
                                        c10 = 4;
                                        break;
                                    }
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    c10 = 65535;
                                    break;
                                case 822864842:
                                    jVar = jVar2;
                                    if (str5.equals("text/x-ssa")) {
                                        obj = "application/dvbsubs";
                                        obj2 = "text/vtt";
                                        c10 = 5;
                                        break;
                                    }
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    c10 = 65535;
                                    break;
                                case 930165504:
                                    jVar = jVar2;
                                    if (str5.equals("application/x-mp4-cea-608")) {
                                        obj = "application/dvbsubs";
                                        obj2 = "text/vtt";
                                        c10 = 6;
                                        break;
                                    }
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    c10 = 65535;
                                    break;
                                case 1201784583:
                                    jVar = jVar2;
                                    if (str5.equals("text/x-exoplayer-cues")) {
                                        obj = "application/dvbsubs";
                                        obj2 = "text/vtt";
                                        c10 = 7;
                                        break;
                                    }
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    c10 = 65535;
                                    break;
                                case 1566015601:
                                    jVar = jVar2;
                                    if (str5.equals("application/cea-608")) {
                                        obj = "application/dvbsubs";
                                        obj2 = "text/vtt";
                                        c10 = '\b';
                                        break;
                                    }
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    c10 = 65535;
                                    break;
                                case 1566016562:
                                    jVar = jVar2;
                                    if (str5.equals("application/cea-708")) {
                                        obj = "application/dvbsubs";
                                        obj2 = "text/vtt";
                                        c10 = '\t';
                                        break;
                                    }
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    c10 = 65535;
                                    break;
                                case 1668750253:
                                    jVar = jVar2;
                                    if (str5.equals("application/x-subrip")) {
                                        c11 = '\n';
                                        obj2 = "text/vtt";
                                        c10 = c11;
                                        obj = "application/dvbsubs";
                                        break;
                                    }
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    c10 = 65535;
                                    break;
                                case 1693976202:
                                    jVar = jVar2;
                                    if (str5.equals("application/ttml+xml")) {
                                        c11 = 11;
                                        obj2 = "text/vtt";
                                        c10 = c11;
                                        obj = "application/dvbsubs";
                                        break;
                                    }
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    c10 = 65535;
                                    break;
                                default:
                                    jVar = jVar2;
                                    obj = "application/dvbsubs";
                                    obj2 = "text/vtt";
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    c0907a2 = new C0907a(list2);
                                    break;
                                case 1:
                                    c0907a2 = new C1051b();
                                    break;
                                case 2:
                                    c0907a2 = new C0907a();
                                    break;
                                case 3:
                                    c0907a2 = new j5.i();
                                    break;
                                case 4:
                                    c0907a2 = new C1347a(list2);
                                    break;
                                case 5:
                                    c0907a2 = new C1135a(list2);
                                    break;
                                case 6:
                                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                    c0907a2 = new C0843c(str5, i13);
                                    break;
                                case 7:
                                    c0907a2 = new R7.c();
                                    break;
                                case '\t':
                                    c0907a2 = new b5.g(i13, list2);
                                    break;
                                case '\n':
                                    c0907a2 = new C1198a();
                                    break;
                                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                    c0907a2 = new h5.d();
                                    break;
                            }
                            this.L = c0907a2;
                            str2 = "Attempted to create decoder for unsupported MIME type: ";
                        }
                        throw new IllegalArgumentException(X.c.t("Attempted to create decoder for unsupported MIME type: ", str5));
                    }
                    z10 = z8;
                    jVar = jVar2;
                    str2 = "Attempted to create decoder for unsupported MIME type: ";
                    obj = "application/dvbsubs";
                    obj2 = "text/vtt";
                    F();
                    this.f12770H = true;
                    obj3 = "application/x-mp4-cea-608";
                    if (z10) {
                        this.f12775N.getClass();
                        int b2 = this.f12775N.b(j);
                        if (b2 == 0 || this.f12775N.o() == 0) {
                            obj5 = "text/x-ssa";
                            j11 = this.f12775N.f23463c;
                        } else {
                            if (b2 == -1) {
                                d10 = this.f12775N.d(r11.o() - 1);
                            } else {
                                d10 = this.f12775N.d(b2 - 1);
                            }
                            obj5 = "text/x-ssa";
                            j11 = d10;
                        }
                        obj4 = obj5;
                        c cVar2 = new c(D(j11), this.f12775N.j(j));
                        if (handler != null) {
                            handler.obtainMessage(0, cVar2).sendToTarget();
                        } else {
                            E(cVar2);
                        }
                    } else {
                        obj4 = "text/x-ssa";
                    }
                    if (this.f12772J == 2) {
                        return;
                    }
                    while (!this.f12769G) {
                        try {
                            k kVar = this.f12774M;
                            if (kVar == null) {
                                h hVar5 = this.L;
                                hVar5.getClass();
                                kVar = (k) hVar5.h();
                                if (kVar == null) {
                                    return;
                                } else {
                                    this.f12774M = kVar;
                                }
                            }
                            i7 = this.f12772J;
                            if (i7 == 1) {
                                try {
                                    kVar.f368b = 4;
                                    h hVar6 = this.L;
                                    hVar6.getClass();
                                    hVar6.a(kVar);
                                    this.f12774M = null;
                                    i7 = 2;
                                    this.f12772J = 2;
                                    return;
                                } catch (i e10) {
                                    e = e10;
                                    i7 = 2;
                                    i10 = 4;
                                    AbstractC1705a.u("TextRenderer", str + this.f12773K, e);
                                    c cVar3 = new c(D(this.f12780S), t0.f7341e);
                                    if (handler == null) {
                                    }
                                    F();
                                    h hVar7 = this.L;
                                    hVar7.getClass();
                                    hVar7.release();
                                    this.L = null;
                                    int i14 = 0;
                                    this.f12772J = 0;
                                    this.f12771I = true;
                                    L l12 = this.f12773K;
                                    l12.getClass();
                                    jVar.getClass();
                                    str3 = l12.f20096z;
                                    if (str3 != null) {
                                    }
                                    throw new IllegalArgumentException(X.c.t(str2, str3));
                                }
                            }
                            try {
                                i7 = 2;
                                int v10 = v(gVar, kVar, 0);
                                if (v10 == -4) {
                                    i10 = 4;
                                    try {
                                        if (kVar.i(4)) {
                                            this.f12769G = true;
                                            this.f12771I = false;
                                        } else {
                                            L l13 = (L) gVar.f17916c;
                                            if (l13 == null) {
                                                return;
                                            }
                                            kVar.f12764w = l13.f20067D;
                                            kVar.J();
                                            this.f12771I &= !kVar.i(1);
                                        }
                                        if (!this.f12771I) {
                                            h hVar8 = this.L;
                                            hVar8.getClass();
                                            hVar8.a(kVar);
                                            this.f12774M = null;
                                        }
                                    } catch (i e11) {
                                        e = e11;
                                    }
                                } else if (v10 == -3) {
                                    return;
                                }
                            } catch (i e12) {
                                e = e12;
                            }
                            e = e12;
                        } catch (i e13) {
                            e = e13;
                        }
                        i10 = 4;
                        AbstractC1705a.u("TextRenderer", str + this.f12773K, e);
                        c cVar32 = new c(D(this.f12780S), t0.f7341e);
                        if (handler == null) {
                            handler.obtainMessage(0, cVar32).sendToTarget();
                        } else {
                            E(cVar32);
                        }
                        F();
                        h hVar72 = this.L;
                        hVar72.getClass();
                        hVar72.release();
                        this.L = null;
                        int i142 = 0;
                        this.f12772J = 0;
                        this.f12771I = true;
                        L l122 = this.f12773K;
                        l122.getClass();
                        jVar.getClass();
                        str3 = l122.f20096z;
                        if (str3 != null) {
                            int i15 = l122.f20080R;
                            List list3 = l122.f20065B;
                            switch (str3.hashCode()) {
                                case -1351681404:
                                    break;
                                case -1248334819:
                                    if (str3.equals(obj6)) {
                                        i11 = 1;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case -1026075066:
                                    if (str3.equals(obj7)) {
                                        i11 = i7;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case -1004728940:
                                    if (str3.equals(obj2)) {
                                        i11 = 3;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 691401887:
                                    if (str3.equals("application/x-quicktime-tx3g")) {
                                        i11 = i10;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 822864842:
                                    if (str3.equals(obj4)) {
                                        i11 = 5;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 930165504:
                                    if (str3.equals(obj3)) {
                                        i11 = 6;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 1201784583:
                                    if (str3.equals("text/x-exoplayer-cues")) {
                                        i11 = 7;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 1566015601:
                                    if (str3.equals("application/cea-608")) {
                                        i11 = 8;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 1566016562:
                                    if (str3.equals("application/cea-708")) {
                                        i11 = 9;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 1668750253:
                                    if (str3.equals("application/x-subrip")) {
                                        i142 = 10;
                                        i11 = i142;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                case 1693976202:
                                    if (str3.equals("application/ttml+xml")) {
                                        i142 = 11;
                                        i11 = i142;
                                        break;
                                    }
                                    i11 = -1;
                                    break;
                                default:
                                    i11 = -1;
                                    break;
                            }
                            switch (i11) {
                                case 0:
                                    c0907a = new C0907a(list3);
                                    c1051b = c0907a;
                                    this.L = c1051b;
                                    return;
                                case 1:
                                    c1051b = new C1051b();
                                    this.L = c1051b;
                                    return;
                                case 2:
                                    c1051b = new C0907a();
                                    this.L = c1051b;
                                    return;
                                case 3:
                                    c1051b = new j5.i();
                                    this.L = c1051b;
                                    return;
                                case 4:
                                    c0907a = new C1347a(list3);
                                    c1051b = c0907a;
                                    this.L = c1051b;
                                    return;
                                case 5:
                                    c0907a = new C1135a(list3);
                                    c1051b = c0907a;
                                    this.L = c1051b;
                                    return;
                                case 6:
                                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                    c1051b = new C0843c(str3, i15);
                                    this.L = c1051b;
                                    return;
                                case 7:
                                    c1051b = new R7.c();
                                    this.L = c1051b;
                                    return;
                                case 9:
                                    c0907a = new b5.g(i15, list3);
                                    c1051b = c0907a;
                                    this.L = c1051b;
                                    return;
                                case 10:
                                    c1051b = new C1198a();
                                    this.L = c1051b;
                                    return;
                                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                    c1051b = new h5.d();
                                    this.L = c1051b;
                                    return;
                            }
                        }
                        throw new IllegalArgumentException(X.c.t(str2, str3));
                    }
                    return;
                }
                z10 = z8;
                jVar = jVar2;
            }
        } else {
            z10 = z8;
            jVar = jVar2;
            str = "Subtitle decoding failed. streamFormat=";
        }
        str2 = "Attempted to create decoder for unsupported MIME type: ";
        obj = "application/dvbsubs";
        obj2 = "text/vtt";
        obj3 = "application/x-mp4-cea-608";
        if (z10) {
        }
        if (this.f12772J == 2) {
        }
    }
}
