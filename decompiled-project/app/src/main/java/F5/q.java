package F5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.F;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final m f4123a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f4124b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile F f4125c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f4126d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f4127e;

    static {
        new m(n.h("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new m(n.h("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f4123a = new m(n.h("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f4124b = new m(n.h("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
        f4126d = new Object();
    }

    public static v a(String str, o oVar, boolean z8, boolean z10) {
        try {
            b();
            G.g(f4127e);
            t tVar = new t(str, oVar, z8, z10);
            try {
                F f4 = f4125c;
                P5.b bVar = new P5.b(f4127e.getPackageManager());
                D d10 = (D) f4;
                Parcel zza = d10.zza();
                zzc.zzc(zza, tVar);
                zzc.zze(zza, bVar);
                Parcel zzB = d10.zzB(5, zza);
                boolean zzf = zzc.zzf(zzB);
                zzB.recycle();
                return zzf ? v.f4143d : new u(new l(z8, str, oVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new v(false, "module call", e2);
            }
        } catch (Q5.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return new v(false, "module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.common.internal.F] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void b() {
        ?? r12;
        if (f4125c != null) {
            return;
        }
        G.g(f4127e);
        synchronized (f4126d) {
            try {
                if (f4125c == null) {
                    IBinder b2 = Q5.d.c(f4127e, Q5.d.f8653e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i7 = E.f15022a;
                    if (b2 == null) {
                        r12 = 0;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        r12 = queryLocalInterface instanceof F ? (F) queryLocalInterface : new zza(b2, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    f4125c = r12;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
