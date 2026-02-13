package Y5;

import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.internal.measurement.zzqc;
import com.google.android.gms.internal.measurement.zzql;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import e8.InterfaceC1098a;
import i2.C1312U;
import ia.C1358d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import jb.InterfaceC1393d;
import k4.InterfaceC1421a;
import m4.C1586o0;
import m5.C1599C;
import m5.C1617n;
import n.InterfaceC1689w;
import n.MenuC1678l;
import o2.InterfaceC1780b;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public /* synthetic */ class B implements InterfaceC0650t, InterfaceC1098a, p7.c, InterfaceC1421a, InterfaceC1780b, InterfaceC1393d, InterfaceC1689w, InterfaceC1984l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ B f11212b = new B(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ B f11213c = new B(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ B f11214d = new B(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ B f11215e = new B(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ B f11216f = new B(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ B f11217u = new B(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ B f11218v = new B(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ B f11219w = new B(8);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ B f11220x = new B(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11221a;

    public /* synthetic */ B(int i7) {
        this.f11221a = i7;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [y1.t, ia.d] */
    public B(View view) {
        this.f11221a = 19;
        if (Build.VERSION.SDK_INT >= 30) {
            new C1358d(view, 24).f26735c = view;
        } else {
            new C1358d(view, 24);
        }
    }

    public B(ua.e eVar) {
        this.f11221a = 18;
    }

    public static D4.e c(C1312U c1312u, A7.a aVar) {
        int i7;
        IOException iOException = (IOException) aVar.f532b;
        if (!(iOException instanceof C1599C) || ((i7 = ((C1599C) iOException).f20535d) != 403 && i7 != 404 && i7 != 410 && i7 != 416 && i7 != 500 && i7 != 503)) {
            return null;
        }
        if (c1312u.b(1)) {
            return new D4.e(1, 300000L);
        }
        if (c1312u.b(2)) {
            return new D4.e(2, 60000L);
        }
        return null;
    }

    public static long e(A7.a aVar) {
        Throwable th = (IOException) aVar.f532b;
        if (!(th instanceof C1586o0) && !(th instanceof FileNotFoundException) && !(th instanceof m5.z) && !(th instanceof m5.I)) {
            int i7 = C1617n.f20620b;
            while (th != null) {
                if (!(th instanceof C1617n) || ((C1617n) th).f20621a != 2008) {
                    th = th.getCause();
                }
            }
            return Math.min((aVar.f531a - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override // n.InterfaceC1689w
    public void a(MenuC1678l menuC1678l, boolean z8) {
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
    }

    @Override // k4.InterfaceC1421a
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public int d(int i7) {
        return i7 == 7 ? 6 : 3;
    }

    @Override // s4.InterfaceC1984l
    public void f() {
        throw new UnsupportedOperationException();
    }

    @Override // p7.c
    public /* synthetic */ Object g(T6.a aVar) {
        return AnalyticsConnectorRegistrar.zza(aVar);
    }

    @Override // s4.InterfaceC1984l
    public void i(s4.s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // n.InterfaceC1689w
    public boolean j(MenuC1678l menuC1678l) {
        return false;
    }

    public String toString() {
        switch (this.f11221a) {
            case 13:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    @Override // s4.InterfaceC1984l
    public s4.v u(int i7, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f11221a) {
            case 0:
                List list = F.f11304a;
                return Integer.valueOf((int) zzoy.zzar());
            case 1:
                List list2 = F.f11304a;
                return Boolean.valueOf(zzoy.zzc());
            case 2:
                List list3 = F.f11304a;
                return Boolean.valueOf(zzpq.zzd());
            case 3:
                List list4 = F.f11304a;
                return Boolean.valueOf(zzpn.zzc());
            case 4:
                List list5 = F.f11304a;
                return Boolean.valueOf(zzql.zzi());
            case 5:
                List list6 = F.f11304a;
                return Boolean.valueOf(zzov.zza());
            default:
                return new Boolean(zzqc.zza());
        }
    }
}
