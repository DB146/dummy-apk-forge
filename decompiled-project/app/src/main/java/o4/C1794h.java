package o4;

import N6.t0;
import N6.y0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: o4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1794h {

    /* renamed from: c, reason: collision with root package name */
    public static final C1794h f21846c = new C1794h(new int[]{2}, 10);

    /* renamed from: d, reason: collision with root package name */
    public static final t0 f21847d = N6.H.M(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    public static final y0 f21848e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f21849a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21850b;

    static {
        A4.s sVar = new A4.s(4);
        sVar.B(5, 6);
        sVar.B(17, 6);
        sVar.B(7, 6);
        sVar.B(30, 10);
        sVar.B(18, 6);
        sVar.B(6, 8);
        sVar.B(8, 8);
        sVar.B(14, 8);
        f21848e = sVar.g();
    }

    public C1794h(int[] iArr, int i7) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f21849a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f21849a = new int[0];
        }
        this.f21850b = i7;
    }

    public static boolean a() {
        if (n5.D.f21141a >= 17) {
            String str = n5.D.f21143c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static C1794h b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [N6.K, N6.B] */
    public static C1794h c(Context context, Intent intent) {
        int i7 = n5.D.f21141a;
        C1794h c1794h = f21846c;
        if (i7 >= 23 && AbstractC1792f.b(context)) {
            return c1794h;
        }
        ?? b2 = new N6.B();
        if (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            t0 t0Var = f21847d;
            t0Var.getClass();
            b2.e(t0Var);
        }
        if (i7 >= 29 && (n5.D.L(context) || (i7 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            N6.H a9 = AbstractC1793g.a();
            a9.getClass();
            b2.e(a9);
            return new C1794h(h3.H.G(b2.h()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            N6.L h10 = b2.h();
            return !h10.isEmpty() ? new C1794h(h3.H.G(h10), 10) : c1794h;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List emptyList = intArrayExtra.length == 0 ? Collections.emptyList() : new Q6.a(0, intArrayExtra.length, intArrayExtra);
            emptyList.getClass();
            b2.e(emptyList);
        }
        return new C1794h(h3.H.G(b2.h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r8 != 5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair d(m4.L l10) {
        int intValue;
        int p10;
        String str = l10.f20096z;
        str.getClass();
        int c10 = n5.o.c(str, l10.f20093w);
        Integer valueOf = Integer.valueOf(c10);
        y0 y0Var = f21848e;
        if (!y0Var.containsKey(valueOf)) {
            return null;
        }
        int[] iArr = this.f21849a;
        int i7 = 6;
        if (c10 == 18 && Arrays.binarySearch(iArr, 18) < 0) {
            c10 = 6;
        } else if ((c10 == 8 && Arrays.binarySearch(iArr, 8) < 0) || (c10 == 30 && Arrays.binarySearch(iArr, 30) < 0)) {
            c10 = 7;
        }
        if (Arrays.binarySearch(iArr, c10) < 0) {
            return null;
        }
        int i10 = l10.f20075M;
        if (i10 == -1 || c10 == 18) {
            int i11 = l10.f20076N;
            if (i11 == -1) {
                i11 = 48000;
            }
            if (n5.D.f21141a >= 29) {
                intValue = AbstractC1793g.b(c10, i11);
            } else {
                Object obj = y0Var.get(Integer.valueOf(c10));
                intValue = ((Integer) (obj != null ? obj : 0)).intValue();
            }
            i10 = intValue;
        } else if (l10.f20096z.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (i10 > 10) {
                return null;
            }
        } else if (i10 > this.f21850b) {
            return null;
        }
        int i12 = n5.D.f21141a;
        if (i12 <= 28) {
            if (i10 == 7) {
                i7 = 8;
            } else if (i10 != 3) {
                if (i10 != 4) {
                }
            }
            if (i12 <= 26 && "fugu".equals(n5.D.f21142b) && i7 == 1) {
                i7 = 2;
            }
            p10 = n5.D.p(i7);
            if (p10 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c10), Integer.valueOf(p10));
        }
        i7 = i10;
        if (i12 <= 26) {
            i7 = 2;
        }
        p10 = n5.D.p(i7);
        if (p10 != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1794h)) {
            return false;
        }
        C1794h c1794h = (C1794h) obj;
        return Arrays.equals(this.f21849a, c1794h.f21849a) && this.f21850b == c1794h.f21850b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f21849a) * 31) + this.f21850b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f21850b + ", supportedEncodings=" + Arrays.toString(this.f21849a) + "]";
    }
}
