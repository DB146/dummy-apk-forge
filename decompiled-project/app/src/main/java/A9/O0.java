package A9;

import B0.C0215z0;
import a5.C0775a;
import a5.C0776b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import b4.C0837h;
import b4.C0838i;
import b4.C0840k;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import d5.C1052c;
import g4.C1196a;
import h5.C1251a;
import j8.InterfaceC1387b;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONObject;
import q5.C1891b;
import q5.C1893d;
import q5.InterfaceC1890a;

/* loaded from: classes2.dex */
public final class O0 implements K0.o, a5.g, Db.g, p7.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f922a;

    /* renamed from: b, reason: collision with root package name */
    public Object f923b;

    /* renamed from: c, reason: collision with root package name */
    public Object f924c;

    /* renamed from: d, reason: collision with root package name */
    public Object f925d;

    /* renamed from: e, reason: collision with root package name */
    public Object f926e;

    public O0(h5.e eVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f922a = eVar;
        this.f925d = hashMap2;
        this.f926e = hashMap3;
        this.f924c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        eVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.f923b = jArr;
    }

    public O0(Map initialState) {
        kotlin.jvm.internal.l.e(initialState, "initialState");
        this.f922a = Eb.B.M(initialState);
        this.f923b = new LinkedHashMap();
        this.f924c = new LinkedHashMap();
        this.f925d = new LinkedHashMap();
        this.f926e = new C0215z0(this, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public O0(kotlin.jvm.internal.e eVar, Rb.a aVar, Rb.a aVar2, Rb.a aVar3) {
        this.f922a = eVar;
        this.f923b = (kotlin.jvm.internal.m) aVar;
        this.f924c = aVar2;
        this.f925d = (kotlin.jvm.internal.m) aVar3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A9.O0, java.lang.Object] */
    public static O0 i(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ?? obj = new Object();
        obj.f925d = new ArrayDeque();
        obj.f922a = sharedPreferences;
        obj.f923b = "topic_operation_queue";
        obj.f924c = ",";
        obj.f926e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) obj.f925d)) {
            try {
                ((ArrayDeque) obj.f925d).clear();
                String string = ((SharedPreferences) obj.f922a).getString((String) obj.f923b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) obj.f924c)) {
                    String[] split = string.split((String) obj.f924c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) obj.f925d).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return obj;
    }

    public void A(Object obj, String key) {
        kotlin.jvm.internal.l.e(key, "key");
        ((LinkedHashMap) this.f922a).put(key, obj);
        fc.J j = (fc.J) ((LinkedHashMap) this.f924c).get(key);
        if (j != null) {
            ((fc.b0) j).i(obj);
        }
        fc.J j10 = (fc.J) ((LinkedHashMap) this.f925d).get(key);
        if (j10 != null) {
            ((fc.b0) j10).i(obj);
        }
    }

    public void B(int i7, int i10, C1891b c1891b, int i11, int i12, boolean z8) {
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        float f4;
        int i17;
        float f10;
        int i18 = c1891b.f23471a;
        float f11 = c1891b.g;
        boolean z11 = false;
        if (f11 <= 0.0f || i11 > i18) {
            return;
        }
        float f12 = (i18 - i11) / f11;
        c1891b.f23471a = i12 + c1891b.f23472b;
        if (!z8) {
            c1891b.f23473c = Integer.MIN_VALUE;
        }
        int i19 = 0;
        boolean z12 = false;
        int i20 = 0;
        float f13 = 0.0f;
        while (i19 < c1891b.f23474d) {
            int i21 = c1891b.k + i19;
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
            View k12 = flexboxLayoutManager.k1(i21);
            if (k12 == null || k12.getVisibility() == 8) {
                i13 = i18;
                i14 = i19;
                z10 = z11;
                i15 = i20;
                f13 = f13;
            } else {
                InterfaceC1890a interfaceC1890a = (InterfaceC1890a) k12.getLayoutParams();
                int i22 = flexboxLayoutManager.f14822p;
                if (i22 == 0 || i22 == 1) {
                    i14 = i19;
                    int i23 = i20;
                    float f14 = f13;
                    int i24 = i18;
                    int measuredWidth = k12.getMeasuredWidth();
                    long[] jArr = (long[]) this.f926e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i21];
                    }
                    int measuredHeight = k12.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.f926e;
                    if (jArr2 != null) {
                        i13 = i24;
                        measuredHeight = (int) (jArr2[i21] >> 32);
                    } else {
                        i13 = i24;
                    }
                    if (((boolean[]) this.f923b)[i21]) {
                        z10 = false;
                    } else {
                        C1893d c1893d = (C1893d) interfaceC1890a;
                        float f15 = c1893d.f23491f;
                        z10 = false;
                        if (f15 > 0.0f) {
                            float f16 = measuredWidth - (f12 * f15);
                            if (i14 == c1891b.f23474d - 1) {
                                f16 += f14;
                                f14 = 0.0f;
                            }
                            int round = Math.round(f16);
                            int i25 = c1893d.f23494w;
                            if (round < i25) {
                                ((boolean[]) this.f923b)[i21] = true;
                                c1891b.g -= f15;
                                z12 = true;
                                round = i25;
                                f13 = f14;
                            } else {
                                float f17 = (f16 - round) + f14;
                                double d10 = f17;
                                if (d10 > 1.0d) {
                                    round++;
                                    f17 -= 1.0f;
                                } else if (d10 < -1.0d) {
                                    round--;
                                    f17 += 1.0f;
                                }
                                f13 = f17;
                            }
                            int q10 = q(i10, interfaceC1890a, c1891b.f23478i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            k12.measure(makeMeasureSpec, q10);
                            int measuredWidth2 = k12.getMeasuredWidth();
                            int measuredHeight2 = k12.getMeasuredHeight();
                            F(i21, makeMeasureSpec, q10, k12);
                            flexboxLayoutManager.v1(k12, i21);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                            C1893d c1893d2 = (C1893d) interfaceC1890a;
                            int max = Math.max(i23, flexboxLayoutManager.j1(k12) + measuredHeight + ((ViewGroup.MarginLayoutParams) c1893d2).topMargin + ((ViewGroup.MarginLayoutParams) c1893d2).bottomMargin);
                            c1891b.f23471a = measuredWidth + ((ViewGroup.MarginLayoutParams) c1893d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1893d2).rightMargin + c1891b.f23471a;
                            i15 = max;
                        }
                    }
                    f13 = f14;
                    C1893d c1893d22 = (C1893d) interfaceC1890a;
                    int max2 = Math.max(i23, flexboxLayoutManager.j1(k12) + measuredHeight + ((ViewGroup.MarginLayoutParams) c1893d22).topMargin + ((ViewGroup.MarginLayoutParams) c1893d22).bottomMargin);
                    c1891b.f23471a = measuredWidth + ((ViewGroup.MarginLayoutParams) c1893d22).leftMargin + ((ViewGroup.MarginLayoutParams) c1893d22).rightMargin + c1891b.f23471a;
                    i15 = max2;
                } else {
                    int measuredHeight3 = k12.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.f926e;
                    if (jArr3 != null) {
                        long j = jArr3[i21];
                        i16 = i20;
                        f4 = f13;
                        measuredHeight3 = (int) (j >> 32);
                    } else {
                        i16 = i20;
                        f4 = f13;
                    }
                    int measuredWidth3 = k12.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.f926e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i21];
                    }
                    if (!((boolean[]) this.f923b)[i21]) {
                        C1893d c1893d3 = (C1893d) interfaceC1890a;
                        float f18 = c1893d3.f23491f;
                        if (f18 > 0.0f) {
                            float f19 = measuredHeight3 - (f12 * f18);
                            if (i19 == c1891b.f23474d - 1) {
                                f19 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(f19);
                            int i26 = c1893d3.f23495x;
                            if (round2 < i26) {
                                ((boolean[]) this.f923b)[i21] = true;
                                c1891b.g -= f18;
                                i14 = i19;
                                round2 = i26;
                                f10 = f4;
                                z12 = true;
                                i17 = i18;
                            } else {
                                f10 = (f19 - round2) + f4;
                                i17 = i18;
                                i14 = i19;
                                double d11 = f10;
                                if (d11 > 1.0d) {
                                    round2++;
                                    f10 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    round2--;
                                    f10 += 1.0f;
                                }
                            }
                            int r10 = r(i7, interfaceC1890a, c1891b.f23478i);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            k12.measure(r10, makeMeasureSpec2);
                            int measuredWidth4 = k12.getMeasuredWidth();
                            int measuredHeight4 = k12.getMeasuredHeight();
                            F(i21, r10, makeMeasureSpec2, k12);
                            flexboxLayoutManager.v1(k12, i21);
                            f4 = f10;
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                            C1893d c1893d4 = (C1893d) interfaceC1890a;
                            i15 = Math.max(i16, flexboxLayoutManager.j1(k12) + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1893d4).leftMargin + ((ViewGroup.MarginLayoutParams) c1893d4).rightMargin);
                            c1891b.f23471a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1893d4).topMargin + ((ViewGroup.MarginLayoutParams) c1893d4).bottomMargin + c1891b.f23471a;
                            i13 = i17;
                            f13 = f4;
                            z10 = false;
                        }
                    }
                    i17 = i18;
                    i14 = i19;
                    C1893d c1893d42 = (C1893d) interfaceC1890a;
                    i15 = Math.max(i16, flexboxLayoutManager.j1(k12) + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1893d42).leftMargin + ((ViewGroup.MarginLayoutParams) c1893d42).rightMargin);
                    c1891b.f23471a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1893d42).topMargin + ((ViewGroup.MarginLayoutParams) c1893d42).bottomMargin + c1891b.f23471a;
                    i13 = i17;
                    f13 = f4;
                    z10 = false;
                }
                c1891b.f23473c = Math.max(c1891b.f23473c, i15);
            }
            i19 = i14 + 1;
            i20 = i15;
            i18 = i13;
            z11 = z10;
        }
        int i27 = i18;
        if (!z12 || i27 == c1891b.f23471a) {
            return;
        }
        B(i7, i10, c1891b, i11, i12, true);
    }

    public void C(View view, int i7, int i10) {
        C1893d c1893d = (C1893d) ((InterfaceC1890a) view.getLayoutParams());
        int i11 = (i7 - ((ViewGroup.MarginLayoutParams) c1893d).leftMargin) - ((ViewGroup.MarginLayoutParams) c1893d).rightMargin;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
        int min = Math.min(Math.max(i11 - flexboxLayoutManager.j1(view), c1893d.f23494w), c1893d.f23496y);
        long[] jArr = (long[]) this.f926e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i10] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        F(i10, makeMeasureSpec2, makeMeasureSpec, view);
        flexboxLayoutManager.v1(view, i10);
    }

    public void D(View view, int i7, int i10) {
        C1893d c1893d = (C1893d) ((InterfaceC1890a) view.getLayoutParams());
        int i11 = (i7 - ((ViewGroup.MarginLayoutParams) c1893d).topMargin) - ((ViewGroup.MarginLayoutParams) c1893d).bottomMargin;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
        int min = Math.min(Math.max(i11 - flexboxLayoutManager.j1(view), c1893d.f23495x), c1893d.f23497z);
        long[] jArr = (long[]) this.f926e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i10] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        F(i10, makeMeasureSpec, makeMeasureSpec2, view);
        flexboxLayoutManager.v1(view, i10);
    }

    public void E(int i7) {
        View k12;
        int i10;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
        if (i7 >= flexboxLayoutManager.f14831y.b()) {
            return;
        }
        int i11 = flexboxLayoutManager.f14822p;
        if (flexboxLayoutManager.f14824r != 4) {
            for (C1891b c1891b : flexboxLayoutManager.f14828v) {
                Iterator it = c1891b.j.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    View k13 = flexboxLayoutManager.k1(num.intValue());
                    if (i11 == 0 || i11 == 1) {
                        D(k13, c1891b.f23473c, num.intValue());
                    } else {
                        if (i11 != 2 && i11 != 3) {
                            throw new IllegalArgumentException(h3.o.l(i11, "Invalid flex direction: "));
                        }
                        C(k13, c1891b.f23473c, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = (int[]) this.f924c;
        List list = flexboxLayoutManager.f14828v;
        int size = list.size();
        for (int i12 = iArr != null ? iArr[i7] : 0; i12 < size; i12++) {
            C1891b c1891b2 = (C1891b) list.get(i12);
            int i13 = c1891b2.f23474d;
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = c1891b2.k + i14;
                if (i14 < flexboxLayoutManager.f14831y.b() && (k12 = flexboxLayoutManager.k1(i15)) != null && k12.getVisibility() != 8 && ((i10 = ((C1893d) ((InterfaceC1890a) k12.getLayoutParams())).f23492u) == -1 || i10 == 4)) {
                    if (i11 == 0 || i11 == 1) {
                        D(k12, c1891b2.f23473c, i15);
                    } else {
                        if (i11 != 2 && i11 != 3) {
                            throw new IllegalArgumentException(h3.o.l(i11, "Invalid flex direction: "));
                        }
                        C(k12, c1891b2.f23473c, i15);
                    }
                }
            }
        }
    }

    public void F(int i7, int i10, int i11, View view) {
        long[] jArr = (long[]) this.f925d;
        if (jArr != null) {
            jArr[i7] = (i10 & 4294967295L) | (i11 << 32);
        }
        long[] jArr2 = (long[]) this.f926e;
        if (jArr2 != null) {
            jArr2[i7] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }

    @Override // K0.o
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f926e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((K0.n) arrayList.get(i7)).f5922a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // a5.g
    public int b(long j) {
        long[] jArr = (long[]) this.f923b;
        int b2 = n5.D.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Db.g, java.lang.Object] */
    @Override // K0.o
    public float c() {
        return ((Number) this.f925d.getValue()).floatValue();
    }

    @Override // a5.g
    public long d(int i7) {
        return ((long[]) this.f923b)[i7];
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x045d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(C1052c c1052c, int i7, int i10, int i11, int i12, int i13, List list) {
        C1052c c1052c2;
        List list2;
        int N10;
        int K10;
        int i14;
        int i15;
        boolean z8;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19;
        int i20;
        List list3;
        O0 o02;
        int i21;
        int z11;
        int i22;
        int i23;
        int i24;
        int i25;
        List list4;
        int i26;
        int[] iArr;
        int i27;
        int i28;
        int minimumHeight;
        int i29;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
        boolean o12 = flexboxLayoutManager.o1();
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (list == null) {
            list2 = new ArrayList();
            c1052c2 = c1052c;
        } else {
            c1052c2 = c1052c;
            list2 = list;
        }
        c1052c2.f16530a = list2;
        boolean z12 = i13 == -1;
        if (o12) {
            RecyclerView recyclerView = flexboxLayoutManager.f13708b;
            if (recyclerView != null) {
                WeakHashMap weakHashMap = y1.K.f26642a;
                N10 = recyclerView.getPaddingStart();
            } else {
                N10 = 0;
            }
        } else {
            N10 = flexboxLayoutManager.N();
        }
        if (o12) {
            RecyclerView recyclerView2 = flexboxLayoutManager.f13708b;
            if (recyclerView2 != null) {
                WeakHashMap weakHashMap2 = y1.K.f26642a;
                K10 = recyclerView2.getPaddingEnd();
            } else {
                K10 = 0;
            }
        } else {
            K10 = flexboxLayoutManager.K();
        }
        if (o12) {
            i14 = flexboxLayoutManager.N();
        } else {
            RecyclerView recyclerView3 = flexboxLayoutManager.f13708b;
            if (recyclerView3 != null) {
                WeakHashMap weakHashMap3 = y1.K.f26642a;
                i14 = recyclerView3.getPaddingStart();
            } else {
                i14 = 0;
            }
        }
        if (o12) {
            i15 = flexboxLayoutManager.K();
        } else {
            RecyclerView recyclerView4 = flexboxLayoutManager.f13708b;
            if (recyclerView4 != null) {
                WeakHashMap weakHashMap4 = y1.K.f26642a;
                i15 = recyclerView4.getPaddingEnd();
            } else {
                i15 = 0;
            }
        }
        C1891b c1891b = new C1891b();
        int i30 = i12;
        c1891b.k = i30;
        int i31 = N10 + K10;
        c1891b.f23471a = i31;
        int b2 = flexboxLayoutManager.f14831y.b();
        int i32 = Integer.MIN_VALUE;
        int i33 = 0;
        int i34 = 0;
        while (i30 < b2) {
            View k12 = flexboxLayoutManager.k1(i30);
            if (k12 != null) {
                z8 = z12;
                if (k12.getVisibility() == 8) {
                    int i35 = c1891b.f23475e + 1;
                    c1891b.f23475e = i35;
                    int i36 = c1891b.f23474d + 1;
                    c1891b.f23474d = i36;
                    if (i30 == b2 - 1 && i36 - i35 != 0) {
                        c1891b.f23478i = i33;
                        c1891b.f23479l = i30;
                        list2.add(c1891b);
                    }
                } else {
                    if (k12 instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) k12;
                        C1893d c1893d = (C1893d) ((InterfaceC1890a) compoundButton.getLayoutParams());
                        int i37 = c1893d.f23494w;
                        i16 = b2;
                        int i38 = c1893d.f23495x;
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        if (buttonDrawable == null) {
                            i29 = -1;
                            minimumHeight = 0;
                        } else {
                            minimumHeight = buttonDrawable.getMinimumHeight();
                            i29 = -1;
                        }
                        if (i37 == i29) {
                            i37 = minimumWidth;
                        }
                        c1893d.f23494w = i37;
                        if (i38 == i29) {
                            i38 = minimumHeight;
                        }
                        c1893d.f23495x = i38;
                    } else {
                        i16 = b2;
                    }
                    InterfaceC1890a interfaceC1890a = (InterfaceC1890a) k12.getLayoutParams();
                    C1893d c1893d2 = (C1893d) interfaceC1890a;
                    if (c1893d2.f23492u == 4) {
                        c1891b.j.add(Integer.valueOf(i30));
                    }
                    int i39 = o12 ? ((ViewGroup.MarginLayoutParams) c1893d2).width : ((ViewGroup.MarginLayoutParams) c1893d2).height;
                    float f4 = c1893d2.f23493v;
                    if (f4 != -1.0f) {
                        i17 = i39;
                        if (mode == 1073741824) {
                            i18 = Math.round(size * f4);
                            if (o12) {
                                z10 = o12;
                                i19 = mode;
                                i20 = size;
                                list3 = list2;
                                o02 = this;
                                i21 = i14;
                                int z13 = androidx.recyclerview.widget.a.z(flexboxLayoutManager.f(), flexboxLayoutManager.f13717n, flexboxLayoutManager.f13715l, ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin + ((ViewGroup.MarginLayoutParams) c1893d2).leftMargin + i14 + i15 + i33, ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).width);
                                z11 = androidx.recyclerview.widget.a.z(flexboxLayoutManager.g(), flexboxLayoutManager.f13718o, flexboxLayoutManager.f13716m, ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin + ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).topMargin + i31, i18);
                                k12.measure(z13, z11);
                                o02.F(i30, z13, z11, k12);
                            } else {
                                i20 = size;
                                i19 = mode;
                                list3 = list2;
                                z11 = androidx.recyclerview.widget.a.z(flexboxLayoutManager.f(), flexboxLayoutManager.f13717n, flexboxLayoutManager.f13715l, ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin + ((ViewGroup.MarginLayoutParams) c1893d2).leftMargin + i31, i18);
                                z10 = o12;
                                int z14 = androidx.recyclerview.widget.a.z(flexboxLayoutManager.g(), flexboxLayoutManager.f13718o, flexboxLayoutManager.f13716m, ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin + ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).topMargin + i14 + i15 + i33, ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).height);
                                k12.measure(z11, z14);
                                o02 = this;
                                o02.F(i30, z11, z14, k12);
                                i21 = i14;
                            }
                            flexboxLayoutManager.v1(k12, i30);
                            o02.f(k12, i30);
                            i34 = View.combineMeasuredStates(i34, k12.getMeasuredState());
                            int i40 = c1891b.f23471a;
                            int measuredWidth = (!z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin) + (!z10 ? ((ViewGroup.MarginLayoutParams) c1893d2).leftMargin : ((ViewGroup.MarginLayoutParams) c1893d2).topMargin) + (!z10 ? k12.getMeasuredWidth() : k12.getMeasuredHeight());
                            int size2 = list3.size();
                            if (flexboxLayoutManager.f14823q != 0) {
                                if (c1893d2.f23489A) {
                                    i25 = i20;
                                } else if (i19 != 0 && ((i22 = flexboxLayoutManager.f14825s) == -1 || i22 > size2 + 1)) {
                                    if (flexboxLayoutManager.o1()) {
                                        i23 = ((H2.T) k12.getLayoutParams()).f4616b.left;
                                        i24 = ((H2.T) k12.getLayoutParams()).f4616b.right;
                                    } else {
                                        i23 = ((H2.T) k12.getLayoutParams()).f4616b.top;
                                        i24 = ((H2.T) k12.getLayoutParams()).f4616b.bottom;
                                    }
                                    int i41 = i23 + i24;
                                    if (i41 > 0) {
                                        measuredWidth += i41;
                                    }
                                    int i42 = i40 + measuredWidth;
                                    i25 = i20;
                                    if (i25 >= i42) {
                                        i20 = i25;
                                    }
                                }
                                if (c1891b.f23474d - c1891b.f23475e > 0) {
                                    int i43 = i30 > 0 ? i30 - 1 : 0;
                                    c1891b.f23478i = i33;
                                    c1891b.f23479l = i43;
                                    list4 = list3;
                                    list4.add(c1891b);
                                    i33 += c1891b.f23473c;
                                } else {
                                    list4 = list3;
                                }
                                if (!z10) {
                                    i20 = i25;
                                    if (((ViewGroup.MarginLayoutParams) c1893d2).width == -1) {
                                        k12.measure(androidx.recyclerview.widget.a.z(flexboxLayoutManager.f(), flexboxLayoutManager.f13717n, flexboxLayoutManager.f13715l, flexboxLayoutManager.M() + flexboxLayoutManager.L() + ((ViewGroup.MarginLayoutParams) c1893d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1893d2).rightMargin + i33, ((ViewGroup.MarginLayoutParams) c1893d2).width), z11);
                                        o02.f(k12, i30);
                                    }
                                } else if (((ViewGroup.MarginLayoutParams) c1893d2).height == -1) {
                                    i20 = i25;
                                    k12.measure(z11, androidx.recyclerview.widget.a.z(flexboxLayoutManager.g(), flexboxLayoutManager.f13718o, flexboxLayoutManager.f13716m, flexboxLayoutManager.K() + flexboxLayoutManager.N() + ((ViewGroup.MarginLayoutParams) c1893d2).topMargin + ((ViewGroup.MarginLayoutParams) c1893d2).bottomMargin + i33, ((ViewGroup.MarginLayoutParams) c1893d2).height));
                                    o02.f(k12, i30);
                                } else {
                                    i20 = i25;
                                }
                                c1891b = new C1891b();
                                c1891b.f23474d = 1;
                                c1891b.f23471a = i31;
                                c1891b.k = i30;
                                i26 = Integer.MIN_VALUE;
                                boolean z15 = c1891b.f23480m;
                                float f10 = c1893d2.f23490e;
                                c1891b.f23480m = z15 | (f10 != 0.0f);
                                boolean z16 = c1891b.f23481n;
                                float f11 = c1893d2.f23491f;
                                c1891b.f23481n = z16 | (f11 != 0.0f);
                                iArr = (int[]) o02.f924c;
                                if (iArr != null) {
                                    iArr[i30] = list4.size();
                                }
                                c1891b.f23471a = (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin) + (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).leftMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).topMargin) + (z10 ? k12.getMeasuredWidth() : k12.getMeasuredHeight()) + c1891b.f23471a;
                                c1891b.f23476f += f10;
                                c1891b.g += f11;
                                flexboxLayoutManager.e(FlexboxLayoutManager.f14809N, k12);
                                if (flexboxLayoutManager.o1()) {
                                    int i44 = ((H2.T) k12.getLayoutParams()).f4616b.left + ((H2.T) k12.getLayoutParams()).f4616b.right;
                                    c1891b.f23471a += i44;
                                    c1891b.f23472b += i44;
                                } else {
                                    int i45 = ((H2.T) k12.getLayoutParams()).f4616b.top + ((H2.T) k12.getLayoutParams()).f4616b.bottom;
                                    c1891b.f23471a += i45;
                                    c1891b.f23472b += i45;
                                }
                                int max = Math.max(i26, flexboxLayoutManager.j1(k12) + (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin) + (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).topMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).leftMargin) + (z10 ? k12.getMeasuredHeight() : k12.getMeasuredWidth()));
                                c1891b.f23473c = Math.max(c1891b.f23473c, max);
                                if (z10) {
                                    if (flexboxLayoutManager.f14823q != 2) {
                                        c1891b.f23477h = Math.max(c1891b.f23477h, k12.getBaseline() + ((ViewGroup.MarginLayoutParams) c1893d2).topMargin);
                                    } else {
                                        c1891b.f23477h = Math.max(c1891b.f23477h, (k12.getMeasuredHeight() - k12.getBaseline()) + ((ViewGroup.MarginLayoutParams) c1893d2).bottomMargin);
                                    }
                                }
                                if (i30 == i16 - 1 && c1891b.f23474d - c1891b.f23475e != 0) {
                                    c1891b.f23478i = i33;
                                    c1891b.f23479l = i30;
                                    list4.add(c1891b);
                                    i33 += c1891b.f23473c;
                                }
                                if (i13 != -1 || list4.size() <= 0 || ((C1891b) list4.get(list4.size() - 1)).f23479l < i13 || i30 < i13 || z8) {
                                    i27 = i11;
                                    z12 = z8;
                                } else {
                                    i33 = -c1891b.f23473c;
                                    z12 = true;
                                    i27 = i11;
                                }
                                if (i33 <= i27 && z12) {
                                    return;
                                }
                                i32 = max;
                                i28 = 1;
                                i30 += i28;
                                b2 = i16;
                                list2 = list4;
                                size = i20;
                                mode = i19;
                                o12 = z10;
                                i14 = i21;
                            }
                            list4 = list3;
                            c1891b.f23474d++;
                            i26 = i32;
                            boolean z152 = c1891b.f23480m;
                            float f102 = c1893d2.f23490e;
                            c1891b.f23480m = z152 | (f102 != 0.0f);
                            boolean z162 = c1891b.f23481n;
                            float f112 = c1893d2.f23491f;
                            c1891b.f23481n = z162 | (f112 != 0.0f);
                            iArr = (int[]) o02.f924c;
                            if (iArr != null) {
                            }
                            if (z10) {
                            }
                            c1891b.f23471a = (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin) + (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).leftMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).topMargin) + (z10 ? k12.getMeasuredWidth() : k12.getMeasuredHeight()) + c1891b.f23471a;
                            c1891b.f23476f += f102;
                            c1891b.g += f112;
                            flexboxLayoutManager.e(FlexboxLayoutManager.f14809N, k12);
                            if (flexboxLayoutManager.o1()) {
                            }
                            if (z10) {
                            }
                            int max2 = Math.max(i26, flexboxLayoutManager.j1(k12) + (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin) + (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).topMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).leftMargin) + (z10 ? k12.getMeasuredHeight() : k12.getMeasuredWidth()));
                            c1891b.f23473c = Math.max(c1891b.f23473c, max2);
                            if (z10) {
                            }
                            if (i30 == i16 - 1) {
                                c1891b.f23478i = i33;
                                c1891b.f23479l = i30;
                                list4.add(c1891b);
                                i33 += c1891b.f23473c;
                            }
                            if (i13 != -1) {
                            }
                            i27 = i11;
                            z12 = z8;
                            if (i33 <= i27) {
                            }
                            i32 = max2;
                            i28 = 1;
                            i30 += i28;
                            b2 = i16;
                            list2 = list4;
                            size = i20;
                            mode = i19;
                            o12 = z10;
                            i14 = i21;
                        }
                    } else {
                        i17 = i39;
                    }
                    i18 = i17;
                    if (o12) {
                    }
                    flexboxLayoutManager.v1(k12, i30);
                    o02.f(k12, i30);
                    i34 = View.combineMeasuredStates(i34, k12.getMeasuredState());
                    int i402 = c1891b.f23471a;
                    if (!z10) {
                    }
                    int measuredWidth2 = (!z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin) + (!z10 ? ((ViewGroup.MarginLayoutParams) c1893d2).leftMargin : ((ViewGroup.MarginLayoutParams) c1893d2).topMargin) + (!z10 ? k12.getMeasuredWidth() : k12.getMeasuredHeight());
                    int size22 = list3.size();
                    if (flexboxLayoutManager.f14823q != 0) {
                    }
                    list4 = list3;
                    c1891b.f23474d++;
                    i26 = i32;
                    boolean z1522 = c1891b.f23480m;
                    float f1022 = c1893d2.f23490e;
                    c1891b.f23480m = z1522 | (f1022 != 0.0f);
                    boolean z1622 = c1891b.f23481n;
                    float f1122 = c1893d2.f23491f;
                    c1891b.f23481n = z1622 | (f1122 != 0.0f);
                    iArr = (int[]) o02.f924c;
                    if (iArr != null) {
                    }
                    if (z10) {
                    }
                    c1891b.f23471a = (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin) + (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).leftMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).topMargin) + (z10 ? k12.getMeasuredWidth() : k12.getMeasuredHeight()) + c1891b.f23471a;
                    c1891b.f23476f += f1022;
                    c1891b.g += f1122;
                    flexboxLayoutManager.e(FlexboxLayoutManager.f14809N, k12);
                    if (flexboxLayoutManager.o1()) {
                    }
                    if (z10) {
                    }
                    int max22 = Math.max(i26, flexboxLayoutManager.j1(k12) + (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).rightMargin) + (z10 ? ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).topMargin : ((ViewGroup.MarginLayoutParams) ((C1893d) interfaceC1890a)).leftMargin) + (z10 ? k12.getMeasuredHeight() : k12.getMeasuredWidth()));
                    c1891b.f23473c = Math.max(c1891b.f23473c, max22);
                    if (z10) {
                    }
                    if (i30 == i16 - 1) {
                    }
                    if (i13 != -1) {
                    }
                    i27 = i11;
                    z12 = z8;
                    if (i33 <= i27) {
                    }
                    i32 = max22;
                    i28 = 1;
                    i30 += i28;
                    b2 = i16;
                    list2 = list4;
                    size = i20;
                    mode = i19;
                    o12 = z10;
                    i14 = i21;
                }
            } else if (i30 == b2 - 1) {
                z8 = z12;
                if (c1891b.f23474d - c1891b.f23475e != 0) {
                    c1891b.f23478i = i33;
                    c1891b.f23479l = i30;
                    list2.add(c1891b);
                }
            } else {
                z8 = z12;
            }
            z12 = z8;
            z10 = o12;
            i19 = mode;
            i20 = size;
            list4 = list2;
            i16 = b2;
            i21 = i14;
            i28 = 1;
            i30 += i28;
            b2 = i16;
            list2 = list4;
            size = i20;
            mode = i19;
            o12 = z10;
            i14 = i21;
        }
    }

    public void f(View view, int i7) {
        boolean z8;
        InterfaceC1890a interfaceC1890a = (InterfaceC1890a) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        C1893d c1893d = (C1893d) interfaceC1890a;
        int i10 = c1893d.f23494w;
        boolean z10 = true;
        if (measuredWidth >= i10 && measuredWidth <= (i10 = c1893d.f23496y)) {
            z8 = false;
        } else {
            measuredWidth = i10;
            z8 = true;
        }
        int i11 = c1893d.f23495x;
        if (measuredHeight < i11) {
            measuredHeight = i11;
        } else {
            int i12 = c1893d.f23497z;
            if (measuredHeight > i12) {
                measuredHeight = i12;
            } else {
                z10 = z8;
            }
        }
        if (z10) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            F(i7, makeMeasureSpec, makeMeasureSpec2, view);
            ((FlexboxLayoutManager) this.f922a).v1(view, i7);
        }
    }

    @Override // p7.c
    public Object g(T6.a aVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((p7.p) this.f922a, (p7.p) this.f923b, (p7.p) this.f924c, (p7.p) this.f925d, (p7.p) this.f926e, aVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Rb.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Rb.a, kotlin.jvm.internal.m] */
    @Override // Db.g
    public Object getValue() {
        l2.Y y10 = (l2.Y) this.f926e;
        if (y10 != null) {
            return y10;
        }
        l2.d0 store = (l2.d0) ((kotlin.jvm.internal.m) this.f923b).invoke();
        l2.a0 factory = (l2.a0) ((Rb.a) this.f924c).invoke();
        o2.c extras = (o2.c) ((kotlin.jvm.internal.m) this.f925d).invoke();
        kotlin.jvm.internal.l.e(store, "store");
        kotlin.jvm.internal.l.e(factory, "factory");
        kotlin.jvm.internal.l.e(extras, "extras");
        q3.n nVar = new q3.n(store, factory, extras);
        kotlin.jvm.internal.e eVar = (kotlin.jvm.internal.e) this.f922a;
        String b2 = eVar.b();
        if (b2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        l2.Y l10 = nVar.l(eVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
        this.f926e = l10;
        return l10;
    }

    public void h(int i7, List list) {
        int i10 = ((int[]) this.f924c)[i7];
        if (i10 == -1) {
            i10 = 0;
        }
        if (list.size() > i10) {
            list.subList(i10, list.size()).clear();
        }
        int[] iArr = (int[]) this.f924c;
        int length = iArr.length - 1;
        if (i7 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i7, length, -1);
        }
        long[] jArr = (long[]) this.f925d;
        int length2 = jArr.length - 1;
        if (i7 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i7, length2, 0L);
        }
    }

    @Override // a5.g
    public List j(long j) {
        h5.e eVar = (h5.e) this.f922a;
        ArrayList arrayList = new ArrayList();
        eVar.g(j, eVar.f17796h, arrayList);
        TreeMap treeMap = new TreeMap();
        eVar.i(j, false, eVar.f17796h, treeMap);
        HashMap hashMap = (HashMap) this.f925d;
        eVar.h(j, (Map) this.f924c, hashMap, eVar.f17796h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((HashMap) this.f926e).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                h5.f fVar = (h5.f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new C0776b(null, null, null, decodeByteArray, fVar.f17802c, 0, fVar.f17804e, fVar.f17801b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f17805f, fVar.g, false, -16777216, fVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            h5.f fVar2 = (h5.f) hashMap.get(entry.getKey());
            fVar2.getClass();
            C0775a c0775a = (C0775a) entry.getValue();
            CharSequence charSequence = c0775a.f12694a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C1251a c1251a : (C1251a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1251a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1251a), spannableStringBuilder.getSpanEnd(c1251a), (CharSequence) "");
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i10 = i7 + 1;
                    int i11 = i10;
                    while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                        i11++;
                    }
                    int i12 = i11 - i10;
                    if (i12 > 0) {
                        spannableStringBuilder.delete(i7, i12 + i7);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == '\n') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == ' ') {
                        spannableStringBuilder.delete(i14, i13 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == '\n') {
                        spannableStringBuilder.delete(i15, i16);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c0775a.f12698e = fVar2.f17802c;
            c0775a.f12699f = fVar2.f17803d;
            c0775a.g = fVar2.f17804e;
            c0775a.f12700h = fVar2.f17801b;
            c0775a.f12702l = fVar2.f17805f;
            c0775a.k = fVar2.f17807i;
            c0775a.j = fVar2.f17806h;
            c0775a.f12706p = fVar2.j;
            arrayList2.add(c0775a.a());
        }
        return arrayList2;
    }

    public void k(int i7, int i10, int i11) {
        int size;
        int L;
        int M3;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
        int b2 = flexboxLayoutManager.f14831y.b();
        boolean[] zArr = (boolean[]) this.f923b;
        if (zArr == null) {
            this.f923b = new boolean[Math.max(b2, 10)];
        } else if (zArr.length < b2) {
            this.f923b = new boolean[Math.max(zArr.length * 2, b2)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i11 >= flexboxLayoutManager.f14831y.b()) {
            return;
        }
        int i12 = flexboxLayoutManager.f14822p;
        if (i12 == 0 || i12 == 1) {
            int mode = View.MeasureSpec.getMode(i7);
            size = View.MeasureSpec.getSize(i7);
            int l12 = flexboxLayoutManager.l1();
            if (mode != 1073741824) {
                size = Math.min(l12, size);
            }
            L = flexboxLayoutManager.L();
            M3 = flexboxLayoutManager.M();
        } else {
            if (i12 != 2 && i12 != 3) {
                throw new IllegalArgumentException(h3.o.l(i12, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            if (mode2 != 1073741824) {
                size = flexboxLayoutManager.l1();
            }
            L = flexboxLayoutManager.N();
            M3 = flexboxLayoutManager.K();
        }
        int i13 = M3 + L;
        int[] iArr = (int[]) this.f924c;
        List list = flexboxLayoutManager.f14828v;
        int size2 = list.size();
        for (int i14 = iArr != null ? iArr[i11] : 0; i14 < size2; i14++) {
            C1891b c1891b = (C1891b) list.get(i14);
            int i15 = c1891b.f23471a;
            if (i15 < size && c1891b.f23480m) {
                p(i7, i10, c1891b, size, i13, false);
            } else if (i15 > size && c1891b.f23481n) {
                B(i7, i10, c1891b, size, i13, false);
            }
        }
    }

    public void l(int i7) {
        int[] iArr = (int[]) this.f924c;
        if (iArr == null) {
            this.f924c = new int[Math.max(i7, 10)];
        } else if (iArr.length < i7) {
            this.f924c = Arrays.copyOf((int[]) this.f924c, Math.max(iArr.length * 2, i7));
        }
    }

    public void m(int i7) {
        long[] jArr = (long[]) this.f925d;
        if (jArr == null) {
            this.f925d = new long[Math.max(i7, 10)];
        } else if (jArr.length < i7) {
            this.f925d = Arrays.copyOf((long[]) this.f925d, Math.max(jArr.length * 2, i7));
        }
    }

    public void n(int i7) {
        long[] jArr = (long[]) this.f926e;
        if (jArr == null) {
            this.f926e = new long[Math.max(i7, 10)];
        } else if (jArr.length < i7) {
            this.f926e = Arrays.copyOf((long[]) this.f926e, Math.max(jArr.length * 2, i7));
        }
    }

    @Override // a5.g
    public int o() {
        return ((long[]) this.f923b).length;
    }

    public void p(int i7, int i10, C1891b c1891b, int i11, int i12, boolean z8) {
        int i13;
        boolean z10;
        int i14;
        float f4;
        int i15;
        double d10;
        double d11;
        float f10 = c1891b.f23476f;
        boolean z11 = false;
        if (f10 <= 0.0f || i11 < (i13 = c1891b.f23471a)) {
            return;
        }
        float f11 = (i11 - i13) / f10;
        c1891b.f23471a = i12 + c1891b.f23472b;
        if (!z8) {
            c1891b.f23473c = Integer.MIN_VALUE;
        }
        int i16 = 0;
        boolean z12 = false;
        int i17 = 0;
        float f12 = 0.0f;
        while (i16 < c1891b.f23474d) {
            int i18 = c1891b.k + i16;
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
            View k12 = flexboxLayoutManager.k1(i18);
            if (k12 == null || k12.getVisibility() == 8) {
                z10 = z11;
                i14 = i13;
                f4 = f11;
            } else {
                InterfaceC1890a interfaceC1890a = (InterfaceC1890a) k12.getLayoutParams();
                int i19 = flexboxLayoutManager.f14822p;
                if (i19 == 0 || i19 == 1) {
                    i14 = i13;
                    f4 = f11;
                    int measuredWidth = k12.getMeasuredWidth();
                    long[] jArr = (long[]) this.f926e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i18];
                    }
                    int measuredHeight = k12.getMeasuredHeight();
                    long[] jArr2 = (long[]) this.f926e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i18] >> 32);
                    }
                    if (((boolean[]) this.f923b)[i18]) {
                        z10 = false;
                    } else {
                        C1893d c1893d = (C1893d) interfaceC1890a;
                        float f13 = c1893d.f23490e;
                        z10 = false;
                        if (f13 > 0.0f) {
                            float f14 = (f4 * f13) + measuredWidth;
                            if (i16 == c1891b.f23474d - 1) {
                                f14 += f12;
                                f12 = 0.0f;
                            }
                            int round = Math.round(f14);
                            int i20 = c1893d.f23496y;
                            if (round > i20) {
                                ((boolean[]) this.f923b)[i18] = true;
                                c1891b.f23476f -= f13;
                                round = i20;
                                z12 = true;
                            } else {
                                float f15 = (f14 - round) + f12;
                                double d12 = f15;
                                if (d12 > 1.0d) {
                                    round++;
                                    d10 = d12 - 1.0d;
                                } else {
                                    if (d12 < -1.0d) {
                                        round--;
                                        d10 = d12 + 1.0d;
                                    }
                                    f12 = f15;
                                }
                                f15 = (float) d10;
                                f12 = f15;
                            }
                            int q10 = q(i10, interfaceC1890a, c1891b.f23478i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            k12.measure(makeMeasureSpec, q10);
                            int measuredWidth2 = k12.getMeasuredWidth();
                            int measuredHeight2 = k12.getMeasuredHeight();
                            F(i18, makeMeasureSpec, q10, k12);
                            flexboxLayoutManager.v1(k12, i18);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                    }
                    C1893d c1893d2 = (C1893d) interfaceC1890a;
                    int max = Math.max(i17, flexboxLayoutManager.j1(k12) + measuredHeight + ((ViewGroup.MarginLayoutParams) c1893d2).topMargin + ((ViewGroup.MarginLayoutParams) c1893d2).bottomMargin);
                    c1891b.f23471a = measuredWidth + ((ViewGroup.MarginLayoutParams) c1893d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1893d2).rightMargin + c1891b.f23471a;
                    i15 = max;
                } else {
                    int measuredHeight3 = k12.getMeasuredHeight();
                    long[] jArr3 = (long[]) this.f926e;
                    if (jArr3 != null) {
                        i14 = i13;
                        measuredHeight3 = (int) (jArr3[i18] >> 32);
                    } else {
                        i14 = i13;
                    }
                    int measuredWidth3 = k12.getMeasuredWidth();
                    long[] jArr4 = (long[]) this.f926e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i18];
                    }
                    if (!((boolean[]) this.f923b)[i18]) {
                        C1893d c1893d3 = (C1893d) interfaceC1890a;
                        float f16 = c1893d3.f23490e;
                        if (f16 > 0.0f) {
                            float f17 = (f11 * f16) + measuredHeight3;
                            if (i16 == c1891b.f23474d - 1) {
                                f17 += f12;
                                f12 = 0.0f;
                            }
                            int round2 = Math.round(f17);
                            int i21 = c1893d3.f23497z;
                            if (round2 > i21) {
                                ((boolean[]) this.f923b)[i18] = true;
                                c1891b.f23476f -= f16;
                                round2 = i21;
                                f4 = f11;
                                z12 = true;
                            } else {
                                float f18 = (f17 - round2) + f12;
                                f4 = f11;
                                double d13 = f18;
                                if (d13 > 1.0d) {
                                    round2++;
                                    d11 = d13 - 1.0d;
                                } else if (d13 < -1.0d) {
                                    round2--;
                                    d11 = d13 + 1.0d;
                                } else {
                                    f12 = f18;
                                }
                                f12 = (float) d11;
                            }
                            int r10 = r(i7, interfaceC1890a, c1891b.f23478i);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            k12.measure(r10, makeMeasureSpec2);
                            int measuredWidth4 = k12.getMeasuredWidth();
                            int measuredHeight4 = k12.getMeasuredHeight();
                            F(i18, r10, makeMeasureSpec2, k12);
                            flexboxLayoutManager.v1(k12, i18);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                            C1893d c1893d4 = (C1893d) interfaceC1890a;
                            i15 = Math.max(i17, flexboxLayoutManager.j1(k12) + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1893d4).leftMargin + ((ViewGroup.MarginLayoutParams) c1893d4).rightMargin);
                            c1891b.f23471a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1893d4).topMargin + ((ViewGroup.MarginLayoutParams) c1893d4).bottomMargin + c1891b.f23471a;
                            z10 = false;
                        }
                    }
                    f4 = f11;
                    C1893d c1893d42 = (C1893d) interfaceC1890a;
                    i15 = Math.max(i17, flexboxLayoutManager.j1(k12) + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1893d42).leftMargin + ((ViewGroup.MarginLayoutParams) c1893d42).rightMargin);
                    c1891b.f23471a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1893d42).topMargin + ((ViewGroup.MarginLayoutParams) c1893d42).bottomMargin + c1891b.f23471a;
                    z10 = false;
                }
                c1891b.f23473c = Math.max(c1891b.f23473c, i15);
                i17 = i15;
            }
            i16++;
            f11 = f4;
            z11 = z10;
            i13 = i14;
        }
        int i22 = i13;
        if (!z12 || i22 == c1891b.f23471a) {
            return;
        }
        p(i7, i10, c1891b, i11, i12, true);
    }

    public int q(int i7, InterfaceC1890a interfaceC1890a, int i10) {
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
        C1893d c1893d = (C1893d) interfaceC1890a;
        int z8 = androidx.recyclerview.widget.a.z(flexboxLayoutManager.g(), flexboxLayoutManager.f13718o, flexboxLayoutManager.f13716m, flexboxLayoutManager.K() + flexboxLayoutManager.N() + ((ViewGroup.MarginLayoutParams) c1893d).topMargin + ((ViewGroup.MarginLayoutParams) c1893d).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) c1893d).height);
        int size = View.MeasureSpec.getSize(z8);
        int i11 = c1893d.f23497z;
        if (size > i11) {
            return View.MeasureSpec.makeMeasureSpec(i11, View.MeasureSpec.getMode(z8));
        }
        int i12 = c1893d.f23495x;
        return size < i12 ? View.MeasureSpec.makeMeasureSpec(i12, View.MeasureSpec.getMode(z8)) : z8;
    }

    public int r(int i7, InterfaceC1890a interfaceC1890a, int i10) {
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
        C1893d c1893d = (C1893d) interfaceC1890a;
        int z8 = androidx.recyclerview.widget.a.z(flexboxLayoutManager.f(), flexboxLayoutManager.f13717n, flexboxLayoutManager.f13715l, flexboxLayoutManager.M() + flexboxLayoutManager.L() + ((ViewGroup.MarginLayoutParams) c1893d).leftMargin + ((ViewGroup.MarginLayoutParams) c1893d).rightMargin + i10, ((ViewGroup.MarginLayoutParams) c1893d).width);
        int size = View.MeasureSpec.getSize(z8);
        int i11 = c1893d.f23496y;
        if (size > i11) {
            return View.MeasureSpec.makeMeasureSpec(i11, View.MeasureSpec.getMode(z8));
        }
        int i12 = c1893d.f23494w;
        return size < i12 ? View.MeasureSpec.makeMeasureSpec(i12, View.MeasureSpec.getMode(z8)) : z8;
    }

    public float s(int i7, boolean z8) {
        Layout layout = (Layout) this.f922a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i7));
        if (i7 > lineEnd) {
            i7 = lineEnd;
        }
        return z8 ? layout.getPrimaryHorizontal(i7) : layout.getSecondaryHorizontal(i7);
    }

    public String t() {
        Context context = (Context) this.f922a;
        try {
            byte[] e2 = M5.c.e(context, context.getPackageName());
            if (e2 != null) {
                return M5.c.b(e2);
            }
            Log.e("A9.O0", "Could not get fingerprint hash for package: " + context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("A9.O0", "No such package: " + context.getPackageName(), e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0149, code lost:
    
        if (r3.getRunCount() == 1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0037, code lost:
    
        if (r30 != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float u(int i7, boolean z8, boolean z10) {
        int lineForOffset;
        int i10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        Bidi bidi;
        int i13;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        int i16 = i7;
        if (!z10) {
            return s(i7, z8);
        }
        Layout layout = (Layout) this.f922a;
        if (i16 <= 0) {
            lineForOffset = 0;
        } else {
            if (i16 >= layout.getText().length()) {
                lineForOffset = layout.getLineCount();
            } else {
                lineForOffset = layout.getLineForOffset(i16);
                int lineStart = layout.getLineStart(lineForOffset);
                int lineEnd = layout.getLineEnd(lineForOffset);
                if (lineStart == i16 || lineEnd == i16) {
                    if (lineStart != i16) {
                        if (!z10) {
                            lineForOffset++;
                        }
                    }
                }
            }
            lineForOffset--;
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (i16 != lineStart2 && i16 != lineEnd2) {
            return s(i7, z8);
        }
        if (i16 == 0 || i16 == layout.getText().length()) {
            return s(i7, z8);
        }
        ArrayList arrayList = (ArrayList) this.f923b;
        int h10 = y7.u0.h(arrayList, Integer.valueOf(i7));
        int i17 = h10 < 0 ? -(h10 + 1) : h10 + 1;
        if (z10 && i17 > 0) {
            int i18 = i17 - 1;
            if (i16 == ((Number) arrayList.get(i18)).intValue()) {
                i17 = i18;
            }
        }
        boolean z17 = layout.getParagraphDirection(layout.getLineForOffset(i17 == 0 ? 0 : ((Number) arrayList.get(i17 + (-1))).intValue())) == -1;
        int x2 = x(lineEnd2, lineStart2);
        int intValue = i17 == 0 ? 0 : ((Number) arrayList.get(i17 - 1)).intValue();
        int i19 = lineStart2 - intValue;
        int i20 = x2 - intValue;
        boolean[] zArr = (boolean[]) this.f925d;
        boolean z18 = zArr[i17];
        ArrayList arrayList2 = (ArrayList) this.f924c;
        if (z18) {
            i11 = lineForOffset;
            i10 = x2;
            bidi = (Bidi) arrayList2.get(i17);
            z11 = z17;
            i12 = -1;
        } else {
            int intValue2 = i17 == 0 ? 0 : ((Number) arrayList.get(i17 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i17)).intValue();
            int i21 = intValue3 - intValue2;
            i10 = x2;
            char[] cArr = (char[]) this.f926e;
            i11 = lineForOffset;
            if (cArr == null || cArr.length < i21) {
                cArr = new char[i21];
            }
            z11 = z17;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i21)) {
                int intValue4 = i17 == 0 ? 0 : ((Number) arrayList.get(i17 - 1)).intValue();
                i12 = -1;
                bidi = new Bidi(cArr, 0, null, 0, i21, layout.getParagraphDirection(layout.getLineForOffset(intValue4)) == -1 ? 1 : 0);
                z12 = true;
            } else {
                i12 = -1;
                z12 = true;
            }
            bidi = null;
            arrayList2.set(i17, bidi);
            zArr[i17] = z12;
            if (bidi != null) {
                char[] cArr2 = (char[]) this.f926e;
                cArr = cArr == cArr2 ? null : cArr2;
            }
            this.f926e = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i19, i20) : null;
        if (createLineBidi == null) {
            i13 = i11;
            z13 = z11;
            z14 = true;
        } else if (createLineBidi.getRunCount() == 1) {
            z14 = true;
            i13 = i11;
            z13 = z11;
        } else {
            int runCount = createLineBidi.getRunCount();
            L0.d[] dVarArr = new L0.d[runCount];
            for (int i22 = 0; i22 < runCount; i22++) {
                dVarArr[i22] = new L0.d(createLineBidi.getRunLevel(i22) % 2 == 1, createLineBidi.getRunStart(i22) + lineStart2, createLineBidi.getRunLimit(i22) + lineStart2);
            }
            int runCount2 = createLineBidi.getRunCount();
            byte[] bArr = new byte[runCount2];
            for (int i23 = 0; i23 < runCount2; i23++) {
                bArr[i23] = (byte) createLineBidi.getRunLevel(i23);
            }
            Bidi.reorderVisually(bArr, 0, dVarArr, 0, runCount);
            if (i16 != lineStart2) {
                int i24 = i11;
                boolean z19 = z11;
                if (i16 > i10) {
                    i16 = x(i16, lineStart2);
                }
                int i25 = 0;
                while (true) {
                    if (i25 >= runCount) {
                        i14 = i12;
                        break;
                    }
                    if (dVarArr[i25].f6236b == i16) {
                        i14 = i25;
                        break;
                    }
                    i25++;
                }
                boolean z20 = (z8 || z19 == dVarArr[i14].f6237c) ? z19 : !z19;
                return (i14 == 0 && z20) ? layout.getLineLeft(i24) : (i14 != runCount - 1 || z20) ? z20 ? layout.getPrimaryHorizontal(dVarArr[i14 - 1].f6236b) : layout.getPrimaryHorizontal(dVarArr[i14 + 1].f6236b) : layout.getLineRight(i24);
            }
            int i26 = 0;
            while (true) {
                if (i26 >= runCount) {
                    i15 = i12;
                    break;
                }
                if (dVarArr[i26].f6235a == i16) {
                    i15 = i26;
                    break;
                }
                i26++;
            }
            L0.d dVar = dVarArr[i15];
            if (z8) {
                z15 = z11;
            } else {
                z15 = z11;
                if (z15 != dVar.f6237c) {
                    z16 = z15;
                    if (i15 == 0 || !z16) {
                        return (i15 == runCount - 1 || z16) ? !z16 ? layout.getPrimaryHorizontal(dVarArr[i15 - 1].f6235a) : layout.getPrimaryHorizontal(dVarArr[i15 + 1].f6235a) : layout.getLineRight(i11);
                    }
                    return layout.getLineLeft(i11);
                }
            }
            z16 = !z15;
            if (i15 == 0) {
            }
            if (i15 == runCount - 1) {
            }
        }
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart2);
        if (z8 || z13 == isRtlCharAt) {
            z13 = !z13 ? z14 : false;
        }
        if (i16 != lineStart2) {
            z13 = !z13 ? z14 : false;
        }
        return z13 ? layout.getLineLeft(i13) : layout.getLineRight(i13);
    }

    public void v(View view, C1891b c1891b, int i7, int i10, int i11, int i12) {
        InterfaceC1890a interfaceC1890a = (InterfaceC1890a) view.getLayoutParams();
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f922a;
        int i13 = flexboxLayoutManager.f14824r;
        C1893d c1893d = (C1893d) interfaceC1890a;
        int i14 = c1893d.f23492u;
        if (i14 != -1) {
            i13 = i14;
        }
        int i15 = c1891b.f23473c;
        if (i13 != 0) {
            if (i13 == 1) {
                if (flexboxLayoutManager.f14823q != 2) {
                    int i16 = i10 + i15;
                    int measuredHeight = i16 - view.getMeasuredHeight();
                    int i17 = ((ViewGroup.MarginLayoutParams) c1893d).bottomMargin;
                    view.layout(i7, measuredHeight - i17, i11, i16 - i17);
                    return;
                }
                view.layout(i7, view.getMeasuredHeight() + (i10 - i15) + ((ViewGroup.MarginLayoutParams) c1893d).topMargin, i11, view.getMeasuredHeight() + (i12 - i15) + ((ViewGroup.MarginLayoutParams) c1893d).topMargin);
                return;
            }
            if (i13 == 2) {
                int measuredHeight2 = (((i15 - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) c1893d).topMargin) - ((ViewGroup.MarginLayoutParams) c1893d).bottomMargin) / 2;
                if (flexboxLayoutManager.f14823q != 2) {
                    int i18 = i10 + measuredHeight2;
                    view.layout(i7, i18, i11, view.getMeasuredHeight() + i18);
                    return;
                } else {
                    int i19 = i10 - measuredHeight2;
                    view.layout(i7, i19, i11, view.getMeasuredHeight() + i19);
                    return;
                }
            }
            if (i13 == 3) {
                if (flexboxLayoutManager.f14823q != 2) {
                    int max = Math.max(c1891b.f23477h - view.getBaseline(), ((ViewGroup.MarginLayoutParams) c1893d).topMargin);
                    view.layout(i7, i10 + max, i11, i12 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (c1891b.f23477h - view.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) c1893d).bottomMargin);
                    view.layout(i7, i10 - max2, i11, i12 - max2);
                    return;
                }
            }
            if (i13 != 4) {
                return;
            }
        }
        if (flexboxLayoutManager.f14823q != 2) {
            int i20 = ((ViewGroup.MarginLayoutParams) c1893d).topMargin;
            view.layout(i7, i10 + i20, i11, i12 + i20);
        } else {
            int i21 = ((ViewGroup.MarginLayoutParams) c1893d).bottomMargin;
            view.layout(i7, i10 - i21, i11, i12 - i21);
        }
    }

    public void w(View view, C1891b c1891b, boolean z8, int i7, int i10, int i11, int i12) {
        InterfaceC1890a interfaceC1890a = (InterfaceC1890a) view.getLayoutParams();
        int i13 = ((FlexboxLayoutManager) this.f922a).f14824r;
        C1893d c1893d = (C1893d) interfaceC1890a;
        int i14 = c1893d.f23492u;
        if (i14 != -1) {
            i13 = i14;
        }
        int i15 = c1891b.f23473c;
        if (i13 != 0) {
            if (i13 == 1) {
                if (!z8) {
                    view.layout(((i7 + i15) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) c1893d).rightMargin, i10, ((i11 + i15) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) c1893d).rightMargin, i12);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i7 - i15) + ((ViewGroup.MarginLayoutParams) c1893d).leftMargin, i10, view.getMeasuredWidth() + (i11 - i15) + ((ViewGroup.MarginLayoutParams) c1893d).leftMargin, i12);
                return;
            }
            if (i13 == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i15 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z8) {
                    view.layout(i7 - marginStart, i10, i11 - marginStart, i12);
                    return;
                } else {
                    view.layout(i7 + marginStart, i10, i11 + marginStart, i12);
                    return;
                }
            }
            if (i13 != 3 && i13 != 4) {
                return;
            }
        }
        if (z8) {
            int i16 = ((ViewGroup.MarginLayoutParams) c1893d).rightMargin;
            view.layout(i7 - i16, i10, i11 - i16, i12);
        } else {
            int i17 = ((ViewGroup.MarginLayoutParams) c1893d).leftMargin;
            view.layout(i7 + i17, i10, i11 + i17, i12);
        }
    }

    public int x(int i7, int i10) {
        while (i7 > i10) {
            char charAt = ((Layout) this.f922a).getText().charAt(i7 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((kotlin.jvm.internal.l.f(charAt, 8192) < 0 || kotlin.jvm.internal.l.f(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                break;
            }
            i7--;
        }
        return i7;
    }

    public String y(URL url, byte[] bArr, h7.g gVar, boolean z8) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        boolean z10 = true;
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            h8.f fVar = (h8.f) ((InterfaceC1387b) this.f926e).get();
            String str = null;
            if (fVar != null) {
                try {
                    str = (String) Tasks.await(((h8.d) fVar).a());
                } catch (Exception unused) {
                    Log.w("A9.O0", "Unable to get heartbeats!");
                }
            }
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Firebase-Client", str);
            }
            httpURLConnection.setRequestProperty("X-Android-Package", ((Context) this.f922a).getPackageName());
            httpURLConnection.setRequestProperty("X-Android-Cert", t());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (responseCode < 200 || responseCode >= 300) {
                    z10 = false;
                }
                if (z10) {
                    if (z8) {
                        gVar.f17852a = 0L;
                        gVar.f17853b = -1L;
                    }
                    httpURLConnection.disconnect();
                    return sb3;
                }
                gVar.f17852a++;
                if (responseCode != 400 && responseCode != 404) {
                    gVar.f17853b = Math.min((long) (Math.pow(2.0d, gVar.f17852a * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L) + System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject(new JSONObject(sb3).optString("error"));
                    throw new Y6.k("Error returned from API. code: " + jSONObject.optInt("code") + " body: " + jSONObject.optString("message"));
                }
                gVar.f17853b = System.currentTimeMillis() + 86400000;
                JSONObject jSONObject2 = new JSONObject(new JSONObject(sb3).optString("error"));
                throw new Y6.k("Error returned from API. code: " + jSONObject2.optInt("code") + " body: " + jSONObject2.optString("message"));
            } finally {
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y.k, java.lang.Object] */
    public void z(Y3.a aVar, Y3.g gVar) {
        C0838i c0838i = (C0838i) this.f922a;
        String str = (String) this.f923b;
        Y3.e eVar = (Y3.e) this.f925d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        Y3.c cVar = (Y3.c) this.f924c;
        b4.p pVar = (b4.p) this.f926e;
        C0838i b2 = c0838i.b(aVar.f11145b);
        ?? obj = new Object();
        obj.f11059f = new HashMap();
        obj.f11057d = Long.valueOf(pVar.f13877a.b());
        obj.f11058e = Long.valueOf(pVar.f13878b.b());
        obj.f11054a = str;
        obj.f11056c = new C0840k(cVar, (byte[]) eVar.apply(aVar.f11144a));
        obj.f11055b = null;
        Y3.b bVar = aVar.f11146c;
        if (bVar != null) {
            obj.g = bVar.f11147a;
        }
        C0837h d10 = obj.d();
        C1196a c1196a = (C1196a) pVar.f13879c;
        c1196a.getClass();
        c1196a.f17448b.execute(new P4.F(c1196a, b2, gVar, d10, 1));
    }
}
