package g1;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f17323a;

    /* renamed from: b, reason: collision with root package name */
    public final l f17324b;

    /* renamed from: c, reason: collision with root package name */
    public final k f17325c;

    /* renamed from: d, reason: collision with root package name */
    public final j f17326d;

    /* renamed from: e, reason: collision with root package name */
    public final m f17327e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f17328f;

    /* JADX WARN: Type inference failed for: r0v0, types: [g1.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [g1.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [g1.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [g1.m, java.lang.Object] */
    public i() {
        ?? obj = new Object();
        obj.f17401a = 0;
        obj.f17402b = 0;
        obj.f17403c = 1.0f;
        obj.f17404d = Float.NaN;
        this.f17324b = obj;
        ?? obj2 = new Object();
        obj2.f17393a = -1;
        obj2.f17394b = 0;
        obj2.f17395c = -1;
        obj2.f17396d = Float.NaN;
        obj2.f17397e = Float.NaN;
        obj2.f17398f = Float.NaN;
        obj2.g = -1;
        obj2.f17399h = null;
        obj2.f17400i = -1;
        this.f17325c = obj2;
        ?? obj3 = new Object();
        obj3.f17355a = false;
        obj3.f17361d = -1;
        obj3.f17363e = -1;
        obj3.f17365f = -1.0f;
        obj3.g = true;
        obj3.f17368h = -1;
        obj3.f17370i = -1;
        obj3.j = -1;
        obj3.k = -1;
        obj3.f17374l = -1;
        obj3.f17376m = -1;
        obj3.f17378n = -1;
        obj3.f17380o = -1;
        obj3.f17382p = -1;
        obj3.f17383q = -1;
        obj3.f17384r = -1;
        obj3.f17385s = -1;
        obj3.f17386t = -1;
        obj3.f17387u = -1;
        obj3.f17388v = -1;
        obj3.f17389w = 0.5f;
        obj3.f17390x = 0.5f;
        obj3.f17391y = null;
        obj3.f17392z = -1;
        obj3.f17330A = 0;
        obj3.f17331B = 0.0f;
        obj3.f17332C = -1;
        obj3.f17333D = -1;
        obj3.f17334E = -1;
        obj3.f17335F = 0;
        obj3.f17336G = 0;
        obj3.f17337H = 0;
        obj3.f17338I = 0;
        obj3.f17339J = 0;
        obj3.f17340K = 0;
        obj3.L = 0;
        obj3.f17341M = Integer.MIN_VALUE;
        obj3.f17342N = Integer.MIN_VALUE;
        obj3.f17343O = Integer.MIN_VALUE;
        obj3.f17344P = Integer.MIN_VALUE;
        obj3.f17345Q = Integer.MIN_VALUE;
        obj3.f17346R = Integer.MIN_VALUE;
        obj3.f17347S = Integer.MIN_VALUE;
        obj3.f17348T = -1.0f;
        obj3.f17349U = -1.0f;
        obj3.f17350V = 0;
        obj3.f17351W = 0;
        obj3.f17352X = 0;
        obj3.f17353Y = 0;
        obj3.f17354Z = 0;
        obj3.f17356a0 = 0;
        obj3.f17358b0 = 0;
        obj3.f17360c0 = 0;
        obj3.f17362d0 = 1.0f;
        obj3.f17364e0 = 1.0f;
        obj3.f17366f0 = -1;
        obj3.f17367g0 = 0;
        obj3.f17369h0 = -1;
        obj3.f17375l0 = false;
        obj3.f17377m0 = false;
        obj3.f17379n0 = true;
        obj3.f17381o0 = 0;
        this.f17326d = obj3;
        ?? obj4 = new Object();
        obj4.f17406a = 0.0f;
        obj4.f17407b = 0.0f;
        obj4.f17408c = 0.0f;
        obj4.f17409d = 1.0f;
        obj4.f17410e = 1.0f;
        obj4.f17411f = Float.NaN;
        obj4.g = Float.NaN;
        obj4.f17412h = -1;
        obj4.f17413i = 0.0f;
        obj4.j = 0.0f;
        obj4.k = 0.0f;
        obj4.f17414l = false;
        obj4.f17415m = 0.0f;
        this.f17327e = obj4;
        this.f17328f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.f17326d;
        eVar.f17271e = jVar.f17368h;
        eVar.f17273f = jVar.f17370i;
        eVar.g = jVar.j;
        eVar.f17276h = jVar.k;
        eVar.f17278i = jVar.f17374l;
        eVar.j = jVar.f17376m;
        eVar.k = jVar.f17378n;
        eVar.f17282l = jVar.f17380o;
        eVar.f17284m = jVar.f17382p;
        eVar.f17286n = jVar.f17383q;
        eVar.f17288o = jVar.f17384r;
        eVar.f17294s = jVar.f17385s;
        eVar.f17295t = jVar.f17386t;
        eVar.f17296u = jVar.f17387u;
        eVar.f17297v = jVar.f17388v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.f17335F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.f17336G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.f17337H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.f17338I;
        eVar.f17238A = jVar.f17346R;
        eVar.f17239B = jVar.f17345Q;
        eVar.f17299x = jVar.f17342N;
        eVar.f17301z = jVar.f17344P;
        eVar.f17242E = jVar.f17389w;
        eVar.f17243F = jVar.f17390x;
        eVar.f17290p = jVar.f17392z;
        eVar.f17292q = jVar.f17330A;
        eVar.f17293r = jVar.f17331B;
        eVar.f17244G = jVar.f17391y;
        eVar.f17256T = jVar.f17332C;
        eVar.f17257U = jVar.f17333D;
        eVar.f17246I = jVar.f17348T;
        eVar.f17245H = jVar.f17349U;
        eVar.f17248K = jVar.f17351W;
        eVar.f17247J = jVar.f17350V;
        eVar.f17259W = jVar.f17375l0;
        eVar.f17260X = jVar.f17377m0;
        eVar.L = jVar.f17352X;
        eVar.f17249M = jVar.f17353Y;
        eVar.f17252P = jVar.f17354Z;
        eVar.f17253Q = jVar.f17356a0;
        eVar.f17250N = jVar.f17358b0;
        eVar.f17251O = jVar.f17360c0;
        eVar.f17254R = jVar.f17362d0;
        eVar.f17255S = jVar.f17364e0;
        eVar.f17258V = jVar.f17334E;
        eVar.f17267c = jVar.f17365f;
        eVar.f17263a = jVar.f17361d;
        eVar.f17265b = jVar.f17363e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f17357b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f17359c;
        String str = jVar.f17373k0;
        if (str != null) {
            eVar.f17261Y = str;
        }
        eVar.f17262Z = jVar.f17381o0;
        eVar.setMarginStart(jVar.f17340K);
        eVar.setMarginEnd(jVar.f17339J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f17326d;
        jVar.getClass();
        j jVar2 = this.f17326d;
        jVar.f17355a = jVar2.f17355a;
        jVar.f17357b = jVar2.f17357b;
        jVar.f17359c = jVar2.f17359c;
        jVar.f17361d = jVar2.f17361d;
        jVar.f17363e = jVar2.f17363e;
        jVar.f17365f = jVar2.f17365f;
        jVar.g = jVar2.g;
        jVar.f17368h = jVar2.f17368h;
        jVar.f17370i = jVar2.f17370i;
        jVar.j = jVar2.j;
        jVar.k = jVar2.k;
        jVar.f17374l = jVar2.f17374l;
        jVar.f17376m = jVar2.f17376m;
        jVar.f17378n = jVar2.f17378n;
        jVar.f17380o = jVar2.f17380o;
        jVar.f17382p = jVar2.f17382p;
        jVar.f17383q = jVar2.f17383q;
        jVar.f17384r = jVar2.f17384r;
        jVar.f17385s = jVar2.f17385s;
        jVar.f17386t = jVar2.f17386t;
        jVar.f17387u = jVar2.f17387u;
        jVar.f17388v = jVar2.f17388v;
        jVar.f17389w = jVar2.f17389w;
        jVar.f17390x = jVar2.f17390x;
        jVar.f17391y = jVar2.f17391y;
        jVar.f17392z = jVar2.f17392z;
        jVar.f17330A = jVar2.f17330A;
        jVar.f17331B = jVar2.f17331B;
        jVar.f17332C = jVar2.f17332C;
        jVar.f17333D = jVar2.f17333D;
        jVar.f17334E = jVar2.f17334E;
        jVar.f17335F = jVar2.f17335F;
        jVar.f17336G = jVar2.f17336G;
        jVar.f17337H = jVar2.f17337H;
        jVar.f17338I = jVar2.f17338I;
        jVar.f17339J = jVar2.f17339J;
        jVar.f17340K = jVar2.f17340K;
        jVar.L = jVar2.L;
        jVar.f17341M = jVar2.f17341M;
        jVar.f17342N = jVar2.f17342N;
        jVar.f17343O = jVar2.f17343O;
        jVar.f17344P = jVar2.f17344P;
        jVar.f17345Q = jVar2.f17345Q;
        jVar.f17346R = jVar2.f17346R;
        jVar.f17347S = jVar2.f17347S;
        jVar.f17348T = jVar2.f17348T;
        jVar.f17349U = jVar2.f17349U;
        jVar.f17350V = jVar2.f17350V;
        jVar.f17351W = jVar2.f17351W;
        jVar.f17352X = jVar2.f17352X;
        jVar.f17353Y = jVar2.f17353Y;
        jVar.f17354Z = jVar2.f17354Z;
        jVar.f17356a0 = jVar2.f17356a0;
        jVar.f17358b0 = jVar2.f17358b0;
        jVar.f17360c0 = jVar2.f17360c0;
        jVar.f17362d0 = jVar2.f17362d0;
        jVar.f17364e0 = jVar2.f17364e0;
        jVar.f17366f0 = jVar2.f17366f0;
        jVar.f17367g0 = jVar2.f17367g0;
        jVar.f17369h0 = jVar2.f17369h0;
        jVar.f17373k0 = jVar2.f17373k0;
        int[] iArr = jVar2.f17371i0;
        if (iArr == null || jVar2.f17372j0 != null) {
            jVar.f17371i0 = null;
        } else {
            jVar.f17371i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f17372j0 = jVar2.f17372j0;
        jVar.f17375l0 = jVar2.f17375l0;
        jVar.f17377m0 = jVar2.f17377m0;
        jVar.f17379n0 = jVar2.f17379n0;
        jVar.f17381o0 = jVar2.f17381o0;
        k kVar = iVar.f17325c;
        kVar.getClass();
        k kVar2 = this.f17325c;
        kVar2.getClass();
        kVar.f17393a = kVar2.f17393a;
        kVar.f17395c = kVar2.f17395c;
        kVar.f17397e = kVar2.f17397e;
        kVar.f17396d = kVar2.f17396d;
        l lVar = iVar.f17324b;
        l lVar2 = this.f17324b;
        lVar.f17401a = lVar2.f17401a;
        lVar.f17403c = lVar2.f17403c;
        lVar.f17404d = lVar2.f17404d;
        lVar.f17402b = lVar2.f17402b;
        m mVar = iVar.f17327e;
        mVar.getClass();
        m mVar2 = this.f17327e;
        mVar2.getClass();
        mVar.f17406a = mVar2.f17406a;
        mVar.f17407b = mVar2.f17407b;
        mVar.f17408c = mVar2.f17408c;
        mVar.f17409d = mVar2.f17409d;
        mVar.f17410e = mVar2.f17410e;
        mVar.f17411f = mVar2.f17411f;
        mVar.g = mVar2.g;
        mVar.f17412h = mVar2.f17412h;
        mVar.f17413i = mVar2.f17413i;
        mVar.j = mVar2.j;
        mVar.k = mVar2.k;
        mVar.f17414l = mVar2.f17414l;
        mVar.f17415m = mVar2.f17415m;
        iVar.f17323a = this.f17323a;
        return iVar;
    }
}
