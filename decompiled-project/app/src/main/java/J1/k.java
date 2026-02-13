package J1;

import A0.G0;
import B0.C;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public abstract class k extends a {

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f5429y = true;

    /* renamed from: b, reason: collision with root package name */
    public final C f5431b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5432c;

    /* renamed from: d, reason: collision with root package name */
    public final l[] f5433d;

    /* renamed from: e, reason: collision with root package name */
    public final View f5434e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5435f;

    /* renamed from: u, reason: collision with root package name */
    public final Choreographer f5436u;

    /* renamed from: v, reason: collision with root package name */
    public final i f5437v;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f5438w;

    /* renamed from: x, reason: collision with root package name */
    public k f5439x;

    /* renamed from: z, reason: collision with root package name */
    public static final Hc.e f5430z = new Hc.e(7);

    /* renamed from: A, reason: collision with root package name */
    public static final ReferenceQueue f5427A = new ReferenceQueue();

    /* renamed from: B, reason: collision with root package name */
    public static final h f5428B = new h(0);

    public k(Object obj, View view, int i7) {
        if (obj != null) {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        this.f5431b = new C(this, 8);
        this.f5432c = false;
        this.f5433d = new l[i7];
        this.f5434e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f5429y) {
            this.f5436u = Choreographer.getInstance();
            this.f5437v = new i(this);
        } else {
            this.f5437v = null;
            this.f5438w = new Handler(Looper.myLooper());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0096, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0094, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(View view, Object[] objArr, G0 g02, SparseIntArray sparseIntArray, boolean z8) {
        int i7;
        boolean z10;
        int i10;
        char c10;
        String str;
        boolean z11;
        int i11;
        String str2;
        int id;
        int i12;
        int i13;
        int length;
        if ((view != null ? (k) view.getTag(R.id.dataBinding) : null) != null) {
            return;
        }
        Object tag = view.getTag();
        String str3 = tag instanceof String ? (String) tag : null;
        char c11 = '0';
        int i14 = 1;
        String str4 = "layout";
        if (!z8 || str3 == null || !str3.startsWith("layout")) {
            if (str3 != null && str3.startsWith("binding_")) {
                int length2 = str3.length();
                i7 = 0;
                for (int i15 = 8; i15 < length2; i15++) {
                    i7 = (i7 * 10) + (str3.charAt(i15) - '0');
                }
                if (objArr[i7] == null) {
                    objArr[i7] = view;
                }
            }
            i7 = -1;
            z10 = false;
            if (!z10 && (id = view.getId()) > 0 && sparseIntArray != null && (i12 = sparseIntArray.get(id, -1)) >= 0 && objArr[i12] == null) {
                objArr[i12] = view;
            }
            if (view instanceof ViewGroup) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i16 = 0;
            int i17 = 0;
            while (i16 < childCount) {
                View childAt = viewGroup.getChildAt(i16);
                if (i7 >= 0 && (childAt.getTag() instanceof String)) {
                    String str5 = (String) childAt.getTag();
                    if (str5.endsWith("_0") && str5.startsWith(str4) && str5.indexOf(47) > 0) {
                        CharSequence subSequence = str5.subSequence(str5.indexOf(47) + i14, str5.length() - 2);
                        String[] strArr = ((String[][]) g02.f27b)[i7];
                        int length3 = strArr.length;
                        int i18 = i17;
                        while (true) {
                            if (i18 >= length3) {
                                i18 = -1;
                                break;
                            } else if (TextUtils.equals(subSequence, strArr[i18])) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i18 >= 0) {
                            int i19 = i18 + 1;
                            int i20 = ((int[][]) g02.f28c)[i7][i18];
                            int i21 = ((int[][]) g02.f29d)[i7][i18];
                            String str6 = (String) viewGroup.getChildAt(i16).getTag();
                            String substring = str6.substring(0, str6.length() - i14);
                            int length4 = substring.length();
                            int childCount2 = viewGroup.getChildCount();
                            i10 = childCount;
                            int i22 = i16 + 1;
                            str = str4;
                            int i23 = i16;
                            while (true) {
                                if (i22 >= childCount2) {
                                    i11 = i19;
                                    break;
                                }
                                View childAt2 = viewGroup.getChildAt(i22);
                                int i24 = childCount2;
                                String str7 = childAt2.getTag() instanceof String ? (String) childAt2.getTag() : null;
                                if (str7 != null && str7.startsWith(substring)) {
                                    str2 = substring;
                                    i11 = i19;
                                    if (str7.length() == str6.length() && str7.charAt(str7.length() - 1) == '0') {
                                        break;
                                    }
                                    int length5 = str7.length();
                                    if (length5 != length4) {
                                        int i25 = length4;
                                        while (true) {
                                            if (i25 >= length5) {
                                                i23 = i22;
                                                break;
                                            } else if (!Character.isDigit(str7.charAt(i25))) {
                                                break;
                                            } else {
                                                i25++;
                                            }
                                        }
                                    }
                                } else {
                                    str2 = substring;
                                    i11 = i19;
                                }
                                i22++;
                                childCount2 = i24;
                                substring = str2;
                                i19 = i11;
                            }
                            if (i23 == i16) {
                                objArr[i20] = e.f5416a.b(childAt, i21);
                            } else {
                                int i26 = i23 - i16;
                                int i27 = i26 + 1;
                                View[] viewArr = new View[i27];
                                for (int i28 = 0; i28 < i27; i28++) {
                                    viewArr[i28] = viewGroup.getChildAt(i16 + i28);
                                }
                                objArr[i20] = e.f5416a.c(viewArr, i21);
                                i16 += i26;
                            }
                            i17 = i11;
                            c10 = '0';
                            z11 = true;
                            if (!z11) {
                                g(childAt, objArr, g02, sparseIntArray, false);
                            }
                            i16++;
                            childCount = i10;
                            i14 = 1;
                            str4 = str;
                            c11 = c10;
                        } else {
                            i10 = childCount;
                            str = str4;
                            c10 = '0';
                            z11 = false;
                            if (!z11) {
                            }
                            i16++;
                            childCount = i10;
                            i14 = 1;
                            str4 = str;
                            c11 = c10;
                        }
                    }
                }
                i10 = childCount;
                c10 = c11;
                str = str4;
                z11 = false;
                if (!z11) {
                }
                i16++;
                childCount = i10;
                i14 = 1;
                str4 = str;
                c11 = c10;
            }
            return;
        }
        int lastIndexOf = str3.lastIndexOf(95);
        if (lastIndexOf > 0 && (length = str3.length()) != (i13 = lastIndexOf + 1)) {
            for (int i29 = i13; i29 < length; i29++) {
                if (Character.isDigit(str3.charAt(i29))) {
                }
            }
            int length6 = str3.length();
            i7 = 0;
            while (i13 < length6) {
                i7 = (i7 * 10) + (str3.charAt(i13) - '0');
                i13++;
            }
            if (objArr[i7] == null) {
                objArr[i7] = view;
            }
        }
        i7 = -1;
        z10 = false;
        if (!z10) {
            objArr[i12] = view;
        }
        if (view instanceof ViewGroup) {
        }
    }

    public static Object[] h(View view, int i7, G0 g02, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i7];
        g(view, objArr, g02, sparseIntArray, true);
        return objArr;
    }

    public abstract void b();

    public final void c() {
        if (this.f5435f) {
            j();
        } else if (e()) {
            this.f5435f = true;
            b();
            this.f5435f = false;
        }
    }

    public final void d() {
        k kVar = this.f5439x;
        if (kVar == null) {
            c();
        } else {
            kVar.d();
        }
    }

    public abstract boolean e();

    public abstract void f();

    public abstract boolean i(int i7, int i10, a aVar);

    public final void j() {
        k kVar = this.f5439x;
        if (kVar != null) {
            kVar.j();
            return;
        }
        synchronized (this) {
            try {
                if (this.f5432c) {
                    return;
                }
                this.f5432c = true;
                if (f5429y) {
                    this.f5436u.postFrameCallback(this.f5437v);
                } else {
                    this.f5438w.post(this.f5431b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public final void l(int i7, a aVar) {
        if (aVar == null) {
            l lVar = this.f5433d[i7];
            if (lVar != null) {
                lVar.a();
                return;
            }
            return;
        }
        l[] lVarArr = this.f5433d;
        l lVar2 = lVarArr[i7];
        ReferenceQueue referenceQueue = f5427A;
        Hc.e eVar = f5430z;
        if (lVar2 == null) {
            if (lVar2 == null) {
                eVar.getClass();
                lVar2 = new j(this, i7, referenceQueue).f5426a;
                lVarArr[i7] = lVar2;
            }
            lVar2.a();
            lVar2.f5442c = aVar;
            lVar2.f5440a.a(aVar);
            return;
        }
        if (lVar2.f5442c == aVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.a();
        }
        l[] lVarArr2 = this.f5433d;
        l lVar3 = lVarArr2[i7];
        if (lVar3 == null) {
            eVar.getClass();
            lVar3 = new j(this, i7, referenceQueue).f5426a;
            lVarArr2[i7] = lVar3;
        }
        lVar3.a();
        lVar3.f5442c = aVar;
        lVar3.f5440a.a(aVar);
    }
}
