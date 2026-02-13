package Z3;

import X.c;
import Y.k;
import a4.AbstractC0740A;
import a4.AbstractC0741B;
import a4.AbstractC0742C;
import a4.AbstractC0743D;
import a4.AbstractC0744E;
import a4.AbstractC0745F;
import a4.AbstractC0748I;
import a4.AbstractC0750a;
import a4.AbstractC0772w;
import a4.AbstractC0774y;
import a4.C0751b;
import a4.C0752c;
import a4.C0753d;
import a4.C0754e;
import a4.C0755f;
import a4.C0756g;
import a4.C0757h;
import a4.C0758i;
import a4.C0759j;
import a4.C0760k;
import a4.C0761l;
import a4.C0762m;
import a4.C0763n;
import a4.C0764o;
import a4.C0765p;
import a4.C0766q;
import a4.C0767r;
import a4.C0768s;
import a4.C0769t;
import a4.C0771v;
import a4.EnumC0746G;
import a4.EnumC0747H;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import b4.C0837h;
import c4.InterfaceC0906h;
import c8.d;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import k4.InterfaceC1421a;

/* loaded from: classes.dex */
public final class b implements InterfaceC0906h {

    /* renamed from: a, reason: collision with root package name */
    public final R7.a f12143a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f12144b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f12145c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f12146d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1421a f12147e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1421a f12148f;
    public final int g;

    public b(Context context, InterfaceC1421a interfaceC1421a, InterfaceC1421a interfaceC1421a2) {
        d dVar = new d();
        C0752c c0752c = C0752c.f12624a;
        dVar.a(AbstractC0772w.class, c0752c);
        dVar.a(C0762m.class, c0752c);
        C0759j c0759j = C0759j.f12647a;
        dVar.a(AbstractC0745F.class, c0759j);
        dVar.a(C0769t.class, c0759j);
        C0753d c0753d = C0753d.f12626a;
        dVar.a(AbstractC0774y.class, c0753d);
        dVar.a(C0763n.class, c0753d);
        C0751b c0751b = C0751b.f12614a;
        dVar.a(AbstractC0750a.class, c0751b);
        dVar.a(C0761l.class, c0751b);
        C0758i c0758i = C0758i.f12639a;
        dVar.a(AbstractC0744E.class, c0758i);
        dVar.a(C0768s.class, c0758i);
        C0754e c0754e = C0754e.f12629a;
        dVar.a(AbstractC0740A.class, c0754e);
        dVar.a(C0764o.class, c0754e);
        C0757h c0757h = C0757h.f12637a;
        dVar.a(AbstractC0743D.class, c0757h);
        dVar.a(C0767r.class, c0757h);
        C0756g c0756g = C0756g.f12635a;
        dVar.a(AbstractC0742C.class, c0756g);
        dVar.a(C0766q.class, c0756g);
        C0760k c0760k = C0760k.f12654a;
        dVar.a(AbstractC0748I.class, c0760k);
        dVar.a(C0771v.class, c0760k);
        C0755f c0755f = C0755f.f12632a;
        dVar.a(AbstractC0741B.class, c0755f);
        dVar.a(C0765p.class, c0755f);
        dVar.f14449d = true;
        this.f12143a = new R7.a(dVar, 20);
        this.f12145c = context;
        this.f12144b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f12146d = b(a.f12137c);
        this.f12147e = interfaceC1421a2;
        this.f12148f = interfaceC1421a;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(c.t("Invalid url: ", str), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (((a4.EnumC0746G) a4.EnumC0746G.f12608a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0837h a(C0837h c0837h) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f12144b.getActiveNetworkInfo();
        k c10 = c0837h.c();
        int i7 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c10.f11059f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i7));
        c10.b("model", Build.MODEL);
        c10.b("hardware", Build.HARDWARE);
        c10.b("device", Build.DEVICE);
        c10.b("product", Build.PRODUCT);
        c10.b("os-uild", Build.ID);
        c10.b("manufacturer", Build.MANUFACTURER);
        c10.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c10.f11059f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i10 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = EnumC0747H.f12610a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c10.f11059f;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = EnumC0746G.f12608a;
                subtype = 100;
            }
            hashMap = (HashMap) c10.f11059f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c10.b("country", Locale.getDefault().getCountry());
            c10.b("locale", Locale.getDefault().getLanguage());
            Context context = this.f12145c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c10.b("mcc_mnc", simOperator);
            try {
                i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e2) {
                android.support.v4.media.session.b.m(e2, "CctTransportBackend", "Unable to find version code for package");
            }
            c10.b("application_build", Integer.toString(i10));
            return c10.d();
        }
        SparseArray sparseArray3 = EnumC0746G.f12608a;
        subtype = 0;
        hashMap = (HashMap) c10.f11059f;
        if (hashMap != null) {
        }
    }
}
