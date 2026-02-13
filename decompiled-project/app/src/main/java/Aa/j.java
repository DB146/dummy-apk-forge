package Aa;

import I2.K;
import N6.E;
import N6.H;
import N6.H0;
import N6.t0;
import P4.B;
import P4.C0463k;
import P4.T;
import W1.C0571n;
import W1.C0572o;
import W1.k0;
import W1.o0;
import W4.A;
import W4.C;
import W4.F;
import W4.z;
import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.net.Uri;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import b4.C0838i;
import c.AbstractActivityC0867k;
import c.C0853A;
import c.C0861e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import ea.C1108c;
import ea.C1111f;
import h7.C1256b;
import h7.C1257c;
import h7.C1259e;
import i3.InterfaceC1342a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.B0;
import m4.C1548B;
import m4.C1549C;
import m4.C1552F;
import m4.C1555I;
import m4.C1581m;
import m4.C1586o0;
import m4.C1595y;
import m4.G0;
import m4.J0;
import m4.L;
import m4.L0;
import m4.SurfaceHolderCallbackC1596z;
import m4.r0;
import m4.z0;
import n3.C1696a;
import n5.AbstractC1705a;
import n5.D;
import o4.I;
import o8.C1824b;
import org.json.JSONException;
import org.json.JSONObject;
import s4.C1986n;
import y7.u0;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1522c;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        this.f1520a = i7;
        this.f1521b = obj;
        this.f1522c = obj2;
    }

    public /* synthetic */ j(k0 k0Var, View view, Rect rect) {
        this.f1520a = 8;
        this.f1521b = view;
        this.f1522c = rect;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i7) {
        this.f1520a = i7;
        this.f1521b = obj;
        this.f1522c = obj2;
    }

    private final void a() {
        long j;
        boolean z8;
        C1549C c1549c = (C1549C) this.f1521b;
        C1552F c1552f = (C1552F) this.f1522c;
        int i7 = c1549c.f19835T - c1552f.f19892c;
        c1549c.f19835T = i7;
        boolean z10 = true;
        if (c1552f.f19893d) {
            c1549c.f19836U = c1552f.f19894e;
            c1549c.f19837V = true;
        }
        if (c1552f.f19895f) {
            c1549c.f19838W = c1552f.g;
        }
        if (i7 == 0) {
            L0 l02 = c1552f.f19891b.f20482a;
            if (!c1549c.f19872w0.f20482a.p() && l02.p()) {
                c1549c.f19874x0 = -1;
                c1549c.f19876y0 = 0L;
            }
            if (!l02.p()) {
                List asList = Arrays.asList(((B0) l02).f19814v);
                AbstractC1705a.m(asList.size() == c1549c.f19819C.size());
                for (int i10 = 0; i10 < asList.size(); i10++) {
                    ((C1548B) c1549c.f19819C.get(i10)).f19806b = (L0) asList.get(i10);
                }
            }
            if (c1549c.f19837V) {
                if (c1552f.f19891b.f20483b.equals(c1549c.f19872w0.f20483b) && c1552f.f19891b.f20485d == c1549c.f19872w0.f20496r) {
                    z10 = false;
                }
                if (!z10) {
                    j = -9223372036854775807L;
                } else if (l02.p() || c1552f.f19891b.f20483b.a()) {
                    j = c1552f.f19891b.f20485d;
                } else {
                    r0 r0Var = c1552f.f19891b;
                    B b2 = r0Var.f20483b;
                    long j10 = r0Var.f20485d;
                    Object obj = b2.f8157a;
                    J0 j02 = c1549c.f19818B;
                    l02.g(obj, j02);
                    j = j10 + j02.f19967e;
                }
                z8 = z10;
            } else {
                j = -9223372036854775807L;
                z8 = false;
            }
            c1549c.f19837V = false;
            c1549c.C0(c1552f.f19891b, 1, c1549c.f19838W, z8, c1549c.f19836U, j, -1, false);
        }
    }

    private final void b() {
        z0 z0Var = (z0) this.f1522c;
        ((C1555I) this.f1521b).getClass();
        try {
            synchronized (z0Var) {
            }
            try {
                z0Var.f20526a.c(z0Var.f20529d, z0Var.f20530e);
            } finally {
                z0Var.b(true);
            }
        } catch (C1581m e2) {
            AbstractC1705a.u("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private final void c() {
        C1108c c1108c = (C1108c) this.f1521b;
        q4.d dVar = (q4.d) this.f1522c;
        c1108c.getClass();
        synchronized (dVar) {
        }
        SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = (SurfaceHolderCallbackC1596z) c1108c.f16830b;
        int i7 = D.f21141a;
        C1549C c1549c = surfaceHolderCallbackC1596z.f20525a;
        n4.f fVar = c1549c.f19821E;
        fVar.Q(fVar.M((B) fVar.f21089d.f9324e), 1013, new G0(22));
        c1549c.f19846c0 = null;
    }

    private final void d() {
        C1108c c1108c = (C1108c) this.f1521b;
        c1108c.getClass();
        int i7 = D.f21141a;
        SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = (SurfaceHolderCallbackC1596z) c1108c.f16830b;
        L l10 = (L) this.f1522c;
        C1549C c1549c = surfaceHolderCallbackC1596z.f20525a;
        c1549c.f19846c0 = l10;
        n4.f fVar = c1549c.f19821E;
        fVar.Q(fVar.P(), 1009, new G0(5));
    }

    private final void e() {
        AudioTrack audioTrack = (AudioTrack) this.f1521b;
        N7.a aVar = (N7.a) this.f1522c;
        try {
            audioTrack.flush();
            audioTrack.release();
            aVar.b();
            synchronized (I.f21694g0) {
                try {
                    int i7 = I.f21696i0 - 1;
                    I.f21696i0 = i7;
                    if (i7 == 0) {
                        I.f21695h0.shutdown();
                        I.f21695h0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            aVar.b();
            synchronized (I.f21694g0) {
                try {
                    int i10 = I.f21696i0 - 1;
                    I.f21696i0 = i10;
                    if (i10 == 0) {
                        I.f21695h0.shutdown();
                        I.f21695h0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0221  */
    /* JADX WARN: Type inference failed for: r2v53, types: [A3.e, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.io.IOException] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        t0 I6;
        C1256b c1256b;
        int i7;
        String str2 = null;
        switch (this.f1520a) {
            case 0:
                int i10 = PlaybackActivity.f16206f0;
                PlaybackActivity playbackActivity = (PlaybackActivity) this.f1521b;
                if (playbackActivity.isDestroyed()) {
                    return;
                }
                playbackActivity.f16215d0 = ActivityUtilsKt.showErrorDialog$default(playbackActivity, null, ((y9.D) ((y9.I) this.f1522c)).f27482a.getMessage(), null, null, null, false, false, false, null, null, 989, null);
                return;
            case 1:
                C7.d dVar = (C7.d) this.f1521b;
                dVar.getClass();
                try {
                    b4.p.a().f13880d.a(((C0838i) dVar.f3057h.f922a).b(Y3.d.f11151c), 1);
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.f1522c).countDown();
                return;
            case 2:
                ((L7.B) this.f1521b).a(((C1257c) this.f1522c).f17832a);
                return;
            case 3:
                ((L7.B) this.f1521b).a(((C1824b) this.f1522c).f22125a);
                return;
            case 4:
                Runnable runnable = (Runnable) this.f1521b;
                K k = (K) this.f1522c;
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 5:
                ((TaskCompletionSource) this.f1521b).trySetResult((G7.a) this.f1522c);
                return;
            case 6:
                T t5 = (T) this.f1521b;
                J4.b bVar = t5.f7918F;
                s4.s sVar = (s4.s) this.f1522c;
                t5.f7924M = bVar == null ? sVar : new C1986n(-9223372036854775807L);
                t5.f7925N = sVar.i();
                boolean z8 = !t5.f7931T && sVar.i() == -9223372036854775807L;
                t5.f7926O = z8;
                t5.f7927P = z8 ? 7 : 1;
                t5.f7944u.w(t5.f7925N, sVar.g(), t5.f7926O);
                if (t5.f7922J) {
                    return;
                }
                t5.z();
                return;
            case 7:
                V4.b bVar2 = (V4.b) this.f1521b;
                bVar2.f10041w = false;
                bVar2.b((Uri) this.f1522c);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                k0.j((Rect) this.f1522c, (View) this.f1521b);
                return;
            case 9:
                C0571n this$0 = (C0571n) this.f1521b;
                kotlin.jvm.internal.l.e(this$0, "this$0");
                ViewGroup container = (ViewGroup) this.f1522c;
                kotlin.jvm.internal.l.e(container, "$container");
                Iterator it = this$0.f10515c.iterator();
                while (it.hasNext()) {
                    o0 o0Var = (o0) ((C0572o) it.next()).f3094a;
                    View view = o0Var.f10533c.f10277U;
                    if (view != null) {
                        A3.c.a(o0Var.f10531a, view, container);
                    }
                }
                return;
            case 10:
                q3.s sVar2 = (q3.s) this.f1521b;
                H h10 = (H) this.f1522c;
                W4.n nVar = (W4.n) sVar2.f23439c;
                nVar.getClass();
                Pattern pattern = z.f10807a;
                if (!z.f10808b.matcher((CharSequence) h10.get(0)).matches()) {
                    Matcher matcher = z.f10807a.matcher((CharSequence) h10.get(0));
                    AbstractC1705a.h(matcher.matches());
                    String group = matcher.group(1);
                    group.getClass();
                    z.a(group);
                    String group2 = matcher.group(2);
                    group2.getClass();
                    Uri.parse(group2);
                    int indexOf = h10.indexOf("");
                    AbstractC1705a.h(indexOf > 0);
                    List subList = h10.subList(1, indexOf);
                    R7.a aVar = new R7.a(10);
                    aVar.i(subList);
                    W4.o k7 = aVar.k();
                    new D7.a(z.f10813h, 1).f(h10.subList(indexOf + 1, h10.size()));
                    String c10 = k7.c("CSeq");
                    c10.getClass();
                    int parseInt = Integer.parseInt(c10);
                    A4.s sVar3 = nVar.f10740u;
                    W4.n nVar2 = (W4.n) sVar3.f472c;
                    A4.s sVar4 = new A4.s(405, new R7.a(parseInt, nVar2.f10736c, nVar2.f10744y).k(), "");
                    W4.o oVar = (W4.o) sVar4.f471b;
                    AbstractC1705a.h(oVar.c("CSeq") != null);
                    E e2 = new E();
                    int i11 = sVar4.f470a;
                    Integer valueOf = Integer.valueOf(i11);
                    if (i11 == 200) {
                        str = "OK";
                    } else if (i11 == 461) {
                        str = "Unsupported Transport";
                    } else if (i11 == 500) {
                        str = "Internal Server Error";
                    } else if (i11 == 505) {
                        str = "RTSP Version Not Supported";
                    } else if (i11 == 301) {
                        str = "Move Permanently";
                    } else if (i11 == 302) {
                        str = "Move Temporarily";
                    } else if (i11 == 400) {
                        str = "Bad Request";
                    } else if (i11 == 401) {
                        str = "Unauthorized";
                    } else if (i11 == 404) {
                        str = "Not Found";
                    } else if (i11 != 405) {
                        switch (i11) {
                            case 454:
                                str = "Session Not Found";
                                break;
                            case 455:
                                str = "Method Not Valid In This State";
                                break;
                            case 456:
                                str = "Header Field Not Valid";
                                break;
                            case 457:
                                str = "Invalid Range";
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        str = "Method Not Allowed";
                    }
                    e2.d(D.n("%s %s %s", "RTSP/1.0", valueOf, str));
                    N6.I a9 = oVar.a();
                    H0 it2 = a9.e().iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        H d10 = a9.d(str3);
                        for (int i12 = 0; i12 < d10.size(); i12++) {
                            e2.d(D.n("%s: %s", str3, d10.get(i12)));
                        }
                    }
                    e2.d("");
                    e2.d((String) sVar4.f472c);
                    nVar2.f10742w.n(e2.h());
                    sVar3.f470a = Math.max(sVar3.f470a, parseInt + 1);
                    return;
                }
                Matcher matcher2 = z.f10808b.matcher((CharSequence) h10.get(0));
                AbstractC1705a.h(matcher2.matches());
                String group3 = matcher2.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3);
                int indexOf2 = h10.indexOf("");
                AbstractC1705a.h(indexOf2 > 0);
                List subList2 = h10.subList(1, indexOf2);
                R7.a aVar2 = new R7.a(10);
                aVar2.i(subList2);
                A4.s sVar5 = new A4.s(parseInt2, new W4.o(aVar2), new D7.a(z.f10813h, 1).f(h10.subList(indexOf2 + 1, h10.size())));
                W4.o oVar2 = (W4.o) sVar5.f471b;
                String c11 = oVar2.c("CSeq");
                AbstractC1705a.l(c11);
                int parseInt3 = Integer.parseInt(c11);
                A a10 = (A) W4.n.K(nVar).get(parseInt3);
                if (a10 == null) {
                    return;
                }
                W4.n.K(nVar).remove(parseInt3);
                int i13 = sVar5.f470a;
                int i14 = a10.f10623b;
                try {
                    try {
                        if (i13 == 200) {
                            switch (i14) {
                                case 1:
                                case 3:
                                case 7:
                                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                case 9:
                                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                case 12:
                                    return;
                                case 2:
                                    sVar2.y(new q3.c(23, oVar2, F.a((String) sVar5.f472c), false));
                                    return;
                                case 4:
                                    sVar2.z(new C0463k(z.b(oVar2.c("Public"))));
                                    return;
                                case 5:
                                    sVar2.A();
                                    return;
                                case 6:
                                    String c12 = oVar2.c("Range");
                                    W4.B a11 = c12 == null ? W4.B.f10626c : W4.B.a(c12);
                                    try {
                                        String c13 = oVar2.c("RTP-Info");
                                        I6 = c13 == null ? H.I() : C.a(W4.n.n(nVar), c13);
                                    } catch (C1586o0 unused2) {
                                        I6 = H.I();
                                    }
                                    sVar2.B(new q3.l(a11, I6));
                                    return;
                                case 10:
                                    String c14 = oVar2.c("Session");
                                    String c15 = oVar2.c("Transport");
                                    if (c14 == null || c15 == null) {
                                        throw C1586o0.b("Missing mandatory session or transport header", null);
                                    }
                                    sVar2.C(new R7.a(z.c(c14), 12));
                                    return;
                                default:
                                    throw new IllegalStateException();
                            }
                        }
                        if (i13 == 401) {
                            if (nVar.f10743x == null || nVar.f10731D) {
                                W4.n.F(nVar, new A3.e(z.h(i14) + " " + i13));
                                return;
                            }
                            oVar2.getClass();
                            H d11 = oVar2.f10746a.d(W4.o.b("WWW-Authenticate"));
                            if (d11.isEmpty()) {
                                throw C1586o0.b("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                            for (int i15 = 0; i15 < d11.size(); i15++) {
                                nVar.f10728A = z.e((String) d11.get(i15));
                                if (nVar.f10728A.f21222b == 2) {
                                    W4.n.l(nVar).D();
                                    nVar.f10731D = true;
                                    return;
                                }
                            }
                            W4.n.l(nVar).D();
                            nVar.f10731D = true;
                            return;
                        }
                        if (i13 == 461) {
                            String str4 = z.h(i14) + " " + i13;
                            String c16 = a10.f10624c.c("Transport");
                            AbstractC1705a.l(c16);
                            W4.n.F(nVar, (i14 != 10 || c16.contains("TCP")) ? new A3.e(str4) : new IOException(str4));
                            return;
                        }
                        if (i13 != 301 && i13 != 302) {
                            W4.n.F(nVar, new A3.e(z.h(i14) + " " + i13));
                            return;
                        }
                        if (nVar.f10729B != -1) {
                            nVar.f10729B = 0;
                        }
                        String c17 = oVar2.c("Location");
                        if (c17 == null) {
                            nVar.f10734a.w("Redirection without new location.", null);
                            return;
                        }
                        Uri parse = Uri.parse(c17);
                        nVar.f10741v = z.f(parse);
                        nVar.f10743x = z.d(parse);
                        W4.n.l(nVar).E(W4.n.n(nVar), nVar.f10744y);
                        return;
                    } catch (C1586o0 e10) {
                        e = e10;
                        W4.n.F(nVar, new IOException(e));
                        return;
                    }
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    W4.n.F(nVar, new IOException(e));
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                W4.x xVar = (W4.x) this.f1521b;
                byte[] bArr = (byte[]) this.f1522c;
                xVar.getClass();
                try {
                    xVar.f10796a.write(bArr);
                    return;
                } catch (Exception unused3) {
                    if (xVar.f10799d.f10806f) {
                        return;
                    }
                    q3.s sVar6 = xVar.f10799d.f10801a;
                    return;
                }
            case 12:
                AbstractActivityC0867k abstractActivityC0867k = (AbstractActivityC0867k) this.f1521b;
                C0853A c0853a = (C0853A) this.f1522c;
                int i16 = AbstractActivityC0867k.f14040H;
                abstractActivityC0867k.f18773a.a(new C0861e(c0853a, abstractActivityC0867k));
                return;
            case 13:
                u0.n((e0.c) this.f1521b, (LongSparseArray) this.f1522c);
                return;
            case 14:
                int i17 = JobInfoSchedulerService.f14711a;
                ((JobInfoSchedulerService) this.f1521b).jobFinished((JobParameters) this.f1522c, false);
                return;
            case 15:
                C1259e c1259e = (C1259e) this.f1521b;
                c1259e.getClass();
                String str5 = h7.i.f17857b.f3260a;
                p7.l lVar = c1259e.f17840e.f17858a;
                String string = ((SharedPreferences) lVar.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String string2 = ((SharedPreferences) lVar.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if (string != null && string2 != null) {
                    try {
                    } catch (IllegalArgumentException e12) {
                        StringBuilder n6 = X.c.n("Failed to parse TokenType of stored token  with type [", string, "] with exception: ");
                        n6.append(e12.getMessage());
                        Log.e(str5, n6.toString(), null);
                        ((SharedPreferences) lVar.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                    }
                    if (string == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (string.equals("DEFAULT_APP_CHECK_TOKEN")) {
                        i7 = 1;
                    } else {
                        if (!string.equals("UNKNOWN_APP_CHECK_TOKEN")) {
                            throw new IllegalArgumentException("No enum constant com.google.firebase.appcheck.internal.StorageHelper.TokenType.".concat(string));
                        }
                        i7 = 2;
                    }
                    int b2 = P.c.b(i7);
                    if (b2 == 0) {
                        c1256b = C1256b.b(string2);
                    } else if (b2 != 1) {
                        Log.e(str5, "Reached unreachable section in #retrieveAppCheckToken()", null);
                    } else {
                        c1256b = C1256b.a(string2);
                    }
                    if (c1256b != null) {
                        c1259e.f17845m = c1256b;
                    }
                    ((TaskCompletionSource) this.f1522c).setResult(null);
                    return;
                }
                c1256b = null;
                if (c1256b != null) {
                }
                ((TaskCompletionSource) this.f1522c).setResult(null);
                return;
            case 16:
                h7.i iVar = ((C1259e) this.f1521b).f17840e;
                iVar.getClass();
                C1256b c1256b2 = (C1256b) this.f1522c;
                boolean z10 = c1256b2 instanceof C1256b;
                p7.l lVar2 = iVar.f17858a;
                if (!z10) {
                    ((SharedPreferences) lVar2.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", c1256b2.f17829a).putString("com.google.firebase.appcheck.TOKEN_TYPE", "UNKNOWN_APP_CHECK_TOKEN").apply();
                    return;
                }
                SharedPreferences.Editor edit = ((SharedPreferences) lVar2.get()).edit();
                c1256b2.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("token", c1256b2.f17829a);
                    jSONObject.put("receivedAt", c1256b2.f17830b);
                    jSONObject.put("expiresIn", c1256b2.f17831c);
                    str2 = jSONObject.toString();
                } catch (JSONException e13) {
                    Log.e("h7.b", "Could not serialize token: " + e13.getMessage());
                }
                edit.putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", str2).putString("com.google.firebase.appcheck.TOKEN_TYPE", "DEFAULT_APP_CHECK_TOKEN").apply();
                return;
            case 17:
                Runnable runnable2 = (Runnable) this.f1522c;
                ((K) this.f1521b).getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                }
            case 18:
                i3.d dVar2 = (i3.d) this.f1521b;
                q3.j jVar = (q3.j) this.f1522c;
                synchronized (dVar2.k) {
                    try {
                        Iterator it3 = dVar2.j.iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC1342a) it3.next()).b(jVar, false);
                        }
                    } finally {
                    }
                }
                return;
            case 19:
                ((C1111f) ((E3.d) this.f1521b).f3526c).K((i3.i) this.f1522c, 3);
                return;
            case 20:
                a();
                return;
            case 21:
                b();
                return;
            case 22:
                ((n1.b) this.f1521b).j((Typeface) this.f1522c);
                return;
            case 23:
                ((m5.r) this.f1522c).a(((n5.u) this.f1521b).g());
                return;
            case 24:
                Iterator it4 = ((List) this.f1521b).iterator();
                while (it4.hasNext()) {
                    ((C1696a) it4.next()).a(((o3.e) this.f1522c).f21673d);
                }
                return;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                e();
                return;
            case 28:
                ha.g gVar = (ha.g) this.f1521b;
                gVar.getClass();
                int i18 = D.f21141a;
                C1549C c1549c = ((SurfaceHolderCallbackC1596z) gVar.f17916c).f20525a;
                o5.w wVar = (o5.w) this.f1522c;
                c1549c.f19868u0 = wVar;
                c1549c.f19877z.e(25, new C1595y(wVar));
                return;
            default:
                ha.g gVar2 = (ha.g) this.f1521b;
                gVar2.getClass();
                int i19 = D.f21141a;
                SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z = (SurfaceHolderCallbackC1596z) gVar2.f17916c;
                L l10 = (L) this.f1522c;
                C1549C c1549c2 = surfaceHolderCallbackC1596z.f20525a;
                c1549c2.f19844b0 = l10;
                n4.f fVar = c1549c2.f19821E;
                fVar.Q(fVar.P(), 1017, new G0(16));
                return;
        }
    }
}
