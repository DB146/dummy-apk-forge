package tc;

import A0.C;
import A0.C0020i;
import A0.C0021j;
import A0.InterfaceC0022k;
import A0.J;
import A0.L;
import A0.j0;
import A0.n0;
import A8.C0061z;
import B0.AbstractC0207v0;
import B0.C0165a;
import B0.C0166a0;
import B0.H0;
import B0.X;
import C.C0227l;
import E.g;
import Eb.n;
import Eb.o;
import F.C0257a;
import F.C0274s;
import H0.f;
import H0.h;
import H0.i;
import H0.q;
import H0.t;
import K0.C0374d;
import Q.C0480b;
import Q.C0498k;
import Q.C0502m;
import Q.C0505n0;
import Q.C0506o;
import Q.InterfaceC0493h0;
import Q.S;
import Q.W;
import R.I;
import Rb.c;
import W1.C0570m;
import Z0.j;
import a.AbstractC0672a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.leanback.transition.FadeAndShortSlide;
import c0.m;
import cc.C0944m;
import com.bumptech.glide.d;
import com.bumptech.glide.integration.compose.GlideNodeElement;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.Task;
import d0.C1035c;
import d0.k;
import i0.C1289b;
import i1.C1290a;
import java.io.Closeable;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.l;
import n5.D;
import n5.v;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.C1877c;
import s4.C1987o;
import u.C2042E;
import u.C2046I;
import u.C2052e;
import u.T;
import v2.r;
import v2.s;
import v2.u;
import y0.C2319D;
import y0.C2341i;
import y3.AbstractC2383f;
import y3.C2380c;
import y3.C2381d;
import y7.u0;
import z1.e;

