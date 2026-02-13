package X4;

import W4.C0591i;
import W4.l;
import Z9.x;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0960a;
import com.google.android.gms.common.api.internal.C0967h;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.L;
import com.google.android.gms.common.internal.AbstractC0990f;
import com.google.android.gms.common.internal.C0993i;
import com.google.android.gms.common.internal.C1001q;
import com.google.android.gms.common.internal.C1002s;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Locale;
import n5.D;
import n5.v;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class i implements h, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public int f10976a;

    /* renamed from: b, reason: collision with root package name */
    public long f10977b;

    /* renamed from: c, reason: collision with root package name */
    public long f10978c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10979d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10980e;

    public i(l lVar) {
        this.f10979d = lVar;
        this.f10977b = -9223372036854775807L;
        this.f10978c = 0L;
        this.f10976a = -1;
    }

    public i(C0967h c0967h, int i7, C0960a c0960a, long j, long j10) {
        this.f10979d = c0967h;
        this.f10976a = i7;
        this.f10980e = c0960a;
        this.f10977b = j;
        this.f10978c = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0993i e(E e2, AbstractC0990f abstractC0990f, int i7) {
        C0993i telemetryConfiguration = abstractC0990f.getTelemetryConfiguration();
        if (telemetryConfiguration != null && telemetryConfiguration.f15068b) {
            int i10 = 0;
            int[] iArr = telemetryConfiguration.f15070d;
            if (iArr == null) {
                int[] iArr2 = telemetryConfiguration.f15072f;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] != i7) {
                            i10++;
                        }
                    }
                }
                if (e2.f14926o >= telemetryConfiguration.f15071e) {
                    return telemetryConfiguration;
                }
                return null;
            }
            while (i10 < iArr.length) {
                if (iArr[i10] != i7) {
                    i10++;
                } else if (e2.f14926o >= telemetryConfiguration.f15071e) {
                }
            }
        }
        return null;
    }

    @Override // X4.h
    public void a(long j, long j10) {
        this.f10977b = j;
        this.f10978c = j10;
    }

    @Override // X4.h
    public void b(long j) {
        this.f10977b = j;
    }

    @Override // X4.h
    public void c(v vVar, long j, int i7, boolean z8) {
        int a9;
        ((s4.v) this.f10980e).getClass();
        int i10 = this.f10976a;
        if (i10 != -1 && i7 != (a9 = C0591i.a(i10))) {
            int i11 = D.f21141a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", A3.c.e(a9, i7, "Received RTP packet with unexpected sequence number. Expected: ", "; received: ", "."));
        }
        long U8 = x.U(this.f10978c, j, this.f10977b, ((l) this.f10979d).f10721b);
        int a10 = vVar.a();
        ((s4.v) this.f10980e).c(a10, vVar);
        ((s4.v) this.f10980e).e(U8, 1, a10, 0, null);
        this.f10976a = i7;
    }

    @Override // X4.h
    public void d(InterfaceC1984l interfaceC1984l, int i7) {
        s4.v u3 = interfaceC1984l.u(i7, 1);
        this.f10980e = u3;
        u3.a(((l) this.f10979d).f10722c);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        E e2;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j;
        long j10;
        C0967h c0967h = (C0967h) this.f10979d;
        if (c0967h.c()) {
            C1002s c1002s = (C1002s) r.b().f15106a;
            if ((c1002s == null || c1002s.f15108b) && (e2 = (E) c0967h.f14998x.get((C0960a) this.f10980e)) != null) {
                Object obj = e2.f14918b;
                if (obj instanceof AbstractC0990f) {
                    AbstractC0990f abstractC0990f = (AbstractC0990f) obj;
                    long j11 = this.f10977b;
                    boolean z8 = j11 > 0;
                    int gCoreServiceId = abstractC0990f.getGCoreServiceId();
                    if (c1002s != null) {
                        z8 &= c1002s.f15109c;
                        boolean hasConnectionInfo = abstractC0990f.hasConnectionInfo();
                        i7 = c1002s.f15110d;
                        int i16 = c1002s.f15107a;
                        if (!hasConnectionInfo || abstractC0990f.isConnecting()) {
                            i11 = c1002s.f15111e;
                            i10 = i16;
                        } else {
                            C0993i e10 = e(e2, abstractC0990f, this.f10976a);
                            if (e10 == null) {
                                return;
                            }
                            boolean z10 = e10.f15069c && j11 > 0;
                            i11 = e10.f15071e;
                            i10 = i16;
                            z8 = z10;
                        }
                    } else {
                        i7 = 5000;
                        i10 = 0;
                        i11 = 100;
                    }
                    int i17 = i7;
                    if (task.isSuccessful()) {
                        i13 = 0;
                        i14 = 0;
                    } else if (task.isCanceled()) {
                        i13 = -1;
                        i14 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.j) {
                            Status status = ((com.google.android.gms.common.api.j) exception).getStatus();
                            i12 = status.f14897a;
                            F5.b bVar = status.f14900d;
                            if (bVar != null) {
                                i13 = bVar.f4088b;
                                i14 = i12;
                            }
                        } else {
                            i12 = 101;
                        }
                        i13 = -1;
                        i14 = i12;
                    }
                    if (z8) {
                        long currentTimeMillis = System.currentTimeMillis();
                        i15 = (int) (SystemClock.elapsedRealtime() - this.f10978c);
                        j = j11;
                        j10 = currentTimeMillis;
                    } else {
                        i15 = -1;
                        j = 0;
                        j10 = 0;
                    }
                    L l10 = new L(new C1001q(this.f10976a, i14, i13, j, j10, null, null, gCoreServiceId, i15), i10, i17, i11);
                    zau zauVar = c0967h.f14987B;
                    zauVar.sendMessage(zauVar.obtainMessage(18, l10));
                }
            }
        }
    }
}
