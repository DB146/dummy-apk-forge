package E3;

import A0.G0;
import Aa.j;
import I2.C0330t;
import Y5.C0613f0;
import Y5.C0646q0;
import Y5.F;
import Y5.I1;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.measurement.zzhs;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.internal.l;
import o7.o;
import q3.s;
import w3.C2210c;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public long f3524a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3525b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3526c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3527d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3528e;

    public /* synthetic */ d(I1 i12) {
        Objects.requireNonNull(i12);
        this.f3528e = i12;
    }

    public void a(i3.i token) {
        Runnable runnable;
        l.e(token, "token");
        synchronized (this.f3527d) {
            runnable = (Runnable) ((LinkedHashMap) this.f3528e).remove(token);
        }
        if (runnable != null) {
            ((H7.e) this.f3525b).f4906a.removeCallbacks(runnable);
        }
    }

    public synchronized C2210c b() {
        try {
            if (((C2210c) this.f3528e) == null) {
                this.f3528e = C2210c.V((File) this.f3526c, this.f3524a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C2210c) this.f3528e;
    }

    public void c(i3.i token) {
        l.e(token, "token");
        j jVar = new j(19, this, token);
        synchronized (this.f3527d) {
        }
        H7.e eVar = (H7.e) this.f3525b;
        eVar.f4906a.postDelayed(jVar, this.f3524a);
    }

    @Override // E3.a
    public void d(A3.h hVar, G0 g02) {
        b bVar;
        C2210c b2;
        boolean z8;
        String t5 = ((s) this.f3525b).t(hVar);
        q3.l lVar = (q3.l) this.f3527d;
        synchronized (lVar) {
            bVar = (b) ((HashMap) lVar.f23391b).get(t5);
            if (bVar == null) {
                c cVar = (c) lVar.f23392c;
                synchronized (cVar.f3523a) {
                    bVar = (b) cVar.f3523a.poll();
                }
                if (bVar == null) {
                    bVar = new b();
                }
                ((HashMap) lVar.f23391b).put(t5, bVar);
            }
            bVar.f3522b++;
        }
        bVar.f3521a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + t5 + " for for Key: " + hVar);
            }
            try {
                b2 = b();
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
            if (b2.T(t5) != null) {
                return;
            }
            C0330t K10 = b2.K(t5);
            if (K10 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(t5));
            }
            try {
                if (((A3.d) g02.f27b).c(g02.f29d, K10.k(), (A3.l) g02.f28c)) {
                    C2210c.l((C2210c) K10.f5201c, K10, true);
                    K10.f5199a = true;
                }
                if (!z8) {
                    try {
                        K10.b();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!K10.f5199a) {
                    try {
                        K10.b();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((q3.l) this.f3527d).H(t5);
        }
    }

    @Override // E3.a
    public File e(A3.h hVar) {
        String t5 = ((s) this.f3525b).t(hVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + t5 + " for for Key: " + hVar);
        }
        try {
            o T10 = b().T(t5);
            if (T10 != null) {
                return ((File[]) T10.f22101b)[0];
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    public boolean f(long j, zzhs zzhsVar) {
        G.g(zzhsVar);
        if (((ArrayList) this.f3527d) == null) {
            this.f3527d = new ArrayList();
        }
        if (((ArrayList) this.f3526c) == null) {
            this.f3526c = new ArrayList();
        }
        if (!((ArrayList) this.f3527d).isEmpty() && ((((zzhs) ((ArrayList) this.f3527d).get(0)).zzf() / 1000) / 60) / 60 != ((zzhsVar.zzf() / 1000) / 60) / 60) {
            return false;
        }
        long zzcn = this.f3524a + zzhsVar.zzcn();
        I1 i12 = (I1) this.f3528e;
        if (!i12.d0().T(null, F.f11318e1)) {
            i12.d0();
            if (zzcn >= Math.max(0, ((Integer) F.j.a(null)).intValue())) {
                return false;
            }
        } else if (!((ArrayList) this.f3527d).isEmpty()) {
            i12.d0();
            if (zzcn >= Math.max(0, ((Integer) F.j.a(null)).intValue())) {
                return false;
            }
        }
        this.f3524a = zzcn;
        ((ArrayList) this.f3527d).add(zzhsVar);
        ((ArrayList) this.f3526c).add(Long.valueOf(j));
        int size = ((ArrayList) this.f3527d).size();
        i12.d0();
        return size < Math.max(1, ((Integer) F.k.a(null)).intValue());
    }

    public void g() {
        C0613f0 c0613f0 = (C0613f0) this.f3528e;
        c0613f0.J();
        ((C0646q0) c0613f0.f3094a).f11917y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = c0613f0.N().edit();
        edit.remove((String) this.f3526c);
        edit.remove((String) this.f3527d);
        edit.putLong((String) this.f3525b, currentTimeMillis);
        edit.apply();
    }
}
