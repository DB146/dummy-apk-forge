package t8;

import A0.AbstractC0017g;
import A0.G0;
import A9.C0089g2;
import A9.C0098j;
import A9.C0099j0;
import A9.Z1;
import Aa.w;
import Ba.s;
import C9.g;
import Ca.r;
import D5.i;
import Db.d;
import E3.e;
import G3.C0280b;
import G3.E;
import G3.F;
import G3.InterfaceC0279a;
import G3.t;
import G3.y;
import G8.m;
import I2.C0331u;
import M9.k;
import N.AbstractC0417g;
import N.C0419i;
import N.q;
import N6.Z;
import U2.f;
import U9.h;
import Y5.C0660y;
import a3.C0723O;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.bumptech.glide.load.data.j;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.internal.C1003t;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.kt.apps.core.service.CloudMessagingService;
import ea.C1108c;
import fc.Q;
import fc.b0;
import j0.n;
import j0.o;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import jb.InterfaceC1395f;
import kotlin.jvm.internal.l;
import m5.C1624v;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;
import org.json.JSONObject;
import y7.u0;

/* renamed from: t8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2034c implements InterfaceC1393d, X3.a, F6.c, InterfaceC1615l, t, InterfaceC0279a, E, InterfaceC0978t, J7.a, f, InterfaceC1394e, o, InterfaceC1395f {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2034c f24511c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24512a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24513b;

    public C2034c(int i7) {
        this.f24512a = 19;
        this.f24513b = Q.c(new int[i7]);
    }

    public C2034c(int i7, byte b2) {
        this.f24512a = i7;
        switch (i7) {
            case 16:
                this.f24513b = new m();
                return;
            case 17:
                this.f24513b = new i(11);
                return;
            case 27:
                return;
            default:
                this.f24513b = new HashSet();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2034c(Rb.c cVar) {
        this.f24512a = 26;
        this.f24513b = (kotlin.jvm.internal.m) cVar;
    }

    public C2034c(Context context) {
        this.f24512a = 9;
        this.f24513b = new e(context, 0);
    }

    public /* synthetic */ C2034c(Object obj, int i7) {
        this.f24512a = i7;
        this.f24513b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(I2.Q q10, Jb.c cVar) {
        C0331u c0331u;
        int i7;
        if (cVar instanceof C0331u) {
            c0331u = (C0331u) cVar;
            int i10 = c0331u.f5205c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0331u.f5205c = i10 - Integer.MIN_VALUE;
                Object obj = c0331u.f5203a;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c0331u.f5205c;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                    throw new d(0);
                }
                com.bumptech.glide.c.c0(obj);
                c0331u.f5205c = 1;
                ((b0) this.f24513b).a(q10, c0331u);
                return;
            }
        }
        c0331u = new C0331u(this, cVar);
        Object obj2 = c0331u.f5203a;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c0331u.f5205c;
        if (i7 == 0) {
        }
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        C0098j c0098j;
        int i7 = 0;
        switch (this.f24512a) {
            case 1:
                List bannerAds = (List) obj;
                w wVar = (w) this.f24513b;
                l.e(bannerAds, "bannerAds");
                if (bannerAds.isEmpty()) {
                    return;
                }
                try {
                    SimpleDateFormat simpleDateFormat = w.f1546v2;
                    C0098j c0098j2 = wVar.f27464h1;
                    C0098j c0098j3 = c0098j2 != null ? c0098j2 : null;
                    if (c0098j3 != null) {
                        c0098j3.h(0, bannerAds);
                    }
                    wVar.i1();
                    return;
                } catch (Exception e2) {
                    Log.e("TVPlaybackVideoFragment", "Failed to add banner ads", e2);
                    return;
                }
            case 2:
                List bannerAds2 = (List) obj;
                l.e(bannerAds2, "bannerAds");
                if (bannerAds2.isEmpty()) {
                    return;
                }
                s sVar = (s) this.f24513b;
                ((C0098j) sVar.f2281V0.getValue()).f(0, sVar.f2278S0.a("🛍️ Sản phẩm được đề xuất", bannerAds2));
                return;
            case 5:
                List bannerAds3 = (List) obj;
                l.e(bannerAds3, "bannerAds");
                if (bannerAds3.isEmpty() || (c0098j = ((r) this.f24513b).f27506m0) == null) {
                    return;
                }
                l.c(c0098j, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
                int size = c0098j.f1233c.size();
                for (Object obj2 : bannerAds3) {
                    int i10 = i7 + 1;
                    if (i7 < 0) {
                        u0.M();
                        throw null;
                    }
                    Jc.a aVar = (Jc.a) obj2;
                    int i11 = i7 * 5;
                    if (i11 <= size) {
                        c0098j.f(i11, aVar);
                    } else {
                        c0098j.g(aVar);
                    }
                    i7 = i10;
                }
                return;
            case 23:
                Throwable it = (Throwable) obj;
                l.e(it, "it");
                k t5 = (k) this.f24513b;
                l.e(t5, "t");
                return;
            default:
                Throwable it2 = (Throwable) obj;
                l.e(it2, "it");
                CloudMessagingService t10 = (CloudMessagingService) this.f24513b;
                l.e(t10, "t");
                return;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
    public void accept(Object obj, Object obj2) {
        H5.a aVar = (H5.a) ((H5.c) obj).getService();
        Parcel zaa = aVar.zaa();
        zac.zac(zaa, (C1003t) this.f24513b);
        aVar.zad(1, zaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        List it = (List) obj;
        l.e(it, "it");
        M9.t tVar = (M9.t) this.f24513b;
        h z8 = tVar.f6916c.z();
        M9.d[] dVarArr = (M9.d[]) it.toArray(new M9.d[0]);
        M9.d[] config = (M9.d[]) Arrays.copyOf(dVarArr, dVarArr.length);
        z8.getClass();
        l.e(config, "config");
        return android.support.v4.media.session.b.g(z8.f9862a, new Aa.t(11, z8, config)).e(Ab.e.f1561c).a(new M9.m(tVar, 2));
    }

    @Override // j0.o
    public long b() {
        C0419i c0419i = (C0419i) this.f24513b;
        long b2 = c0419i.f7049H.b();
        if (b2 != 16) {
            return b2;
        }
        N.o oVar = (N.o) AbstractC0017g.h(c0419i, q.f7068b);
        if (oVar != null) {
            long j = oVar.f7065a;
            if (j != 16) {
                return j;
            }
        }
        return ((n) AbstractC0017g.h(c0419i, AbstractC0417g.f7043a)).f18554a;
    }

    public void c(Set tableIds) {
        b0 b0Var;
        Object value;
        int[] iArr;
        l.e(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        do {
            b0Var = (b0) this.f24513b;
            value = b0Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = tableIds.contains(Integer.valueOf(i7)) ? iArr2[i7] + 1 : iArr2[i7];
            }
        } while (!b0Var.h(value, iArr));
    }

    public void d() {
        C9.c cVar = (C9.c) this.f24513b;
        Z1 z12 = cVar.f3073e;
        if (z12 != null) {
            long O10 = cVar.f3072d.f3061c.O();
            if (z12.g != O10) {
                z12.g = O10;
                C0089g2 c0089g2 = z12.f1047h;
                if (c0089g2 != null) {
                    c0089g2.f1202a.f1256v.setSecondaryProgress((int) ((O10 / r0.f1258x) * 2.147483647E9d));
                }
            }
        }
    }

    @Override // m5.InterfaceC1615l
    public InterfaceC1616m e() {
        C0723O c0723o = (C0723O) this.f24513b;
        return new E9.f(new C1624v((String) c0723o.f12522f, c0723o.f12517a, c0723o.f12518b, c0723o.f12519c, (C1108c) c0723o.f12521e, c0723o.f12520d));
    }

    @Override // G3.InterfaceC0279a
    public com.bumptech.glide.load.data.e f(AssetManager assetManager, String str) {
        return new j(assetManager, str, 0);
    }

    public void g() {
        g gVar = (g) ((C9.c) this.f24513b);
        C9.f fVar = g.f3090F;
        WeakReference weakReference = gVar.f3092D;
        boolean hasMessages = fVar.hasMessages(100, weakReference);
        C9.b bVar = gVar.f3072d;
        if (hasMessages) {
            fVar.removeMessages(100, weakReference);
            if (bVar.s() != gVar.f3076v) {
                fVar.sendMessageDelayed(fVar.obtainMessage(100, weakReference), 2000L);
            } else {
                boolean s3 = bVar.s();
                gVar.f3076v = s3;
                gVar.e(s3);
            }
        } else {
            boolean s10 = bVar.s();
            gVar.f3076v = s10;
            gVar.e(s10);
        }
        ArrayList arrayList = gVar.f3071c == null ? null : new ArrayList(gVar.f3071c);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((C0099j0) arrayList.get(i7)).getClass();
            }
        }
    }

    @Override // G3.E
    public com.bumptech.glide.load.data.e h(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f24513b, uri, 0);
    }

    @Override // X3.a
    public Object i() {
        A4.s sVar = (A4.s) this.f24513b;
        return new C3.k((F5.i) sVar.f471b, (Q7.h) sVar.f472c);
    }

    public void j(int i7, Serializable serializable) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f24513b).setResultCode(i7);
    }

    public D7.b k(JSONObject jSONObject) {
        D7.e eVar;
        int i7 = jSONObject.getInt("settings_version");
        if (i7 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.", null);
            eVar = new U9.j(3);
        } else {
            eVar = new h8.e(3);
        }
        return eVar.d((C0660y) this.f24513b, jSONObject);
    }

    @Override // U2.f
    public String l() {
        return ((L2.e) this.f24513b).f6280b;
    }

    @Override // G3.t
    public G3.s m(y yVar) {
        switch (this.f24512a) {
            case 14:
                return new C0280b(0, (AssetManager) this.f24513b, this);
            case 15:
                return new F(this);
            default:
                return new H3.a((i) this.f24513b);
        }
    }

    @Override // U2.f
    public void n(U2.e eVar) {
        L2.e eVar2 = (L2.e) this.f24513b;
        int length = eVar2.f6272d.length;
        for (int i7 = 1; i7 < length; i7++) {
            int i10 = eVar2.f6272d[i7];
            if (i10 == 1) {
                eVar.f(i7, eVar2.f6273e[i7]);
            } else if (i10 == 2) {
                eVar.b(i7, eVar2.f6274f[i7]);
            } else if (i10 == 3) {
                String str = eVar2.f6275u[i7];
                l.b(str);
                eVar.p(i7, str);
            } else if (i10 == 4) {
                byte[] bArr = eVar2.f6276v[i7];
                l.b(bArr);
                eVar.g(i7, bArr);
            } else if (i10 == 5) {
                eVar.a(i7);
            }
        }
    }

    @Override // J7.a
    public void onSuccess(String str) {
        ((TaskCompletionSource) this.f24513b).setResult(str);
    }

    @Override // J7.a
    public void q(String str) {
        ((TaskCompletionSource) this.f24513b).setException(new Exception(str));
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        W9.c oldItem = (W9.c) obj;
        l.e(oldItem, "oldItem");
        return oldItem.f10862e > ((W9.c) this.f24513b).f10862e;
    }

    public String toString() {
        switch (this.f24512a) {
            case 27:
                G0 C2 = E6.b.C(this);
                Z z8 = (Z) this.f24513b;
                if (z8 != null) {
                    String N10 = u0.N(z8.toString());
                    G0 g02 = new G0(23, (char) 0);
                    ((G0) C2.f29d).f28c = g02;
                    C2.f29d = g02;
                    g02.f29d = N10;
                    g02.f27b = "valueStrength";
                }
                return C2.toString();
            default:
                return super.toString();
        }
    }

    @Override // F6.c
    public Object zza() {
        switch (this.f24512a) {
            case 10:
                return new E6.c(((E6.e) ((C2034c) this.f24513b).f24513b).f3734b);
            default:
                return ((E6.e) this.f24513b).f3734b;
        }
    }
}
