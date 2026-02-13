package B4;

import A0.G0;
import C4.B;
import C4.C0244f;
import C4.D;
import C4.E;
import C4.F;
import C4.G;
import Eb.C0252c;
import Eb.o;
import F.C0257a;
import H2.i0;
import J7.m;
import J7.r;
import J7.w;
import L7.A;
import L7.AbstractC0382b;
import L7.C0385e;
import L7.z;
import P3.p;
import T7.s;
import T7.u;
import Y5.C0658x;
import Y5.C0660y;
import ac.n;
import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ia.C1358d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.l;
import l2.X;
import n5.AbstractC1705a;
import n5.C1704A;
import n5.v;
import o.Y0;
import s4.InterfaceC1984l;
import u.U;
import v2.q;
import y1.K;

/* loaded from: classes.dex */
public final class j implements B {

    /* renamed from: u, reason: collision with root package name */
    public static long f2087u;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2088a;

    /* renamed from: b, reason: collision with root package name */
    public int f2089b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2090c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2091d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2092e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2093f;

    public j(D d10, int i7) {
        this.f2088a = 1;
        this.f2093f = d10;
        this.f2090c = new b5.f(new byte[5], 5);
        this.f2091d = new SparseArray();
        this.f2092e = new SparseIntArray();
        this.f2089b = i7;
    }

    public j(D5.i iVar) {
        this.f2088a = 2;
        this.f2089b = 0;
        this.f2090c = iVar;
        this.f2091d = new A4.f(1);
        this.f2092e = new ArrayList();
    }

    public j(W8.a aVar, C1358d c1358d, byte[] bArr, N7.a[] aVarArr, int i7) {
        this.f2088a = 0;
        this.f2090c = aVar;
        this.f2091d = c1358d;
        this.f2092e = bArr;
        this.f2093f = aVarArr;
        this.f2089b = i7;
    }

