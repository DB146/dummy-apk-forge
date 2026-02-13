package i2;

import A9.AbstractC0132r2;
import A9.C0109l2;
import A9.C0152w2;
import A9.N1;
import Y5.InterfaceC0650t;
import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqi;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.nio.ByteBuffer;
import java.util.List;
import u.C2046I;
import u.C2066t;

/* renamed from: i2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332t implements X3.a, N1, E7.a, J3.F, Q5.b, X3.c, InterfaceC0650t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18304a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18293b = new C1332t(18);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18294c = new C1332t(19);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18295d = new C1332t(20);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18296e = new C1332t(21);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18297f = new C1332t(22);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18298u = new C1332t(23);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18299v = new C1332t(24);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18300w = new C1332t(25);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18301x = new C1332t(26);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18302y = new C1332t(27);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18303z = new C1332t(28);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C1332t f18292A = new C1332t(29);

    public C1332t() {
        this.f18304a = 9;
        new C2066t(16);
        long[] jArr = u.Q.f24633a;
        new C2046I();
    }

    public /* synthetic */ C1332t(int i7) {
        this.f18304a = i7;
    }

    public static final boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // X3.c
    public void a(Object obj) {
    }

    @Override // A9.InterfaceC0149w
    public void b(C0109l2 itemViewHolder, Object item, C0152w2 rowViewHolder, Object obj) {
        AbstractC0132r2 row = (AbstractC0132r2) obj;
        kotlin.jvm.internal.l.e(itemViewHolder, "itemViewHolder");
        kotlin.jvm.internal.l.e(item, "item");
        kotlin.jvm.internal.l.e(rowViewHolder, "rowViewHolder");
        kotlin.jvm.internal.l.e(row, "row");
    }

    @Override // Q5.b
    public int c(Context context, String str) {
        return Q5.d.a(context, str);
    }

    @Override // Q5.b
    public int d(Context context, String str, boolean z8) {
        return Q5.d.d(context, str, z8);
    }

    @Override // E7.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // X3.a
    public Object i() {
        return new C3.z();
    }

    @Override // J3.F
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new J3.E((ByteBuffer) obj));
    }

    @Override // J3.F
    public void r(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new J3.E((ByteBuffer) obj));
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f18304a) {
            case 18:
                return new Boolean(zzpw.zza());
            case 19:
                List list = Y5.F.f11304a;
                return zzoy.zze();
            case 20:
                List list2 = Y5.F.f11304a;
                return Integer.valueOf((int) zzoy.zzr());
            case 21:
                List list3 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzA());
            case 22:
                List list4 = Y5.F.f11304a;
                return Integer.valueOf((int) zzoy.zzO());
            case 23:
                List list5 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzaf());
            case 24:
                List list6 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzy());
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                List list7 = Y5.F.f11304a;
                return Integer.valueOf((int) zzoy.zzas());
            case 26:
                List list8 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzH());
            case 27:
                List list9 = Y5.F.f11304a;
                return Integer.valueOf((int) zzqi.zzd());
            case 28:
                List list10 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzad());
            default:
                List list11 = Y5.F.f11304a;
                return zzoy.zzY();
        }
    }
}
