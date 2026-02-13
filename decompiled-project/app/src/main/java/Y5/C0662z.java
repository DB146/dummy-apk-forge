package Y5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpq;
import java.util.List;
import jb.InterfaceC1395f;
import m5.InterfaceC1603G;
import n5.AbstractC1705a;
import o2.InterfaceC1780b;
import s4.InterfaceC1975c;
import t7.InterfaceC2030a;

/* renamed from: Y5.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0662z implements InterfaceC0650t, InterfaceC1780b, InterfaceC1395f, InterfaceC1603G, InterfaceC1975c, InterfaceC2030a, x7.d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0662z f12007b = new C0662z(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0662z f12008c = new C0662z(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C0662z f12009d = new C0662z(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C0662z f12010e = new C0662z(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0662z f12011f = new C0662z(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C0662z f12012u = new C0662z(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C0662z f12013v = new C0662z(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12014a;

    public /* synthetic */ C0662z(int i7) {
        this.f12014a = i7;
    }

    public C0662z(c2.t tVar) {
        this.f12014a = 8;
    }

    @Override // x7.d
    public void a() {
    }

    @Override // m5.InterfaceC1603G
    public void b() {
        synchronized (AbstractC1705a.f21158h) {
            Object obj = AbstractC1705a.f21159i;
            synchronized (obj) {
                if (AbstractC1705a.j) {
                    return;
                }
                long a9 = AbstractC1705a.a();
                synchronized (obj) {
                    AbstractC1705a.k = a9;
                    AbstractC1705a.j = true;
                }
            }
        }
    }

    @Override // x7.d
    public String c() {
        return null;
    }

    @Override // m5.InterfaceC1603G
    public void d() {
    }

    @Override // s4.InterfaceC1975c
    public long e(long j) {
        return j;
    }

    @Override // x7.d
    public void f(String str, long j) {
    }

    @Override // t7.InterfaceC2030a
    public void j(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        return true;
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f12014a) {
            case 0:
                List list = F.f11304a;
                return zzoy.zzk();
            case 1:
                List list2 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzw());
            case 2:
                List list3 = F.f11304a;
                return Boolean.valueOf(zzpq.zzb());
            case 3:
                List list4 = F.f11304a;
                return Integer.valueOf((int) zzpb.zza());
            case 4:
                List list5 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzam());
            case 5:
                List list6 = F.f11304a;
                return Boolean.valueOf(zzph.zzb());
            default:
                List list7 = F.f11304a;
                return Long.valueOf(zzoy.zza());
        }
    }
}
