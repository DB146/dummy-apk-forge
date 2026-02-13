package Y6;

import A0.AbstractC0017g;
import A0.C0005a;
import A0.C0031u;
import K2.B;
import N6.y0;
import Z9.x;
import a.AbstractC0672a;
import a1.AbstractC0707h;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewOutlineProvider;
import bc.EnumC0851c;
import c.AbstractC0862f;
import cc.C0944m;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m4.Y;
import m5.C1619p;
import n5.AbstractC1705a;
import n7.AbstractC1712c;
import n7.C1714e;
import n7.F;
import n7.o;
import n7.w;
import n7.z;
import p7.C1857a;
import t8.C2032a;
import tss.r.core.ads.ui.leanback.ShopeeProductDetailsActivity;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static SparseArray f12025a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f12026b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f12027c;

    /* renamed from: d, reason: collision with root package name */
    public static Class f12028d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f12029e;

    /* renamed from: f, reason: collision with root package name */
    public static Field f12030f;
    public static boolean g;

    /* renamed from: h, reason: collision with root package name */
    public static Field f12031h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f12032i;
    public static final /* synthetic */ int j = 0;

    public static zzait A(AbstractC1712c abstractC1712c, String str) {
        if (o.class.isAssignableFrom(abstractC1712c.getClass())) {
            o oVar = (o) abstractC1712c;
            return new zzait(oVar.f21294a, oVar.f21295b, "google.com", null, null, null, str, null, null);
        }
        if (C1714e.class.isAssignableFrom(abstractC1712c.getClass())) {
            return new zzait(null, ((C1714e) abstractC1712c).f21286a, "facebook.com", null, null, null, str, null, null);
        }
        if (z.class.isAssignableFrom(abstractC1712c.getClass())) {
            z zVar = (z) abstractC1712c;
            return new zzait(null, zVar.f21310a, "twitter.com", null, zVar.f21311b, null, str, null, null);
        }
        if (n7.n.class.isAssignableFrom(abstractC1712c.getClass())) {
            return new zzait(null, ((n7.n) abstractC1712c).f21293a, "github.com", null, null, null, str, null, null);
        }
        if (w.class.isAssignableFrom(abstractC1712c.getClass())) {
            return new zzait(null, null, "playgames.google.com", null, null, ((w) abstractC1712c).f21305a, str, null, null);
        }
        if (!F.class.isAssignableFrom(abstractC1712c.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        F f4 = (F) abstractC1712c;
        zzait zzaitVar = f4.f21260d;
        if (zzaitVar != null) {
            return zzaitVar;
        }
        return new zzait(f4.f21258b, f4.f21259c, f4.f21257a, null, f4.f21262f, null, str, f4.f21261e, f4.f21263u);
    }

    public static V0.d a() {
        return new V0.d(1.0f, 1.0f);
    }

    public static final boolean b(f0.f fVar, long j10) {
        if (!fVar.f14113a.f14112B) {
            return false;
        }
        C0031u c0031u = (C0031u) AbstractC0017g.t(fVar).f60S.f226c;
        if (!c0031u.f310Y.f14112B) {
            return false;
        }
        long A10 = c0031u.A(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (A10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (A10 & 4294967295L));
        long j11 = fVar.f16933E;
        float f4 = ((int) (j11 >> 32)) + intBitsToFloat;
        float f10 = ((int) (j11 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f4) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f10;
    }

    public static final Object c(R6.a aVar, Jb.i iVar) {
        try {
            if (aVar.isDone()) {
                return AbstractC0707h.j(aVar);
            }
            C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(iVar));
            aVar.a(new a1.o(aVar, c0944m, 0), a1.m.f12478a);
            c0944m.u(new C0005a(aVar, 21));
            Object r10 = c0944m.r();
            Ib.a aVar2 = Ib.a.f5345a;
            return r10;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            NullPointerException nullPointerException = new NullPointerException();
            kotlin.jvm.internal.l.i(nullPointerException, kotlin.jvm.internal.l.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = r(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(int i7, Rect rect, Rect rect2, Rect rect3) {
        boolean e2 = e(i7, rect, rect2);
        if (e(i7, rect, rect3) || !e2) {
            return false;
        }
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static boolean e(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, D4.c] */
    public static C1619p f(T4.m mVar, String str, T4.j jVar, int i7) {
        ?? obj = new Object();
        obj.f3211a = 1;
        obj.g = Collections.emptyMap();
        obj.f3213c = -1L;
        obj.f3215e = AbstractC1705a.O(str, jVar.f9287c);
        obj.f3212b = jVar.f9285a;
        obj.f3213c = jVar.f9286b;
        String a9 = mVar.a();
        if (a9 == null) {
            a9 = AbstractC1705a.O(((T4.b) mVar.f9293b.get(0)).f9243a, jVar.f9287c).toString();
        }
        obj.f3217h = a9;
        obj.f3214d = i7;
        obj.g = y0.f7368u;
        return obj.d();
    }

    public static byte[] g(ArrayDeque arrayDeque, int i7) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i7 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final long h(long j10, EnumC0851c sourceUnit, EnumC0851c targetUnit) {
        kotlin.jvm.internal.l.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.l.e(targetUnit, "targetUnit");
        return targetUnit.f14004a.convert(j10, sourceUnit.f14004a);
    }

    public static final long i(long j10, EnumC0851c sourceUnit, EnumC0851c targetUnit) {
        kotlin.jvm.internal.l.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.l.e(targetUnit, "targetUnit");
        return targetUnit.f14004a.convert(j10, sourceUnit.f14004a);
    }

    public static C1857a j(String str, String str2) {
        C2032a c2032a = new C2032a(str, str2);
        Y a9 = C1857a.a(C2032a.class);
        a9.f20193c = 1;
        a9.f20196f = new n4.d(c2032a);
        return a9.b();
    }

    public static final float k(float f4) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f4) & 8589934591L) / 3)) + 709952852);
        float f10 = intBitsToFloat - ((intBitsToFloat - (f4 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f10 - ((f10 - (f4 / (f10 * f10))) * 0.33333334f);
    }

    public static C1857a l(String str, P4.Y y10) {
        Y a9 = C1857a.a(C2032a.class);
        a9.f20193c = 1;
        a9.a(p7.h.c(Context.class));
        a9.f20196f = new n4.b(5, str, y10);
        return a9.b();
    }

    public static D0.a m(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new D0.a(D0.d.b(view));
        }
        return null;
    }

    public static final Bundle n(String key, Bundle bundle) {
        kotlin.jvm.internal.l.e(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        x.E(key);
        throw null;
    }

    public static final ArrayList o(String key, Bundle bundle) {
        kotlin.jvm.internal.l.e(key, "key");
        ArrayList c10 = Build.VERSION.SDK_INT >= 34 ? AbstractC0862f.c(bundle, key, c2.i.q(kotlin.jvm.internal.w.a(Bundle.class))) : bundle.getParcelableArrayList(key);
        if (c10 != null) {
            return c10;
        }
        x.E(key);
        throw null;
    }

    public static final void p(Hb.i iVar, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            com.bumptech.glide.d.t(th);
        } catch (Throwable th2) {
            AbstractC0672a.c(th, th2);
            cc.F.t(iVar, th);
        }
    }

    public static boolean q(int i7, Rect rect, Rect rect2) {
        if (i7 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i7 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i7 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    public static int r(int i7, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i7 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i7 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i7 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i7 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return Math.max(0, i10 - i11);
    }

    public static int s(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final Object v(Rb.e eVar) {
        Thread.interrupted();
        return cc.F.F(Hb.j.f4919a, new B(eVar, null));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewOutlineProvider, A9.q2, java.lang.Object] */
    public static void w(View view, int i7) {
        if (f12025a == null) {
            f12025a = new SparseArray();
        }
        ViewOutlineProvider viewOutlineProvider = (ViewOutlineProvider) f12025a.get(i7);
        ViewOutlineProvider viewOutlineProvider2 = viewOutlineProvider;
        if (viewOutlineProvider == null) {
            ?? viewOutlineProvider3 = new ViewOutlineProvider();
            viewOutlineProvider3.f1351a = i7;
            viewOutlineProvider2 = viewOutlineProvider3;
            if (f12025a.size() < 32) {
                f12025a.put(i7, viewOutlineProvider3);
                viewOutlineProvider2 = viewOutlineProvider3;
            }
        }
        view.setOutlineProvider(viewOutlineProvider2);
        view.setClipToOutline(true);
    }

    public static void x(Context context, Jc.a bannerAd) {
        kotlin.jvm.internal.l.e(bannerAd, "bannerAd");
        Intent intent = new Intent(context, (Class<?>) ShopeeProductDetailsActivity.class);
        intent.putExtra("extra_banner_ad", bannerAd);
        context.startActivity(intent);
    }

    public static byte[] y(r8.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i7 = 0;
        while (i7 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i7);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = dVar.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return g(arrayDeque, i7);
                }
                i10 += read;
                i7 += read;
            }
            long j10 = min * (min < 4096 ? 4 : 2);
            min = j10 > 2147483647L ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
        }
        if (dVar.read() == -1) {
            return g(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static int z(int i7) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i7) {
                return i11;
            }
        }
        return 1;
    }

    public abstract void t(int i7);

    public abstract void u(Typeface typeface, boolean z8);
}
