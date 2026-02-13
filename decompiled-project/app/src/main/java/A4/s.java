package A4;

import A0.G0;
import F.C0265i;
import N6.F;
import N6.H0;
import N6.I;
import N6.J;
import N6.w0;
import N6.y0;
import P4.B;
import P4.C0474w;
import P4.E;
import P4.G;
import P4.H;
import W4.A;
import W4.z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import android.widget.ImageView;
import com.google.android.gms.common.api.internal.AbstractC0971l;
import com.google.android.gms.internal.common.zzh;
import h.AbstractC1213a;
import j1.AbstractC1370a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l2.X;
import m4.C1586o0;
import m4.L;
import m4.O0;
import m8.C1641b;
import n5.AbstractC1705a;
import n5.C1704A;
import n5.D;
import o.AbstractC1737h0;
import org.xmlpull.v1.XmlPullParserException;
import s4.C1976d;
import s4.C1979g;
import s4.InterfaceC1977e;
import t8.C2034c;
import u.C2041D;
import u.T;
import y.S;
import y1.K;

/* loaded from: classes.dex */
public final class s implements InterfaceC1977e {

    /* renamed from: a, reason: collision with root package name */
    public int f470a;

    /* renamed from: b, reason: collision with root package name */
    public Object f471b;

    /* renamed from: c, reason: collision with root package name */
    public Object f472c;

    public s(int i7) {
        this.f471b = new Object[i7 * 2];
        this.f470a = 0;
    }

    public s(int i7, W4.o oVar, String str) {
        this.f470a = i7;
        this.f471b = oVar;
        this.f472c = str;
    }

    public /* synthetic */ s(int i7, Object obj, Object obj2) {
        this.f471b = obj;
        this.f472c = obj2;
        this.f470a = i7;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, u.T] */
    public s(int i7, boolean z8) {
        switch (i7) {
            case 14:
                this.f471b = Collections.synchronizedMap(new T(0));
                this.f470a = 0;
                return;
            case 21:
                Object[] objArr = new Object[5];
                this.f471b = objArr;
                this.f472c = objArr;
                return;
            default:
                this.f471b = new S.e(new C0265i[16]);
                return;
        }
    }

    public s(ImageView imageView) {
        this.f470a = 0;
        this.f471b = imageView;
    }

    public /* synthetic */ s(Object obj, int i7, Serializable serializable) {
        this.f471b = obj;
        this.f470a = i7;
        this.f472c = serializable;
    }

    public s(CopyOnWriteArrayList copyOnWriteArrayList, int i7, B b2) {
        this.f472c = copyOnWriteArrayList;
        this.f470a = i7;
        this.f471b = b2;
    }

