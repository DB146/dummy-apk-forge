package Tb;

import A0.C0005a;
import C1.g;
import Db.d;
import Db.j;
import Eb.m;
import Eb.p;
import I2.C0323l;
import I2.C0327p;
import I2.E;
import I2.S;
import I2.c0;
import M1.C0405u;
import Q5.e;
import V0.c;
import V0.n;
import V0.o;
import a.AbstractC0672a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import bc.AbstractC0850b;
import bc.C0849a;
import bc.EnumC0851c;
import cc.B;
import cc.C0944m;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import ec.q;
import ec.r;
import fc.AbstractC1178z;
import fc.InterfaceC1161h;
import fc.Q;
import h3.H;
import j0.AbstractC1362A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import l1.AbstractC1449a;
import l2.X;
import ma.C1652c;
import q1.C1877c;
import tc.b;
import xa.i;
import y1.K;

/* loaded from: classes2.dex */
public abstract class a implements g {
    public static void B(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static final float C(long j, float f4, c cVar) {
        float c10;
        long b2 = n.b(j);
        if (o.a(b2, 4294967296L)) {
            if (cVar.f() <= 1.05d) {
                return cVar.J(j);
            }
            c10 = n.c(j) / n.c(cVar.P(f4));
        } else {
            if (!o.a(b2, 8589934592L)) {
                return Float.NaN;
            }
            c10 = n.c(j);
        }
        return c10 * f4;
    }

    public static int D(Context context, int i7, int i10) {
        TypedValue N10 = e.N(context, i7);
        return (N10 == null || N10.type != 16) ? i10 : N10.data;
    }

    public static TimeInterpolator E(Context context, int i7, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!u(valueOf, "cubic-bezier") && !u(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (u(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(r(0, split), r(1, split), r(2, split), r(3, split));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!u(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            C1877c.b(b.q(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    public static int F(float f4) {
        if (Float.isNaN(f4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f4);
    }

    public static long G(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    public static final void H(Spannable spannable, long j, int i7, int i10) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC1362A.z(j)), i7, i10, 33);
        }
    }

    public static final void I(Spannable spannable, long j, c cVar, int i7, int i10) {
        long b2 = n.b(j);
        if (o.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(F(cVar.J(j)), false), i7, i10, 33);
        } else if (o.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(n.c(j)), i7, i10, 33);
        }
    }

    public static void J(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = K.f26642a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z8 = onLongClickListener != null;
        boolean z10 = hasOnClickListeners || z8;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z8);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public static final void K(Spannable spannable, Q0.b bVar, int i7, int i10) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(p.S(bVar, 10));
            Iterator it = bVar.f8599a.iterator();
            while (it.hasNext()) {
                arrayList.add(((Q0.a) it.next()).f8597a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i7, i10, 33);
        }
    }

    public static void L(int i7, Drawable drawable) {
        drawable.setTint(i7);
    }

    public static final long M(int i7, EnumC0851c unit) {
        l.e(unit, "unit");
        if (unit.compareTo(EnumC0851c.f13999d) > 0) {
            return N(i7, unit);
        }
        long i10 = Y6.b.i(i7, unit, EnumC0851c.f13997b) << 1;
        int i11 = C0849a.f13994d;
        int i12 = AbstractC0850b.f13996a;
        return i10;
    }

    public static final long N(long j, EnumC0851c unit) {
        l.e(unit, "unit");
        EnumC0851c enumC0851c = EnumC0851c.f13997b;
        long i7 = Y6.b.i(4611686018426999999L, enumC0851c, unit);
        if ((-i7) > j || j > i7) {
            return j(H.l(Y6.b.h(j, unit, EnumC0851c.f13998c), -4611686018427387903L, 4611686018427387903L));
        }
        long i10 = Y6.b.i(j, unit, enumC0851c) << 1;
        int i11 = C0849a.f13994d;
        int i12 = AbstractC0850b.f13996a;
        return i10;
    }

    public static int O(int i7) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
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

    public static final int a(float[] fArr) {
        int i7 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i10 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i7 = 1;
        }
        return i7 | (i10 << 1);
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(r rVar, Rb.a aVar, Jb.c cVar) {
        ec.p pVar;
        int i7;
        try {
            if (cVar instanceof ec.p) {
                ec.p pVar2 = (ec.p) cVar;
                int i10 = pVar2.f16899c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    pVar2.f16899c = i10 - Integer.MIN_VALUE;
                    pVar = pVar2;
                    Object obj = pVar.f16898b;
                    Ib.a aVar2 = Ib.a.f5345a;
                    i7 = pVar.f16899c;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        if (pVar.getContext().get(B.f14467b) != rVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        pVar.f16897a = aVar;
                        pVar.f16899c = 1;
                        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(pVar));
                        c0944m.s();
                        ((q) rVar).Z(new C0005a(c0944m, 22));
                        if (c0944m.r() == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = pVar.f16897a;
                        com.bumptech.glide.c.c0(obj);
                    }
                    aVar.invoke();
                    return Db.q.f3365a;
                }
            }
            if (i7 != 0) {
            }
            aVar.invoke();
            return Db.q.f3365a;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
        pVar = new Jb.c(cVar);
        Object obj2 = pVar.f16898b;
        Ib.a aVar22 = Ib.a.f5345a;
        i7 = pVar.f16899c;
    }

    public static final void d(int i7, int i10) {
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
    }

    public static final void e(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "index: ", ", size: "));
        }
    }

