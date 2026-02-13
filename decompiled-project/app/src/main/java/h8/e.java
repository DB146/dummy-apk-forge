package h8;

import A0.G0;
import A3.o;
import A9.C0154x0;
import C3.A;
import C3.j;
import E4.i;
import J3.F;
import T7.l;
import T7.q;
import W4.I;
import W4.InterfaceC0586d;
import W4.InterfaceC0587e;
import Y5.C0660y;
import Y5.InterfaceC0650t;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzqi;
import com.google.android.gms.internal.measurement.zzqr;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import m5.C1618o;
import m5.L;
import n5.AbstractC1705a;
import n5.D;
import org.json.JSONObject;
import t0.InterfaceC2015a;

/* loaded from: classes.dex */
public final class e implements D7.e, i, Hb.h, F, o, P3.g, R7.d, L, InterfaceC0586d, InterfaceC2015a, InterfaceC0650t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17890a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e f17879b = new e(18);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e f17880c = new e(19);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e f17881d = new e(20);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e f17882e = new e(21);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e f17883f = new e(22);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ e f17884u = new e(23);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ e f17885v = new e(24);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ e f17886w = new e(25);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e f17887x = new e(26);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ e f17888y = new e(27);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ e f17889z = new e(28);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ e f17878A = new e(29);

    public /* synthetic */ e(int i7) {
        this.f17890a = i7;
    }

    public static MediaCodec k(E4.h hVar) {
        hVar.f3575a.getClass();
        String str = hVar.f3575a.f3581a;
        AbstractC1705a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        AbstractC1705a.v();
        return createByCodecName;
    }

    @Override // R7.d
    public q a(l lVar, q qVar, boolean z8) {
        return null;
    }

    @Override // A3.d
    public boolean c(Object obj, File file, A3.l lVar) {
        try {
            W3.b.d(((N3.g) ((N3.c) ((A) obj).get()).f7173a.f7172b).f7188a.f26189d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }

    @Override // D7.e
    public D7.b d(C0660y c0660y, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        C0154x0 c0154x0 = jSONObject.has("session") ? new C0154x0(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new C0154x0(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new D7.b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), c0154x0, new j(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // W4.InterfaceC0586d
    public InterfaceC0587e e(int i7) {
        I i10 = new I();
        I i11 = new I();
        try {
            i10.f10658a.d(E6.b.q(0));
            int j = i10.j();
            boolean z8 = j % 2 == 0;
            i11.f10658a.d(E6.b.q(z8 ? j + 1 : j - 1));
            if (z8) {
                i10.f10659b = i11;
                return i10;
            }
            i11.f10659b = i10;
            return i11;
        } catch (IOException e2) {
            c2.i.f(i10);
            c2.i.f(i11);
            throw e2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, W4.d] */
    @Override // W4.InterfaceC0586d
    public InterfaceC0586d f() {
        return new Object();
    }

    @Override // m5.L
    public Object g(Uri uri, C1618o c1618o) {
        return Long.valueOf(D.P(new BufferedReader(new InputStreamReader(c1618o)).readLine()));
    }

    @Override // P3.g
    public void h(P3.i iVar) {
    }

    @Override // E4.i
    public E4.j i(E4.h hVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = k(hVar);
            AbstractC1705a.c("configureCodec");
            mediaCodec.configure(hVar.f3576b, hVar.f3578d, hVar.f3579e, 0);
            AbstractC1705a.v();
            AbstractC1705a.c("startCodec");
            mediaCodec.start();
            AbstractC1705a.v();
            return new G0(mediaCodec);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e2;
        }
    }

    @Override // P3.g
    public void j(P3.i iVar) {
        iVar.j();
    }

    @Override // J3.F
    public void m(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // A3.o
    public int q(A3.l lVar) {
        return 1;
    }

    @Override // J3.F
    public void r(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f17890a) {
            case 18:
                return new Boolean(zzpt.zza());
            case 19:
                List list = Y5.F.f11304a;
                return Boolean.valueOf(zzqr.zza());
            case 20:
                List list2 = Y5.F.f11304a;
                return Integer.valueOf((int) zzoy.zzaq());
            case 21:
                List list3 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzT());
            case 22:
                List list4 = Y5.F.f11304a;
                return Integer.valueOf((int) zzoy.zzP());
            case 23:
                List list5 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzf());
            case 24:
                List list6 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzz());
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                List list7 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzat());
            case 26:
                List list8 = Y5.F.f11304a;
                return Long.valueOf(zzoy.zzG());
            case 27:
                List list9 = Y5.F.f11304a;
                return Long.valueOf(zzqi.zzb());
            case 28:
                List list10 = Y5.F.f11304a;
                return Integer.valueOf((int) zzoy.zzd());
            default:
                List list11 = Y5.F.f11304a;
                return zzoy.zzac();
        }
    }
}
