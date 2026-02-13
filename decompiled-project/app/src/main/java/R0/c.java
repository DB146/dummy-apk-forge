package R0;

import A0.B;
import A0.G0;
import E.g;
import K0.AbstractC0375e;
import K0.C0373c;
import K0.F;
import K0.InterfaceC0372b;
import K0.o;
import K0.p;
import K0.s;
import K0.x;
import N0.i;
import N0.j;
import N0.k;
import N0.q;
import Q7.h;
import U0.l;
import U0.m;
import U0.r;
import U0.t;
import V0.n;
import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import j0.AbstractC1362A;
import j0.C;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import l0.AbstractC1444c;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f8783a;

    /* renamed from: b, reason: collision with root package name */
    public final F f8784b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8785c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8786d;

    /* renamed from: e, reason: collision with root package name */
    public final N0.d f8787e;

    /* renamed from: f, reason: collision with root package name */
    public final V0.c f8788f;

    /* renamed from: u, reason: collision with root package name */
    public final d f8789u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f8790v;

    /* renamed from: w, reason: collision with root package name */
    public final L0.e f8791w;

    /* renamed from: x, reason: collision with root package name */
    public h f8792x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8793y;

    /* JADX WARN: Code restructure failed: missing block: B:131:0x03a2, code lost:
    
        if ((r5.f5856b.f5927c & 1095216660480L) != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x008c, code lost:
    
        if (r10 == 1) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x086f A[LOOP:7: B:322:0x086d->B:323:0x086f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a2  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [R0.d, android.text.TextPaint, android.graphics.Paint] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, F f4, List list, List list2, N0.d dVar, V0.c cVar) {
        Locale locale;
        int i7;
        g gVar;
        int i10;
        x xVar;
        int size;
        int i11;
        Object obj;
        boolean a9;
        q qVar;
        Q0.b bVar;
        String str2;
        U0.q qVar2;
        long j;
        x xVar2;
        ?? r42;
        float textSize;
        F f10;
        List list3;
        V0.c cVar2;
        boolean z8;
        p pVar;
        g gVar2;
        float C2;
        int length;
        r rVar;
        ArrayList arrayList;
        int size2;
        int i12;
        ArrayList arrayList2;
        x xVar3;
        int[] iArr;
        int i13;
        int size3;
        int i14;
        boolean z10;
        r rVar2;
        int size4;
        int i15;
        int i16;
        int i17;
        int i18;
        List list4;
        p pVar2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        long j10;
        float c10;
        K0.r rVar3;
        int i24;
        C0373c c0373c;
        Q0.b bVar2;
        Typeface typeface;
        c cVar3 = this;
        int i25 = 1;
        cVar3.f8783a = str;
        cVar3.f8784b = f4;
        cVar3.f8785c = list;
        cVar3.f8786d = list2;
        cVar3.f8787e = dVar;
        cVar3.f8788f = cVar;
        float k = cVar.k();
        ?? textPaint = new TextPaint(1);
        ((TextPaint) textPaint).density = k;
        textPaint.f8795b = l.f9432b;
        textPaint.f8796c = 3;
        textPaint.f8797d = C.f18511d;
        cVar3.f8789u = textPaint;
        s sVar = f4.f5857c;
        int i26 = f4.f5856b.f5926b;
        Q0.b bVar3 = f4.f5855a.k;
        if (!m.a(i26, 4)) {
            if (!m.a(i26, 5)) {
                if (m.a(i26, 1)) {
                    i7 = 0;
                } else if (m.a(i26, 2)) {
                    i7 = 1;
                } else {
                    if (!(m.a(i26, 3) ? true : m.a(i26, Integer.MIN_VALUE))) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar3 == null || (locale = ((Q0.a) bVar3.f8599a.get(0)).f8597a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                cVar3.f8793y = i7;
                gVar = new g(cVar3, i25);
                t tVar = f4.f5856b.f5932i;
                tVar = tVar == null ? t.f9446c : tVar;
                textPaint.setFlags(tVar.f9449b ? textPaint.getFlags() | 128 : textPaint.getFlags() & (-129));
                i10 = tVar.f9448a;
                if (U0.s.a(i10, 1)) {
                    textPaint.setFlags(textPaint.getFlags() | 64);
                    textPaint.setHinting(0);
                } else if (U0.s.a(i10, 2)) {
                    textPaint.getFlags();
                    textPaint.setHinting(1);
                } else if (U0.s.a(i10, 3)) {
                    textPaint.getFlags();
                    textPaint.setHinting(0);
                } else {
                    textPaint.getFlags();
                }
                xVar = f4.f5855a;
                size = list.size();
                i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i11);
                    if (((C0373c) obj).f5866a instanceof x) {
                        break;
                    } else {
                        i11++;
                    }
                }
                boolean z11 = obj != null;
                long b2 = n.b(xVar.f5987b);
                a9 = V0.o.a(b2, 4294967296L);
                long j11 = xVar.f5987b;
                if (a9) {
                    textPaint.setTextSize(cVar.J(j11));
                } else if (V0.o.a(b2, 8589934592L)) {
                    textPaint.setTextSize(n.c(j11) * textPaint.getTextSize());
                }
                qVar = xVar.f5991f;
                if ((qVar != null && xVar.f5989d == null && xVar.f5988c == null) ? false : true) {
                    k kVar = xVar.f5988c;
                    kVar = kVar == null ? k.f7140c : kVar;
                    i iVar = xVar.f5989d;
                    int i27 = iVar != null ? iVar.f7137a : 0;
                    j jVar = xVar.f5990e;
                    int i28 = jVar != null ? jVar.f7138a : 65535;
                    c cVar4 = (c) gVar.f3410b;
                    N0.s b10 = ((N0.e) cVar4.f8787e).b(qVar, kVar, i27, i28);
                    if (b10 instanceof N0.s) {
                        typeface = b10.f7153a;
                        kotlin.jvm.internal.l.c(typeface, "null cannot be cast to non-null type android.graphics.Typeface");
                    } else {
                        h hVar = new h(b10, cVar4.f8792x);
                        cVar4.f8792x = hVar;
                        Object obj2 = hVar.f8697d;
                        kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj2;
                    }
                    textPaint.setTypeface(typeface);
                }
                bVar = xVar.k;
                if (bVar != null) {
                    Q0.b bVar4 = Q0.b.f8598c;
                    G0 g02 = Q0.c.f8601a;
                    g02.getClass();
                    LocaleList localeList = LocaleList.getDefault();
                    synchronized (((Hc.e) g02.f29d)) {
                        try {
                            bVar2 = (Q0.b) g02.f28c;
                            if (bVar2 == null || localeList != ((LocaleList) g02.f27b)) {
                                int size5 = localeList.size();
                                ArrayList arrayList3 = new ArrayList(size5);
                                for (int i29 = 0; i29 < size5; i29++) {
                                    arrayList3.add(new Q0.a(localeList.get(i29)));
                                }
                                bVar2 = new Q0.b(arrayList3);
                                g02.f27b = localeList;
                                g02.f28c = bVar2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!bVar.equals(bVar2)) {
                        ArrayList arrayList4 = new ArrayList(Eb.p.S(bVar, 10));
                        Iterator it = bVar.f8599a.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((Q0.a) it.next()).f8597a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList4.toArray(new Locale[0]);
                        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                str2 = xVar.g;
                if (str2 != null && !str2.equals("")) {
                    textPaint.setFontFeatureSettings(str2);
                }
                qVar2 = xVar.j;
                if (qVar2 != null && !qVar2.equals(U0.q.f9439c)) {
                    textPaint.setTextScaleX(textPaint.getTextScaleX() * qVar2.f9440a);
                    textPaint.setTextSkewX(textPaint.getTextSkewX() + qVar2.f9441b);
                }
                U0.p pVar3 = xVar.f5986a;
                textPaint.d(pVar3.b());
                textPaint.c(pVar3.c(), 9205357640488583168L, pVar3.a());
                textPaint.f(xVar.f5996n);
                textPaint.g(xVar.f5995m);
                textPaint.e(xVar.f5997o);
                j = xVar.f5992h;
                if (!V0.o.a(n.b(j), 4294967296L) && n.c(j) != 0.0f) {
                    float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
                    float J10 = cVar.J(j);
                    if (textScaleX != 0.0f) {
                        textPaint.setLetterSpacing(J10 / textScaleX);
                    }
                } else if (V0.o.a(n.b(j), 8589934592L)) {
                    textPaint.setLetterSpacing(n.c(j));
                }
                boolean z12 = (z11 || !V0.o.a(n.b(j), 4294967296L) || n.c(j) == 0.0f) ? false : true;
                long j12 = j0.n.g;
                long j13 = xVar.f5994l;
                boolean z13 = j0.n.c(j13, j12) && !j0.n.c(j13, j0.n.f18552f);
                U0.a aVar = xVar.f5993i;
                boolean z14 = aVar == null && Float.compare(aVar.f9414a, 0.0f) != 0;
                xVar2 = (!z12 || z13 || z14) ? new x(0L, 0L, (k) null, (i) null, (j) null, (q) null, (String) null, z12 ? j : n.f9987c, z14 ? aVar : null, (U0.q) null, (Q0.b) null, z13 ? j13 : j12, (l) null, (C) null, 63103) : null;
                if (xVar2 != null) {
                    int size6 = cVar3.f8785c.size() + 1;
                    r42 = new ArrayList(size6);
                    int i30 = 0;
                    while (i30 < size6) {
                        if (i30 == 0) {
                            c0373c = new C0373c(xVar2, 0, cVar3.f8783a.length());
                            i24 = 1;
                        } else {
                            i24 = 1;
                            c0373c = (C0373c) cVar3.f8785c.get(i30 - 1);
                        }
                        r42.add(c0373c);
                        i30 += i24;
                    }
                } else {
                    r42 = cVar3.f8785c;
                }
                ?? r02 = cVar3.f8783a;
                textSize = cVar3.f8789u.getTextSize();
                f10 = cVar3.f8784b;
                list3 = cVar3.f8786d;
                cVar2 = cVar3.f8788f;
                a aVar2 = b.f8782a;
                Spannable spannable = (r42.isEmpty() && list3.isEmpty() && kotlin.jvm.internal.l.a(f10.f5856b.f5928d, r.f9442c)) ? r02 : spannable;
                Spannable spannableString = r02 instanceof Spannable ? (Spannable) r02 : new SpannableString(r02);
                if (kotlin.jvm.internal.l.a(f10.f5855a.f5995m, l.f9433c)) {
                    spannableString.setSpan(b.f8782a, 0, r02.length(), 33);
                }
                s sVar2 = f10.f5857c;
                z8 = (sVar2 != null || (rVar3 = sVar2.f5936a) == null) ? false : rVar3.f5935a;
                pVar = f10.f5856b;
                if (z8 || pVar.f5930f != null) {
                    gVar2 = gVar;
                    U0.i iVar2 = pVar.f5930f;
                    iVar2 = iVar2 == null ? U0.i.f9425c : iVar2;
                    C2 = Tb.a.C(pVar.f5927c, textSize, cVar2);
                    if (!Float.isNaN(C2)) {
                        if (spannableString.length() != 0) {
                            if (spannableString.length() == 0) {
                                throw new NoSuchElementException("Char sequence is empty.");
                            }
                            if (spannableString.charAt(ac.g.c0(spannableString)) != '\n') {
                                length = spannableString.length();
                                int i31 = length;
                                int i32 = iVar2.f9427b;
                                spannableString.setSpan(new M0.h(C2, i31, (i32 & 1) <= 0, (i32 & 16) <= 0, iVar2.f9426a, false), 0, spannableString.length(), 33);
                            }
                        }
                        length = spannableString.length() + 1;
                        int i312 = length;
                        int i322 = iVar2.f9427b;
                        spannableString.setSpan(new M0.h(C2, i312, (i322 & 1) <= 0, (i322 & 16) <= 0, iVar2.f9426a, false), 0, spannableString.length(), 33);
                    }
                } else {
                    gVar2 = gVar;
                    float C10 = Tb.a.C(pVar.f5927c, textSize, cVar2);
                    if (!Float.isNaN(C10)) {
                        spannableString.setSpan(new M0.g(C10), 0, spannableString.length(), 33);
                    }
                }
                rVar = pVar.f5928d;
                List list5 = r42;
                if (rVar != null) {
                    long v10 = android.support.v4.media.session.b.v(0);
                    long j14 = rVar.f9443a;
                    boolean a10 = n.a(j14, v10);
                    long j15 = rVar.f9444b;
                    if ((!a10 || !n.a(j15, android.support.v4.media.session.b.v(0))) && (j14 & 1095216660480L) != 0 && (j15 & 1095216660480L) != 0) {
                        long b11 = n.b(j14);
                        if (V0.o.a(b11, 4294967296L)) {
                            c10 = cVar2.J(j14);
                            j10 = 8589934592L;
                        } else {
                            j10 = 8589934592L;
                            c10 = V0.o.a(b11, 8589934592L) ? n.c(j14) * textSize : 0.0f;
                        }
                        long b12 = n.b(j15);
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(c10), (int) Math.ceil(V0.o.a(b12, 4294967296L) ? cVar2.J(j15) : V0.o.a(b12, j10) ? textSize * n.c(j15) : 0.0f)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list5.size());
                size2 = list5.size();
                i12 = 0;
                while (i12 < size2) {
                    List list6 = list5;
                    C0373c c0373c2 = (C0373c) list6.get(i12);
                    Object obj3 = c0373c2.f5866a;
                    if (obj3 instanceof x) {
                        x xVar4 = (x) obj3;
                        if (((xVar4.f5991f == null && xVar4.f5989d == null && xVar4.f5988c == null) ? false : true) || ((x) obj3).f5990e != null) {
                            arrayList.add(c0373c2);
                        }
                    }
                    i12++;
                    list5 = list6;
                }
                List list7 = list5;
                x xVar5 = f10.f5855a;
                q qVar3 = xVar5.f5991f;
                x xVar6 = ((qVar3 == null || xVar5.f5989d != null || xVar5.f5988c != null) && xVar5.f5990e == null) ? null : new x(0L, 0L, xVar5.f5988c, xVar5.f5989d, xVar5.f5990e, qVar3, (String) null, 0L, (U0.a) null, (U0.q) null, (Q0.b) null, 0L, (l) null, (C) null, 65475);
                S0.a aVar3 = new S0.a(0, spannableString, gVar2);
                if (arrayList.size() > 1) {
                    int size7 = arrayList.size();
                    int i33 = size7 * 2;
                    int[] iArr2 = new int[i33];
                    int size8 = arrayList.size();
                    for (int i34 = 0; i34 < size8; i34++) {
                        C0373c c0373c3 = (C0373c) arrayList.get(i34);
                        iArr2[i34] = c0373c3.f5867b;
                        iArr2[i34 + size7] = c0373c3.f5868c;
                    }
                    if (i33 > 1) {
                        Arrays.sort(iArr2);
                    }
                    if (i33 == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    int i35 = iArr2[0];
                    int i36 = 0;
                    while (i36 < i33) {
                        int i37 = iArr2[i36];
                        if (i37 == i35) {
                            arrayList2 = arrayList;
                            xVar3 = xVar6;
                            iArr = iArr2;
                            i13 = 1;
                        } else {
                            int size9 = arrayList.size();
                            x xVar7 = xVar6;
                            int i38 = 0;
                            while (i38 < size9) {
                                ArrayList arrayList5 = arrayList;
                                C0373c c0373c4 = (C0373c) arrayList.get(i38);
                                x xVar8 = xVar6;
                                int i39 = c0373c4.f5867b;
                                int[] iArr3 = iArr2;
                                int i40 = c0373c4.f5868c;
                                if (i39 != i40 && AbstractC0375e.a(i35, i37, i39, i40)) {
                                    x xVar9 = (x) c0373c4.f5866a;
                                    xVar7 = xVar7 != null ? xVar7.c(xVar9) : xVar9;
                                }
                                i38++;
                                arrayList = arrayList5;
                                xVar6 = xVar8;
                                iArr2 = iArr3;
                            }
                            arrayList2 = arrayList;
                            xVar3 = xVar6;
                            iArr = iArr2;
                            i13 = 1;
                            if (xVar7 != null) {
                                aVar3.a(xVar7, Integer.valueOf(i35), Integer.valueOf(i37));
                            }
                            i35 = i37;
                        }
                        i36 += i13;
                        arrayList = arrayList2;
                        xVar6 = xVar3;
                        iArr2 = iArr;
                    }
                } else if (!arrayList.isEmpty()) {
                    x xVar10 = (x) ((C0373c) arrayList.get(0)).f5866a;
                    aVar3.a(xVar6 != null ? xVar6.c(xVar10) : xVar10, Integer.valueOf(((C0373c) arrayList.get(0)).f5867b), Integer.valueOf(((C0373c) arrayList.get(0)).f5868c));
                }
                size3 = list7.size();
                i14 = 0;
                z10 = false;
                while (i14 < size3) {
                    C0373c c0373c5 = (C0373c) list7.get(i14);
                    if (!(c0373c5.f5866a instanceof x) || (i19 = c0373c5.f5867b) < 0 || i19 >= spannableString.length() || (i20 = c0373c5.f5868c) <= i19 || i20 > spannableString.length()) {
                        list4 = list7;
                        pVar2 = pVar;
                    } else {
                        x xVar11 = (x) c0373c5.f5866a;
                        U0.a aVar4 = xVar11.f5993i;
                        if (aVar4 != null) {
                            spannableString.setSpan(new M0.a(0, aVar4.f9414a), i19, i20, 33);
                        }
                        U0.p pVar4 = xVar11.f5986a;
                        Tb.a.H(spannableString, pVar4.b(), i19, i20);
                        AbstractC1362A c11 = pVar4.c();
                        float a11 = pVar4.a();
                        if (c11 != null) {
                            if (c11 instanceof j0.F) {
                                Tb.a.H(spannableString, ((j0.F) c11).f18525e, i19, i20);
                            } else {
                                spannableString.setSpan(new T0.b((j0.k) c11, a11), i19, i20, 33);
                            }
                        }
                        l lVar = xVar11.f5995m;
                        if (lVar != null) {
                            int i41 = lVar.f9434a;
                            spannableString.setSpan(new M0.k((i41 | 1) == i41, (i41 | 2) == i41), i19, i20, 33);
                        }
                        Tb.a.I(spannableString, xVar11.f5987b, cVar2, i19, i20);
                        String str3 = xVar11.g;
                        if (str3 != null) {
                            i21 = 33;
                            spannableString.setSpan(new M0.b(str3, 0), i19, i20, 33);
                        } else {
                            i21 = 33;
                        }
                        U0.q qVar4 = xVar11.j;
                        if (qVar4 != null) {
                            spannableString.setSpan(new ScaleXSpan(qVar4.f9440a), i19, i20, i21);
                            spannableString.setSpan(new M0.a(1, qVar4.f9441b), i19, i20, i21);
                        }
                        Tb.a.K(spannableString, xVar11.k, i19, i20);
                        long j16 = xVar11.f5994l;
                        if (j16 != 16) {
                            spannableString.setSpan(new BackgroundColorSpan(AbstractC1362A.z(j16)), i19, i20, 33);
                        }
                        C c12 = xVar11.f5996n;
                        if (c12 != null) {
                            list4 = list7;
                            int z15 = AbstractC1362A.z(c12.f18512a);
                            i22 = i19;
                            long j17 = c12.f18513b;
                            pVar2 = pVar;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j17 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j17 & 4294967295L));
                            float f11 = c12.f18514c;
                            M0.j jVar2 = new M0.j(intBitsToFloat, intBitsToFloat2, f11 == 0.0f ? Float.MIN_VALUE : f11, z15);
                            i23 = 33;
                            spannableString.setSpan(jVar2, i22, i20, 33);
                        } else {
                            list4 = list7;
                            i22 = i19;
                            pVar2 = pVar;
                            i23 = 33;
                        }
                        AbstractC1444c abstractC1444c = xVar11.f5997o;
                        if (abstractC1444c != null) {
                            spannableString.setSpan(new T0.a(abstractC1444c), i22, i20, i23);
                        }
                        long j18 = xVar11.f5992h;
                        if (V0.o.a(n.b(j18), 4294967296L) || V0.o.a(n.b(j18), 8589934592L)) {
                            z10 = true;
                        }
                    }
                    i14++;
                    list7 = list4;
                    pVar = pVar2;
                }
                List list8 = list7;
                p pVar5 = pVar;
                if (z10) {
                    int size10 = list8.size();
                    int i42 = 0;
                    while (i42 < size10) {
                        List list9 = list8;
                        C0373c c0373c6 = (C0373c) list9.get(i42);
                        InterfaceC0372b interfaceC0372b = (InterfaceC0372b) c0373c6.f5866a;
                        if (!(interfaceC0372b instanceof x) || (i17 = c0373c6.f5867b) < 0 || i17 >= spannableString.length() || (i18 = c0373c6.f5868c) <= i17) {
                            list8 = list9;
                        } else if (i18 > spannableString.length()) {
                            list8 = list9;
                            i16 = 1;
                            i42 += i16;
                        } else {
                            long j19 = ((x) interfaceC0372b).f5992h;
                            long b13 = n.b(j19);
                            list8 = list9;
                            Object fVar = V0.o.a(b13, 4294967296L) ? new M0.f(cVar2.J(j19)) : V0.o.a(b13, 8589934592L) ? new M0.e(n.c(j19)) : null;
                            if (fVar != null) {
                                spannableString.setSpan(fVar, i17, i18, 33);
                            }
                        }
                        i16 = 1;
                        i42 += i16;
                    }
                }
                rVar2 = pVar5.f5928d;
                if (rVar2 != null) {
                    long j20 = rVar2.f9443a;
                    long b14 = n.b(j20);
                    if (V0.o.a(b14, 4294967296L)) {
                        cVar2.J(j20);
                    } else if (V0.o.a(b14, 8589934592L)) {
                        n.c(j20);
                    }
                }
                size4 = list8.size();
                i15 = 0;
                while (i15 < size4) {
                    List list10 = list8;
                    Object obj4 = ((C0373c) list10.get(i15)).f5866a;
                    i15++;
                    list8 = list10;
                }
                if (list3.size() <= 0) {
                    cVar3 = this;
                    spannable = spannableString;
                    cVar3.f8790v = spannable;
                    cVar3.f8791w = new L0.e(spannable, cVar3.f8789u, cVar3.f8793y);
                    return;
                }
                C0373c c0373c7 = (C0373c) list3.get(0);
                if (c0373c7.f5866a != null) {
                    throw new ClassCastException();
                }
                for (Object obj5 : spannableString.getSpans(c0373c7.f5867b, c0373c7.f5868c, S1.b.class)) {
                    if (obj5 != null) {
                        throw new ClassCastException();
                    }
                    spannableString.removeSpan(null);
                }
                throw null;
            }
            i7 = 3;
            cVar3.f8793y = i7;
            gVar = new g(cVar3, i25);
            t tVar2 = f4.f5856b.f5932i;
            if (tVar2 == null) {
            }
            textPaint.setFlags(tVar2.f9449b ? textPaint.getFlags() | 128 : textPaint.getFlags() & (-129));
            i10 = tVar2.f9448a;
            if (U0.s.a(i10, 1)) {
            }
            xVar = f4.f5855a;
            size = list.size();
            i11 = 0;
            while (true) {
                if (i11 >= size) {
                }
                i11++;
            }
            if (obj != null) {
            }
            long b22 = n.b(xVar.f5987b);
            a9 = V0.o.a(b22, 4294967296L);
            long j112 = xVar.f5987b;
            if (a9) {
            }
            qVar = xVar.f5991f;
            if ((qVar != null && xVar.f5989d == null && xVar.f5988c == null) ? false : true) {
            }
            bVar = xVar.k;
            if (bVar != null) {
            }
            str2 = xVar.g;
            if (str2 != null) {
                textPaint.setFontFeatureSettings(str2);
            }
            qVar2 = xVar.j;
            if (qVar2 != null) {
                textPaint.setTextScaleX(textPaint.getTextScaleX() * qVar2.f9440a);
                textPaint.setTextSkewX(textPaint.getTextSkewX() + qVar2.f9441b);
            }
            U0.p pVar32 = xVar.f5986a;
            textPaint.d(pVar32.b());
            textPaint.c(pVar32.c(), 9205357640488583168L, pVar32.a());
            textPaint.f(xVar.f5996n);
            textPaint.g(xVar.f5995m);
            textPaint.e(xVar.f5997o);
            j = xVar.f5992h;
            if (!V0.o.a(n.b(j), 4294967296L)) {
            }
            if (V0.o.a(n.b(j), 8589934592L)) {
            }
            if (z11) {
            }
            long j122 = j0.n.g;
            long j132 = xVar.f5994l;
            if (j0.n.c(j132, j122)) {
            }
            U0.a aVar5 = xVar.f5993i;
            if (aVar5 == null) {
            }
            if (z12) {
            }
            if (xVar2 != null) {
            }
            ?? r022 = cVar3.f8783a;
            textSize = cVar3.f8789u.getTextSize();
            f10 = cVar3.f8784b;
            list3 = cVar3.f8786d;
            cVar2 = cVar3.f8788f;
            a aVar22 = b.f8782a;
            if (r42.isEmpty()) {
            }
            if (r022 instanceof Spannable) {
            }
            if (kotlin.jvm.internal.l.a(f10.f5855a.f5995m, l.f9433c)) {
            }
            s sVar22 = f10.f5857c;
            if (sVar22 != null) {
            }
            pVar = f10.f5856b;
            if (z8) {
            }
            gVar2 = gVar;
            U0.i iVar22 = pVar.f5930f;
            if (iVar22 == null) {
            }
            C2 = Tb.a.C(pVar.f5927c, textSize, cVar2);
            if (!Float.isNaN(C2)) {
            }
            rVar = pVar.f5928d;
            List list52 = r42;
            if (rVar != null) {
            }
            arrayList = new ArrayList(list52.size());
            size2 = list52.size();
            i12 = 0;
            while (i12 < size2) {
            }
            List list72 = list52;
            x xVar52 = f10.f5855a;
            q qVar32 = xVar52.f5991f;
            if (qVar32 == null || xVar52.f5989d != null || xVar52.f5988c != null) {
            }
            S0.a aVar32 = new S0.a(0, spannableString, gVar2);
            if (arrayList.size() > 1) {
            }
            size3 = list72.size();
            i14 = 0;
            z10 = false;
            while (i14 < size3) {
            }
            List list82 = list72;
            p pVar52 = pVar;
            if (z10) {
            }
            rVar2 = pVar52.f5928d;
            if (rVar2 != null) {
            }
            size4 = list82.size();
            i15 = 0;
            while (i15 < size4) {
            }
            if (list3.size() <= 0) {
            }
        }
        i7 = 2;
        cVar3.f8793y = i7;
        gVar = new g(cVar3, i25);
        t tVar22 = f4.f5856b.f5932i;
        if (tVar22 == null) {
        }
        textPaint.setFlags(tVar22.f9449b ? textPaint.getFlags() | 128 : textPaint.getFlags() & (-129));
        i10 = tVar22.f9448a;
        if (U0.s.a(i10, 1)) {
        }
        xVar = f4.f5855a;
        size = list.size();
        i11 = 0;
        while (true) {
            if (i11 >= size) {
            }
            i11++;
        }
        if (obj != null) {
        }
        long b222 = n.b(xVar.f5987b);
        a9 = V0.o.a(b222, 4294967296L);
        long j1122 = xVar.f5987b;
        if (a9) {
        }
        qVar = xVar.f5991f;
        if ((qVar != null && xVar.f5989d == null && xVar.f5988c == null) ? false : true) {
        }
        bVar = xVar.k;
        if (bVar != null) {
        }
        str2 = xVar.g;
        if (str2 != null) {
        }
        qVar2 = xVar.j;
        if (qVar2 != null) {
        }
        U0.p pVar322 = xVar.f5986a;
        textPaint.d(pVar322.b());
        textPaint.c(pVar322.c(), 9205357640488583168L, pVar322.a());
        textPaint.f(xVar.f5996n);
        textPaint.g(xVar.f5995m);
        textPaint.e(xVar.f5997o);
        j = xVar.f5992h;
        if (!V0.o.a(n.b(j), 4294967296L)) {
        }
        if (V0.o.a(n.b(j), 8589934592L)) {
        }
        if (z11) {
        }
        long j1222 = j0.n.g;
        long j1322 = xVar.f5994l;
        if (j0.n.c(j1322, j1222)) {
        }
        U0.a aVar52 = xVar.f5993i;
        if (aVar52 == null) {
        }
        if (z12) {
        }
        if (xVar2 != null) {
        }
        ?? r0222 = cVar3.f8783a;
        textSize = cVar3.f8789u.getTextSize();
        f10 = cVar3.f8784b;
        list3 = cVar3.f8786d;
        cVar2 = cVar3.f8788f;
        a aVar222 = b.f8782a;
        if (r42.isEmpty()) {
        }
        if (r0222 instanceof Spannable) {
        }
        if (kotlin.jvm.internal.l.a(f10.f5855a.f5995m, l.f9433c)) {
        }
        s sVar222 = f10.f5857c;
        if (sVar222 != null) {
        }
        pVar = f10.f5856b;
        if (z8) {
        }
        gVar2 = gVar;
        U0.i iVar222 = pVar.f5930f;
        if (iVar222 == null) {
        }
        C2 = Tb.a.C(pVar.f5927c, textSize, cVar2);
        if (!Float.isNaN(C2)) {
        }
        rVar = pVar.f5928d;
        List list522 = r42;
        if (rVar != null) {
        }
        arrayList = new ArrayList(list522.size());
        size2 = list522.size();
        i12 = 0;
        while (i12 < size2) {
        }
        List list722 = list522;
        x xVar522 = f10.f5855a;
        q qVar322 = xVar522.f5991f;
        if (qVar322 == null || xVar522.f5989d != null || xVar522.f5988c != null) {
        }
        S0.a aVar322 = new S0.a(0, spannableString, gVar2);
        if (arrayList.size() > 1) {
        }
        size3 = list722.size();
        i14 = 0;
        z10 = false;
        while (i14 < size3) {
        }
        List list822 = list722;
        p pVar522 = pVar;
        if (z10) {
        }
        rVar2 = pVar522.f5928d;
        if (rVar2 != null) {
        }
        size4 = list822.size();
        i15 = 0;
        while (i15 < size4) {
        }
        if (list3.size() <= 0) {
        }
    }

    @Override // K0.o
    public final boolean a() {
        h hVar = this.f8792x;
        if (hVar != null ? hVar.G() : false) {
            return true;
        }
        s sVar = this.f8784b.f5857c;
        return false;
    }

    public final float b() {
        float f4;
        L0.e eVar = this.f8791w;
        if (!Float.isNaN(eVar.f6242e)) {
            return eVar.f6242e;
        }
        TextPaint textPaint = eVar.f6239b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = eVar.f6238a;
        lineInstance.setText(new L0.b(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new B(4));
        int i7 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Db.j(Integer.valueOf(i7), Integer.valueOf(next)));
            } else {
                Db.j jVar = (Db.j) priorityQueue.peek();
                if (jVar != null && ((Number) jVar.f3355b).intValue() - ((Number) jVar.f3354a).intValue() < next - i7) {
                    priorityQueue.poll();
                    priorityQueue.add(new Db.j(Integer.valueOf(i7), Integer.valueOf(next)));
                }
            }
            i7 = next;
        }
        if (priorityQueue.isEmpty()) {
            f4 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Db.j jVar2 = (Db.j) it.next();
            float desiredWidth = Layout.getDesiredWidth(eVar.b(), ((Number) jVar2.f3354a).intValue(), ((Number) jVar2.f3355b).intValue(), textPaint);
            while (it.hasNext()) {
                Db.j jVar3 = (Db.j) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(eVar.b(), ((Number) jVar3.f3354a).intValue(), ((Number) jVar3.f3355b).intValue(), textPaint));
            }
            f4 = desiredWidth;
        }
        eVar.f6242e = f4;
        return f4;
    }

    @Override // K0.o
    public final float c() {
        return this.f8791w.c();
    }
}
