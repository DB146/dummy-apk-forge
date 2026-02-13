package n4;

import A4.s;
import A9.C0109l2;
import A9.C0152w2;
import A9.N1;
import E4.o;
import H2.O;
import I2.K;
import N6.F;
import P4.B;
import P4.C0474w;
import P4.Y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.os.Build;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Log;
import android.util.SparseArray;
import androidx.work.rxjava3.RxWorker;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.kt.apps.core.extensions.ExtensionsChannel;
import fb.C1151e;
import gb.p;
import i1.C1290a;
import j8.InterfaceC1386a;
import j8.InterfaceC1387b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m4.AbstractC1571h;
import m4.C1549C;
import m4.C1581m;
import m4.C1586o0;
import m4.L;
import m4.L0;
import m4.M0;
import m4.N0;
import m4.q0;
import m5.AbstractC1598B;
import m5.C1597A;
import m5.C1599C;
import m5.U;
import m5.x;
import n5.D;
import n5.u;
import o4.C1798l;
import o4.C1804s;
import o4.C1805t;
import ob.m;
import r4.C1928G;
import r4.C1932d;
import r4.C1936h;
import r4.C1937i;
import t8.C2032a;
import u.C2052e;
import v8.C2149c;
import v8.C2151e;
import v8.C2153g;
import v8.C2155i;
import va.C;
import vb.v;
import y7.u0;
import y9.G;
import y9.I;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements n5.j, n5.i, InterfaceC1386a, OnCompleteListener, Continuation, p7.c, a1.j, SuccessContinuation, N1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21080c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f21078a = i7;
        this.f21079b = obj;
        this.f21080c = obj2;
    }

    private final Object c(Task task) {
        C2153g c2153g = (C2153g) this.f21079b;
        Date date = (Date) this.f21080c;
        c2153g.getClass();
        if (task.isSuccessful()) {
            v8.k kVar = c2153g.g;
            synchronized (kVar.f25255b) {
                kVar.f25254a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                if (exception instanceof u8.f) {
                    v8.k kVar2 = c2153g.g;
                    synchronized (kVar2.f25255b) {
                        kVar2.f25254a.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    v8.k kVar3 = c2153g.g;
                    synchronized (kVar3.f25255b) {
                        kVar3.f25254a.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return task;
    }

    @Override // a1.j
    public Object a(a1.i iVar) {
        int i7 = 1;
        RxWorker rxWorker = (RxWorker) this.f21079b;
        m f4 = ((p) this.f21080c).f(rxWorker.d());
        K k = (K) rxWorker.f17719b.f13737e.f23382a;
        v vVar = Ab.e.f1559a;
        try {
            f4.d(new qb.p(new C1290a(iVar, 23), new C1151e(k, i7), i7));
            return "converted single to future";
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @Override // A9.InterfaceC0149w
    public void b(C0109l2 c0109l2, Object obj, C0152w2 c0152w2, Object obj2) {
        C c10 = (C) this.f21079b;
        ExtensionsChannel extensionsChannel = c10.f25270n2;
        if (extensionsChannel != null) {
            ((Map) c10.f25272p2.getValue()).put(extensionsChannel.getChannelId(), 0);
        }
        c10.f25270n2 = obj instanceof ExtensionsChannel ? (ExtensionsChannel) obj : null;
        c10.q1((List) ((G) ((I) this.f21080c)).f27483a);
        ExtensionsChannel extensionsChannel2 = c10.f25270n2;
        if (extensionsChannel2 != null) {
            c10.o1(extensionsChannel2, false, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06da A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05c7  */
    /* JADX WARN: Type inference failed for: r2v104, types: [m4.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v70 */
    @Override // n5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(Object obj, n5.f fVar) {
        boolean z8;
        int i7;
        int i10;
        int i11;
        O o10;
        O o11;
        int i12;
        int i13;
        char c10;
        O o12;
        O o13;
        O o14;
        O o15;
        int i14;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i15;
        int i16;
        L l10;
        int i17;
        int i18;
        int i19;
        j jVar;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        L l11;
        C1936h c1936h;
        int i20;
        int i21 = 1;
        f fVar2 = (f) this.f21079b;
        C1549C c1549c = (C1549C) this.f21080c;
        j jVar2 = (j) obj;
        SparseArray sparseArray = fVar2.f21090e;
        SparseArray sparseArray2 = new SparseArray(fVar.f21175a.size());
        for (int i22 = 0; i22 < fVar.f21175a.size(); i22++) {
            int a9 = fVar.a(i22);
            C1703a c1703a = (C1703a) sparseArray.get(a9);
            c1703a.getClass();
            sparseArray2.append(a9, c1703a);
        }
        jVar2.getClass();
        if (fVar.f21175a.size() == 0) {
            return;
        }
        for (int i23 = 0; i23 < fVar.f21175a.size(); i23++) {
            int a10 = fVar.a(i23);
            C1703a c1703a2 = (C1703a) sparseArray2.get(a10);
            c1703a2.getClass();
            if (a10 == 0) {
                h hVar = jVar2.f21111b;
                synchronized (hVar) {
                    try {
                        hVar.f21106d.getClass();
                        L0 l02 = hVar.f21107e;
                        hVar.f21107e = c1703a2.f21071b;
                        Iterator it = hVar.f21105c.values().iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            if (gVar.b(l02, hVar.f21107e) && !gVar.a(c1703a2)) {
                            }
                            it.remove();
                            if (gVar.f21099e) {
                                if (gVar.f21095a.equals(hVar.f21108f)) {
                                    hVar.a(gVar);
                                }
                                hVar.f21106d.d(c1703a2, gVar.f21095a);
                            }
                        }
                        hVar.d(c1703a2);
                    } finally {
                    }
                }
            } else if (a10 == 11) {
                h hVar2 = jVar2.f21111b;
                int i24 = jVar2.k;
                synchronized (hVar2) {
                    try {
                        hVar2.f21106d.getClass();
                        boolean z10 = i24 == 0;
                        Iterator it2 = hVar2.f21105c.values().iterator();
                        while (it2.hasNext()) {
                            g gVar2 = (g) it2.next();
                            if (gVar2.a(c1703a2)) {
                                it2.remove();
                                if (gVar2.f21099e) {
                                    boolean equals = gVar2.f21095a.equals(hVar2.f21108f);
                                    if (z10 && equals) {
                                        boolean z11 = gVar2.f21100f;
                                    }
                                    if (equals) {
                                        hVar2.a(gVar2);
                                    }
                                    hVar2.f21106d.d(c1703a2, gVar2.f21095a);
                                }
                            }
                        }
                        hVar2.d(c1703a2);
                    } finally {
                    }
                }
            } else {
                jVar2.f21111b.e(c1703a2);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (fVar.f21175a.get(0)) {
            C1703a c1703a3 = (C1703a) sparseArray2.get(0);
            c1703a3.getClass();
            if (jVar2.j != null) {
                jVar2.c(c1703a3.f21071b, c1703a3.f21073d);
            }
        }
        if (fVar.f21175a.get(2) && jVar2.j != null) {
            F listIterator = c1549c.Z().f20114a.listIterator(0);
            loop4: while (true) {
                if (!listIterator.hasNext()) {
                    c1936h = null;
                    break;
                }
                M0 m02 = (M0) listIterator.next();
                for (int i25 = 0; i25 < m02.f20107a; i25++) {
                    if (m02.f20111e[i25] && (c1936h = m02.f20108b.f8109d[i25].f20066C) != null) {
                        break loop4;
                    }
                }
            }
            if (c1936h != null) {
                PlaybackMetrics.Builder builder = jVar2.j;
                int i26 = D.f21141a;
                PlaybackMetrics.Builder h10 = i.h(builder);
                int i27 = 0;
                while (true) {
                    if (i27 >= c1936h.f23764d) {
                        i20 = 1;
                        break;
                    }
                    UUID uuid = c1936h.f23761a[i27].f23757b;
                    if (uuid.equals(AbstractC1571h.f20385d)) {
                        i20 = 3;
                        break;
                    } else if (uuid.equals(AbstractC1571h.f20386e)) {
                        i20 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC1571h.f20384c)) {
                            i20 = 6;
                            break;
                        }
                        i27++;
                    }
                }
                h10.setDrmType(i20);
            }
        }
        if (fVar.f21175a.get(1011)) {
            jVar2.f21132z++;
        }
        q0 q0Var = jVar2.f21120n;
        if (q0Var == null) {
            i10 = 8;
            i11 = 9;
        } else {
            boolean z12 = jVar2.f21128v == 4;
            int i28 = q0Var.f20477a;
            if (i28 == 1001) {
                o15 = new O(20, 0, 7);
            } else {
                if (q0Var instanceof C1581m) {
                    C1581m c1581m = (C1581m) q0Var;
                    z8 = c1581m.f20428c == 1;
                    i7 = c1581m.f20432u;
                } else {
                    z8 = false;
                    i7 = 0;
                }
                Throwable cause = q0Var.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    i10 = 8;
                    int i29 = 24;
                    i11 = 9;
                    if (z8 && (i7 == 0 || i7 == 1)) {
                        o10 = new O(35, 0, 7);
                    } else if (z8 && i7 == 3) {
                        o10 = new O(15, 0, 7);
                    } else if (z8 && i7 == 2) {
                        o10 = new O(23, 0, 7);
                    } else {
                        if (cause instanceof o) {
                            o11 = new O(13, D.v(((o) cause).f3591d), 7);
                        } else {
                            if (cause instanceof E4.k) {
                                o10 = new O(14, D.v(((E4.k) cause).f3580a), 7);
                            } else if (cause instanceof OutOfMemoryError) {
                                o10 = new O(14, 0, 7);
                            } else if (cause instanceof C1804s) {
                                o10 = new O(17, ((C1804s) cause).f21875a, 7);
                            } else if (cause instanceof C1805t) {
                                o10 = new O(18, ((C1805t) cause).f21877a, 7);
                            } else if (D.f21141a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                o10 = new O(22, 0, 7);
                            } else {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (D.u(errorCode2)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i29 = 28;
                                        break;
                                    case 6004:
                                        i29 = 25;
                                        break;
                                    case 6005:
                                        i29 = 26;
                                        break;
                                    default:
                                        i29 = 27;
                                        break;
                                }
                                o11 = new O(i29, errorCode2, 7);
                            }
                            PlaybackSession playbackSession = jVar2.f21112c;
                            timeSinceCreatedMillis = i.f().setTimeSinceCreatedMillis(elapsedRealtime - jVar2.f21113d);
                            errorCode = timeSinceCreatedMillis.setErrorCode(o10.f4603b);
                            subErrorCode = errorCode.setSubErrorCode(o10.f4604c);
                            exception = subErrorCode.setException(q0Var);
                            build = exception.build();
                            playbackSession.reportPlaybackErrorEvent(build);
                            i21 = 1;
                            jVar2.f21109A = true;
                            jVar2.f21120n = null;
                        }
                        o10 = o11;
                        PlaybackSession playbackSession2 = jVar2.f21112c;
                        timeSinceCreatedMillis = i.f().setTimeSinceCreatedMillis(elapsedRealtime - jVar2.f21113d);
                        errorCode = timeSinceCreatedMillis.setErrorCode(o10.f4603b);
                        subErrorCode = errorCode.setSubErrorCode(o10.f4604c);
                        exception = subErrorCode.setException(q0Var);
                        build = exception.build();
                        playbackSession2.reportPlaybackErrorEvent(build);
                        i21 = 1;
                        jVar2.f21109A = true;
                        jVar2.f21120n = null;
                    }
                    PlaybackSession playbackSession22 = jVar2.f21112c;
                    timeSinceCreatedMillis = i.f().setTimeSinceCreatedMillis(elapsedRealtime - jVar2.f21113d);
                    errorCode = timeSinceCreatedMillis.setErrorCode(o10.f4603b);
                    subErrorCode = errorCode.setSubErrorCode(o10.f4604c);
                    exception = subErrorCode.setException(q0Var);
                    build = exception.build();
                    playbackSession22.reportPlaybackErrorEvent(build);
                    i21 = 1;
                    jVar2.f21109A = true;
                    jVar2.f21120n = null;
                } else if (cause instanceof C1599C) {
                    o15 = new O(5, ((C1599C) cause).f20535d, 7);
                } else {
                    if ((cause instanceof AbstractC1598B) || (cause instanceof C1586o0)) {
                        i12 = 8;
                        i13 = 9;
                        c10 = 6;
                        o12 = new O(z12 ? 10 : 11, 0, 7);
                    } else {
                        boolean z13 = cause instanceof C1597A;
                        if (z13 || (cause instanceof U)) {
                            i13 = 9;
                            if (u.f(jVar2.f21110a).g() == 1) {
                                o14 = new O(3, 0, 7);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    c10 = 6;
                                    o13 = new O(6, 0, 7);
                                } else {
                                    c10 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        o13 = new O(7, 0, 7);
                                    } else if (z13 && ((C1597A) cause).f20534c == 1) {
                                        o13 = new O(4, 0, 7);
                                    } else {
                                        i12 = 8;
                                        o12 = new O(8, 0, 7);
                                    }
                                }
                                i11 = 9;
                                o10 = o13;
                                i10 = 8;
                                PlaybackSession playbackSession222 = jVar2.f21112c;
                                timeSinceCreatedMillis = i.f().setTimeSinceCreatedMillis(elapsedRealtime - jVar2.f21113d);
                                errorCode = timeSinceCreatedMillis.setErrorCode(o10.f4603b);
                                subErrorCode = errorCode.setSubErrorCode(o10.f4604c);
                                exception = subErrorCode.setException(q0Var);
                                build = exception.build();
                                playbackSession222.reportPlaybackErrorEvent(build);
                                i21 = 1;
                                jVar2.f21109A = true;
                                jVar2.f21120n = null;
                            }
                        } else if (i28 == 1002) {
                            o15 = new O(21, 0, 7);
                        } else if (cause instanceof C1937i) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i30 = D.f21141a;
                            if (i30 < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                o15 = (i30 < 23 || !(cause3 instanceof MediaDrmResetException)) ? (i30 < 18 || !(cause3 instanceof NotProvisionedException)) ? (i30 < 18 || !(cause3 instanceof DeniedByServerException)) ? cause3 instanceof C1928G ? new O(23, 0, 7) : cause3 instanceof C1932d ? new O(28, 0, 7) : new O(30, 0, 7) : new O(29, 0, 7) : new O(24, 0, 7) : new O(27, 0, 7);
                            } else {
                                int v10 = D.v(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (D.u(v10)) {
                                    case 6002:
                                        i14 = 24;
                                        break;
                                    case 6003:
                                        i14 = 28;
                                        break;
                                    case 6004:
                                        i14 = 25;
                                        break;
                                    case 6005:
                                        i14 = 26;
                                        break;
                                    default:
                                        i14 = 27;
                                        break;
                                }
                                o15 = new O(i14, v10, 7);
                            }
                        } else if ((cause instanceof x) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            o15 = (D.f21141a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new O(32, 0, 7) : new O(31, 0, 7);
                        } else {
                            i13 = 9;
                            o14 = new O(9, 0, 7);
                        }
                        i11 = i13;
                        o10 = o14;
                        i10 = 8;
                        PlaybackSession playbackSession2222 = jVar2.f21112c;
                        timeSinceCreatedMillis = i.f().setTimeSinceCreatedMillis(elapsedRealtime - jVar2.f21113d);
                        errorCode = timeSinceCreatedMillis.setErrorCode(o10.f4603b);
                        subErrorCode = errorCode.setSubErrorCode(o10.f4604c);
                        exception = subErrorCode.setException(q0Var);
                        build = exception.build();
                        playbackSession2222.reportPlaybackErrorEvent(build);
                        i21 = 1;
                        jVar2.f21109A = true;
                        jVar2.f21120n = null;
                    }
                    i11 = i13;
                    O o16 = o12;
                    i10 = i12;
                    o10 = o16;
                    PlaybackSession playbackSession22222 = jVar2.f21112c;
                    timeSinceCreatedMillis = i.f().setTimeSinceCreatedMillis(elapsedRealtime - jVar2.f21113d);
                    errorCode = timeSinceCreatedMillis.setErrorCode(o10.f4603b);
                    subErrorCode = errorCode.setSubErrorCode(o10.f4604c);
                    exception = subErrorCode.setException(q0Var);
                    build = exception.build();
                    playbackSession22222.reportPlaybackErrorEvent(build);
                    i21 = 1;
                    jVar2.f21109A = true;
                    jVar2.f21120n = null;
                }
            }
            o10 = o15;
            i10 = 8;
            i11 = 9;
            PlaybackSession playbackSession222222 = jVar2.f21112c;
            timeSinceCreatedMillis = i.f().setTimeSinceCreatedMillis(elapsedRealtime - jVar2.f21113d);
            errorCode = timeSinceCreatedMillis.setErrorCode(o10.f4603b);
            subErrorCode = errorCode.setSubErrorCode(o10.f4604c);
            exception = subErrorCode.setException(q0Var);
            build = exception.build();
            playbackSession222222.reportPlaybackErrorEvent(build);
            i21 = 1;
            jVar2.f21109A = true;
            jVar2.f21120n = null;
        }
        if (fVar.f21175a.get(2)) {
            N0 Z7 = c1549c.Z();
            boolean a11 = Z7.a(2);
            boolean a12 = Z7.a(i21);
            boolean a13 = Z7.a(3);
            if (a11 || a12 || a13) {
                if (a11) {
                    i15 = i10;
                    i16 = 2;
                    i17 = 10;
                    i18 = 5;
                    l11 = null;
                } else if (D.a(jVar2.f21124r, null)) {
                    i15 = i10;
                    l11 = null;
                    i16 = 2;
                    i17 = 10;
                    i18 = 5;
                } else {
                    int i31 = jVar2.f21124r == null ? 1 : 0;
                    jVar2.f21124r = null;
                    i15 = i10;
                    l11 = null;
                    i17 = 10;
                    i18 = 5;
                    i16 = 2;
                    jVar2.e(1, elapsedRealtime, null, i31);
                }
                if (a12) {
                    l10 = l11;
                } else {
                    L l12 = l11;
                    if (D.a(jVar2.f21125s, l12)) {
                        l10 = l12;
                    } else {
                        int i32 = jVar2.f21125s == null ? 1 : 0;
                        jVar2.f21125s = l12;
                        l10 = l12;
                        jVar2.e(0, elapsedRealtime, l12, i32);
                    }
                }
                if (!a13 && !D.a(jVar2.f21126t, l10)) {
                    int i33 = jVar2.f21126t == null ? 1 : 0;
                    jVar2.f21126t = l10;
                    jVar2.e(2, elapsedRealtime, l10, i33);
                }
                if (jVar2.a(jVar2.f21121o)) {
                    s sVar = jVar2.f21121o;
                    L l13 = (L) sVar.f471b;
                    if (l13.f20069F != -1) {
                        int i34 = sVar.f470a;
                        if (!D.a(jVar2.f21124r, l13)) {
                            int i35 = (jVar2.f21124r == null && i34 == 0) ? 1 : i34;
                            jVar2.f21124r = l13;
                            jVar2.e(1, elapsedRealtime, l13, i35);
                        }
                        jVar2.f21121o = l10;
                    }
                }
                if (jVar2.a(jVar2.f21122p)) {
                    s sVar2 = jVar2.f21122p;
                    L l14 = (L) sVar2.f471b;
                    int i36 = sVar2.f470a;
                    if (!D.a(jVar2.f21125s, l14)) {
                        int i37 = (jVar2.f21125s == null && i36 == 0) ? 1 : i36;
                        jVar2.f21125s = l14;
                        jVar2.e(0, elapsedRealtime, l14, i37);
                    }
                    jVar2.f21122p = l10;
                }
                if (jVar2.a(jVar2.f21123q)) {
                    s sVar3 = jVar2.f21123q;
                    L l15 = (L) sVar3.f471b;
                    int i38 = sVar3.f470a;
                    if (!D.a(jVar2.f21126t, l15)) {
                        int i39 = (jVar2.f21126t == null && i38 == 0) ? 1 : i38;
                        jVar2.f21126t = l15;
                        jVar2.e(2, elapsedRealtime, l15, i39);
                    }
                    jVar2.f21123q = l10;
                }
                switch (u.f(jVar2.f21110a).g()) {
                    case 0:
                        i19 = 0;
                        break;
                    case 1:
                        i19 = i11;
                        break;
                    case 2:
                        i19 = i16;
                        break;
                    case 3:
                        i19 = 4;
                        break;
                    case 4:
                        i19 = i18;
                        break;
                    case 5:
                        i19 = 6;
                        break;
                    case 6:
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    default:
                        i19 = 1;
                        break;
                    case 7:
                        i19 = 3;
                        break;
                    case 9:
                        i19 = i15;
                        break;
                    case 10:
                        i19 = 7;
                        break;
                }
                if (i19 != jVar2.f21119m) {
                    jVar2.f21119m = i19;
                    PlaybackSession playbackSession3 = jVar2.f21112c;
                    networkType = i.b().setNetworkType(i19);
                    timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - jVar2.f21113d);
                    build3 = timeSinceCreatedMillis3.build();
                    playbackSession3.reportNetworkEvent(build3);
                }
                if (c1549c.d0() != i16) {
                    jVar2.f21127u = false;
                }
                c1549c.E0();
                if (c1549c.f19872w0.f20487f != null) {
                    jVar2.f21129w = false;
                } else if (fVar.f21175a.get(i17)) {
                    jVar2.f21129w = true;
                }
                int d02 = c1549c.d0();
                if (!jVar2.f21127u) {
                    i17 = i18;
                } else if (jVar2.f21129w) {
                    i17 = 13;
                } else if (d02 == 4) {
                    i17 = 11;
                } else if (d02 == i16) {
                    int i40 = jVar2.f21118l;
                    if (i40 == 0 || i40 == i16) {
                        i17 = i16;
                    } else if (c1549c.c0()) {
                        c1549c.E0();
                        if (c1549c.f19872w0.f20491m == 0) {
                            i17 = 6;
                        }
                    } else {
                        i17 = 7;
                    }
                } else {
                    i17 = 3;
                    if (d02 != 3) {
                        i17 = (d02 != 1 || jVar2.f21118l == 0) ? jVar2.f21118l : 12;
                    } else if (c1549c.c0()) {
                        c1549c.E0();
                        if (c1549c.f19872w0.f20491m != 0) {
                            i17 = i11;
                        }
                    } else {
                        i17 = 4;
                    }
                }
                if (jVar2.f21118l != i17) {
                    jVar2.f21118l = i17;
                    jVar2.f21109A = true;
                    PlaybackSession playbackSession4 = jVar2.f21112c;
                    state = i.i().setState(jVar2.f21118l);
                    timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - jVar2.f21113d);
                    build2 = timeSinceCreatedMillis2.build();
                    playbackSession4.reportPlaybackStateEvent(build2);
                }
                if (fVar.f21175a.get(1028)) {
                    return;
                }
                h hVar3 = jVar2.f21111b;
                C1703a c1703a4 = (C1703a) sparseArray2.get(1028);
                c1703a4.getClass();
                synchronized (hVar3) {
                    try {
                        String str = hVar3.f21108f;
                        if (str != null) {
                            g gVar3 = (g) hVar3.f21105c.get(str);
                            gVar3.getClass();
                            hVar3.a(gVar3);
                        }
                        Iterator it3 = hVar3.f21105c.values().iterator();
                        while (it3.hasNext()) {
                            g gVar4 = (g) it3.next();
                            it3.remove();
                            if (gVar4.f21099e && (jVar = hVar3.f21106d) != null) {
                                jVar.d(c1703a4, gVar4.f21095a);
                            }
                        }
                    } finally {
                    }
                }
                return;
            }
        }
        i15 = i10;
        i16 = 2;
        l10 = 0;
        i17 = 10;
        i18 = 5;
        if (jVar2.a(jVar2.f21121o)) {
        }
        if (jVar2.a(jVar2.f21122p)) {
        }
        if (jVar2.a(jVar2.f21123q)) {
        }
        switch (u.f(jVar2.f21110a).g()) {
        }
        if (i19 != jVar2.f21119m) {
        }
        if (c1549c.d0() != i16) {
        }
        c1549c.E0();
        if (c1549c.f19872w0.f20487f != null) {
        }
        int d022 = c1549c.d0();
        if (!jVar2.f21127u) {
        }
        if (jVar2.f21118l != i17) {
        }
        if (fVar.f21175a.get(1028)) {
        }
    }

    @Override // j8.InterfaceC1386a
    public void f(InterfaceC1387b interfaceC1387b) {
        ((InterfaceC1386a) this.f21079b).f(interfaceC1387b);
        ((InterfaceC1386a) this.f21080c).f(interfaceC1387b);
    }

    @Override // p7.c
    public Object g(T6.a aVar) {
        String str;
        Context context = (Context) aVar.a(Context.class);
        switch (((Y) this.f21080c).f7974a) {
            case 12:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo == null) {
                    str = "";
                    break;
                } else {
                    str = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
            case 13:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 == null) {
                    str = "";
                    break;
                } else {
                    str = String.valueOf(applicationInfo2.minSdkVersion);
                    break;
                }
            case 14:
                int i7 = Build.VERSION.SDK_INT;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            if (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                str = "embedded";
                                break;
                            } else {
                                str = "";
                                break;
                            }
                        } else {
                            str = "auto";
                            break;
                        }
                    } else {
                        str = "watch";
                        break;
                    }
                } else {
                    str = "tv";
                    break;
                }
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    str = "";
                    break;
                } else {
                    str = FirebaseCommonRegistrar.a(installerPackageName);
                    break;
                }
        }
        return new C2032a((String) this.f21079b, str);
    }

    @Override // n5.i
    public void invoke(Object obj) {
        j jVar = (j) obj;
        jVar.getClass();
        C1703a c1703a = (C1703a) this.f21079b;
        B b2 = c1703a.f21073d;
        if (b2 == null) {
            return;
        }
        C0474w c0474w = (C0474w) this.f21080c;
        L l10 = (L) c0474w.f8155f;
        l10.getClass();
        b2.getClass();
        s sVar = new s(l10, c0474w.f8154e, jVar.f21111b.c(c1703a.f21071b, b2));
        int i7 = c0474w.f8152c;
        if (i7 != 0) {
            if (i7 == 1) {
                jVar.f21122p = sVar;
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                jVar.f21123q = sVar;
                return;
            }
        }
        jVar.f21121o = sVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((r8.g) this.f21079b).a((Intent) this.f21080c);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        C2149c c2149c = (C2149c) this.f21079b;
        C2151e c2151e = (C2151e) this.f21080c;
        synchronized (c2149c) {
            c2149c.f25202c = Tasks.forResult(c2151e);
        }
        return Tasks.forResult(c2151e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #8 {all -> 0x0055, blocks: (B:42:0x003e, B:45:0x0041, B:46:0x0042, B:50:0x005e, B:52:0x00cf, B:54:0x00d3, B:57:0x00d6, B:85:0x00da, B:86:0x00db, B:56:0x00d4), top: B:4:0x001a, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00db A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #8 {all -> 0x0055, blocks: (B:42:0x003e, B:45:0x0041, B:46:0x0042, B:50:0x005e, B:52:0x00cf, B:54:0x00d3, B:57:0x00d6, B:85:0x00da, B:86:0x00db, B:56:0x00d4), top: B:4:0x001a, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v38, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r1v5, types: [v8.i] */
    @Override // com.google.android.gms.tasks.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object then(Task task) {
        InputStream inputStream;
        Integer num;
        ?? r11;
        u8.g gVar;
        int responseCode;
        switch (this.f21078a) {
            case 4:
                r8.h hVar = (r8.h) this.f21079b;
                String str = (String) this.f21080c;
                synchronized (hVar) {
                    ((C2052e) hVar.f23841b).remove(str);
                }
                return task;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                c(task);
                return task;
            case 9:
                return ((C2153g) this.f21079b).c(task, 0L, (HashMap) this.f21080c);
            default:
                ?? r15 = (Task) this.f21080c;
                ?? r12 = (C2155i) this.f21079b;
                M5.b bVar = r12.f25247p;
                InputStream inputStream2 = null;
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    r15 = 0;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    num = null;
                    r12.b(inputStream2, inputStream);
                    synchronized (r12) {
                    }
                }
                if (!r15.isSuccessful()) {
                    throw new IOException(r15.getException());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) r15.getResult();
                r12.f25240f = httpURLConnection;
                r15 = httpURLConnection.getInputStream();
                try {
                    inputStream = r12.f25240f.getErrorStream();
                } catch (IOException e10) {
                    e = e10;
                    inputStream = null;
                    r15 = r15;
                    r11 = inputStream;
                    if (r12.f25239e) {
                    }
                    r12.b(r15, inputStream);
                    synchronized (r12) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    r11 = 0;
                }
                try {
                    responseCode = r12.f25240f.getResponseCode();
                    r11 = Integer.valueOf(responseCode);
                    if (responseCode == 200) {
                        try {
                            synchronized (r12) {
                                r12.f25237c = 8;
                            }
                            r12.f25248q.e(0, v8.k.f25253f);
                            C1798l j = r12.j(r12.f25240f);
                            r12.g = j;
                            j.g();
                        } catch (IOException e11) {
                            e = e11;
                            if (r12.f25239e) {
                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            } else {
                                synchronized (r12) {
                                    r12.f25237c = 8;
                                }
                            }
                            r12.b(r15, inputStream);
                            synchronized (r12) {
                                r12.f25236b = false;
                            }
                            if (r12.f25239e || (r11 != 0 && !C2155i.d(r11.intValue()))) {
                                r6 = false;
                            }
                            if (r6) {
                                bVar.getClass();
                                r12.k(new Date(System.currentTimeMillis()));
                            }
                            if (!r6 && r11.intValue() != 200) {
                                String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r11);
                                if (r11.intValue() == 403) {
                                    format = C2155i.f(r12.f25240f.getErrorStream());
                                }
                                gVar = new u8.g(r11.intValue(), format, 0);
                                r12.g(gVar);
                                r12.f25240f = null;
                                r12.g = null;
                                return Tasks.forResult(null);
                            }
                            r12.h();
                            r12.f25240f = null;
                            r12.g = null;
                            return Tasks.forResult(null);
                        }
                    }
                    r12.b(r15, inputStream);
                    synchronized (r12) {
                        r12.f25236b = false;
                    }
                    r6 = !r12.f25239e && C2155i.d(responseCode);
                    if (r6) {
                        bVar.getClass();
                        r12.k(new Date(System.currentTimeMillis()));
                    }
                } catch (IOException e12) {
                    e = e12;
                    r11 = 0;
                } catch (Throwable th4) {
                    th = th4;
                    r11 = 0;
                    inputStream2 = r15;
                    num = r11;
                    r12.b(inputStream2, inputStream);
                    synchronized (r12) {
                        r12.f25236b = false;
                        if (r12.f25239e || (num != null && !C2155i.d(num.intValue()))) {
                            r6 = false;
                        }
                        if (r6) {
                            bVar.getClass();
                            r12.k(new Date(System.currentTimeMillis()));
                        }
                        if (r6 || num.intValue() == 200) {
                            r12.h();
                        } else {
                            String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                            if (num.intValue() == 403) {
                                format2 = C2155i.f(r12.f25240f.getErrorStream());
                            }
                            r12.g(new u8.g(num.intValue(), format2, 0));
                        }
                        throw th;
                    }
                }
                if (!r6 && responseCode != 200) {
                    String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r11);
                    if (responseCode == 403) {
                        format3 = C2155i.f(r12.f25240f.getErrorStream());
                    }
                    gVar = new u8.g(responseCode, format3, 0);
                    r12.g(gVar);
                    r12.f25240f = null;
                    r12.g = null;
                    return Tasks.forResult(null);
                }
                r12.h();
                r12.f25240f = null;
                r12.g = null;
                return Tasks.forResult(null);
        }
    }
}
