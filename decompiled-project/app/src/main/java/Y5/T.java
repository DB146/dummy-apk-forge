package Y5;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11560a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f11561b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11562c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11563d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11564e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11565f;

    /* renamed from: u, reason: collision with root package name */
    public final Object f11566u;

    public T(W w10, int i7, String str, Object obj, Object obj2, Object obj3) {
        this.f11561b = i7;
        this.f11562c = str;
        this.f11563d = obj;
        this.f11564e = obj2;
        this.f11565f = obj3;
        Objects.requireNonNull(w10);
        this.f11566u = w10;
    }

    public /* synthetic */ T(String str, Y y10, int i7, IOException iOException, byte[] bArr, Map map) {
        com.google.android.gms.common.internal.G.g(y10);
        this.f11563d = y10;
        this.f11561b = i7;
        this.f11564e = iOException;
        this.f11565f = bArr;
        this.f11562c = str;
        this.f11566u = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11560a) {
            case 0:
                W w10 = (W) this.f11566u;
                C0613f0 c0613f0 = ((C0646q0) w10.f3094a).f11911e;
                C0646q0.j(c0613f0);
                if (!c0613f0.f11992b) {
                    Log.println(6, w10.T(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (w10.f11574c == 0) {
                    C0615g c0615g = ((C0646q0) w10.f3094a).f11910d;
                    if (c0615g.f11756e == null) {
                        synchronized (c0615g) {
                            try {
                                if (c0615g.f11756e == null) {
                                    C0646q0 c0646q0 = (C0646q0) c0615g.f3094a;
                                    ApplicationInfo applicationInfo = c0646q0.f11907a.getApplicationInfo();
                                    String d10 = M5.c.d();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c0615g.f11756e = Boolean.valueOf(str != null && str.equals(d10));
                                    }
                                    if (c0615g.f11756e == null) {
                                        c0615g.f11756e = Boolean.TRUE;
                                        W w11 = c0646q0.f11912f;
                                        C0646q0.l(w11);
                                        w11.f11577f.a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c0615g.f11756e.booleanValue()) {
                        w10.f11574c = 'C';
                    } else {
                        w10.f11574c = 'c';
                    }
                }
                if (w10.f11575d < 0) {
                    ((C0646q0) w10.f3094a).f11910d.O();
                    w10.f11575d = 130000L;
                }
                int i7 = this.f11561b;
                char c10 = w10.f11574c;
                long j = w10.f11575d;
                String str2 = this.f11562c;
                Object obj = this.f11563d;
                Object obj2 = this.f11564e;
                Object obj3 = this.f11565f;
                char charAt = "01VDIWEA?".charAt(i7);
                String U8 = W.U(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(charAt).length() + 1 + String.valueOf(c10).length() + String.valueOf(j).length() + 1 + U8.length());
                sb2.append("2");
                sb2.append(charAt);
                sb2.append(c10);
                sb2.append(j);
                sb2.append(":");
                sb2.append(U8);
                String sb3 = sb2.toString();
                if (sb3.length() > 1024) {
                    sb3 = str2.substring(0, 1024);
                }
                E3.d dVar = c0613f0.f11743e;
                if (dVar != null) {
                    C0613f0 c0613f02 = (C0613f0) dVar.f3528e;
                    c0613f02.J();
                    if (((C0613f0) dVar.f3528e).N().getLong((String) dVar.f3525b, 0L) == 0) {
                        dVar.g();
                    }
                    if (sb3 == null) {
                        sb3 = "";
                    }
                    SharedPreferences N10 = c0613f02.N();
                    String str3 = (String) dVar.f3526c;
                    long j10 = N10.getLong(str3, 0L);
                    String str4 = (String) dVar.f3527d;
                    if (j10 <= 0) {
                        SharedPreferences.Editor edit = c0613f02.N().edit();
                        edit.putString(str4, sb3);
                        edit.putLong(str3, 1L);
                        edit.apply();
                        return;
                    }
                    M1 m12 = ((C0646q0) c0613f02.f3094a).f11915w;
                    C0646q0.j(m12);
                    long nextLong = m12.G0().nextLong() & Long.MAX_VALUE;
                    long j11 = j10 + 1;
                    long j12 = Long.MAX_VALUE / j11;
                    SharedPreferences.Editor edit2 = c0613f02.N().edit();
                    if (nextLong < j12) {
                        edit2.putString(str4, sb3);
                    }
                    edit2.putLong(str3, j11);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((Y) this.f11563d).f(this.f11562c, this.f11561b, (IOException) this.f11564e, (byte[]) this.f11565f, (Map) this.f11566u);
                return;
        }
    }
}