    public static final void f(int i7, int i10, int i11) {
        if (i7 < 0 || i10 > i11) {
            StringBuilder q10 = h3.o.q(i7, i10, "fromIndex: ", ", toIndex: ", ", size: ");
            q10.append(i11);
            throw new IndexOutOfBoundsException(q10.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(X.c.e(i7, i10, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void g(T2.c cVar, Throwable th) {
        if (cVar != null) {
            if (th == null) {
                cVar.close();
                return;
            }
            try {
                cVar.close();
            } catch (Throwable th2) {
                AbstractC0672a.c(th, th2);
            }
        }
    }

    public static ImageView.ScaleType h(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final K2.l i(E db2, boolean z8, String[] strArr, Rb.c cVar) {
        int i7 = 0;
        int i10 = 1;
        l.e(db2, "db");
        C0323l i11 = db2.i();
        String[] tables = (String[]) Arrays.copyOf(strArr, strArr.length);
        l.e(tables, "tables");
        c0 c0Var = i11.f5170c;
        j g = c0Var.g(tables);
        String[] resolvedTableNames = (String[]) g.f3354a;
        int[] tableIds = (int[]) g.f3355b;
        l.e(resolvedTableNames, "resolvedTableNames");
        l.e(tableIds, "tableIds");
        InterfaceC1161h c0405u = new C0405u(new S(c0Var, tableIds, resolvedTableNames, null));
        C0327p c0327p = i11.f5175i;
        A8.K k = c0327p != null ? new A8.K(i10, c0327p.f5190h, resolvedTableNames) : null;
        if (k != null) {
            InterfaceC1161h[] interfaceC1161hArr = {c0405u, k};
            int i12 = AbstractC1178z.f17213a;
            c0405u = new gc.p(new m(interfaceC1161hArr, i7), Hb.j.f4919a, -2, 1);
        }
        return new K2.l(Q.f(c0405u, -1), db2, z8, cVar);
    }

    public static final long j(long j) {
        long j10 = (j << 1) + 1;
        int i7 = C0849a.f13994d;
        int i10 = AbstractC0850b.f13996a;
        return j10;
    }

    public static long k(int i7, int i10, int i11, int i12) {
        int i13 = 262142;
        int min = Math.min(i11, 262142);
        int i14 = f.API_PRIORITY_OTHER;
        int min2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
        int i15 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i13 = 65534;
            } else if (i15 < 65535) {
                i13 = 32766;
            } else {
                if (i15 >= 262143) {
                    V0.b.j(i15);
                    throw new d(0);
                }
                i13 = 8190;
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            i14 = Math.min(i13, i10);
        }
        return V0.b.a(Math.min(i13, i7), i14, min, min2);
    }

    public static long l(int i7, int i10, int i11, int i12) {
        int i13 = 262142;
        int min = Math.min(i7, 262142);
        int i14 = f.API_PRIORITY_OTHER;
        int min2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int i15 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i13 = 65534;
            } else if (i15 < 65535) {
                i13 = 32766;
            } else {
                if (i15 >= 262143) {
                    V0.b.j(i15);
                    throw new d(0);
                }
                i13 = 8190;
            }
        }
        if (i12 != Integer.MAX_VALUE) {
            i14 = Math.min(i13, i12);
        }
        return V0.b.a(min, min2, Math.min(i13, i11), i14);
    }

    public static Calendar m(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static ColorStateList n(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateList = AbstractC1449a.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateList;
    }

    public static ColorStateList o(Context context, X x2, int i7) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) x2.f19195c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateList = AbstractC1449a.getColorStateList(context, resourceId)) == null) ? x2.m(i7) : colorStateList;
    }