    public s(C2034c c2034c) {
        this.f472c = c2034c;
        this.f471b = M6.d.f6796a;
        this.f470a = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ca, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s h(int i7, Resources.Theme theme, Resources resources) {
        int next;
        float f4;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i11;
        Object radialGradient;
        XmlResourceParser xml = resources.getXml(i7);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b2 = n1.c.b(resources, xml, asAttributeSet, theme);
                return new s(b2.getDefaultColor(), obj, b2);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray h10 = n1.b.h(resources, theme, asAttributeSet, AbstractC1370a.f18567d);
        float f14 = !n1.b.e(xml, "startX") ? 0.0f : h10.getFloat(8, 0.0f);
        float f15 = !n1.b.e(xml, "startY") ? 0.0f : h10.getFloat(9, 0.0f);
        float f16 = !n1.b.e(xml, "endX") ? 0.0f : h10.getFloat(10, 0.0f);
        float f17 = !n1.b.e(xml, "endY") ? 0.0f : h10.getFloat(11, 0.0f);
        float f18 = !n1.b.e(xml, "centerX") ? 0.0f : h10.getFloat(3, 0.0f);
        float f19 = !n1.b.e(xml, "centerY") ? 0.0f : h10.getFloat(4, 0.0f);
        int i12 = !n1.b.e(xml, "type") ? 0 : h10.getInt(2, 0);
        int color = !n1.b.e(xml, "startColor") ? 0 : h10.getColor(0, 0);
        boolean e2 = n1.b.e(xml, "centerColor");
        int color2 = !n1.b.e(xml, "centerColor") ? 0 : h10.getColor(7, 0);
        int color3 = !n1.b.e(xml, "endColor") ? 0 : h10.getColor(1, 0);
        if (n1.b.e(xml, "tileMode")) {
            f4 = f18;
            i10 = h10.getInt(6, 0);
        } else {
            f4 = f18;
            i10 = 0;
        }
        if (n1.b.e(xml, "gradientRadius")) {
            f10 = f19;
            f11 = h10.getFloat(5, 0.0f);
        } else {
            f10 = f19;
            f11 = 0.0f;
        }
        h10.recycle();
        int depth = xml.getDepth() + 1;
        float f20 = f11;
        ArrayList arrayList = new ArrayList(20);
        float f21 = f17;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f12 = f16;
            if (next2 == 1) {
                f13 = f15;
                break;
            }
            int depth2 = xml.getDepth();
            f13 = f15;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray h11 = n1.b.h(resources, theme, asAttributeSet, AbstractC1370a.f18568e);
                boolean hasValue = h11.hasValue(0);
                boolean hasValue2 = h11.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = h11.getColor(0, 0);
                float f22 = h11.getFloat(1, 0.0f);
                h11.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f22));
            }
            f16 = f12;
            f15 = f13;
        }
        ha.g gVar = arrayList2.size() > 0 ? new ha.g(arrayList2, arrayList) : null;
        if (gVar == null) {
            gVar = e2 ? new ha.g(color, color2, color3) : new ha.g(color, color3);
        }
        if (i12 == 1) {
            float f23 = f4;
            float f24 = f10;
            i11 = 0;
            if (f20 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f23, f24, f20, (int[]) gVar.f17915b, (float[]) gVar.f17916c, i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i12 != 2) {
            i11 = 0;
            radialGradient = new LinearGradient(f14, f13, f12, f21, (int[]) gVar.f17915b, (float[]) gVar.f17916c, i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i11 = 0;
            radialGradient = new SweepGradient(f4, f10, (int[]) gVar.f17915b, (float[]) gVar.f17916c);
        }
        return new s(i11, radialGradient, (Object) null);
    }

    public static void o(s sVar, int i7, int i10, int i11, int i12, int i13, int i14) {
        long[] jArr = (long[]) sVar.f471b;
        int i15 = sVar.f470a;
        int i16 = i15 + 3;
        sVar.f470a = i16;
        int length = jArr.length;
        if (length <= i16) {
            int max = Math.max(length * 2, i16);
            long[] copyOf = Arrays.copyOf(jArr, max);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            sVar.f471b = copyOf;
            long[] copyOf2 = Arrays.copyOf((long[]) sVar.f472c, max);
            kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
            sVar.f472c = copyOf2;
        }
        long[] jArr2 = (long[]) sVar.f471b;
        jArr2[i15] = (i10 << 32) | (i11 & 4294967295L);
        jArr2[i15 + 1] = (i13 & 4294967295L) | (i12 << 32);
        int i17 = i14 & 67108863;
        jArr2[i15 + 2] = (0 << 63) | (0 << 62) | (1 << 61) | (0 << 52) | (i17 << 26) | (i7 & 67108863);
        if (i14 < 0) {
            return;
        }
        for (int i18 = i15 - 3; i18 >= 0; i18 -= 3) {
            int i19 = i18 + 2;
            long j = jArr2[i19];
            if ((((int) j) & 67108863) == i17) {
                jArr2[i19] = (j & (-2301339409586323457L)) | (((i15 - i18) & 511) << 52);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, P4.I] */
    public void A(P4.r rVar, C0474w c0474w) {
        Iterator it = ((CopyOnWriteArrayList) this.f472c).iterator();
        while (it.hasNext()) {
            H h10 = (H) it.next();
            D.Q(h10.f7866a, new P4.D(this, h10.f7867b, rVar, c0474w, 2));
        }
    }

    public void B(Object obj, Object obj2) {
        int i7 = (this.f470a + 1) * 2;
        Object[] objArr = (Object[]) this.f471b;
        if (i7 > objArr.length) {
            this.f471b = Arrays.copyOf(objArr, N6.B.f(objArr.length, i7));
        }
        N6.r.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.f471b;
        int i10 = this.f470a;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f470a = i10 + 1;
    }

    public void C(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.f470a) * 2;
            Object[] objArr = (Object[]) this.f471b;
            if (size > objArr.length) {
                this.f471b = Arrays.copyOf(objArr, N6.B.f(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            B(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void D() {
        AbstractC1705a.n((A) this.f471b);
        W4.o oVar = ((A) this.f471b).f10624c;
        HashMap hashMap = new HashMap();
        I i7 = oVar.f10746a;
        H0 it = ((w0) i7.f7233d.keySet()).iterator();
        while (true) {
            F f4 = (F) it;
            if (!f4.hasNext()) {
                A a9 = (A) this.f471b;
                F(n(a9.f10623b, ((W4.n) this.f472c).f10744y, hashMap, a9.f10622a));
                return;
            }
            String str = (String) f4.next();
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                hashMap.put(str, (String) N6.r.l(i7.d(str)));
            }
        }
    }

    public void E(Uri uri, String str) {
        F(n(2, str, y0.f7368u, uri));
    }

    public void F(A a9) {
        String c10 = a9.f10624c.c("CSeq");
        c10.getClass();
        int parseInt = Integer.parseInt(c10);
        W4.n nVar = (W4.n) this.f472c;
        AbstractC1705a.m(nVar.f10739f.get(parseInt) == null);
        nVar.f10739f.append(parseInt, a9);
        nVar.f10742w.n(z.g(a9));
        this.f471b = a9;
    }

    public List G(CharSequence charSequence) {
        charSequence.getClass();
        C2034c c2034c = (C2034c) this.f472c;
        c2034c.getClass();
        M6.p pVar = new M6.p(c2034c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (pVar.hasNext()) {
            arrayList.add((String) pVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void H(C0474w c0474w) {
        B b2 = (B) this.f471b;
        b2.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f472c).iterator();
        while (it.hasNext()) {
            H h10 = (H) it.next();
            D.Q(h10.f7866a, new P4.F(this, h10.f7867b, b2, c0474w, 0));
        }
    }

    public void I(int i7, Rb.g gVar) {
        int i10 = i7 & 67108863;
        long[] jArr = (long[]) this.f471b;
        int i11 = this.f470a;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & 67108863) == i10) {
                long j = jArr[i12];
                long j10 = jArr[i12 + 1];
                gVar.f(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10));
                return;
            }
        }
    }

    public void J(String str, AbstractC0971l abstractC0971l) {
        Map map = (Map) this.f471b;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(S.b("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, abstractC0971l);
        if (this.f470a > 0) {
            new zzh(Looper.getMainLooper()).post(new C7.c(this, abstractC0971l, str, 11));
        }
    }

    public void K(Bundle bundle) {
        this.f470a = 1;
        this.f472c = bundle;
        for (Map.Entry entry : ((Map) this.f471b).entrySet()) {
            ((AbstractC0971l) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void L(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f471b).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC0971l) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public void a(Object obj) {
        int i7 = this.f470a;
        if (i7 == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.f472c)[4] = objArr;
            this.f472c = objArr;
            i7 = 0;
        }
        ((Object[]) this.f472c)[i7] = obj;
        this.f470a = i7 + 1;
    }

    @Override // s4.InterfaceC1977e
    public C1976d b(C1979g c1979g, long j) {
        long j10 = c1979g.f24055d;
        int min = (int) Math.min(112800, c1979g.f24054c - j10);
        n5.v vVar = (n5.v) this.f472c;
        vVar.D(min);
        c1979g.x(vVar.f21229a, 0, min, false);
        int i7 = vVar.f21231c;
        long j11 = -1;
        long j12 = -1;
        long j13 = -9223372036854775807L;
        while (vVar.a() >= 188) {
            byte[] bArr = vVar.f21229a;
            int i10 = vVar.f21230b;
            while (i10 < i7 && bArr[i10] != 71) {
                i10++;
            }
            int i11 = i10 + 188;
            if (i11 > i7) {
                break;
            }
            long D10 = O5.b.D(vVar, i10, this.f470a);
            if (D10 != -9223372036854775807L) {
                long b2 = ((C1704A) this.f471b).b(D10);
                if (b2 > j) {
                    return j13 == -9223372036854775807L ? new C1976d(-1, b2, j10) : new C1976d(0, -9223372036854775807L, j10 + j12);
                }
                if (100000 + b2 > j) {
                    return new C1976d(0, -9223372036854775807L, j10 + i10);
                }
                j12 = i10;
                j13 = b2;
            }
            vVar.G(i11);
            j11 = i11;
        }
        return j13 != -9223372036854775807L ? new C1976d(-2, j13, j10 + j11) : C1976d.f24042d;
    }

    @Override // s4.InterfaceC1977e
    public void c() {
        byte[] bArr = D.f21146f;
        n5.v vVar = (n5.v) this.f472c;
        vVar.getClass();
        vVar.E(bArr.length, bArr);
    }

    public void d(int i7, G0 g02) {
        if (i7 < 0) {
            B.a.a("size should be >=0");
        }
        if (i7 == 0) {
            return;
        }
        C0265i c0265i = new C0265i(this.f470a, i7, g02);
        this.f470a += i7;
        ((S.e) this.f471b).b(c0265i);
    }

    public void e() {
        O0 o02;
        ImageView imageView = (ImageView) this.f471b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1737h0.a(drawable);
        }
        if (drawable == null || (o02 = (O0) this.f472c) == null) {
            return;
        }
        o.r.e(drawable, o02, imageView.getDrawableState());
    }

    public C1641b f() {
        if ("".isEmpty()) {
            return new C1641b((String) this.f471b, ((Long) this.f472c).longValue(), this.f470a);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public y0 g() {
        J j = (J) this.f472c;
        if (j != null) {
            throw j.a();
        }
        y0 c10 = y0.c(this.f470a, (Object[]) this.f471b, this);
        J j10 = (J) this.f472c;
        if (j10 == null) {
            return c10;
        }
        throw j10.a();
    }

    public void i(int i7, L l10, int i10, Object obj, long j) {
        j(new C0474w(1, i7, l10, i10, obj, D.Z(j), -9223372036854775807L));
    }

    public void j(C0474w c0474w) {
        Iterator it = ((CopyOnWriteArrayList) this.f472c).iterator();
        while (it.hasNext()) {
            H h10 = (H) it.next();
            D.Q(h10.f7866a, new G(this, h10.f7867b, c0474w, 0));
        }
    }

    public C0265i k(int i7) {
        if (i7 < 0 || i7 >= this.f470a) {
            StringBuilder r10 = h3.o.r(i7, "Index ", ", size ");
            r10.append(this.f470a);
            B.a.d(r10.toString());
        }
        C0265i c0265i = (C0265i) this.f472c;
        if (c0265i != null) {
            int i10 = c0265i.f3975a;
            if (i7 < c0265i.f3976b + i10 && i10 <= i7) {
                return c0265i;
            }
        }
        S.e eVar = (S.e) this.f471b;
        C0265i c0265i2 = (C0265i) eVar.f8959a[F.x.e(i7, eVar)];
        this.f472c = c0265i2;
        return c0265i2;
    }

    public Object l(int i7) {
        SparseArray sparseArray;
        if (this.f470a == -1) {
            this.f470a = 0;
        }
        while (true) {
            int i10 = this.f470a;
            sparseArray = (SparseArray) this.f471b;
            if (i10 <= 0 || i7 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f470a--;
        }
        while (this.f470a < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.f470a + 1)) {
            this.f470a++;
        }
        return sparseArray.valueAt(this.f470a);
    }

    public int m(Object obj) {
        C2041D c2041d = (C2041D) this.f471b;
        int d10 = c2041d.d(obj);
        if (d10 >= 0) {
            return c2041d.f24580c[d10];
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [A3.e, java.io.IOException] */
    public A n(int i7, String str, Map map, Uri uri) {
        W4.n nVar = (W4.n) this.f472c;
        String str2 = nVar.f10736c;
        int i10 = this.f470a;
        this.f470a = i10 + 1;
        R7.a aVar = new R7.a(i10, str2, str);
        if (nVar.f10728A != null) {
            AbstractC1705a.n(nVar.f10743x);
            try {
                aVar.f("Authorization", nVar.f10728A.e(nVar.f10743x, uri, i7));
            } catch (C1586o0 e2) {
                W4.n.F(nVar, new IOException(e2));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            aVar.f((String) entry.getKey(), (String) entry.getValue());
        }
        return new A(uri, i7, new W4.o(aVar), "");
    }

    public boolean p() {
        ColorStateList colorStateList;
        return ((Shader) this.f471b) == null && (colorStateList = (ColorStateList) this.f472c) != null && colorStateList.isStateful();
    }

    public void q(P4.r rVar, int i7, int i10, L l10, int i11, Object obj, long j, long j10) {
        r(rVar, new C0474w(i7, i10, l10, i11, obj, D.Z(j), D.Z(j10)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, P4.I] */
    public void r(P4.r rVar, C0474w c0474w) {
        Iterator it = ((CopyOnWriteArrayList) this.f472c).iterator();
        while (it.hasNext()) {
            H h10 = (H) it.next();
            D.Q(h10.f7866a, new P4.D(this, h10.f7867b, rVar, c0474w, 1));
        }
    }

    public void s(P4.r rVar, int i7) {
        t(rVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void t(P4.r rVar, int i7, int i10, L l10, int i11, Object obj, long j, long j10) {
        u(rVar, new C0474w(i7, i10, l10, i11, obj, D.Z(j), D.Z(j10)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, P4.I] */
    public void u(P4.r rVar, C0474w c0474w) {
        Iterator it = ((CopyOnWriteArrayList) this.f472c).iterator();
        while (it.hasNext()) {
            H h10 = (H) it.next();
            D.Q(h10.f7866a, new P4.D(this, h10.f7867b, rVar, c0474w, 0));
        }
    }

    public void v(P4.r rVar, int i7, int i10, L l10, int i11, Object obj, long j, long j10, IOException iOException, boolean z8) {
        x(rVar, new C0474w(i7, i10, l10, i11, obj, D.Z(j), D.Z(j10)), iOException, z8);
    }

    public void w(P4.r rVar, int i7, IOException iOException, boolean z8) {
        v(rVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z8);
    }

    public void x(P4.r rVar, C0474w c0474w, IOException iOException, boolean z8) {
        Iterator it = ((CopyOnWriteArrayList) this.f472c).iterator();
        while (it.hasNext()) {
            H h10 = (H) it.next();
            D.Q(h10.f7866a, new E(this, h10.f7867b, rVar, c0474w, iOException, z8, 0));
        }
    }

    public void y(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.f471b;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1213a.f17571f;
        X u3 = X.u(context, attributeSet, iArr, i7);
        K.m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) u3.f19195c, i7, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) u3.f19195c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = Q5.e.x(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1737h0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(u3.m(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1737h0.c(typedArray.getInt(3, -1), null));
            }
            u3.w();
        } catch (Throwable th) {
            u3.w();
            throw th;
        }
    }

    public void z(P4.r rVar, int i7, int i10, L l10, int i11, Object obj, long j, long j10) {
        A(rVar, new C0474w(i7, i10, l10, i11, obj, D.Z(j), D.Z(j10)));
    }
}
