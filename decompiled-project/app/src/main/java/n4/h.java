package n4;

import M6.s;
import P4.B;
import P4.C0477z;
import android.media.metrics.PlaybackMetrics;
import java.util.HashMap;
import java.util.Random;
import m4.J0;
import m4.K0;
import m4.L0;
import n5.D;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final s f21101h = new s(2);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f21102i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public j f21106d;

    /* renamed from: f, reason: collision with root package name */
    public String f21108f;

    /* renamed from: a, reason: collision with root package name */
    public final K0 f21103a = new K0();

    /* renamed from: b, reason: collision with root package name */
    public final J0 f21104b = new J0();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21105c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public L0 f21107e = L0.f20097a;
    public long g = -1;

    public final void a(g gVar) {
        long j = gVar.f21097c;
        if (j != -1) {
            this.g = j;
        }
        this.f21108f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g b(int i7, B b2) {
        long j;
        long j10;
        HashMap hashMap = this.f21105c;
        g gVar = null;
        long j11 = Long.MAX_VALUE;
        for (g gVar2 : hashMap.values()) {
            if (gVar2.f21097c == -1 && i7 == gVar2.f21096b && b2 != null) {
                h hVar = gVar2.g;
                g gVar3 = (g) hVar.f21105c.get(hVar.f21108f);
                if (gVar3 != null) {
                    j10 = gVar3.f21097c;
                }
                j10 = 1 + hVar.g;
                long j12 = b2.f8160d;
                if (j12 >= j10) {
                    gVar2.f21097c = j12;
                }
            }
            B b10 = gVar2.f21098d;
            if (b2 != null) {
                long j13 = b2.f8160d;
                if (b10 == null) {
                    if (!b2.a() && j13 == gVar2.f21097c) {
                        j = gVar2.f21097c;
                        if (j == -1) {
                        }
                        gVar = gVar2;
                        j11 = j;
                    }
                } else if (j13 == b10.f8160d && b2.f8158b == b10.f8158b && b2.f8159c == b10.f8159c) {
                    j = gVar2.f21097c;
                    if (j == -1) {
                    }
                    gVar = gVar2;
                    j11 = j;
                }
            } else if (i7 == gVar2.f21096b) {
                j = gVar2.f21097c;
                if (j == -1 || j < j11) {
                    gVar = gVar2;
                    j11 = j;
                } else if (j == j11) {
                    int i10 = D.f21141a;
                    if (gVar.f21098d != null && b10 != null) {
                        gVar = gVar2;
                    }
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str = (String) f21101h.get();
        g gVar4 = new g(this, str, i7, b2);
        hashMap.put(str, gVar4);
        return gVar4;
    }

    public final synchronized String c(L0 l02, B b2) {
        return b(l02.g(b2.f8157a, this.f21104b).f19965c, b2).f21095a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [P4.z, P4.B] */
    public final void d(C1703a c1703a) {
        B b2;
        boolean p10 = c1703a.f21071b.p();
        HashMap hashMap = this.f21105c;
        if (p10) {
            String str = this.f21108f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f21108f);
        int i7 = c1703a.f21072c;
        B b10 = c1703a.f21073d;
        this.f21108f = b(i7, b10).f21095a;
        e(c1703a);
        if (b10 == null || !b10.a()) {
            return;
        }
        long j = b10.f8160d;
        if (gVar2 != null && gVar2.f21097c == j && (b2 = gVar2.f21098d) != null && b2.f8158b == b10.f8158b && b2.f8159c == b10.f8159c) {
            return;
        }
        b(i7, new C0477z(b10.f8157a, j));
        this.f21106d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b3, B:41:0x00b7, B:42:0x00be, B:44:0x00c8, B:46:0x00cc, B:48:0x00d9, B:51:0x00e0), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(C1703a c1703a) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        long j;
        this.f21106d.getClass();
        if (c1703a.f21071b.p()) {
            return;
        }
        B b2 = c1703a.f21073d;
        if (b2 != null) {
            long j10 = b2.f8160d;
            g gVar = (g) this.f21105c.get(this.f21108f);
            if (gVar != null) {
                j = gVar.f21097c;
                if (j != -1) {
                    if (j10 >= j) {
                        return;
                    }
                    g gVar2 = (g) this.f21105c.get(this.f21108f);
                    if (gVar2 != null && gVar2.f21097c == -1 && gVar2.f21096b != c1703a.f21072c) {
                        return;
                    }
                }
            }
            j = this.g + 1;
            if (j10 >= j) {
            }
        }
        g b10 = b(c1703a.f21072c, c1703a.f21073d);
        if (this.f21108f == null) {
            this.f21108f = b10.f21095a;
        }
        B b11 = c1703a.f21073d;
        if (b11 != null && b11.a()) {
            B b12 = c1703a.f21073d;
            g b13 = b(c1703a.f21072c, new B(b12.f8157a, b12.f8158b, b12.f8160d));
            if (!b13.f21099e) {
                b13.f21099e = true;
                c1703a.f21071b.g(c1703a.f21073d.f8157a, this.f21104b);
                Math.max(0L, D.Z(this.f21104b.d(c1703a.f21073d.f8158b)) + D.Z(this.f21104b.f19967e));
                this.f21106d.getClass();
            }
        }
        if (!b10.f21099e) {
            b10.f21099e = true;
            this.f21106d.getClass();
        }
        if (b10.f21095a.equals(this.f21108f) && !b10.f21100f) {
            b10.f21100f = true;
            j jVar = this.f21106d;
            String str = b10.f21095a;
            jVar.getClass();
            B b14 = c1703a.f21073d;
            if (b14 == null || !b14.a()) {
                jVar.b();
                jVar.f21117i = str;
                playerName = i6.a.h().setPlayerName("ExoPlayerLib");
                playerVersion = playerName.setPlayerVersion("2.19.1");
                jVar.j = playerVersion;
                jVar.c(c1703a.f21071b, c1703a.f21073d);
            }
        }
    }
}