    public static Drawable p(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        Drawable x2;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (x2 = e.x(context, resourceId)) == null) ? typedArray.getDrawable(i7) : x2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a1.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, a1.n] */
    public static a1.l q(a1.j jVar) {
        ?? obj = new Object();
        obj.f12473c = new Object();
        a1.l lVar = new a1.l(obj);
        obj.f12472b = lVar;
        obj.f12471a = jVar.getClass();
        try {
            Object a9 = jVar.a(obj);
            if (a9 != null) {
                obj.f12471a = a9;
            }
        } catch (Exception e2) {
            lVar.f12477b.u(e2);
        }
        return lVar;
    }

    public static float r(int i7, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i7]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean t(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean u(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static String w(String str, Object... objArr) {
        int indexOf;
        String sb2;
        int i7 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e2);
                    StringBuilder n6 = X.c.n("<", str2, " threw ");
                    n6.append(e2.getClass().getName());
                    n6.append(">");
                    sb2 = n6.toString();
                }
            }
            objArr[i10] = sb2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i7 < objArr.length && (indexOf = str.indexOf("%s", i11)) != -1) {
            sb3.append((CharSequence) str, i11, indexOf);
            sb3.append(objArr[i7]);
            i11 = indexOf + 2;
            i7++;
        }
        sb3.append((CharSequence) str, i11, str.length());
        if (i7 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb3.append(", ");
                sb3.append(objArr[i12]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static i x(C1652c c1652c) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra:playback_type", Aa.l.f1524b);
        bundle.putParcelable("extra:football_match", c1652c);
        iVar.l0(bundle);
        return iVar;
    }

    public abstract void A();

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.tasks.Continuation, q3.i, java.lang.Object] */
    public Task P(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        T6.a aVar;
        boolean z8;
        o7.o oVar = new o7.o(0);
        oVar.f22101b = this;
        synchronized (firebaseAuth) {
            aVar = firebaseAuth.j;
        }
        if (aVar != null) {
            synchronized (aVar.f9320a) {
                try {
                    zzahk zzahkVar = (zzahk) aVar.f9322c;
                    z8 = zzahkVar != null && zzahkVar.zzc("EMAIL_PASSWORD_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z8) {
                return aVar.z(str, Boolean.FALSE, recaptchaAction).continueWithTask(oVar).continueWithTask(new q3.n(10, str, aVar, recaptchaAction, oVar));
            }
        }
        Task Q3 = Q(null);
        ?? obj = new Object();
        obj.f23382a = recaptchaAction;
        obj.f23383b = firebaseAuth;
        obj.f23384c = str;
        obj.f23385d = oVar;
        return Q3.continueWithTask(obj);
    }

    public abstract Task Q(String str);

    public abstract void s();

    public abstract boolean v();

    public abstract void y(boolean z8);

    public abstract void z(long j);
}