    public j(String str, String str2) {
        byte[] bArr;
        this.f2088a = 4;
        int glCreateProgram = GLES20.glCreateProgram();
        this.f2089b = glCreateProgram;
        AbstractC1705a.i();
        a(glCreateProgram, 35633, str);
        a(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int i7 = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        int i10 = 1;
        AbstractC1705a.j("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.f2092e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f2090c = new C0658x[iArr2[0]];
        int i11 = 0;
        while (i11 < iArr2[0]) {
            int i12 = this.f2089b;
            int[] iArr3 = new int[i10];
            GLES20.glGetProgramiv(i12, 35722, iArr3, 0);
            int i13 = iArr3[0];
            byte[] bArr2 = new byte[i13];
            GLES20.glGetActiveAttrib(i12, i11, i13, new int[i10], 0, new int[i10], 0, new int[i10], 0, bArr2, 0);
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    i14 = i13;
                    break;
                } else if (bArr2[i14] == 0) {
                    break;
                } else {
                    i14++;
                }
            }
            String str3 = new String(bArr2, 0, i14);
            GLES20.glGetAttribLocation(i12, str3);
            C0658x c0658x = new C0658x(15);
            ((C0658x[]) this.f2090c)[i11] = c0658x;
            ((HashMap) this.f2092e).put(str3, c0658x);
            i11++;
            i10 = 1;
        }
        this.f2093f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f2089b, 35718, iArr4, 0);
        this.f2091d = new C0660y[iArr4[0]];
        for (int i15 = 0; i15 < iArr4[i7]; i15++) {
            int i16 = this.f2089b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i16, 35719, iArr5, i7);
            int i17 = iArr5[i7];
            byte[] bArr3 = new byte[i17];
            GLES20.glGetActiveUniform(i16, i15, i17, new int[1], 0, new int[1], 0, new int[1], 0, bArr3, 0);
            int i18 = 0;
            while (true) {
                if (i18 >= i17) {
                    bArr = bArr3;
                    i18 = i17;
                    break;
                } else {
                    if (bArr3[i18] == 0) {
                        bArr = bArr3;
                        break;
                    }
                    i18++;
                }
            }
            i7 = 0;
            String str4 = new String(bArr, 0, i18);
            GLES20.glGetUniformLocation(i16, str4);
            C0660y c0660y = new C0660y(15);
            ((C0660y[]) this.f2091d)[i15] = c0660y;
            ((HashMap) this.f2093f).put(str4, c0660y);
        }
        AbstractC1705a.i();
    }

    public j(Y0 y02, p pVar, String str, r rVar, String str2, String str3) {
        this.f2088a = 3;
        long j = f2087u;
        f2087u = 1 + j;
        this.f2090c = pVar;
        this.f2092e = rVar;
        this.f2093f = new Q7.h((A7.a) y02.f21466d, "Connection", A3.c.h("conn_", j), 4);
        this.f2089b = 1;
        this.f2091d = new w(y02, pVar, str, str3, this, str2);
    }

    public j(v2.r graph) {
        this.f2088a = 5;
        l.e(graph, "graph");
        this.f2090c = graph;
        this.f2091d = new U(0);
    }

    public static void a(int i7, int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        AbstractC1705a.j(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, iArr[0] == 1);
        GLES20.glAttachShader(i7, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        AbstractC1705a.i();
    }

    public void A(View view) {
        if (((ArrayList) this.f2092e).remove(view)) {
            D5.i iVar = (D5.i) this.f2090c;
            i0 M3 = RecyclerView.M(view);
            if (M3 != null) {
                int i7 = M3.f4719p;
                RecyclerView recyclerView = (RecyclerView) iVar.f3256b;
                if (recyclerView.Q()) {
                    M3.f4720q = i7;
                    recyclerView.f13628I0.add(M3);
                } else {
                    WeakHashMap weakHashMap = K.f26642a;
                    M3.f4707a.setImportantForAccessibility(i7);
                }
                M3.f4719p = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
    
        if (r28.v() == 21) goto L42;
     */
    @Override // C4.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(v vVar) {
        C1704A c1704a;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        C1704A c1704a2;
        int i7;
        SparseArray sparseArray2;
        char c10;
        SparseIntArray sparseIntArray;
        int i10;
        SparseArray sparseArray3;
        SparseIntArray sparseIntArray2;
        if (vVar.v() != 2) {
            return;
        }
        D d10 = (D) this.f2093f;
        int i11 = d10.f2663a;
        int i12 = 0;
        List list = d10.f2664b;
        if (i11 == 1 || i11 == 2 || d10.f2671l == 1) {
            c1704a = (C1704A) list.get(0);
        } else {
            c1704a = new C1704A(((C1704A) list.get(0)).c());
            list.add(c1704a);
        }
        if ((vVar.v() & 128) == 0) {
            return;
        }
        vVar.H(1);
        int A10 = vVar.A();
        int i13 = 3;
        vVar.H(3);
        b5.f fVar = (b5.f) this.f2090c;
        vVar.f(0, fVar.f13953b, 2);
        fVar.p(0);
        fVar.s(3);
        d10.f2677r = fVar.i(13);
        vVar.f(0, fVar.f13953b, 2);
        fVar.p(0);
        fVar.s(4);
        vVar.H(fVar.i(12));
        C0244f c0244f = d10.f2667e;
        int i14 = d10.f2663a;
        if (i14 == 2 && d10.f2675p == null) {
            G a9 = c0244f.a(21, new G0(21, (String) null, (ArrayList) null, n5.D.f21146f));
            d10.f2675p = a9;
            if (a9 != null) {
                a9.c(c1704a, d10.k, new F(A10, 21, 8192));
            }
        }
        SparseArray sparseArray4 = (SparseArray) this.f2091d;
        sparseArray4.clear();
        SparseIntArray sparseIntArray3 = (SparseIntArray) this.f2092e;
        sparseIntArray3.clear();
        int a10 = vVar.a();
        while (true) {
            sparseBooleanArray = d10.g;
            if (a10 <= 0) {
                break;
            }
            vVar.f(i12, fVar.f13953b, 5);
            fVar.p(i12);
            int i15 = fVar.i(8);
            fVar.s(i13);
            int i16 = fVar.i(13);
            fVar.s(4);
            int i17 = fVar.i(12);
            int i18 = vVar.f21230b;
            int i19 = i18 + i17;
            int i20 = A10;
            b5.f fVar2 = fVar;
            int i21 = -1;
            String str = null;
            C1704A c1704a3 = c1704a;
            ArrayList arrayList = null;
            while (true) {
                if (vVar.f21230b >= i19) {
                    sparseArray2 = sparseArray4;
                    break;
                }
                int v10 = vVar.v();
                sparseArray2 = sparseArray4;
                int v11 = vVar.f21230b + vVar.v();
                if (v11 > i19) {
                    break;
                }
                int i22 = i16;
                if (v10 == 5) {
                    long w10 = vVar.w();
                    if (w10 == 1094921523) {
                        i21 = 129;
                    } else if (w10 == 1161904947) {
                        i21 = 135;
                    } else {
                        if (w10 != 1094921524) {
                            if (w10 == 1212503619) {
                                i21 = 36;
                            }
                        }
                        i21 = 172;
                    }
                    sparseIntArray2 = sparseIntArray3;
                } else if (v10 == 106) {
                    sparseIntArray2 = sparseIntArray3;
                    i21 = 129;
                } else if (v10 == 122) {
                    sparseIntArray2 = sparseIntArray3;
                    i21 = 135;
                } else {
                    if (v10 != 127) {
                        if (v10 == 123) {
                            sparseIntArray2 = sparseIntArray3;
                            i21 = 138;
                        } else if (v10 == 10) {
                            str = vVar.t(3, M6.e.f6799c).trim();
                        } else if (v10 == 89) {
                            arrayList = new ArrayList();
                            while (vVar.f21230b < v11) {
                                String trim = vVar.t(3, M6.e.f6799c).trim();
                                vVar.v();
                                byte[] bArr = new byte[4];
                                vVar.f(0, bArr, 4);
                                arrayList.add(new E(trim, bArr));
                                sparseIntArray3 = sparseIntArray3;
                            }
                            sparseIntArray2 = sparseIntArray3;
                            i21 = 89;
                        } else {
                            sparseIntArray2 = sparseIntArray3;
                            if (v10 == 111) {
                                i21 = 257;
                            }
                        }
                    }
                    sparseIntArray2 = sparseIntArray3;
                }
                vVar.H(v11 - vVar.f21230b);
                sparseIntArray3 = sparseIntArray2;
                sparseArray4 = sparseArray2;
                i16 = i22;
            }
            SparseIntArray sparseIntArray4 = sparseIntArray3;
            int i23 = i16;
            vVar.G(i19);
            G0 g02 = new G0(i21, str, arrayList, Arrays.copyOfRange(vVar.f21229a, i18, i19));
            if (i15 == 6 || i15 == 5) {
                i15 = i21;
            }
            a10 -= i17 + 5;
            int i24 = i14 == 2 ? i15 : i23;
            if (sparseBooleanArray.get(i24)) {
                sparseIntArray = sparseIntArray4;
                sparseArray3 = sparseArray2;
                c10 = 21;
            } else {
                c10 = 21;
                G a11 = (i14 == 2 && i15 == 21) ? d10.f2675p : c0244f.a(i15, g02);
                sparseIntArray = sparseIntArray4;
                if (i14 == 2) {
                    i10 = i23;
                    if (i10 >= sparseIntArray.get(i24, 8192)) {
                        sparseArray3 = sparseArray2;
                    }
                } else {
                    i10 = i23;
                }
                sparseIntArray.put(i24, i10);
                sparseArray3 = sparseArray2;
                sparseArray3.put(i24, a11);
            }
            sparseArray4 = sparseArray3;
            sparseIntArray3 = sparseIntArray;
            c1704a = c1704a3;
            fVar = fVar2;
            A10 = i20;
            i12 = 0;
            i13 = 3;
        }
        SparseArray sparseArray5 = sparseArray4;
        C1704A c1704a4 = c1704a;
        SparseIntArray sparseIntArray5 = sparseIntArray3;
        int i25 = A10;
        int size = sparseIntArray5.size();
        int i26 = 0;
        while (true) {
            sparseArray = d10.f2668f;
            if (i26 >= size) {
                break;
            }
            int keyAt = sparseIntArray5.keyAt(i26);
            int valueAt = sparseIntArray5.valueAt(i26);
            sparseBooleanArray.put(keyAt, true);
            d10.f2669h.put(valueAt, true);
            G g = (G) sparseArray5.valueAt(i26);
            if (g != null) {
                if (g != d10.f2675p) {
                    InterfaceC1984l interfaceC1984l = d10.k;
                    i7 = i25;
                    F f4 = new F(i7, keyAt, 8192);
                    c1704a2 = c1704a4;
                    g.c(c1704a2, interfaceC1984l, f4);
                } else {
                    c1704a2 = c1704a4;
                    i7 = i25;
                }
                sparseArray.put(valueAt, g);
            } else {
                c1704a2 = c1704a4;
                i7 = i25;
            }
            i26++;
            c1704a4 = c1704a2;
            i25 = i7;
        }
        if (i14 == 2) {
            if (!d10.f2672m) {
                d10.k.f();
                d10.f2671l = 0;
                d10.f2672m = true;
            }
            return;
        }
        sparseArray.remove(this.f2089b);
        int i27 = i14 == 1 ? 0 : d10.f2671l - 1;
        d10.f2671l = i27;
        if (i27 == 0) {
            d10.k.f();
            d10.f2672m = true;
        }
    }

    @Override // C4.B
    public void c(C1704A c1704a, InterfaceC1984l interfaceC1984l, F f4) {
    }

    public void d(View view, int i7, boolean z8) {
        RecyclerView recyclerView = (RecyclerView) ((D5.i) this.f2090c).f3256b;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : n(i7);
        ((A4.f) this.f2091d).K(childCount, z8);
        if (z8) {
            q(view);
        }
        recyclerView.addView(view, childCount);
        i0 M3 = RecyclerView.M(view);
        H2.K k = recyclerView.f13612A;
        if (k == null || M3 == null) {
            return;
        }
        k.i(M3);
    }

    public void e(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z8) {
        RecyclerView recyclerView = (RecyclerView) ((D5.i) this.f2090c).f3256b;
        int childCount = i7 < 0 ? recyclerView.getChildCount() : n(i7);
        ((A4.f) this.f2091d).K(childCount, z8);
        if (z8) {
            q(view);
        }
        i0 M3 = RecyclerView.M(view);
        if (M3 != null) {
            if (!M3.m() && !M3.r()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(M3);
                throw new IllegalArgumentException(A3.c.g(recyclerView, sb2));
            }
            if (RecyclerView.f13603P0) {
                Log.d("RecyclerView", "reAttach " + M3);
            }
            M3.j &= -257;
        } else if (RecyclerView.f13602O0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(A3.c.g(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void f(int i7) {
        String str;
        if (this.f2089b != 3) {
            Q7.h hVar = (Q7.h) this.f2093f;
            boolean z8 = false;
            if (hVar.H()) {
                hVar.p("closing realtime connection", null, new Object[0]);
            }
            this.f2089b = 3;
            w wVar = (w) this.f2091d;
            if (wVar != null) {
                wVar.c();
                this.f2091d = null;
            }
            r rVar = (r) this.f2092e;
            Q7.h hVar2 = rVar.f5637y;
            if (hVar2.H()) {
                if (i7 == 1) {
                    str = "SERVER_RESET";
                } else {
                    if (i7 != 2) {
                        throw null;
                    }
                    str = "OTHER";
                }
                hVar2.p("Got on disconnect due to ".concat(str), null, new Object[0]);
            }
            rVar.f5622h = m.f5590a;
            rVar.g = null;
            rVar.f5624l.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = rVar.f5626n.entrySet().iterator();
            while (it.hasNext()) {
                J7.p pVar = (J7.p) ((Map.Entry) it.next()).getValue();
                if (pVar.f5604b.containsKey("h") && pVar.f5606d) {
                    arrayList.add(pVar);
                    it.remove();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((J7.p) it2.next()).f5605c.a("disconnected", null);
            }
            if (rVar.f5619d.size() == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = rVar.f5621f;
                long j10 = currentTimeMillis - j;
                if (j > 0 && j10 > 30000) {
                    z8 = true;
                }
                if (i7 == 1 || z8) {
                    K7.a aVar = rVar.f5638z;
                    aVar.j = true;
                    aVar.f6203i = 0L;
                }
                rVar.o();
            }
            rVar.f5621f = 0L;
            L7.j jVar = rVar.f5616a;
            jVar.getClass();
            jVar.j(AbstractC0382b.f6325d, Boolean.FALSE);
            com.bumptech.glide.c.B((C0257a) jVar.f6357c);
            ArrayList arrayList2 = new ArrayList();
            Hc.e eVar = (Hc.e) jVar.f6360f;
            C0385e c0385e = C0385e.f6337d;
            eVar.getClass();
            jVar.f6360f = new Hc.e(9);
            jVar.f(arrayList2);
        }
    }

    public void g(int i7) {
        int n6 = n(i7);
        ((A4.f) this.f2091d).M(n6);
        RecyclerView recyclerView = (RecyclerView) ((D5.i) this.f2090c).f3256b;
        View childAt = recyclerView.getChildAt(n6);
        if (childAt != null) {
            i0 M3 = RecyclerView.M(childAt);
            if (M3 != null) {
                if (M3.m() && !M3.r()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(M3);
                    throw new IllegalArgumentException(A3.c.g(recyclerView, sb2));
                }
                if (RecyclerView.f13603P0) {
                    Log.d("RecyclerView", "tmpDetach " + M3);
                }
                M3.a(256);
            }
        } else if (RecyclerView.f13602O0) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(n6);
            throw new IllegalArgumentException(A3.c.g(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(n6);
    }

    public q h(int i7) {
        return j(i7, (v2.r) this.f2090c, null, false);
    }

    public q i(String route, boolean z8) {
        Object obj;
        v2.r rVar;
        l.e(route, "route");
        U u3 = (U) this.f2091d;
        l.e(u3, "<this>");
        Iterator it = ((Zb.a) Zb.i.M(new C0252c(u3, 3))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            q qVar = (q) obj;
            if (n.T((String) qVar.f25017b.f4642e, route, false) || qVar.f25017b.l(route) != null) {
                break;
            }
        }
        q qVar2 = (q) obj;
        if (qVar2 != null) {
            return qVar2;
        }
        if (!z8 || (rVar = ((v2.r) this.f2090c).f25018c) == null) {
            return null;
        }
        j jVar = rVar.f25021f;
        jVar.getClass();
        if (ac.g.h0(route)) {
            return null;
        }
        return jVar.i(route, true);
    }

    public q j(int i7, q qVar, q qVar2, boolean z8) {
        U u3 = (U) this.f2091d;
        q qVar3 = (q) u3.c(i7);
        if (qVar2 != null) {
            if (l.a(qVar3, qVar2) && l.a(qVar3.f25018c, qVar2.f25018c)) {
                return qVar3;
            }
            qVar3 = null;
        } else if (qVar3 != null) {
            return qVar3;
        }
        v2.r rVar = (v2.r) this.f2090c;
        if (z8) {
            Iterator it = ((Zb.a) Zb.i.M(new C0252c(u3, 3))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    qVar3 = null;
                    break;
                }
                q qVar4 = (q) it.next();
                qVar3 = (!(qVar4 instanceof v2.r) || l.a(qVar4, qVar)) ? null : ((v2.r) qVar4).f25021f.j(i7, rVar, qVar2, true);
                if (qVar3 != null) {
                    break;
                }
            }
        }
        if (qVar3 != null) {
            return qVar3;
        }
        v2.r rVar2 = rVar.f25018c;
        if (rVar2 == null || rVar2.equals(qVar)) {
            return null;
        }
        v2.r rVar3 = rVar.f25018c;
        l.b(rVar3);
        return rVar3.f25021f.j(i7, rVar, qVar2, z8);
    }

    public int k(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f2089b, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        AbstractC1705a.i();
        return glGetAttribLocation;
    }

    public View l(int i7) {
        return ((RecyclerView) ((D5.i) this.f2090c).f3256b).getChildAt(n(i7));
    }

    public int m() {
        return ((RecyclerView) ((D5.i) this.f2090c).f3256b).getChildCount() - ((ArrayList) this.f2092e).size();
    }

    public int n(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((D5.i) this.f2090c).f3256b).getChildCount();
        int i10 = i7;
        while (i10 < childCount) {
            A4.f fVar = (A4.f) this.f2091d;
            int H10 = i7 - (i10 - fVar.H(i10));
            if (H10 == 0) {
                while (fVar.J(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += H10;
        }
        return -1;
    }

    public View o(int i7) {
        return ((RecyclerView) ((D5.i) this.f2090c).f3256b).getChildAt(i7);
    }

    public int p() {
        return ((RecyclerView) ((D5.i) this.f2090c).f3256b).getChildCount();
    }

    public void q(View view) {
        ((ArrayList) this.f2092e).add(view);
        D5.i iVar = (D5.i) this.f2090c;
        i0 M3 = RecyclerView.M(view);
        if (M3 != null) {
            int i7 = M3.f4720q;
            View view2 = M3.f4707a;
            if (i7 != -1) {
                M3.f4719p = i7;
            } else {
                WeakHashMap weakHashMap = K.f26642a;
                M3.f4719p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) iVar.f3256b;
            if (recyclerView.Q()) {
                M3.f4720q = 4;
                recyclerView.f13628I0.add(M3);
            } else {
                WeakHashMap weakHashMap2 = K.f26642a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public int r(View view) {
        int indexOfChild = ((RecyclerView) ((D5.i) this.f2090c).f3256b).indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        A4.f fVar = (A4.f) this.f2091d;
        if (fVar.J(indexOfChild)) {
            return -1;
        }
        return indexOfChild - fVar.H(indexOfChild);
    }

    public v2.p s(v2.p pVar, X x2, boolean z8, q lastVisited) {
        v2.p pVar2;
        l.e(lastVisited, "lastVisited");
        ArrayList arrayList = new ArrayList();
        v2.r rVar = (v2.r) this.f2090c;
        Iterator it = rVar.iterator();
        while (true) {
            y2.h hVar = (y2.h) it;
            if (!hVar.hasNext()) {
                break;
            }
            q qVar = (q) hVar.next();
            pVar2 = l.a(qVar, lastVisited) ? null : qVar.t(x2);
            if (pVar2 != null) {
                arrayList.add(pVar2);
            }
        }
        v2.p pVar3 = (v2.p) o.g0(arrayList);
        v2.r rVar2 = rVar.f25018c;
        if (rVar2 != null && z8 && !rVar2.equals(lastVisited)) {
            pVar2 = rVar2.y(x2, rVar);
        }
        return (v2.p) o.g0(Eb.n.X(new v2.p[]{pVar, pVar3, pVar2}));
    }

    public void t(String str) {
        Q7.h hVar = (Q7.h) this.f2093f;
        if (hVar.H()) {
            hVar.p("Connection shutdown command received. Shutting down...", null, new Object[0]);
        }
        r rVar = (r) this.f2092e;
        rVar.getClass();
        boolean equals = str.equals("Invalid appcheck token");
        Q7.h hVar2 = rVar.f5637y;
        if (equals) {
            int i7 = rVar.f5613D;
            if (i7 < 3) {
                rVar.f5613D = i7 + 1;
                hVar2.b0("Detected invalid AppCheck token. Reconnecting (" + (3 - rVar.f5613D) + " attempts remaining)");
                f(2);
            }
        }
        hVar2.b0("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(str));
        rVar.c("server_kill");
        f(2);
    }

    public String toString() {
        switch (this.f2088a) {
            case 2:
                return ((A4.f) this.f2091d).toString() + ", hidden list:" + ((ArrayList) this.f2092e).size();
            default:
                return super.toString();
        }
    }

    public void u(Map map) {
        Q7.h hVar = (Q7.h) this.f2093f;
        if (hVar.H()) {
            hVar.p("Got control message: " + map.toString(), null, new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (hVar.H()) {
                    hVar.p("Got invalid control message: " + map.toString(), null, new Object[0]);
                }
                f(2);
                return;
            }
            if (str.equals("s")) {
                t((String) map.get("d"));
                return;
            }
            if (str.equals("r")) {
                y((String) map.get("d"));
            } else if (str.equals("h")) {
                w((Map) map.get("d"));
            } else if (hVar.H()) {
                hVar.p("Ignoring unknown control message: ".concat(str), null, new Object[0]);
            }
        } catch (ClassCastException e2) {
            if (hVar.H()) {
                hVar.p("Failed to parse control message: " + e2.toString(), null, new Object[0]);
            }
            f(2);
        }
    }

    public void v(Map map) {
        List e2;
        List emptyList;
        Q7.h hVar = (Q7.h) this.f2093f;
        ArrayList arrayList = null;
        if (hVar.H()) {
            hVar.p("received data message: " + map.toString(), null, new Object[0]);
        }
        r rVar = (r) this.f2092e;
        rVar.getClass();
        if (map.containsKey("r")) {
            J7.l lVar = (J7.l) rVar.f5624l.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (lVar != null) {
                lVar.a((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        boolean containsKey = map.containsKey("a");
        Q7.h hVar2 = rVar.f5637y;
        if (!containsKey) {
            if (hVar2.H()) {
                hVar2.p("Ignoring unknown message: " + map, null, new Object[0]);
                return;
            }
            return;
        }
        String str = (String) map.get("a");
        Map map2 = (Map) map.get("b");
        if (hVar2.H()) {
            hVar2.p("handleServerMessage: " + str + " " + map2, null, new Object[0]);
        }
        boolean equals = str.equals("d");
        L7.j jVar = rVar.f5616a;
        if (equals || str.equals("m")) {
            boolean equals2 = str.equals("m");
            String str2 = (String) map2.get("p");
            Object obj = map2.get("d");
            Object obj2 = map2.get("t");
            Long valueOf = obj2 instanceof Integer ? Long.valueOf(((Integer) obj2).intValue()) : obj2 instanceof Long ? (Long) obj2 : null;
            if (equals2 && (obj instanceof Map) && ((Map) obj).size() == 0) {
                if (hVar2.H()) {
                    hVar2.p(X.c.t("ignoring empty merge for path ", str2), null, new Object[0]);
                    return;
                }
                return;
            }
            ArrayList K10 = tc.b.K(str2);
            jVar.getClass();
            C0385e c0385e = new C0385e(K10);
            Q7.h hVar3 = (Q7.h) jVar.j;
            if (hVar3.H()) {
                hVar3.p("onDataUpdate: " + c0385e, null, new Object[0]);
            }
            if (((Q7.h) jVar.k).H()) {
                hVar3.p("onDataUpdate: " + c0385e + " " + obj, null, new Object[0]);
            }
            try {
                if (valueOf != null) {
                    A a9 = new A(valueOf.longValue());
                    if (equals2) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            hashMap.put(new C0385e((String) entry.getKey()), android.support.v4.media.session.b.a(entry.getValue(), T7.k.f9348e));
                        }
                        z zVar = (z) jVar.f6364m;
                        zVar.getClass();
                        e2 = (List) zVar.g.c(new L7.p(zVar, a9, c0385e, hashMap, 0));
                    } else {
                        s a10 = android.support.v4.media.session.b.a(obj, T7.k.f9348e);
                        z zVar2 = (z) jVar.f6364m;
                        zVar2.getClass();
                        e2 = (List) zVar2.g.c(new L7.p(zVar2, a9, c0385e, a10, 1));
                    }
                } else if (equals2) {
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                        hashMap2.put(new C0385e((String) entry2.getKey()), android.support.v4.media.session.b.a(entry2.getValue(), T7.k.f9348e));
                    }
                    z zVar3 = (z) jVar.f6364m;
                    zVar3.getClass();
                    e2 = (List) zVar3.g.c(new L7.w(zVar3, hashMap2, c0385e));
                } else {
                    e2 = ((z) jVar.f6364m).e(c0385e, android.support.v4.media.session.b.a(obj, T7.k.f9348e));
                }
                if (e2.size() > 0) {
                    jVar.h(c0385e);
                }
                jVar.f(e2);
                return;
            } catch (G7.c e10) {
                hVar3.u("FIREBASE INTERNAL ERROR", e10);
                return;
            }
        }
        if (!str.equals("rm")) {
            if (str.equals("c")) {
                ArrayList K11 = tc.b.K((String) map2.get("p"));
                if (hVar2.H()) {
                    hVar2.p("removing all listens at path " + K11, null, new Object[0]);
                }
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap3 = rVar.f5628p;
                for (Map.Entry entry3 : hashMap3.entrySet()) {
                    J7.q qVar = (J7.q) entry3.getKey();
                    J7.o oVar = (J7.o) entry3.getValue();
                    if (qVar.f5607a.equals(K11)) {
                        arrayList2.add(oVar);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    hashMap3.remove(((J7.o) it.next()).f5600b);
                }
                rVar.b();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((J7.o) it2.next()).f5599a.a("permission_denied", null);
                }
                return;
            }
            if (str.equals("ac")) {
                hVar2.p(h3.o.n("Auth token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), null, new Object[0]);
                rVar.f5629q = null;
                rVar.f5630r = true;
                jVar.getClass();
                jVar.j(AbstractC0382b.f6324c, Boolean.FALSE);
                rVar.g.f(2);
                return;
            }
            if (str.equals("apc")) {
                hVar2.p(h3.o.n("App check token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), null, new Object[0]);
                rVar.f5631s = null;
                rVar.f5632t = true;
                return;
            } else if (str.equals("sd")) {
                String W10 = hVar2.W((String) map2.get("msg"), new Object[0]);
                System.currentTimeMillis();
                ((A7.a) hVar2.f8695b).k(2, (String) hVar2.f8696c, W10);
                return;
            } else {
                if (hVar2.H()) {
                    hVar2.p("Unrecognized action from server: ".concat(str), null, new Object[0]);
                    return;
                }
                return;
            }
        }
        String str3 = (String) map2.get("p");
        ArrayList K12 = tc.b.K(str3);
        Object obj3 = map2.get("d");
        Object obj4 = map2.get("t");
        Long valueOf2 = obj4 instanceof Integer ? Long.valueOf(((Integer) obj4).intValue()) : obj4 instanceof Long ? (Long) obj4 : null;
        ArrayList arrayList3 = new ArrayList();
        for (Map map3 : (List) obj3) {
            String str4 = (String) map3.get("s");
            String str5 = (String) map3.get("e");
            arrayList3.add(new J7.s(map3.get("m"), str4 != null ? tc.b.K(str4) : arrayList, str5 != null ? tc.b.K(str5) : arrayList));
            arrayList = null;
        }
        if (arrayList3.isEmpty()) {
            if (hVar2.H()) {
                hVar2.p("Ignoring empty range merge for path ".concat(str3), null, new Object[0]);
                return;
            }
            return;
        }
        jVar.getClass();
        C0385e c0385e2 = new C0385e(K12);
        Q7.h hVar4 = (Q7.h) jVar.j;
        if (hVar4.H()) {
            hVar4.p("onRangeMergeUpdate: " + c0385e2, null, new Object[0]);
        }
        if (((Q7.h) jVar.k).H()) {
            hVar4.p("onRangeMergeUpdate: " + c0385e2 + " " + arrayList3, null, new Object[0]);
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new u((J7.s) it3.next()));
        }
        if (valueOf2 != null) {
            z zVar4 = (z) jVar.f6364m;
            A a11 = new A(valueOf2.longValue());
            Q7.f fVar = (Q7.f) zVar4.f6413c.get(a11);
            if (fVar != null) {
                C0385e c0385e3 = fVar.f8685a;
                O7.k.c(c0385e2.equals(c0385e3));
                L7.n nVar = (L7.n) zVar4.f6411a.o(c0385e3);
                O7.k.b("Missing sync point for query tag that we're tracking", nVar != null);
                Q7.g g = nVar.g(fVar);
                O7.k.b("Missing view for query tag that we're tracking", g != null);
                s sVar = ((T7.m) ((Q7.a) g.f8689c.f23392c).f8671c).f9350a;
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    u uVar = (u) it4.next();
                    uVar.getClass();
                    sVar = uVar.a(C0385e.f6337d, sVar, uVar.f9364c);
                }
                emptyList = (List) zVar4.g.c(new L7.p(zVar4, a11, c0385e2, sVar, 1));
            } else {
                emptyList = Collections.emptyList();
            }
        } else {
            z zVar5 = (z) jVar.f6364m;
            L7.n nVar2 = (L7.n) zVar5.f6411a.o(c0385e2);
            if (nVar2 == null) {
                emptyList = Collections.emptyList();
            } else {
                Q7.g d10 = nVar2.d();
                if (d10 != null) {
                    s sVar2 = ((T7.m) ((Q7.a) d10.f8689c.f23392c).f8671c).f9350a;
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        u uVar2 = (u) it5.next();
                        uVar2.getClass();
                        sVar2 = uVar2.a(C0385e.f6337d, sVar2, uVar2.f9364c);
                    }
                    emptyList = zVar5.e(c0385e2, sVar2);
                } else {
                    emptyList = Collections.emptyList();
                }
            }
        }
        if (emptyList.size() > 0) {
            jVar.h(c0385e2);
        }
        jVar.f(emptyList);
    }

    public void w(Map map) {
        long longValue = ((Long) map.get("ts")).longValue();
        String str = (String) map.get("h");
        r rVar = (r) this.f2092e;
        rVar.f5618c = str;
        String str2 = (String) map.get("s");
        if (this.f2089b == 1) {
            ((w) this.f2091d).getClass();
            Q7.h hVar = (Q7.h) this.f2093f;
            if (hVar.H()) {
                hVar.p("realtime connection established", null, new Object[0]);
            }
            this.f2089b = 2;
            Q7.h hVar2 = rVar.f5637y;
            if (hVar2.H()) {
                hVar2.p("onReady", null, new Object[0]);
            }
            rVar.f5621f = System.currentTimeMillis();
            if (hVar2.H()) {
                hVar2.p("handling timestamp", null, new Object[0]);
            }
            long currentTimeMillis = longValue - System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
            L7.j jVar = rVar.f5616a;
            jVar.getClass();
            for (Map.Entry entry : hashMap.entrySet()) {
                jVar.j(T7.c.b((String) entry.getKey()), entry.getValue());
            }
            if (rVar.f5620e) {
                HashMap hashMap2 = new HashMap();
                rVar.f5633u.getClass();
                hashMap2.put("sdk.android." + "21.0.0".replace('.', '-'), 1);
                if (hVar2.H()) {
                    hVar2.p("Sending first connection stats", null, new Object[0]);
                }
                if (!hashMap2.isEmpty()) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("c", hashMap2);
                    rVar.n("s", false, hashMap3, new J7.k(rVar));
                } else if (hVar2.H()) {
                    hVar2.p("Not sending stats because stats are empty", null, new Object[0]);
                }
            }
            if (hVar2.H()) {
                hVar2.p("calling restore tokens", null, new Object[0]);
            }
            m mVar = rVar.f5622h;
            tc.b.z(mVar == m.f5592c, "Wanted to restore tokens, but was in wrong state: %s", mVar);
            if (rVar.f5629q != null) {
                if (hVar2.H()) {
                    hVar2.p("Restoring auth.", null, new Object[0]);
                }
                rVar.f5622h = m.f5593d;
                rVar.j(true);
            } else {
                if (hVar2.H()) {
                    hVar2.p("Not restoring auth because auth token is null.", null, new Object[0]);
                }
                rVar.f5622h = m.f5594e;
                rVar.i(true);
            }
            rVar.f5620e = false;
            rVar.f5610A = str2;
            jVar.j(AbstractC0382b.f6325d, Boolean.TRUE);
        }
    }

    public void x(HashMap hashMap) {
        Q7.h hVar = (Q7.h) this.f2093f;
        try {
            String str = (String) hashMap.get("t");
            if (str == null) {
                if (hVar.H()) {
                    hVar.p("Failed to parse server message: missing message type:" + hashMap.toString(), null, new Object[0]);
                }
                f(2);
                return;
            }
            if (str.equals("d")) {
                v((Map) hashMap.get("d"));
            } else if (str.equals("c")) {
                u((Map) hashMap.get("d"));
            } else if (hVar.H()) {
                hVar.p("Ignoring unknown server message type: ".concat(str), null, new Object[0]);
            }
        } catch (ClassCastException e2) {
            if (hVar.H()) {
                hVar.p("Failed to parse server message: " + e2.toString(), null, new Object[0]);
            }
            f(2);
        }
    }

    public void y(String str) {
        Q7.h hVar = (Q7.h) this.f2093f;
        if (hVar.H()) {
            hVar.p(A3.c.m(new StringBuilder("Got a reset; killing connection to "), (String) ((p) this.f2090c).f7842c, "; Updating internalHost to ", str), null, new Object[0]);
        }
        ((r) this.f2092e).f5618c = str;
        f(1);
    }

    public void z(int i7) {
        D5.i iVar = (D5.i) this.f2090c;
        int i10 = this.f2089b;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int n6 = n(i7);
            View childAt = ((RecyclerView) iVar.f3256b).getChildAt(n6);
            if (childAt == null) {
                this.f2089b = 0;
                this.f2093f = null;
                return;
            }
            this.f2089b = 1;
            this.f2093f = childAt;
            if (((A4.f) this.f2091d).M(n6)) {
                A(childAt);
            }
            iVar.x(n6);
            this.f2089b = 0;
            this.f2093f = null;
        } catch (Throwable th) {
            this.f2089b = 0;
            this.f2093f = null;
            throw th;
        }
    }
}
