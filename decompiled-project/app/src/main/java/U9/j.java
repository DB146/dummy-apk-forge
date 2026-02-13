package U9;

import A9.C0154x0;
import Y5.C0660y;
import Y5.F;
import Y5.InterfaceC0650t;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.ads.interactivemedia.pal.PlatformSignalCollector;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzqi;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.components.ComponentRegistrar;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.crypto.Mac;
import org.json.JSONObject;
import p7.C1857a;

/* loaded from: classes2.dex */
public final class j implements A3.j, D7.e, E4.v, J3.p, PlatformSignalCollector, Q5.c, X6.b, InterfaceC0650t {

    /* renamed from: b, reason: collision with root package name */
    public static volatile j f9883b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9894a;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j f9884c = new j(18);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j f9885d = new j(19);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j f9886e = new j(20);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j f9887f = new j(21);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ j f9888u = new j(22);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j f9889v = new j(23);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ j f9890w = new j(24);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j f9891x = new j(25);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ j f9892y = new j(26);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ j f9893z = new j(27);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ j f9881A = new j(28);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ j f9882B = new j(29);

    public /* synthetic */ j(int i7) {
        this.f9894a = i7;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [L9.c, L9.b] */
    public static L9.b l(int i7, String str) {
        int i10 = L9.c.f6423d;
        if ((i7 & 2) != 0) {
            str = null;
        }
        return new L9.c(4404, str, null);
    }

    public static D7.b m(C0660y c0660y) {
        return new D7.b(System.currentTimeMillis() + 3600000, new C0154x0(8), new C3.j(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // A3.j
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // X6.b
    public Object b(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // E4.v
    public MediaCodecInfo c(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // com.google.ads.interactivemedia.pal.PlatformSignalCollector
    public Task collectSignals(Context context, ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        context.getClass();
        executorService.getClass();
        executorService.execute(new E5.k(6, taskCompletionSource, context));
        return taskCompletionSource.getTask();
    }

    @Override // D7.e
    public D7.b d(C0660y c0660y, JSONObject jSONObject) {
        return m(c0660y);
    }

    @Override // E4.v
    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // J3.p
    public void f(D3.a aVar, Bitmap bitmap) {
    }

    @Override // E4.v
    public int g() {
        return MediaCodecList.getCodecCount();
    }

    @Override // Q5.c
    public E3.h h(Context context, String str, Q5.b bVar) {
        int d10;
        E3.h hVar = new E3.h();
        int c10 = bVar.c(context, str);
        hVar.f3537a = c10;
        int i7 = 1;
        int i10 = 0;
        if (c10 != 0) {
            d10 = bVar.d(context, str, false);
            hVar.f3538b = d10;
        } else {
            d10 = bVar.d(context, str, true);
            hVar.f3538b = d10;
        }
        int i11 = hVar.f3537a;
        if (i11 != 0) {
            i10 = i11;
        } else if (d10 == 0) {
            i7 = 0;
            hVar.f3539c = i7;
            return hVar;
        }
        if (i10 >= d10) {
            i7 = -1;
        }
        hVar.f3539c = i7;
        return hVar;
    }

    @Override // E4.v
    public boolean i(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // E4.v
    public boolean j() {
        return false;
    }

    @Override // J3.p
    public void k() {
    }

    public List n(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C1857a c1857a : componentRegistrar.getComponents()) {
            String str = c1857a.f23118a;
            if (str != null) {
                F8.a aVar = new F8.a(0, str, c1857a);
                c1857a = new C1857a(str, c1857a.f23119b, c1857a.f23120c, c1857a.f23121d, c1857a.f23122e, aVar, c1857a.g);
            }
            arrayList.add(c1857a);
        }
        return arrayList;
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f9894a) {
            case 18:
                return new Boolean(zzpk.zzb());
            case 19:
                List list = F.f11304a;
                return Boolean.valueOf(zzrd.zzb());
            case 20:
                List list2 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzak());
            case 21:
                List list3 = F.f11304a;
                return zzoy.zzN();
            case 22:
                List list4 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzK());
            case 23:
                List list5 = F.f11304a;
                return Long.valueOf(zzoy.zzI());
            case 24:
                List list6 = F.f11304a;
                return Long.valueOf(zzoy.zzi());
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                List list7 = F.f11304a;
                return zzoy.zzh();
            case 26:
                List list8 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzt());
            case 27:
                List list9 = F.f11304a;
                return Long.valueOf(zzqi.zze());
            case 28:
                List list10 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzq());
            default:
                List list11 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzp());
        }
    }
}