/* loaded from: classes2.dex */
public abstract class b {
    public static final ArrayList A(Map map, c cVar) {
        l.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() != null) {
                throw new ClassCastException();
            }
            l.b(null);
            throw null;
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) cVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064 A[Catch: UnsupportedEncodingException -> 0x0069, TRY_LEAVE, TryCatch #1 {UnsupportedEncodingException -> 0x0069, blocks: (B:8:0x0022, B:12:0x0064, B:22:0x0046, B:24:0x005b, B:25:0x005e, B:17:0x0037, B:19:0x0040), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map D(String str) {
        Map emptyMap;
        JSONObject jSONObject;
        G.d(str);
        String[] split = str.split("\\.", -1);
        if (split.length < 2) {
            Log.e("FirebaseAppCheck", "Invalid token (too few subsections):\n".concat(str), null);
            return Collections.emptyMap();
        }
        try {
            String str2 = new String(Base64.decode(split[1], 11), "UTF-8");
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception e2) {
                    String str3 = "Failed to parse JSONObject into Map:\n" + e2;
                    if (Log.isLoggable("FirebaseAppCheck", 3)) {
                        Log.d("FirebaseAppCheck", str3, null);
                    }
                    emptyMap = Collections.emptyMap();
                }
                if (jSONObject != JSONObject.NULL) {
                    emptyMap = M(jSONObject);
                    return emptyMap != null ? Collections.emptyMap() : emptyMap;
                }
            }
            emptyMap = null;
            if (emptyMap != null) {
            }
        } catch (UnsupportedEncodingException e10) {
            Log.e("FirebaseAppCheck", "Unable to decode token (charset unknown):\n" + e10, null);
            return Collections.emptyMap();
        }
    }

    public static String E(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        boolean z8 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z8) {
                sb2.append("/");
            }
            sb2.append(str);
            z8 = false;
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void F(ViewStructure viewStructure, L l10, AutofillId autofillId, String str, I0.a aVar) {
        J0.a aVar2;
        C0374d c0374d;
        boolean z8;
        boolean z10;
        C1035c c1035c;
        d0.l lVar;
        Boolean bool;
        f fVar;
        Integer num;
        List list;
        String[] q10;
        AutofillValue forText;
        String q11;
        String[] q12;
        String[] q13;
        C2046I c2046i;
        long[] jArr;
        Object[] objArr;
        int i7;
        long[] jArr2;
        Object[] objArr2;
        C2046I c2046i2;
        J0.a aVar3;
        C0374d c0374d2;
        int i10;
        int i11;
        t tVar = q.f4539a;
        t tVar2 = h.f4471a;
        i v10 = l10.v();
        char c10 = 7;
        long j = -9187201950435737472L;
        int i12 = 8;
        Integer num2 = 1;
        if (v10 == null || (c2046i2 = v10.f4494a) == null) {
            aVar2 = null;
            c0374d = null;
            z8 = false;
            z10 = false;
            c1035c = null;
            lVar = null;
            bool = null;
            fVar = null;
            num = null;
        } else {
            Object[] objArr3 = c2046i2.f24604b;
            Object[] objArr4 = c2046i2.f24605c;
            long[] jArr3 = c2046i2.f24603a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                z8 = false;
                z10 = false;
                c1035c = null;
                aVar3 = null;
                lVar = null;
                bool = null;
                fVar = null;
                num = null;
                c0374d2 = null;
                while (true) {
                    long j10 = jArr3[i13];
                    if ((((~j10) << c10) & j10 & j) != j) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j10 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr3[i16];
                                Object obj2 = objArr4[i16];
                                t tVar3 = (t) obj;
                                if (l.a(tVar3, q.f4552q)) {
                                    l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    c1035c = (C1035c) obj2;
                                } else if (l.a(tVar3, q.f4539a)) {
                                    l.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) o.Z((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (l.a(tVar3, q.f4551p)) {
                                    l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    lVar = (d0.l) obj2;
                                } else if (l.a(tVar3, q.f4530C)) {
                                    l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    c0374d2 = (C0374d) obj2;
                                } else if (l.a(tVar3, q.k)) {
                                    l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (l.a(tVar3, q.f4538K)) {
                                    l.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (l.a(tVar3, q.f4534G)) {
                                    z10 = true;
                                } else if (l.a(tVar3, q.f4557v)) {
                                    l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    fVar = (f) obj2;
                                } else if (l.a(tVar3, q.f4532E)) {
                                    l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (l.a(tVar3, q.f4533F)) {
                                    l.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar3 = (J0.a) obj2;
                                } else if (l.a(tVar3, h.f4472b)) {
                                    viewStructure.setClickable(true);
                                } else if (l.a(tVar3, h.f4473c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (l.a(tVar3, h.f4488u)) {
                                    viewStructure.setFocusable(true);
                                } else if (l.a(tVar3, h.j)) {
                                    z8 = true;
                                }
                                i11 = 8;
                            } else {
                                i11 = i12;
                            }
                            j10 >>= i11;
                            i15++;
                            i12 = i11;
                        }
                        i10 = 1;
                        if (i14 != i12) {
                            break;
                        }
                    } else {
                        i10 = 1;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13 += i10;
                    c10 = 7;
                    j = -9187201950435737472L;
                    i12 = 8;
                }
            } else {
                z8 = false;
                z10 = false;
                c1035c = null;
                aVar3 = null;
                lVar = null;
                bool = null;
                fVar = null;
                num = null;
                c0374d2 = null;
            }
            aVar2 = aVar3;
            c0374d = c0374d2;
        }
        i v11 = l10.v();
        if (v11 != null && v11.f4496c && !v11.f4497d) {
            v11 = v11.o();
            C2042E c2042e = new C2042E(((S.b) l10.n()).f8953a.f8961c);
            c2042e.b(l10.n());
            while (c2042e.h()) {
                L l11 = (L) c2042e.i(c2042e.f24585b - 1);
                i v12 = l11.v();
                if (v12 != null && !v12.f4496c) {
                    v11.y(v12);
                    if (!v12.f4497d) {
                        c2042e.b(l11.n());
                    }
                }
            }
        }
        if (v11 != null && (c2046i = v11.f4494a) != null) {
            Object[] objArr5 = c2046i.f24604b;
            Object[] objArr6 = c2046i.f24605c;
            long[] jArr4 = c2046i.f24603a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                list = null;
                while (true) {
                    long j11 = jArr4[i17];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j11 & 255) < 128) {
                                int i20 = (i17 << 3) + i19;
                                Object obj3 = objArr5[i20];
                                Object obj4 = objArr6[i20];
                                jArr2 = jArr4;
                                t tVar4 = (t) obj3;
                                objArr2 = objArr5;
                                if (l.a(tVar4, q.f4546i)) {
                                    viewStructure.setEnabled(false);
                                } else if (l.a(tVar4, q.f4560y)) {
                                    l.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j11 >>= 8;
                            i19++;
                            jArr4 = jArr2;
                            objArr5 = objArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i7 = 1;
                        if (i18 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i7 = 1;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17 += i7;
                    jArr4 = jArr;
                    objArr5 = objArr;
                }
                Integer valueOf = Integer.valueOf(l10.f70b);
                if (l10.t() == null) {
                    valueOf = null;
                }
                int intValue = valueOf == null ? valueOf.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                if (c1035c == null && !z8) {
                    num2 = aVar2 == null ? 2 : null;
                }
                if (num2 != null) {
                    viewStructure.setAutofillType(num2.intValue());
                }
                if (lVar != null && (q13 = q3.f.q(lVar)) != null) {
                    viewStructure.setAutofillHints(q13);
                }
                aVar.f4955a.I(l10.f70b, new g(viewStructure, 2));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (aVar2 == null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(aVar2 == J0.a.f5412a);
                } else if (bool != null) {
                    if (!(fVar == null ? false : f.a(5, 4))) {
                        viewStructure.setCheckable(true);
                        viewStructure.setChecked(bool.booleanValue());
                    }
                }
                d0.l.f16313a.getClass();
                q10 = q3.f.q(k.f16312b);
                l.e(q10, "<this>");
                if (q10.length != 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                boolean z11 = z10 || (lVar != null && (q12 = q3.f.q(lVar)) != null && n.K(q12, q10[0]));
                if (z11) {
                    viewStructure.setDataIsSensitive(true);
                }
                viewStructure.setVisibility(((n0) l10.f60S.f227d).B0() ? 4 : 0);
                if (list != null) {
                    int size = list.size();
                    String str2 = "";
                    for (int i21 = 0; i21 < size; i21++) {
                        str2 = A3.c.l(X.c.m(str2), ((C0374d) list.get(i21)).f5871b, '\n');
                    }
                    viewStructure.setText(str2);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((S.b) l10.n()).isEmpty() && fVar != null && (q11 = X.q()) != null) {
                    viewStructure.setClassName(q11);
                }
                if (z8) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (Build.VERSION.SDK_INT >= 28 && num != null) {
                        viewStructure.setMaxTextLength(num.intValue());
                    }
                    if (c0374d != null) {
                        forText = AutofillValue.forText(c0374d.f5871b);
                        viewStructure.setAutofillValue(forText);
                    }
                    if (z11) {
                        viewStructure.setInputType(129);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        list = null;
        Integer valueOf2 = Integer.valueOf(l10.f70b);
        if (l10.t() == null) {
        }
        if (valueOf2 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (c1035c == null) {
            if (aVar2 == null) {
            }
        }
        if (num2 != null) {
        }
        if (lVar != null) {
            viewStructure.setAutofillHints(q13);
        }
        aVar.f4955a.I(l10.f70b, new g(viewStructure, 2));
        if (bool != null) {
        }
        if (aVar2 == null) {
        }
        d0.l.f16313a.getClass();
        q10 = q3.f.q(k.f16312b);
        l.e(q10, "<this>");
        if (q10.length != 0) {
        }
    }

    public static int G(int i7, v vVar) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return vVar.v() + 1;
            case 7:
                return vVar.A() + 1;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    public static final void H(H0.n nVar, e eVar) {
        Object g = nVar.i().f4494a.g(q.g);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            throw new ClassCastException();
        }
        H0.n j = nVar.j();
        if (j == null) {
            return;
        }
        Object g2 = j.i().f4494a.g(q.f4543e);
        if (g2 == null) {
            g2 = null;
        }
        if (g2 != null) {
            Object g10 = j.i().f4494a.g(q.f4544f);
            H0.b bVar = (H0.b) (g10 != null ? g10 : null);
            if (bVar == null || (bVar.f4462a >= 0 && bVar.f4463b >= 0)) {
                if (nVar.i().f4494a.c(q.f4532E)) {
                    ArrayList arrayList = new ArrayList();
                    List h10 = H0.n.h(4, j);
                    int size = h10.size();
                    int i7 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        H0.n nVar2 = (H0.n) h10.get(i10);
                        if (nVar2.i().f4494a.c(q.f4532E)) {
                            arrayList.add(nVar2);
                            if (nVar2.f4504c.u() < nVar.f4504c.u()) {
                                i7++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean k = k(arrayList);
                    int i11 = k ? 0 : i7;
                    int i12 = k ? i7 : 0;
                    Object g11 = nVar.i().f4494a.g(q.f4532E);
                    if (g11 == null) {
                        g11 = Boolean.FALSE;
                    }
                    eVar.k(o7.o.m(((Boolean) g11).booleanValue(), i11, 1, i12, 1));
                }
            }
        }
    }

    public static final void I(I i7, int i10, Object obj) {
        i7.j[(i7.k - i7.f8742f[i7.g - 1].f8220c) + i10] = obj;
    }

    public static final void J(I i7, int i10, Object obj, int i11, Object obj2) {
        int i12 = i7.k - i7.f8742f[i7.g - 1].f8220c;
        Object[] objArr = i7.j;
        objArr[i10 + i12] = obj;
        objArr[i12 + i11] = obj2;
    }

    public static ArrayList K(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i7 = 0; i7 < split.length; i7++) {
            if (!split[i7].isEmpty()) {
                arrayList.add(split[i7]);
            }
        }
        return arrayList;
    }

    public static ArrayList L(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = L((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = M((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u.T, u.e] */
    public static C2052e M(JSONObject jSONObject) {
        ?? t5 = new T(0);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = L((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = M((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            t5.put(next, obj);
        }
        return t5;
    }

    public static final void d(Rb.a aVar, j jVar, Y.e eVar, C0506o c0506o, int i7) {
        boolean z8;
        int i10;
        Object obj;
        c0506o.U(-2032877254);
        int i11 = i7 | (c0506o.i(aVar) ? 4 : 2) | (c0506o.g(jVar) ? 32 : 16);
        if (c0506o.K(i11 & 1, (i11 & 147) != 146)) {
            View view = (View) c0506o.k(AndroidCompositionLocals_androidKt.f13211f);
            V0.c cVar = (V0.c) c0506o.k(AbstractC0207v0.f1993h);
            V0.l lVar = (V0.l) c0506o.k(AbstractC0207v0.f1997n);
            C0502m q10 = C0480b.q(c0506o);
            W r10 = C0480b.r(eVar, c0506o);
            UUID uuid = (UUID) c2.i.w(new Object[0], null, Z0.c.f12106b, c0506o, 3072, 6);
            boolean g = c0506o.g(view) | c0506o.g(cVar);
            Object H10 = c0506o.H();
            Object obj2 = C0498k.f8409a;
            if (g || H10 == obj2) {
                z8 = true;
                i10 = i11;
                Z0.k kVar = new Z0.k(aVar, jVar, view, lVar, cVar, uuid);
                Y.e eVar2 = new Y.e(488261145, new C0165a(r10, 4), true);
                Z0.i iVar = kVar.f12129u;
                iVar.setParentCompositionContext(q10);
                iVar.f12118x.setValue(eVar2);
                iVar.f12116B = true;
                if (iVar.f1852d == null && !iVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                iVar.d();
                c0506o.d0(kVar);
                obj = kVar;
            } else {
                z8 = true;
                i10 = i11;
                obj = H10;
            }
            Z0.k kVar2 = (Z0.k) obj;
            boolean i12 = c0506o.i(kVar2);
            Object H11 = c0506o.H();
            if (i12 || H11 == obj2) {
                H11 = new Z0.a(kVar2, 0);
                c0506o.d0(H11);
            }
            C0480b.c(kVar2, (c) H11, c0506o);
            boolean i13 = c0506o.i(kVar2) | ((i10 & 14) == 4 ? z8 : false) | ((i10 & 112) == 32 ? z8 : false) | c0506o.g(lVar);
            Object H12 = c0506o.H();
            if (i13 || H12 == obj2) {
                H12 = new C0570m(kVar2, aVar, jVar, lVar, 1);
                c0506o.d0(H12);
            }
            C0480b.g((Rb.a) H12, c0506o);
        } else {
            c0506o.N();
        }
        C0505n0 r11 = c0506o.r();
        if (r11 != null) {
            r11.f8432d = new C0166a0(aVar, jVar, eVar, i7, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [Q.o] */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.bumptech.glide.k] */
    /* JADX WARN: Type inference failed for: r4v6, types: [S3.a, java.lang.Object, com.bumptech.glide.k] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.bumptech.glide.k] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [J3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [J3.e, java.lang.Object] */
    public static final void e(Serializable serializable, m mVar, C0506o c0506o, int i7) {
        int i10 = 1;
        c0506o.U(1955430130);
        C2319D c2319d = C2341i.f26586b;
        C2380c c2380c = C2380c.f26797b;
        c0506o.T(482162156);
        Context context = (Context) c0506o.k(AndroidCompositionLocals_androidKt.f13207b);
        c0506o.T(1157296644);
        boolean g = c0506o.g(context);
        Object H10 = c0506o.H();
        Object obj = C0498k.f8409a;
        if (g || H10 == obj) {
            H10 = com.bumptech.glide.b.d(context);
            l.d(H10, "with(it)");
            c0506o.d0(H10);
        }
        c0506o.p(false);
        com.bumptech.glide.n nVar = (com.bumptech.glide.n) H10;
        c0506o.p(false);
        l.d(nVar, "LocalContext.current.let…(it) { Glide.with(it) } }");
        c0506o.T(1761561633);
        Object[] objArr = {serializable, nVar, c2380c, c2319d};
        c0506o.T(-568225417);
        boolean z8 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            z8 |= c0506o.g(objArr[i11]);
        }
        Object H11 = c0506o.H();
        Object obj2 = H11;
        if (z8 || H11 == obj) {
            ?? E10 = nVar.l(Drawable.class).E(serializable);
            l.d(E10, "requestManager.load(model)");
            if (l.a(c2319d, C2341i.f26585a)) {
                S3.a j = E10.j(J3.o.f5482d, new Object());
                l.d(j, "{\n      optionalCenterCrop()\n    }");
                E10 = (com.bumptech.glide.k) j;
            } else if (l.a(c2319d, C2341i.f26587c) ? true : l.a(c2319d, c2319d)) {
                E10 = (com.bumptech.glide.k) E10.o(J3.o.f5481c, new Object(), false);
            }
            c0506o.d0(E10);
            obj2 = E10;
        }
        c0506o.p(false);
        com.bumptech.glide.k requestBuilder = (com.bumptech.glide.k) obj2;
        c0506o.p(false);
        c0506o.T(482162656);
        ((Boolean) c0506o.k(H0.f1686a)).getClass();
        c0506o.p(false);
        c0506o.T(482163560);
        Float valueOf = Float.valueOf(1.0f);
        Yb.h[] hVarArr = AbstractC2383f.f26802a;
        c0.e eVar = c0.b.f14093e;
        l.e(mVar, "<this>");
        l.e(requestBuilder, "requestBuilder");
        m d10 = d.d(new GlideNodeElement(requestBuilder, c2319d, eVar, valueOf, null, null, null, null, null, null));
        H0.l lVar = new H0.l(null, i10);
        AtomicInteger atomicInteger = H0.j.f4498a;
        h(mVar.c(d10.c(new AppendedSemanticsElement(lVar, false))), c0506o, 0);
        c0506o.p(false);
        C0505n0 r10 = c0506o.r();
        if (r10 == null) {
            return;
        }
        r10.f8432d = new j0(serializable, mVar, i7, 10);
    }

    public static final void f(final u uVar, c0.j jVar, c0.e eVar, c cVar, c cVar2, c cVar3, c cVar4, final c cVar5, C0506o c0506o, final int i7) {
        int i10;
        c0.j jVar2;
        c0.e eVar2;
        c cVar6;
        c cVar7;
        c cVar8;
        c cVar9;
        final c0.j jVar3;
        final c0.e eVar3;
        final c cVar10;
        final c cVar11;
        final c cVar12;
        final c cVar13;
        c0506o.U(1840250294);
        int i11 = i7 | (c0506o.i(uVar) ? 4 : 2) | 844852608;
        char c10 = c0506o.i(cVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i11) == 306783378 && (c10 & 3) == 2 && c0506o.x()) {
            c0506o.N();
            jVar3 = jVar;
            eVar3 = eVar;
            cVar10 = cVar;
            cVar11 = cVar2;
            cVar12 = cVar3;
            cVar13 = cVar4;
        } else {
            c0506o.P();
            int i12 = i7 & 1;
            S s3 = C0498k.f8409a;
            if (i12 == 0 || c0506o.w()) {
                c0.j jVar4 = c0.j.f14110a;
                c0.e eVar4 = c0.b.f14089a;
                Object H10 = c0506o.H();
                if (H10 == s3) {
                    H10 = new Ba.i(19);
                    c0506o.d0(H10);
                }
                c cVar14 = (c) H10;
                Object H11 = c0506o.H();
                if (H11 == s3) {
                    H11 = new Ba.i(21);
                    c0506o.d0(H11);
                }
                i10 = i11 & (-264241153);
                jVar2 = jVar4;
                eVar2 = eVar4;
                cVar6 = cVar14;
                cVar7 = cVar6;
                cVar8 = (c) H11;
                cVar9 = cVar8;
            } else {
                c0506o.N();
                i10 = i11 & (-264241153);
                jVar2 = jVar;
                eVar2 = eVar;
                cVar6 = cVar;
                cVar8 = cVar2;
                cVar7 = cVar3;
                cVar9 = cVar4;
            }
            c0506o.q();
            boolean z8 = (c10 & 14) == 4;
            Object H12 = c0506o.H();
            if (z8 || H12 == s3) {
                s sVar = new s(uVar.f25026b.f26780s);
                cVar5.invoke(sVar);
                H12 = sVar.g();
                c0506o.d0(H12);
            }
            g(uVar, (r) H12, jVar2, eVar2, cVar6, cVar8, cVar7, cVar9, c0506o, (i10 & 8078) | 100884480);
            jVar3 = jVar2;
            eVar3 = eVar2;
            cVar10 = cVar6;
            cVar11 = cVar8;
            cVar12 = cVar7;
            cVar13 = cVar9;
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new Rb.e(jVar3, eVar3, cVar10, cVar11, cVar12, cVar13, cVar5, i7) { // from class: w2.v

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c0.j f25722b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ c0.e f25723c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Rb.c f25724d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Rb.c f25725e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Rb.c f25726f;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Rb.c f25727u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ Rb.c f25728v;

                @Override // Rb.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int u3 = C0480b.u(49);
                    Rb.c cVar15 = this.f25727u;
                    Rb.c cVar16 = this.f25728v;
                    tc.b.f(v2.u.this, this.f25722b, this.f25723c, this.f25724d, this.f25725e, this.f25726f, cVar15, cVar16, (C0506o) obj, u3);
                    return Db.q.f3365a;
                }
            };
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v22 ??, still in use, count: 1, list:
          (r2v22 ?? I:java.lang.Object) from 0x0804: INVOKE (r53v0 ?? I:Q.o), (r2v22 ?? I:java.lang.Object) VIRTUAL call: Q.o.d0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final void g(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v22 ??, still in use, count: 1, list:
          (r2v22 ?? I:java.lang.Object) from 0x0804: INVOKE (r53v0 ?? I:Q.o), (r2v22 ?? I:java.lang.Object) VIRTUAL call: Q.o.d0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r45v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public static final void h(m mVar, C0506o c0506o, int i7) {
        c0506o.U(-1856253139);
        if ((((c0506o.g(mVar) ? 4 : 2) | i7) & 11) == 2 && c0506o.x()) {
            c0506o.N();
        } else {
            C2381d c2381d = C2381d.f26800a;
            c0506o.T(544976794);
            int i10 = c0506o.f8449P;
            m c10 = c0.o.c(c0506o, mVar);
            InterfaceC0493h0 m10 = c0506o.m();
            InterfaceC0022k.g.getClass();
            C c11 = C0021j.f241b;
            c0506o.T(1405779621);
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(new J(c11, 26));
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, C0021j.f244e, c2381d);
            C0480b.s(c0506o, C0021j.f243d, m10);
            C0480b.s(c0506o, C0021j.f242c, c10);
            C0020i c0020i = C0021j.f245f;
            if (c0506o.f8448O || !l.a(c0506o.H(), Integer.valueOf(i10))) {
                c0506o.d0(Integer.valueOf(i10));
                c0506o.c(Integer.valueOf(i10), c0020i);
            }
            c0506o.p(true);
            c0506o.p(false);
            c0506o.p(false);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 == null) {
            return;
        }
        r10.f8432d = new C0227l(mVar, i7, 1);
    }

    public static final void i(m mVar, Rb.e eVar, C0506o c0506o, int i7) {
        int i10;
        c0506o.U(-1177876616);
        if ((i7 & 6) == 0) {
            i10 = (c0506o.g(mVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0506o.i(eVar) ? 32 : 16;
        }
        if (c0506o.K(i10 & 1, (i10 & 19) != 18)) {
            Z0.e eVar2 = Z0.e.f12111a;
            int i11 = c0506o.f8449P;
            InterfaceC0493h0 m10 = c0506o.m();
            m c10 = c0.o.c(c0506o, mVar);
            InterfaceC0022k.g.getClass();
            C c11 = C0021j.f241b;
            int i12 = (((((i10 << 3) & 112) | (((i10 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(c11);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, C0021j.f244e, eVar2);
            C0480b.s(c0506o, C0021j.f243d, m10);
            C0020i c0020i = C0021j.f245f;
            if (c0506o.f8448O || !l.a(c0506o.H(), Integer.valueOf(i11))) {
                c0506o.d0(Integer.valueOf(i11));
                c0506o.c(Integer.valueOf(i11), c0020i);
            }
            C0480b.s(c0506o, C0021j.f242c, c10);
            eVar.invoke(c0506o, Integer.valueOf((i12 >> 6) & 14));
            c0506o.p(true);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0274s(mVar, eVar, i7, 4);
        }
    }

    public static final Object j(Task task, C0061z c0061z) {
        if (!task.isComplete()) {
            C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(c0061z));
            c0944m.s();
            task.addOnCompleteListener(nc.a.f21354a, new C1290a(c0944m, 10));
            Object r10 = c0944m.r();
            Ib.a aVar = Ib.a.f5345a;
            return r10;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final boolean k(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() <= 1) {
            list = Eb.v.f3891a;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Object obj = arrayList.get(0);
            int s3 = u0.s(arrayList);
            int i7 = 0;
            while (i7 < s3) {
                i7++;
                Object obj2 = arrayList.get(i7);
                H0.n nVar = (H0.n) obj2;
                H0.n nVar2 = (H0.n) obj;
                arrayList2.add(new C1289b((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (nVar2.e().a() >> 32)) - Float.intBitsToFloat((int) (nVar.e().a() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (nVar2.e().a() & 4294967295L)) - Float.intBitsToFloat((int) (nVar.e().a() & 4294967295L)))) & 4294967295L)));
                obj = obj2;
            }
            list = arrayList2;
        }
        if (list.size() == 1) {
            j = ((C1289b) o.Y(list)).f18172a;
        } else {
            if (list.isEmpty()) {
                X0.a.b("Empty collection can't be reduced.");
            }
            Object Y2 = o.Y(list);
            int s10 = u0.s(list);
            if (1 <= s10) {
                int i10 = 1;
                while (true) {
                    Y2 = new C1289b(C1289b.e(((C1289b) Y2).f18172a, ((C1289b) list.get(i10)).f18172a));
                    if (i10 == s10) {
                        break;
                    }
                    i10++;
                }
            }
            j = ((C1289b) Y2).f18172a;
        }
        return Float.intBitsToFloat((int) (4294967295L & j)) < Float.intBitsToFloat((int) (j >> 32));
    }

    public static Object l(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r13 == r21.f24073f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if ((r20.v() * 1000) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (r6 == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m(v vVar, C1987o c1987o, int i7, C0257a c0257a) {
        long w10 = vVar.w();
        long j = w10 >>> 16;
        if (j != i7) {
            return false;
        }
        boolean z8 = (j & 1) == 1;
        int i10 = (int) ((w10 >> 12) & 15);
        int i11 = (int) ((w10 >> 8) & 15);
        int i12 = (int) ((w10 >> 4) & 15);
        int i13 = (int) ((w10 >> 1) & 7);
        boolean z10 = (w10 & 1) == 1;
        if (i12 > 7 ? !(i12 > 10 || c1987o.g != 2) : i12 == c1987o.g - 1) {
            if ((i13 == 0 || i13 == c1987o.f24075i) && !z10) {
                try {
                    long B10 = vVar.B();
                    if (!z8) {
                        B10 *= c1987o.f24069b;
                    }
                    c0257a.f3957a = B10;
                    int G9 = G(i10, vVar);
                    if (G9 != -1 && G9 <= c1987o.f24069b) {
                        if (i11 != 0) {
                            if (i11 > 11) {
                                int i14 = c1987o.f24072e;
                                if (i11 != 12) {
                                    if (i11 <= 14) {
                                        int A10 = vVar.A();
                                        if (i11 == 14) {
                                            A10 *= 10;
                                        }
                                    }
                                }
                            }
                        }
                        int v10 = vVar.v();
                        int i15 = vVar.f21230b;
                        byte[] bArr = vVar.f21229a;
                        int i16 = i15 - 1;
                        int i17 = D.f21141a;
                        int i18 = 0;
                        for (int i19 = vVar.f21230b; i19 < i16; i19++) {
                            i18 = D.f21151n[i18 ^ (bArr[i19] & 255)];
                        }
                        if (v10 == i18) {
                            return true;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public static void n(int i7, int i10, int i11) {
        if (i7 < 0 || i10 > i11) {
            StringBuilder q10 = h3.o.q(i7, i10, "fromIndex: ", ", toIndex: ", ", size: ");
            q10.append(i11);
            throw new IndexOutOfBoundsException(q10.toString());
        }
        if (i7 > i10) {
            throw new IllegalArgumentException(X.c.e(i7, i10, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void o(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0672a.c(th, th2);
            }
        }
    }

    public static float[] p(float[] fArr, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i7, length);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1877c[] q(String str) {
        int i7;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i12 < str.length()) {
            while (i12 < str.length()) {
                char charAt = str.charAt(i12);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i12++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i11, i12).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i10) == 'z' || trim.charAt(i10) == 'Z') {
                            fArr = new float[i10];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i13 = i10;
                                int i14 = 1;
                                while (i14 < length) {
                                    int i15 = i10;
                                    int i16 = i15;
                                    int i17 = i16;
                                    int i18 = i17;
                                    for (int i19 = i14; i19 < trim.length(); i19++) {
                                        char charAt2 = trim.charAt(i19);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i19 != i14 && i15 == 0) {
                                                            i15 = 0;
                                                            i17 = 1;
                                                            i18 = 1;
                                                            break;
                                                        }
                                                        i15 = 0;
                                                        break;
                                                    case '.':
                                                        if (i16 == 0) {
                                                            i15 = 0;
                                                            i16 = 1;
                                                            break;
                                                        }
                                                        i15 = 0;
                                                        i17 = 1;
                                                        i18 = 1;
                                                        break;
                                                    default:
                                                        i15 = 0;
                                                        break;
                                                }
                                            } else {
                                                i15 = 1;
                                            }
                                            if (i17 == 0) {
                                                if (i14 < i19) {
                                                    fArr2[i13] = Float.parseFloat(trim.substring(i14, i19));
                                                    i13++;
                                                }
                                                i14 = i18 == 0 ? i19 : i19 + 1;
                                                i10 = 0;
                                            }
                                        }
                                        i15 = 0;
                                        i17 = 1;
                                        if (i17 == 0) {
                                        }
                                    }
                                    if (i14 < i19) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    i10 = 0;
                                }
                                fArr = p(fArr2, i13);
                                i10 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException(y.S.b("error in parsing \"", trim, "\""), e2);
                            }
                        }
                        arrayList.add(new C1877c(trim.charAt(i10), fArr));
                    }
                    i11 = i12;
                    i12++;
                    i10 = 0;
                }
                i12++;
            }
            trim = str.substring(i11, i12).trim();
            if (!trim.isEmpty()) {
            }
            i11 = i12;
            i12++;
            i10 = 0;
        }
        if (i12 - i11 != 1 || i11 >= str.length()) {
            i7 = 0;
        } else {
            i7 = 0;
            arrayList.add(new C1877c(str.charAt(i11), new float[0]));
        }
        return (C1877c[]) arrayList.toArray(new C1877c[i7]);
    }

    public static C1877c[] r(C1877c[] c1877cArr) {
        C1877c[] c1877cArr2 = new C1877c[c1877cArr.length];
        for (int i7 = 0; i7 < c1877cArr.length; i7++) {
            c1877cArr2[i7] = new C1877c(c1877cArr[i7]);
        }
        return c1877cArr2;
    }

    public static final boolean t(int i7, int i10) {
        return i7 == i10;
    }

    public static final float u(Layout layout, int i7, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i7);
        L0.i iVar = L0.k.f6261a;
        if (layout.getEllipsisCount(i7) <= 0 || layout.getParagraphDirection(i7) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment == null ? -1 : M0.d.f6529a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float v(Layout layout, int i7, Paint paint) {
        float width;
        float width2;
        L0.i iVar = L0.k.f6261a;
        if (layout.getEllipsisCount(i7) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i7) != -1 || layout.getWidth() >= layout.getLineRight(i7)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i7) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i7) + layout.getLineStart(i7)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i7);
        if ((paragraphAlignment != null ? M0.d.f6529a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i7);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static void z(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new AssertionError("hardAssert failed: ".concat(String.format(str, objArr)));
        }
    }

    public abstract View B(int i7);

    public abstract boolean C();

    public float x(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationX();
    }

    public float y(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY();
    }
}
