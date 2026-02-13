package U9;

import L7.D;
import W1.U;
import Y5.F;
import Y5.InterfaceC0650t;
import Z9.x;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.leanback.tab.LeanbackTabLayout;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzrd;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import n5.AbstractC1705a;

/* loaded from: classes2.dex */
public class i implements A2.a, E4.i, Hb.h, O7.i, N0.p, P3.m, Q5.c, R4.l, X6.b, InterfaceC0650t {

    /* renamed from: b, reason: collision with root package name */
    public static i f9869b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9880a;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i f9870c = new i(18);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i f9871d = new i(19);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i f9872e = new i(20);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i f9873f = new i(21);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ i f9874u = new i(22);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ i f9875v = new i(23);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ i f9876w = new i(24);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ i f9877x = new i(25);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ i f9878y = new i(26);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ i f9879z = new i(27);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ i f9867A = new i(28);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ i f9868B = new i(29);

    public /* synthetic */ i(int i7) {
        this.f9880a = i7;
    }

    public i(q3.s sVar, U u3) {
        this.f9880a = 12;
    }

    public static final float f(float f4, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float max;
        float abs = Math.abs(f4);
        float signum = Math.signum(f4);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = signum * fArr2[binarySearch];
        } else {
            int i7 = -(binarySearch + 1);
            int i10 = i7 - 1;
            if (i10 >= fArr.length - 1) {
                float f14 = fArr[fArr.length - 1];
                float f15 = fArr2[fArr.length - 1];
                if (f14 == 0.0f) {
                    return 0.0f;
                }
                return (f15 / f14) * f4;
            }
            if (i10 == -1) {
                float f16 = fArr[0];
                f12 = fArr2[0];
                f13 = f16;
                f11 = 0.0f;
                f10 = 0.0f;
            } else {
                float f17 = fArr[i10];
                float f18 = fArr[i7];
                f10 = fArr2[i10];
                f11 = f17;
                f12 = fArr2[i7];
                f13 = f18;
            }
            max = signum * (((f12 - f10) * Math.max(0.0f, Math.min(1.0f, f11 == f13 ? 0.0f : (abs - f11) / (f13 - f11)))) + f10);
        }
        return max;
    }

    public static RectF g(LeanbackTabLayout leanbackTabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (leanbackTabLayout.f2170S || !(view instanceof B6.m)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        B6.m mVar = (B6.m) view;
        int contentWidth = mVar.getContentWidth();
        int contentHeight = mVar.getContentHeight();
        int d10 = (int) s6.o.d(mVar.getContext(), 24);
        if (contentWidth < d10) {
            contentWidth = d10;
        }
        int right = (mVar.getRight() + mVar.getLeft()) / 2;
        int bottom = (mVar.getBottom() + mVar.getTop()) / 2;
        int i7 = contentWidth / 2;
        return new RectF(right - i7, bottom - (contentHeight / 2), i7 + right, (right / 2) + bottom);
    }

    public static Typeface k(String str, N0.k kVar, int i7) {
        if (N0.i.a(i7, 0) && kotlin.jvm.internal.l.a(kVar, N0.k.f7140c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int m10 = x.m(kVar, i7);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(m10) : Typeface.create(str, m10);
    }

    @Override // R4.l
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // X6.b
    public Object b(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // R4.l
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // O7.i
    public boolean d(Object obj) {
        switch (this.f9880a) {
            case 9:
                ((D) obj).getClass();
                return true;
            default:
                return true;
        }
    }

    @Override // N0.p
    public Typeface e(N0.m mVar, N0.k kVar, int i7) {
        String str;
        mVar.getClass();
        int i10 = kVar.f7143a / 100;
        if (i10 >= 0 && i10 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i10 || i10 >= 4) {
            if (i10 != 4) {
                if (i10 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i10 || i10 >= 8) && 8 <= i10 && i10 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface k = k(str, kVar, i7);
            if (!kotlin.jvm.internal.l.a(k, Typeface.create(Typeface.DEFAULT, x.m(kVar, i7))) && !kotlin.jvm.internal.l.a(k, k(null, kVar, i7))) {
                typeface = k;
            }
        }
        return typeface == null ? k("sans-serif", kVar, i7) : typeface;
    }

    @Override // Q5.c
    public E3.h h(Context context, String str, Q5.b bVar) {
        E3.h hVar = new E3.h();
        hVar.f3537a = bVar.c(context, str);
        int i7 = 1;
        int d10 = bVar.d(context, str, true);
        hVar.f3538b = d10;
        int i10 = hVar.f3537a;
        if (i10 == 0) {
            i10 = 0;
            if (d10 == 0) {
                i7 = 0;
                hVar.f3539c = i7;
                return hVar;
            }
        }
        if (i10 >= d10) {
            i7 = -1;
        }
        hVar.f3539c = i7;
        return hVar;
    }

    @Override // E4.i
    public E4.j i(E4.h hVar) {
        int i7 = n5.D.f21141a;
        if (i7 < 23 || i7 < 31) {
            return new h8.e(4).i(hVar);
        }
        int h10 = n5.o.h(hVar.f3577c.f20096z);
        AbstractC1705a.B("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + n5.D.E(h10));
        return new q3.c(h10).i(hVar);
    }

    @Override // A2.a
    public CharSequence j(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f13569a.getString(R.string.not_set);
        }
        return null;
    }

    public void l(LeanbackTabLayout leanbackTabLayout, View view, View view2, float f4, Drawable drawable) {
        RectF g = g(leanbackTabLayout, view);
        RectF g2 = g(leanbackTabLayout, view2);
        drawable.setBounds(AbstractC1053a.c(f4, (int) g.left, (int) g2.left), drawable.getBounds().top, AbstractC1053a.c(f4, (int) g.right, (int) g2.right), drawable.getBounds().bottom);
    }

    @Override // R4.l
    public boolean next() {
        return false;
    }

    @Override // N0.p
    public Typeface q(N0.k kVar, int i7) {
        return k(null, kVar, i7);
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f9880a) {
            case 18:
                return new Boolean(zzpe.zzb());
            case 19:
                List list = F.f11304a;
                return Boolean.valueOf(zzrd.zza());
            case 20:
                List list2 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzao());
            case 21:
                List list3 = F.f11304a;
                return zzoy.zzM();
            case 22:
                List list4 = F.f11304a;
                return Long.valueOf(zzoy.zzL());
            case 23:
                List list5 = F.f11304a;
                return Long.valueOf(zzoy.zzQ());
            case 24:
                List list6 = F.f11304a;
                return Long.valueOf(zzoy.zzE());
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                List list7 = F.f11304a;
                return Long.valueOf(zzoy.zzag());
            case 26:
                List list8 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzo());
            case 27:
                List list9 = F.f11304a;
                return zzoy.zzg();
            case 28:
                List list10 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzu());
            default:
                List list11 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzx());
        }
    }
}
