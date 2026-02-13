package B0;

import A0.C0031u;
import K0.AbstractC0375e;
import K0.C0373c;
import K0.C0374d;
import a.AbstractC0672a;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.kt.apps.media.xemtv.beta.R;
import h0.C1221h;
import ia.C1358d;
import j0.AbstractC1362A;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import l2.C1481z;
import l2.EnumC1474s;
import m6.C1628d;
import u.AbstractC2065s;
import u.C2041D;
import u.C2046I;
import u.C2069w;
import v.AbstractC2121a;
import x0.AbstractC2256a;
import y0.AbstractC2328M;
import y0.InterfaceC2345m;
import y1.C2354b;
import y1.C2355c;

/* loaded from: classes.dex */
public final class H extends C2355c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2354b f1685c;

    public /* synthetic */ H(C2354b c2354b, int i7) {
        this.f1684b = i7;
        this.f1685c = c2354b;
    }

    @Override // y1.C2355c
    public void d(int i7, z1.e eVar, String str, Bundle bundle) {
        switch (this.f1684b) {
            case 0:
                ((L) this.f1685c).j(i7, eVar, str, bundle);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:378:0x074e, code lost:
    
        if (kotlin.jvm.internal.l.a(r3, java.lang.Boolean.TRUE) == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0750, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x078a, code lost:
    
        if (r3 == false) goto L385;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0c1e  */
    /* JADX WARN: Type inference failed for: r3v72, types: [Eb.v] */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.util.ArrayList] */
    @Override // y1.C2355c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z1.e e(int i7) {
        H0.f fVar;
        D d10;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        H0.i iVar;
        z1.e eVar;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        int i10;
        boolean z8;
        Object g;
        D d11;
        z1.e eVar2;
        Y0.j o10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean a9;
        boolean z13;
        boolean z14;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        C1481z w10;
        C2354b c2354b = this.f1685c;
        switch (this.f1684b) {
            case 0:
                L l10 = (L) c2354b;
                D d12 = l10.f1728d;
                C0195p viewTreeOwners = d12.getViewTreeOwners();
                if (((viewTreeOwners == null || (w10 = viewTreeOwners.f1943a.w()) == null) ? null : w10.f19242d) != EnumC1474s.f19227a) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                    z1.e eVar3 = new z1.e(obtain);
                    AccessibilityNodeInfo accessibilityNodeInfo5 = eVar3.f28173a;
                    X0 x02 = (X0) l10.s().b(i7);
                    if (x02 != null) {
                        H0.n nVar = x02.f1809a;
                        if (i7 == -1) {
                            Object parentForAccessibility = d12.getParentForAccessibility();
                            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                            eVar3.f28174b = -1;
                            obtain.setParent(view);
                        } else {
                            H0.n j = nVar.j();
                            Integer valueOf = j != null ? Integer.valueOf(j.g) : null;
                            if (valueOf == null) {
                                AbstractC2256a.c("semanticsNode " + i7 + " has null parent");
                                throw new Db.d(0);
                            }
                            int intValue = valueOf.intValue();
                            if (intValue == d12.getSemanticsOwner().a().g) {
                                intValue = -1;
                            }
                            eVar3.f28174b = intValue;
                            obtain.setParent(d12, intValue);
                        }
                        eVar3.f28175c = i7;
                        obtain.setSource(d12, i7);
                        obtain.setBoundsInScreen(l10.k(x02));
                        Resources resources = d12.getContext().getResources();
                        eVar3.i("android.view.View");
                        if (nVar.f4505d.f4494a.c(H0.q.f4530C)) {
                            eVar3.i("android.widget.EditText");
                        }
                        H0.t tVar = H0.q.f4560y;
                        H0.i iVar2 = nVar.f4505d;
                        C2046I c2046i = iVar2.f4494a;
                        if (c2046i.c(tVar)) {
                            eVar3.i("android.widget.TextView");
                        }
                        Object g2 = c2046i.g(H0.q.f4557v);
                        if (g2 == null) {
                            g2 = null;
                        }
                        H0.f fVar2 = (H0.f) g2;
                        if (fVar2 != null && (nVar.f4506e || H0.n.h(4, nVar).isEmpty())) {
                            if (H0.f.a(5, 4)) {
                                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                            } else if (H0.f.a(5, 2)) {
                                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                            } else {
                                String q10 = X.q();
                                if (!H0.f.a(5, 5) || nVar.m() || iVar2.f4496c) {
                                    eVar3.i(q10);
                                }
                            }
                        }
                        obtain.setPackageName(d12.getContext().getPackageName());
                        obtain.setImportantForAccessibility(X.j(nVar));
                        List h10 = H0.n.h(4, nVar);
                        int size = h10.size();
                        int i13 = 0;
                        while (i13 < size) {
                            H0.n nVar2 = (H0.n) h10.get(i13);
                            int i14 = size;
                            if (l10.s().a(nVar2.g)) {
                                Y0.j jVar = d12.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(nVar2.f4504c);
                                int i15 = nVar2.g;
                                if (i15 != -1) {
                                    if (jVar != null) {
                                        obtain.addChild(jVar);
                                    } else {
                                        accessibilityNodeInfo5.addChild(d12, i15);
                                    }
                                }
                            }
                            i13++;
                            size = i14;
                        }
                        if (i7 == l10.f1735n) {
                            accessibilityNodeInfo5.setAccessibilityFocused(true);
                            eVar3.b(z1.d.g);
                        } else {
                            accessibilityNodeInfo5.setAccessibilityFocused(false);
                            eVar3.b(z1.d.f28160f);
                        }
                        C0374d e2 = P.e(nVar);
                        if (e2 != null) {
                            d12.getFontFamilyResolver();
                            V0.c density = d12.getDensity();
                            String str = e2.f5871b;
                            SpannableString spannableString2 = new SpannableString(str);
                            ArrayList arrayList3 = e2.f5872c;
                            if (arrayList3 != null) {
                                d10 = d12;
                                int size2 = arrayList3.size();
                                int i16 = 0;
                                while (i16 < size2) {
                                    int i17 = size2;
                                    C0373c c0373c = (C0373c) arrayList3.get(i16);
                                    ArrayList arrayList4 = arrayList3;
                                    K0.x xVar = (K0.x) c0373c.f5866a;
                                    H0.i iVar3 = iVar2;
                                    AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo5;
                                    long b2 = xVar.f5986a.b();
                                    H0.f fVar3 = fVar2;
                                    U0.p pVar = xVar.f5986a;
                                    AccessibilityNodeInfo accessibilityNodeInfo7 = obtain;
                                    z1.e eVar4 = eVar3;
                                    if (!j0.n.c(b2, pVar.b())) {
                                        pVar = b2 != 16 ? new U0.c(b2) : U0.n.f9436a;
                                    }
                                    long b10 = pVar.b();
                                    int i18 = c0373c.f5867b;
                                    int i19 = c0373c.f5868c;
                                    Tb.a.H(spannableString2, b10, i18, i19);
                                    Tb.a.I(spannableString2, xVar.f5987b, density, i18, i19);
                                    N0.k kVar = xVar.f5988c;
                                    N0.i iVar4 = xVar.f5989d;
                                    if (kVar == null && iVar4 == null) {
                                        i12 = 33;
                                    } else {
                                        if (kVar == null) {
                                            kVar = N0.k.f7140c;
                                        }
                                        StyleSpan styleSpan = new StyleSpan(Z9.x.m(kVar, iVar4 != null ? iVar4.f7137a : 0));
                                        i12 = 33;
                                        spannableString2.setSpan(styleSpan, i18, i19, 33);
                                    }
                                    U0.l lVar = xVar.f5995m;
                                    if (lVar != null) {
                                        int i20 = lVar.f9434a;
                                        if ((i20 | 1) == i20) {
                                            spannableString2.setSpan(new UnderlineSpan(), i18, i19, i12);
                                        }
                                        if ((i20 | 2) == i20) {
                                            spannableString2.setSpan(new StrikethroughSpan(), i18, i19, i12);
                                        }
                                    }
                                    U0.q qVar = xVar.j;
                                    if (qVar != null) {
                                        spannableString2.setSpan(new ScaleXSpan(qVar.f9440a), i18, i19, i12);
                                    }
                                    Tb.a.K(spannableString2, xVar.k, i18, i19);
                                    long j10 = xVar.f5994l;
                                    if (j10 != 16) {
                                        spannableString2.setSpan(new BackgroundColorSpan(AbstractC1362A.z(j10)), i18, i19, 33);
                                    }
                                    i16++;
                                    size2 = i17;
                                    arrayList3 = arrayList4;
                                    iVar2 = iVar3;
                                    accessibilityNodeInfo5 = accessibilityNodeInfo6;
                                    fVar2 = fVar3;
                                    obtain = accessibilityNodeInfo7;
                                    eVar3 = eVar4;
                                }
                                fVar = fVar2;
                            } else {
                                fVar = fVar2;
                                d10 = d12;
                            }
                            accessibilityNodeInfo = obtain;
                            z1.e eVar5 = eVar3;
                            accessibilityNodeInfo2 = accessibilityNodeInfo5;
                            iVar = iVar2;
                            int length = str.length();
                            ?? r32 = Eb.v.f3891a;
                            List list = e2.f5870a;
                            if (list != null) {
                                arrayList = new ArrayList(list.size());
                                int size3 = list.size();
                                for (int i21 = 0; i21 < size3; i21++) {
                                    Object obj = list.get(i21);
                                    C0373c c0373c2 = (C0373c) obj;
                                    if ((c0373c2.f5866a instanceof K0.H) && AbstractC0375e.a(0, length, c0373c2.f5867b, c0373c2.f5868c)) {
                                        arrayList.add(obj);
                                    }
                                }
                            } else {
                                arrayList = r32;
                            }
                            int size4 = arrayList.size();
                            for (int i22 = 0; i22 < size4; i22++) {
                                C0373c c0373c3 = (C0373c) arrayList.get(i22);
                                K0.H h11 = (K0.H) c0373c3.f5866a;
                                if (!(h11 instanceof K0.H)) {
                                    throw new Db.d(1);
                                }
                                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(h11.f5859a).build(), c0373c3.f5867b, c0373c3.f5868c, 33);
                            }
                            int length2 = str.length();
                            if (list != null) {
                                arrayList2 = new ArrayList(list.size());
                                int size5 = list.size();
                                for (int i23 = 0; i23 < size5; i23++) {
                                    Object obj2 = list.get(i23);
                                    C0373c c0373c4 = (C0373c) obj2;
                                    if ((c0373c4.f5866a instanceof K0.G) && AbstractC0375e.a(0, length2, c0373c4.f5867b, c0373c4.f5868c)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                            } else {
                                arrayList2 = r32;
                            }
                            int size6 = arrayList2.size();
                            int i24 = 0;
                            while (true) {
                                Q7.h hVar = l10.f1722I;
                                if (i24 < size6) {
                                    C0373c c0373c5 = (C0373c) arrayList2.get(i24);
                                    K0.G g10 = (K0.G) c0373c5.f5866a;
                                    WeakHashMap weakHashMap = (WeakHashMap) hVar.f8695b;
                                    Object obj3 = weakHashMap.get(g10);
                                    if (obj3 == null) {
                                        obj3 = new URLSpan(g10.f5858a);
                                        weakHashMap.put(g10, obj3);
                                    }
                                    spannableString2.setSpan((URLSpan) obj3, c0373c5.f5867b, c0373c5.f5868c, 33);
                                    i24++;
                                } else {
                                    int length3 = str.length();
                                    if (list != null) {
                                        r32 = new ArrayList(list.size());
                                        int size7 = list.size();
                                        for (int i25 = 0; i25 < size7; i25++) {
                                            Object obj4 = list.get(i25);
                                            C0373c c0373c6 = (C0373c) obj4;
                                            if ((c0373c6.f5866a instanceof K0.j) && AbstractC0375e.a(0, length3, c0373c6.f5867b, c0373c6.f5868c)) {
                                                r32.add(obj4);
                                            }
                                        }
                                    }
                                    int size8 = r32.size();
                                    for (int i26 = 0; i26 < size8; i26++) {
                                        C0373c c0373c7 = (C0373c) r32.get(i26);
                                        int i27 = c0373c7.f5867b;
                                        int i28 = c0373c7.f5868c;
                                        if (i27 != i28) {
                                            Object obj5 = c0373c7.f5866a;
                                            K0.j jVar2 = (K0.j) obj5;
                                            if (jVar2 instanceof K0.i) {
                                                jVar2.getClass();
                                                kotlin.jvm.internal.l.c(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                                K0.i iVar5 = (K0.i) obj5;
                                                C0373c c0373c8 = new C0373c(iVar5, i27, i28);
                                                WeakHashMap weakHashMap2 = (WeakHashMap) hVar.f8696c;
                                                Object obj6 = weakHashMap2.get(c0373c8);
                                                if (obj6 == null) {
                                                    obj6 = new URLSpan(iVar5.f5885a);
                                                    weakHashMap2.put(c0373c8, obj6);
                                                }
                                                spannableString2.setSpan((URLSpan) obj6, i27, i28, 33);
                                            } else {
                                                WeakHashMap weakHashMap3 = (WeakHashMap) hVar.f8697d;
                                                Object obj7 = weakHashMap3.get(c0373c7);
                                                if (obj7 == null) {
                                                    obj7 = new R0.e(jVar2);
                                                    weakHashMap3.put(c0373c7, obj7);
                                                }
                                                spannableString2.setSpan((ClickableSpan) obj7, i27, i28, 33);
                                            }
                                        }
                                    }
                                    spannableString = (SpannableString) L.K(spannableString2);
                                    eVar = eVar5;
                                }
                            }
                        } else {
                            fVar = fVar2;
                            d10 = d12;
                            accessibilityNodeInfo = obtain;
                            accessibilityNodeInfo2 = accessibilityNodeInfo5;
                            iVar = iVar2;
                            eVar = eVar3;
                            spannableString = null;
                        }
                        eVar.n(spannableString);
                        H0.t tVar2 = H0.q.f4535H;
                        if (c2046i.c(tVar2)) {
                            accessibilityNodeInfo4 = accessibilityNodeInfo;
                            accessibilityNodeInfo4.setContentInvalid(true);
                            Object g11 = c2046i.g(tVar2);
                            if (g11 == null) {
                                g11 = null;
                            }
                            accessibilityNodeInfo3 = accessibilityNodeInfo2;
                            accessibilityNodeInfo3.setError((CharSequence) g11);
                        } else {
                            accessibilityNodeInfo3 = accessibilityNodeInfo2;
                            accessibilityNodeInfo4 = accessibilityNodeInfo;
                        }
                        String d13 = P.d(nVar, resources);
                        if (Build.VERSION.SDK_INT >= 30) {
                            D0.e.j(accessibilityNodeInfo3, d13);
                        } else {
                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", d13);
                        }
                        accessibilityNodeInfo3.setCheckable(P.c(nVar));
                        Object g12 = c2046i.g(H0.q.f4533F);
                        if (g12 == null) {
                            g12 = null;
                        }
                        J0.a aVar = (J0.a) g12;
                        if (aVar != null) {
                            if (aVar == J0.a.f5412a) {
                                accessibilityNodeInfo3.setChecked(true);
                            } else if (aVar == J0.a.f5413b) {
                                accessibilityNodeInfo3.setChecked(false);
                            }
                        }
                        Object g13 = c2046i.g(H0.q.f4532E);
                        if (g13 == null) {
                            g13 = null;
                        }
                        Boolean bool = (Boolean) g13;
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            if (fVar == null ? false : H0.f.a(5, 4)) {
                                accessibilityNodeInfo4.setSelected(booleanValue);
                            } else {
                                accessibilityNodeInfo3.setChecked(booleanValue);
                            }
                        }
                        H0.i iVar6 = iVar;
                        if (!iVar6.f4496c || H0.n.h(4, nVar).isEmpty()) {
                            Object g14 = c2046i.g(H0.q.f4539a);
                            if (g14 == null) {
                                g14 = null;
                            }
                            List list2 = (List) g14;
                            accessibilityNodeInfo3.setContentDescription(list2 != null ? (String) Eb.o.Z(list2) : null);
                        }
                        Object g15 = c2046i.g(H0.q.f4558w);
                        if (g15 == null) {
                            g15 = null;
                        }
                        String str2 = (String) g15;
                        if (str2 != null) {
                            H0.n nVar3 = nVar;
                            while (true) {
                                if (nVar3 != null) {
                                    H0.t tVar3 = H0.r.f4562a;
                                    H0.i iVar7 = nVar3.f4505d;
                                    if (iVar7.f4494a.c(tVar3)) {
                                        z14 = ((Boolean) iVar7.t(tVar3)).booleanValue();
                                    } else {
                                        nVar3 = nVar3.j();
                                    }
                                } else {
                                    z14 = false;
                                }
                            }
                            if (z14) {
                                accessibilityNodeInfo4.setViewIdResourceName(str2);
                            }
                        }
                        H0.t tVar4 = H0.q.f4539a;
                        Object g16 = c2046i.g(H0.q.f4545h);
                        if (g16 == null) {
                            g16 = null;
                        }
                        if (((Db.q) g16) != null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                accessibilityNodeInfo3.setHeading(true);
                            } else {
                                eVar.h(2, true);
                            }
                        }
                        accessibilityNodeInfo4.setPassword(c2046i.c(H0.q.f4534G));
                        accessibilityNodeInfo4.setEditable(c2046i.c(H0.q.f4537J));
                        Object g17 = c2046i.g(H0.q.f4538K);
                        if (g17 == null) {
                            g17 = null;
                        }
                        Integer num = (Integer) g17;
                        accessibilityNodeInfo3.setMaxTextLength(num != null ? num.intValue() : -1);
                        accessibilityNodeInfo3.setEnabled(P.a(nVar));
                        H0.t tVar5 = H0.q.k;
                        accessibilityNodeInfo3.setFocusable(c2046i.c(tVar5));
                        if (accessibilityNodeInfo4.isFocusable()) {
                            accessibilityNodeInfo3.setFocused(((Boolean) iVar6.t(tVar5)).booleanValue());
                            if (!accessibilityNodeInfo4.isFocused()) {
                                i10 = i7;
                                z8 = true;
                                eVar.a(1);
                                accessibilityNodeInfo3.setVisibleToUser(X.i(nVar) ^ z8);
                                g = c2046i.g(H0.q.j);
                                if (g == null) {
                                    g = null;
                                }
                                if (g == null) {
                                    throw new ClassCastException();
                                }
                                accessibilityNodeInfo3.setClickable(false);
                                Object g18 = c2046i.g(H0.h.f4472b);
                                if (g18 == null) {
                                    g18 = null;
                                }
                                H0.a aVar2 = (H0.a) g18;
                                if (aVar2 != null) {
                                    Object g19 = c2046i.g(H0.q.f4532E);
                                    if (g19 == null) {
                                        g19 = null;
                                    }
                                    boolean a10 = kotlin.jvm.internal.l.a(g19, Boolean.TRUE);
                                    if (fVar == null) {
                                        i11 = 5;
                                        a9 = false;
                                    } else {
                                        i11 = 5;
                                        a9 = H0.f.a(5, 4);
                                    }
                                    if (!a9) {
                                        if (!(fVar == null ? false : H0.f.a(i11, 3))) {
                                            z13 = false;
                                            accessibilityNodeInfo3.setClickable(z13 || (z13 && !a10));
                                            if (P.a(nVar) && accessibilityNodeInfo4.isClickable()) {
                                                eVar.b(new z1.d(16, aVar2.f4460a));
                                            }
                                        }
                                    }
                                    z13 = true;
                                    accessibilityNodeInfo3.setClickable(z13 || (z13 && !a10));
                                    if (P.a(nVar)) {
                                        eVar.b(new z1.d(16, aVar2.f4460a));
                                    }
                                }
                                accessibilityNodeInfo3.setLongClickable(false);
                                Object g20 = c2046i.g(H0.h.f4473c);
                                if (g20 == null) {
                                    g20 = null;
                                }
                                H0.a aVar3 = (H0.a) g20;
                                if (aVar3 != null) {
                                    accessibilityNodeInfo3.setLongClickable(true);
                                    if (P.a(nVar)) {
                                        eVar.b(new z1.d(32, aVar3.f4460a));
                                    }
                                }
                                Object g21 = c2046i.g(H0.h.f4482o);
                                if (g21 == null) {
                                    g21 = null;
                                }
                                H0.a aVar4 = (H0.a) g21;
                                if (aVar4 != null) {
                                    eVar.b(new z1.d(16384, aVar4.f4460a));
                                }
                                if (P.a(nVar)) {
                                    Object g22 = c2046i.g(H0.h.j);
                                    if (g22 == null) {
                                        g22 = null;
                                    }
                                    H0.a aVar5 = (H0.a) g22;
                                    if (aVar5 != null) {
                                        eVar.b(new z1.d(2097152, aVar5.f4460a));
                                    }
                                    Object g23 = c2046i.g(H0.h.f4481n);
                                    if (g23 == null) {
                                        g23 = null;
                                    }
                                    H0.a aVar6 = (H0.a) g23;
                                    if (aVar6 != null) {
                                        eVar.b(new z1.d(android.R.id.accessibilityActionImeEnter, aVar6.f4460a));
                                    }
                                    Object g24 = c2046i.g(H0.h.f4483p);
                                    if (g24 == null) {
                                        g24 = null;
                                    }
                                    H0.a aVar7 = (H0.a) g24;
                                    if (aVar7 != null) {
                                        eVar.b(new z1.d(65536, aVar7.f4460a));
                                    }
                                    Object g25 = c2046i.g(H0.h.f4484q);
                                    if (g25 == null) {
                                        g25 = null;
                                    }
                                    H0.a aVar8 = (H0.a) g25;
                                    if (aVar8 != null && accessibilityNodeInfo4.isFocused()) {
                                        ClipDescription primaryClipDescription = d10.m3getClipboardManager().f1924a.getPrimaryClipDescription();
                                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                            eVar.b(new z1.d(32768, aVar8.f4460a));
                                        }
                                    }
                                }
                                String t5 = L.t(nVar);
                                if (!(t5 == null || t5.length() == 0)) {
                                    accessibilityNodeInfo4.setTextSelection(l10.r(nVar), l10.q(nVar));
                                    Object g26 = c2046i.g(H0.h.f4478i);
                                    if (g26 == null) {
                                        g26 = null;
                                    }
                                    H0.a aVar9 = (H0.a) g26;
                                    eVar.b(new z1.d(131072, aVar9 != null ? aVar9.f4460a : null));
                                    eVar.a(256);
                                    eVar.a(512);
                                    accessibilityNodeInfo3.setMovementGranularities(11);
                                    Object g27 = iVar6.f4494a.g(H0.q.f4539a);
                                    if (g27 == null) {
                                        g27 = null;
                                    }
                                    List list3 = (List) g27;
                                    if (list3 == null || list3.isEmpty()) {
                                        if (iVar6.f4494a.c(H0.h.f4471a)) {
                                            if (iVar6.f4494a.c(H0.q.f4530C)) {
                                                Object g28 = iVar6.f4494a.g(tVar5);
                                                if (g28 == null) {
                                                    g28 = null;
                                                }
                                                break;
                                            }
                                            r rVar = r.f1963e;
                                            A0.L t10 = nVar.f4504c.t();
                                            while (true) {
                                                if (t10 == null) {
                                                    t10 = null;
                                                } else if (!((Boolean) rVar.invoke(t10)).booleanValue()) {
                                                    t10 = t10.t();
                                                }
                                            }
                                            if (t10 != null) {
                                                H0.i v10 = t10.v();
                                                if (v10 != null) {
                                                    Object g29 = v10.f4494a.g(H0.q.k);
                                                    if (g29 == null) {
                                                        g29 = null;
                                                    }
                                                    z12 = kotlin.jvm.internal.l.a(g29, Boolean.TRUE);
                                                    break;
                                                } else {
                                                    z12 = false;
                                                    break;
                                                }
                                            }
                                            boolean z15 = false;
                                            if (!z15) {
                                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                }
                                int i29 = Build.VERSION.SDK_INT;
                                if (i29 >= 26) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add("androidx.compose.ui.semantics.id");
                                    CharSequence g30 = eVar.g();
                                    if (!(g30 == null || g30.length() == 0) && iVar6.b(H0.h.f4471a)) {
                                        arrayList5.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (iVar6.b(H0.q.f4558w)) {
                                        arrayList5.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        accessibilityNodeInfo3.setAvailableExtraData(arrayList5);
                                    }
                                }
                                H0.e eVar6 = (H0.e) vc.i.u(nVar.k(), H0.q.f4541c);
                                if (eVar6 != null) {
                                    H0.i k = nVar.k();
                                    H0.t tVar6 = H0.h.f4477h;
                                    if (k.b(tVar6)) {
                                        eVar.i("android.widget.SeekBar");
                                    } else {
                                        eVar.i("android.widget.ProgressBar");
                                    }
                                    H0.e eVar7 = H0.e.f4466b;
                                    if (eVar6 != H0.e.f4466b) {
                                        eVar6.a().getClass();
                                        float floatValue = Float.valueOf(0.0f).floatValue();
                                        eVar6.a().getClass();
                                        accessibilityNodeInfo3.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C1358d(AccessibilityNodeInfo.RangeInfo.obtain(1, floatValue, Float.valueOf(0.0f).floatValue(), 0.0f), 27).f18487b);
                                    }
                                    if (nVar.k().b(tVar6) && P.a(nVar)) {
                                        eVar6.a().getClass();
                                        float floatValue2 = Float.valueOf(0.0f).floatValue();
                                        eVar6.a().getClass();
                                        float floatValue3 = Float.valueOf(0.0f).floatValue();
                                        if (floatValue2 < floatValue3) {
                                            floatValue2 = floatValue3;
                                        }
                                        if (0.0f < floatValue2) {
                                            eVar.b(z1.d.f28161h);
                                        }
                                        eVar6.a().getClass();
                                        float floatValue4 = Float.valueOf(0.0f).floatValue();
                                        eVar6.a().getClass();
                                        float floatValue5 = Float.valueOf(0.0f).floatValue();
                                        if (floatValue4 > floatValue5) {
                                            floatValue4 = floatValue5;
                                        }
                                        if (0.0f > floatValue4) {
                                            eVar.b(z1.d.f28162i);
                                        }
                                    }
                                }
                                if (P.a(nVar)) {
                                    Object g31 = nVar.f4505d.f4494a.g(H0.h.f4477h);
                                    if (g31 == null) {
                                        g31 = null;
                                    }
                                    H0.a aVar10 = (H0.a) g31;
                                    if (aVar10 != null) {
                                        eVar.b(new z1.d(android.R.id.accessibilityActionSetProgress, aVar10.f4460a));
                                    }
                                }
                                Object g32 = nVar.i().f4494a.g(H0.q.f4544f);
                                if (g32 == null) {
                                    g32 = null;
                                }
                                H0.b bVar = (H0.b) g32;
                                if (bVar != null) {
                                    eVar.j(C2355c.g(bVar.f4462a, bVar.f4463b, 0));
                                } else {
                                    ArrayList arrayList6 = new ArrayList();
                                    Object g33 = nVar.i().f4494a.g(H0.q.f4543e);
                                    if (g33 == null) {
                                        g33 = null;
                                    }
                                    if (g33 != null) {
                                        List h12 = H0.n.h(4, nVar);
                                        int size9 = h12.size();
                                        for (int i30 = 0; i30 < size9; i30++) {
                                            H0.n nVar4 = (H0.n) h12.get(i30);
                                            if (nVar4.i().f4494a.c(H0.q.f4532E)) {
                                                arrayList6.add(nVar4);
                                            }
                                        }
                                    }
                                    if (!arrayList6.isEmpty()) {
                                        boolean k7 = tc.b.k(arrayList6);
                                        eVar.j(C2355c.g(k7 ? 1 : arrayList6.size(), k7 ? arrayList6.size() : 1, 0));
                                    }
                                }
                                tc.b.H(nVar, eVar);
                                H0.g gVar = (H0.g) vc.i.u(nVar.k(), H0.q.f4554s);
                                H0.a aVar11 = (H0.a) vc.i.u(nVar.k(), H0.h.f4474d);
                                if (gVar != null && aVar11 != null) {
                                    Object g34 = nVar.i().f4494a.g(H0.q.f4544f);
                                    if (g34 == null) {
                                        g34 = null;
                                    }
                                    if (g34 == null) {
                                        Object g35 = nVar.i().f4494a.g(H0.q.f4543e);
                                        if (g35 == null) {
                                            g35 = null;
                                        }
                                        if (g35 == null) {
                                            z11 = false;
                                            if (!z11) {
                                                eVar.i("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) gVar.f4469b.invoke()).floatValue() > 0.0f) {
                                                eVar.m(true);
                                            }
                                            if (P.a(nVar)) {
                                                if (L.y(gVar)) {
                                                    eVar.b(z1.d.f28161h);
                                                    eVar.b(!P.f(nVar) ? z1.d.f28167p : z1.d.f28165n);
                                                }
                                                if (L.x(gVar)) {
                                                    eVar.b(z1.d.f28162i);
                                                    eVar.b(!P.f(nVar) ? z1.d.f28165n : z1.d.f28167p);
                                                }
                                            }
                                        }
                                    }
                                    z11 = true;
                                    if (!z11) {
                                    }
                                    if (((Number) gVar.f4469b.invoke()).floatValue() > 0.0f) {
                                    }
                                    if (P.a(nVar)) {
                                    }
                                }
                                H0.g gVar2 = (H0.g) vc.i.u(nVar.k(), H0.q.f4555t);
                                if (gVar2 != null && aVar11 != null) {
                                    Object g36 = nVar.i().f4494a.g(H0.q.f4544f);
                                    if (g36 == null) {
                                        g36 = null;
                                    }
                                    if (g36 == null) {
                                        Object g37 = nVar.i().f4494a.g(H0.q.f4543e);
                                        if (g37 == null) {
                                            g37 = null;
                                        }
                                        if (g37 == null) {
                                            z10 = false;
                                            if (!z10) {
                                                eVar.i("android.widget.ScrollView");
                                            }
                                            if (((Number) gVar2.f4469b.invoke()).floatValue() > 0.0f) {
                                                eVar.m(true);
                                            }
                                            if (P.a(nVar)) {
                                                if (L.y(gVar2)) {
                                                    eVar.b(z1.d.f28161h);
                                                    eVar.b(z1.d.f28166o);
                                                }
                                                if (L.x(gVar2)) {
                                                    eVar.b(z1.d.f28162i);
                                                    eVar.b(z1.d.f28164m);
                                                }
                                            }
                                        }
                                    }
                                    z10 = true;
                                    if (!z10) {
                                    }
                                    if (((Number) gVar2.f4469b.invoke()).floatValue() > 0.0f) {
                                    }
                                    if (P.a(nVar)) {
                                    }
                                }
                                if (i29 >= 29) {
                                    X.a(nVar, eVar);
                                }
                                CharSequence charSequence = (CharSequence) vc.i.u(nVar.k(), H0.q.f4542d);
                                if (i29 >= 28) {
                                    accessibilityNodeInfo3.setPaneTitle(charSequence);
                                } else {
                                    accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                                }
                                if (P.a(nVar)) {
                                    H0.a aVar12 = (H0.a) vc.i.u(nVar.k(), H0.h.f4485r);
                                    if (aVar12 != null) {
                                        eVar.b(new z1.d(262144, aVar12.f4460a));
                                    }
                                    H0.a aVar13 = (H0.a) vc.i.u(nVar.k(), H0.h.f4486s);
                                    if (aVar13 != null) {
                                        eVar.b(new z1.d(524288, aVar13.f4460a));
                                    }
                                    H0.a aVar14 = (H0.a) vc.i.u(nVar.k(), H0.h.f4487t);
                                    if (aVar14 != null) {
                                        eVar.b(new z1.d(1048576, aVar14.f4460a));
                                    }
                                    H0.i k10 = nVar.k();
                                    H0.t tVar7 = H0.h.f4489v;
                                    if (k10.b(tVar7)) {
                                        List list4 = (List) nVar.k().t(tVar7);
                                        int size10 = list4.size();
                                        C2069w c2069w = L.f1713P;
                                        if (size10 >= c2069w.f24728b) {
                                            throw new IllegalStateException(A3.c.k(new StringBuilder("Can't have more than "), c2069w.f24728b, " custom actions for one widget"));
                                        }
                                        u.U u3 = new u.U(0);
                                        C2041D a11 = u.N.a();
                                        u.U u10 = l10.f1743v;
                                        if (u10.f24638a) {
                                            AbstractC2065s.a(u10);
                                        }
                                        if (AbstractC2121a.a(u10.f24641d, i10, u10.f24639b) >= 0) {
                                            C2041D c2041d = (C2041D) u10.c(i10);
                                            int[] iArr = new int[16];
                                            int[] iArr2 = c2069w.f24727a;
                                            int i31 = c2069w.f24728b;
                                            int i32 = 0;
                                            int i33 = 0;
                                            while (i32 < i31) {
                                                int i34 = iArr2[i32];
                                                int i35 = i31;
                                                int i36 = i33 + 1;
                                                int[] iArr3 = iArr2;
                                                if (iArr.length < i36) {
                                                    iArr = Arrays.copyOf(iArr, Math.max(i36, (iArr.length * 3) / 2));
                                                    kotlin.jvm.internal.l.d(iArr, "copyOf(...)");
                                                }
                                                iArr[i33] = i34;
                                                i32++;
                                                i33 = i36;
                                                i31 = i35;
                                                iArr2 = iArr3;
                                            }
                                            ArrayList arrayList7 = new ArrayList();
                                            if (list4.size() > 0) {
                                                A3.c.p(list4.get(0));
                                                kotlin.jvm.internal.l.b(c2041d);
                                                throw null;
                                            }
                                            if (arrayList7.size() > 0) {
                                                A3.c.p(arrayList7.get(0));
                                                if (i33 > 0) {
                                                    int i37 = iArr[0];
                                                    throw null;
                                                }
                                                AbstractC2121a.d("Index must be between 0 and size");
                                                throw null;
                                            }
                                        } else if (list4.size() > 0) {
                                            A3.c.p(list4.get(0));
                                            c2069w.b(0);
                                            throw null;
                                        }
                                        l10.f1742u.e(i10, u3);
                                        u10.e(i10, a11);
                                    }
                                }
                                boolean g38 = P.g(nVar, resources);
                                if (Build.VERSION.SDK_INT >= 28) {
                                    accessibilityNodeInfo3.setScreenReaderFocusable(g38);
                                } else {
                                    eVar.h(1, g38);
                                }
                                int d14 = l10.f1718E.d(i10);
                                if (d14 != -1) {
                                    Y0.j o11 = X.o(d10.getAndroidViewsHandler$ui_release(), d14);
                                    if (o11 != null) {
                                        accessibilityNodeInfo3.setTraversalBefore(o11);
                                        d11 = d10;
                                    } else {
                                        d11 = d10;
                                        accessibilityNodeInfo3.setTraversalBefore(d11, d14);
                                    }
                                    l10.j(i10, eVar, l10.f1720G, null);
                                } else {
                                    d11 = d10;
                                }
                                int d15 = l10.f1719F.d(i10);
                                if (d15 != -1 && (o10 = X.o(d11.getAndroidViewsHandler$ui_release(), d15)) != null) {
                                    accessibilityNodeInfo3.setTraversalAfter(o10);
                                    l10.j(i10, eVar, l10.f1721H, null);
                                }
                                eVar2 = eVar;
                                if (l10.f1739r) {
                                    if (i10 == l10.f1735n) {
                                        l10.f1737p = eVar2;
                                    }
                                    if (i10 == l10.f1736o) {
                                        l10.f1738q = eVar2;
                                    }
                                }
                                return eVar2;
                            }
                            eVar.a(2);
                            i10 = i7;
                            l10.f1736o = i10;
                        } else {
                            i10 = i7;
                        }
                        z8 = true;
                        accessibilityNodeInfo3.setVisibleToUser(X.i(nVar) ^ z8);
                        g = c2046i.g(H0.q.j);
                        if (g == null) {
                        }
                        if (g == null) {
                        }
                    }
                }
                i10 = i7;
                eVar2 = null;
                if (l10.f1739r) {
                }
                return eVar2;
            default:
                return new z1.e(AccessibilityNodeInfo.obtain(((I1.a) c2354b).n(i7).f28173a));
        }
    }

    @Override // y1.C2355c
    public final z1.e f(int i7) {
        switch (this.f1684b) {
            case 0:
                L l10 = (L) this.f1685c;
                if (i7 != 1) {
                    if (i7 == 2) {
                        return e(l10.f1735n);
                    }
                    throw new IllegalArgumentException(h3.o.l(i7, "Unknown focus type: "));
                }
                int i10 = l10.f1736o;
                if (i10 == Integer.MIN_VALUE) {
                    return null;
                }
                return e(i10);
            default:
                I1.a aVar = (I1.a) this.f1685c;
                int i11 = i7 == 2 ? aVar.k : aVar.f4975l;
                if (i11 == Integer.MIN_VALUE) {
                    return null;
                }
                return e(i11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x020b, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x06f8, code lost:
    
        if (r1 != 16) goto L501;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00d7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x07b3  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r6v23, types: [B0.g, B0.c] */
    /* JADX WARN: Type inference failed for: r7v16, types: [B0.f, B0.c] */
    /* JADX WARN: Type inference failed for: r7v20, types: [B0.e, B0.c] */
    @Override // y1.C2355c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i7, int i10, Bundle bundle) {
        boolean z8;
        H0.n nVar;
        int i11;
        int i12;
        Integer num;
        AbstractC0169c abstractC0169c;
        int i13;
        int i14;
        K0.C g;
        C0175f c0175f;
        Rb.a aVar;
        int i15;
        int i16;
        ?? r22;
        int i17;
        Rb.a aVar2;
        int i18;
        Integer num2;
        Boolean bool;
        Rb.a aVar3;
        Rb.a aVar4;
        boolean z10;
        H0.a aVar5;
        Rb.a aVar6;
        float intBitsToFloat;
        H0.a aVar7;
        Rb.a aVar8;
        Rb.c cVar;
        Rb.a aVar9;
        Rb.a aVar10;
        Rb.a aVar11;
        Rb.a aVar12;
        Rb.a aVar13;
        Rb.c cVar2;
        H0.a aVar14;
        long j;
        Object g2;
        float f4;
        float f10;
        Rb.e eVar;
        Rb.c cVar3;
        Rb.a aVar15;
        Rb.a aVar16;
        Rb.a aVar17;
        Rb.a aVar18;
        Rb.a aVar19;
        int i19;
        C2354b c2354b = this.f1685c;
        boolean z11 = false;
        boolean z12 = true;
        switch (this.f1684b) {
            case 0:
                L l10 = (L) c2354b;
                X0 x02 = (X0) l10.s().b(i7);
                if (x02 == null || (nVar = x02.f1809a) == null) {
                    z8 = false;
                } else {
                    D d10 = l10.f1728d;
                    if (i10 == 64) {
                        z8 = false;
                        AccessibilityManager accessibilityManager = l10.g;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i11 = l10.f1735n) != i7) {
                            if (i11 != Integer.MIN_VALUE) {
                                i12 = 12;
                                num = null;
                                L.D(l10, i11, 65536, null, 12);
                            } else {
                                i12 = 12;
                                num = null;
                            }
                            l10.f1735n = i7;
                            d10.invalidate();
                            L.D(l10, i7, 32768, num, i12);
                            return true;
                        }
                    } else if (i10 != 128) {
                        H0.i iVar = nVar.f4505d;
                        int i20 = nVar.g;
                        C2046I c2046i = iVar.f4494a;
                        if (i10 != 256 && i10 != 512) {
                            if (i10 == 16384) {
                                Object g10 = c2046i.g(H0.h.f4482o);
                                H0.a aVar20 = (H0.a) (g10 == null ? null : g10);
                                if (aVar20 != null && (aVar = (Rb.a) aVar20.f4461b) != null) {
                                    return ((Boolean) aVar.invoke()).booleanValue();
                                }
                            } else {
                                if (i10 == 131072) {
                                    if (bundle != null) {
                                        i15 = -1;
                                        i16 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                    } else {
                                        i15 = -1;
                                        i16 = -1;
                                    }
                                    if (bundle != null) {
                                        i17 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i15);
                                        r22 = 0;
                                    } else {
                                        r22 = 0;
                                        i17 = -1;
                                    }
                                    boolean J10 = l10.J(nVar, i16, i17, r22);
                                    if (J10) {
                                        L.D(l10, l10.z(i20), r22, null, 12);
                                    }
                                    return J10;
                                }
                                if (!P.a(nVar)) {
                                    return false;
                                }
                                if (i10 == 1) {
                                    Object g11 = c2046i.g(H0.h.f4488u);
                                    H0.a aVar21 = (H0.a) (g11 == null ? null : g11);
                                    if (aVar21 != null && (aVar2 = (Rb.a) aVar21.f4461b) != null) {
                                        return ((Boolean) aVar2.invoke()).booleanValue();
                                    }
                                } else if (i10 != 2) {
                                    switch (i10) {
                                        case 16:
                                            Object g12 = c2046i.g(H0.h.f4472b);
                                            if (g12 == null) {
                                                g12 = null;
                                            }
                                            H0.a aVar22 = (H0.a) g12;
                                            if (aVar22 == null || (aVar3 = (Rb.a) aVar22.f4461b) == null) {
                                                i18 = 12;
                                                num2 = null;
                                                bool = null;
                                            } else {
                                                bool = (Boolean) aVar3.invoke();
                                                i18 = 12;
                                                num2 = null;
                                            }
                                            L.D(l10, i7, 1, num2, i18);
                                            if (bool != null) {
                                                return bool.booleanValue();
                                            }
                                            break;
                                        case 32:
                                            Object g13 = c2046i.g(H0.h.f4473c);
                                            H0.a aVar23 = (H0.a) (g13 == null ? null : g13);
                                            if (aVar23 != null && (aVar4 = (Rb.a) aVar23.f4461b) != null) {
                                                return ((Boolean) aVar4.invoke()).booleanValue();
                                            }
                                            break;
                                        case 4096:
                                        case 8192:
                                            boolean z13 = i10 == 4096;
                                            boolean z14 = i10 == 8192;
                                            boolean z15 = i10 == 16908345;
                                            boolean z16 = i10 == 16908347;
                                            boolean z17 = i10 == 16908344;
                                            boolean z18 = i10 == 16908346;
                                            boolean z19 = z15 || z16 || z13 || z14;
                                            if (!z17 && !z18 && !z13 && !z14) {
                                                z12 = false;
                                            }
                                            if (z13 || z14) {
                                                Object g14 = c2046i.g(H0.q.f4541c);
                                                if (g14 == null) {
                                                    g14 = null;
                                                }
                                                H0.e eVar2 = (H0.e) g14;
                                                Object g15 = c2046i.g(H0.h.f4477h);
                                                if (g15 == null) {
                                                    g15 = null;
                                                }
                                                H0.a aVar24 = (H0.a) g15;
                                                if (eVar2 != null && aVar24 != null) {
                                                    float f11 = 0.0f / 20;
                                                    if (z14) {
                                                        f11 = -f11;
                                                    }
                                                    Rb.c cVar4 = (Rb.c) aVar24.f4461b;
                                                    if (cVar4 != null) {
                                                        return ((Boolean) cVar4.invoke(Float.valueOf(0.0f + f11))).booleanValue();
                                                    }
                                                    return false;
                                                }
                                            }
                                            long b2 = AbstractC2328M.d((C0031u) nVar.f4504c.f60S.f226c).b();
                                            ArrayList arrayList = new ArrayList();
                                            Object g16 = c2046i.g(H0.h.f4470A);
                                            if (g16 == null) {
                                                g16 = null;
                                            }
                                            H0.a aVar25 = (H0.a) g16;
                                            Float f12 = (aVar25 == null || (cVar = (Rb.c) aVar25.f4461b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                            Object g17 = c2046i.g(H0.h.f4474d);
                                            if (g17 == null) {
                                                g17 = null;
                                            }
                                            H0.a aVar26 = (H0.a) g17;
                                            if (aVar26 == null) {
                                                return false;
                                            }
                                            Object g18 = c2046i.g(H0.q.f4554s);
                                            if (g18 == null) {
                                                g18 = null;
                                            }
                                            H0.g gVar = (H0.g) g18;
                                            Db.c cVar5 = aVar26.f4461b;
                                            if (gVar == null || !z19) {
                                                z10 = z17;
                                            } else {
                                                if (f12 != null) {
                                                    intBitsToFloat = f12.floatValue();
                                                    z10 = z17;
                                                } else {
                                                    z10 = z17;
                                                    intBitsToFloat = Float.intBitsToFloat((int) (b2 >> 32));
                                                }
                                                if (z15 || z14) {
                                                    intBitsToFloat = -intBitsToFloat;
                                                }
                                                if (P.f(nVar) && (z15 || z16)) {
                                                    intBitsToFloat = -intBitsToFloat;
                                                }
                                                if (L.w(gVar, intBitsToFloat)) {
                                                    H0.t tVar = H0.h.f4491x;
                                                    if (c2046i.c(tVar) || c2046i.c(H0.h.f4493z)) {
                                                        if (intBitsToFloat > 0.0f) {
                                                            Object g19 = c2046i.g(H0.h.f4493z);
                                                            aVar7 = (H0.a) (g19 == null ? null : g19);
                                                        } else {
                                                            Object g20 = c2046i.g(tVar);
                                                            aVar7 = (H0.a) (g20 == null ? null : g20);
                                                        }
                                                        if (aVar7 != null && (aVar8 = (Rb.a) aVar7.f4461b) != null) {
                                                            return ((Boolean) aVar8.invoke()).booleanValue();
                                                        }
                                                    } else {
                                                        Rb.e eVar3 = (Rb.e) cVar5;
                                                        if (eVar3 != null) {
                                                            return ((Boolean) eVar3.invoke(Float.valueOf(intBitsToFloat), Float.valueOf(0.0f))).booleanValue();
                                                        }
                                                    }
                                                }
                                            }
                                            Object g21 = c2046i.g(H0.q.f4555t);
                                            if (g21 == null) {
                                                g21 = null;
                                            }
                                            H0.g gVar2 = (H0.g) g21;
                                            if (gVar2 != null && z12) {
                                                float floatValue = f12 != null ? f12.floatValue() : Float.intBitsToFloat((int) (b2 & 4294967295L));
                                                if (z10 || z14) {
                                                    floatValue = -floatValue;
                                                }
                                                if (L.w(gVar2, floatValue)) {
                                                    H0.t tVar2 = H0.h.f4490w;
                                                    if (c2046i.c(tVar2) || c2046i.c(H0.h.f4492y)) {
                                                        if (floatValue > 0.0f) {
                                                            Object g22 = c2046i.g(H0.h.f4492y);
                                                            aVar5 = (H0.a) (g22 == null ? null : g22);
                                                        } else {
                                                            Object g23 = c2046i.g(tVar2);
                                                            aVar5 = (H0.a) (g23 == null ? null : g23);
                                                        }
                                                        if (aVar5 != null && (aVar6 = (Rb.a) aVar5.f4461b) != null) {
                                                            return ((Boolean) aVar6.invoke()).booleanValue();
                                                        }
                                                    } else {
                                                        Rb.e eVar4 = (Rb.e) cVar5;
                                                        if (eVar4 != null) {
                                                            return ((Boolean) eVar4.invoke(Float.valueOf(0.0f), Float.valueOf(floatValue))).booleanValue();
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 32768:
                                            Object g24 = c2046i.g(H0.h.f4484q);
                                            H0.a aVar27 = (H0.a) (g24 == null ? null : g24);
                                            if (aVar27 == null || (aVar9 = (Rb.a) aVar27.f4461b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) aVar9.invoke()).booleanValue();
                                        case 65536:
                                            Object g25 = c2046i.g(H0.h.f4483p);
                                            H0.a aVar28 = (H0.a) (g25 == null ? null : g25);
                                            if (aVar28 == null || (aVar10 = (Rb.a) aVar28.f4461b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) aVar10.invoke()).booleanValue();
                                        case 262144:
                                            Object g26 = c2046i.g(H0.h.f4485r);
                                            H0.a aVar29 = (H0.a) (g26 == null ? null : g26);
                                            if (aVar29 == null || (aVar11 = (Rb.a) aVar29.f4461b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) aVar11.invoke()).booleanValue();
                                        case 524288:
                                            Object g27 = c2046i.g(H0.h.f4486s);
                                            H0.a aVar30 = (H0.a) (g27 == null ? null : g27);
                                            if (aVar30 == null || (aVar12 = (Rb.a) aVar30.f4461b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) aVar12.invoke()).booleanValue();
                                        case 1048576:
                                            Object g28 = c2046i.g(H0.h.f4487t);
                                            H0.a aVar31 = (H0.a) (g28 == null ? null : g28);
                                            if (aVar31 == null || (aVar13 = (Rb.a) aVar31.f4461b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) aVar13.invoke()).booleanValue();
                                        case 2097152:
                                            String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                            Object g29 = c2046i.g(H0.h.j);
                                            H0.a aVar32 = (H0.a) (g29 == null ? null : g29);
                                            if (aVar32 == null || (cVar2 = (Rb.c) aVar32.f4461b) == null) {
                                                return false;
                                            }
                                            if (string == null) {
                                                string = "";
                                            }
                                            return ((Boolean) cVar2.invoke(new C0374d(string))).booleanValue();
                                        case android.R.id.accessibilityActionShowOnScreen:
                                            H0.n j10 = nVar.j();
                                            if (j10 != null) {
                                                Object g30 = j10.f4505d.f4494a.g(H0.h.f4474d);
                                                if (g30 == null) {
                                                    g30 = null;
                                                }
                                                aVar14 = (H0.a) g30;
                                                while (j10 != null && aVar14 == null) {
                                                    j10 = j10.j();
                                                    if (j10 != null) {
                                                        Object g31 = j10.f4505d.f4494a.g(H0.h.f4474d);
                                                        if (g31 == null) {
                                                            g31 = null;
                                                        }
                                                        aVar14 = (H0.a) g31;
                                                    }
                                                }
                                                if (j10 == null) {
                                                    return false;
                                                }
                                                A0.L l11 = j10.f4504c;
                                                i0.c d11 = AbstractC2328M.d((C0031u) l11.f60S.f226c);
                                                InterfaceC2345m e2 = ((C0031u) l11.f60S.f226c).e();
                                                i0.c e10 = d11.e(e2 != null ? ((A0.n0) e2).A(0L) : 0L);
                                                A0.n0 c10 = nVar.c();
                                                if (c10 != null) {
                                                    if (!c10.t0().f14112B) {
                                                        c10 = null;
                                                    }
                                                    if (c10 != null) {
                                                        j = c10.A(0L);
                                                        A0.n0 c11 = nVar.c();
                                                        i0.c b10 = android.support.v4.media.session.b.b(j, AbstractC0672a.u(c11 != null ? c11.f26556c : 0L));
                                                        H0.t tVar3 = H0.q.f4554s;
                                                        C2046I c2046i2 = j10.f4505d.f4494a;
                                                        g2 = c2046i2.g(tVar3);
                                                        if (g2 == null) {
                                                            g2 = null;
                                                        }
                                                        Object g32 = c2046i2.g(H0.q.f4555t);
                                                        f4 = b10.f18174a - e10.f18174a;
                                                        f10 = b10.f18176c - e10.f18176c;
                                                        if (Math.signum(f4) == Math.signum(f10)) {
                                                            f4 = 0.0f;
                                                        } else if (Math.abs(f4) >= Math.abs(f10)) {
                                                            f4 = f10;
                                                        }
                                                        if (P.f(nVar)) {
                                                            f4 = -f4;
                                                        }
                                                        float f13 = b10.f18175b - e10.f18175b;
                                                        float f14 = b10.f18177d - e10.f18177d;
                                                        float f15 = Math.signum(f13) == Math.signum(f14) ? Math.abs(f13) < Math.abs(f14) ? f13 : f14 : 0.0f;
                                                        if (aVar14 == null && (eVar = (Rb.e) aVar14.f4461b) != null) {
                                                            return ((Boolean) eVar.invoke(Float.valueOf(f4), Float.valueOf(f15))).booleanValue();
                                                        }
                                                    }
                                                }
                                                j = 0;
                                                A0.n0 c112 = nVar.c();
                                                i0.c b102 = android.support.v4.media.session.b.b(j, AbstractC0672a.u(c112 != null ? c112.f26556c : 0L));
                                                H0.t tVar32 = H0.q.f4554s;
                                                C2046I c2046i22 = j10.f4505d.f4494a;
                                                g2 = c2046i22.g(tVar32);
                                                if (g2 == null) {
                                                }
                                                Object g322 = c2046i22.g(H0.q.f4555t);
                                                f4 = b102.f18174a - e10.f18174a;
                                                f10 = b102.f18176c - e10.f18176c;
                                                if (Math.signum(f4) == Math.signum(f10)) {
                                                }
                                                if (P.f(nVar)) {
                                                }
                                                float f132 = b102.f18175b - e10.f18175b;
                                                float f142 = b102.f18177d - e10.f18177d;
                                                if (Math.signum(f132) == Math.signum(f142)) {
                                                }
                                                return aVar14 == null ? false : false;
                                            }
                                            aVar14 = null;
                                            break;
                                        case android.R.id.accessibilityActionSetProgress:
                                            if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                                return false;
                                            }
                                            Object g33 = c2046i.g(H0.h.f4477h);
                                            H0.a aVar33 = (H0.a) (g33 == null ? null : g33);
                                            if (aVar33 == null || (cVar3 = (Rb.c) aVar33.f4461b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) cVar3.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                        case android.R.id.accessibilityActionImeEnter:
                                            Object g34 = c2046i.g(H0.h.f4481n);
                                            H0.a aVar34 = (H0.a) (g34 == null ? null : g34);
                                            if (aVar34 == null || (aVar15 = (Rb.a) aVar34.f4461b) == null) {
                                                return false;
                                            }
                                            return ((Boolean) aVar15.invoke()).booleanValue();
                                        default:
                                            switch (i10) {
                                                case android.R.id.accessibilityActionScrollUp:
                                                case android.R.id.accessibilityActionScrollLeft:
                                                case android.R.id.accessibilityActionScrollDown:
                                                case android.R.id.accessibilityActionScrollRight:
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case android.R.id.accessibilityActionPageUp:
                                                            Object g35 = c2046i.g(H0.h.f4490w);
                                                            H0.a aVar35 = (H0.a) (g35 == null ? null : g35);
                                                            if (aVar35 == null || (aVar16 = (Rb.a) aVar35.f4461b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) aVar16.invoke()).booleanValue();
                                                        case android.R.id.accessibilityActionPageDown:
                                                            Object g36 = c2046i.g(H0.h.f4492y);
                                                            H0.a aVar36 = (H0.a) (g36 == null ? null : g36);
                                                            if (aVar36 == null || (aVar17 = (Rb.a) aVar36.f4461b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) aVar17.invoke()).booleanValue();
                                                        case android.R.id.accessibilityActionPageLeft:
                                                            Object g37 = c2046i.g(H0.h.f4491x);
                                                            H0.a aVar37 = (H0.a) (g37 == null ? null : g37);
                                                            if (aVar37 == null || (aVar18 = (Rb.a) aVar37.f4461b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) aVar18.invoke()).booleanValue();
                                                        case android.R.id.accessibilityActionPageRight:
                                                            Object g38 = c2046i.g(H0.h.f4493z);
                                                            H0.a aVar38 = (H0.a) (g38 == null ? null : g38);
                                                            if (aVar38 == null || (aVar19 = (Rb.a) aVar38.f4461b) == null) {
                                                                return false;
                                                            }
                                                            return ((Boolean) aVar19.invoke()).booleanValue();
                                                        default:
                                                            u.U u3 = (u.U) l10.f1742u.c(i7);
                                                            if (u3 == null || ((CharSequence) u3.c(i10)) == null) {
                                                                return false;
                                                            }
                                                            Object g39 = c2046i.g(H0.h.f4489v);
                                                            List list = (List) (g39 == null ? null : g39);
                                                            if (list == null || list.size() <= 0) {
                                                                return false;
                                                            }
                                                            list.get(0).getClass();
                                                            throw new ClassCastException();
                                                    }
                                            }
                                    }
                                } else {
                                    Object g40 = c2046i.g(H0.q.k);
                                    if (kotlin.jvm.internal.l.a(g40 == null ? null : g40, Boolean.TRUE)) {
                                        ((C1221h) d10.getFocusOwner()).b(8, false, true);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (bundle != null) {
                            int i21 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                            boolean z20 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                            boolean z21 = i10 == 256;
                            Integer num3 = l10.f1745x;
                            if (num3 == null || i20 != num3.intValue()) {
                                l10.f1744w = -1;
                                l10.f1745x = Integer.valueOf(i20);
                            }
                            String t5 = L.t(nVar);
                            if (t5 != null && t5.length() != 0) {
                                String t10 = L.t(nVar);
                                if (t10 != null && t10.length() != 0) {
                                    if (i21 == 1) {
                                        Locale locale = d10.getContext().getResources().getConfiguration().locale;
                                        if (C0171d.f1870e == null) {
                                            C0171d c0171d = new C0171d(0);
                                            c0171d.f1873d = BreakIterator.getCharacterInstance(locale);
                                            C0171d.f1870e = c0171d;
                                        }
                                        C0171d c0171d2 = C0171d.f1870e;
                                        kotlin.jvm.internal.l.c(c0171d2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                        c0171d2.o(t10);
                                        abstractC0169c = c0171d2;
                                    } else if (i21 != 2) {
                                        if (i21 != 4) {
                                            if (i21 != 8) {
                                                break;
                                            } else {
                                                if (C0177g.f1906c == null) {
                                                    C0177g.f1906c = new AbstractC0169c();
                                                }
                                                C0177g c0177g = C0177g.f1906c;
                                                kotlin.jvm.internal.l.c(c0177g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                                c0177g.f1861a = t10;
                                                abstractC0169c = c0177g;
                                            }
                                        }
                                        if (c2046i.c(H0.h.f4471a) && (g = X.g(iVar)) != null) {
                                            if (i21 == 4) {
                                                if (C0173e.f1876d == null) {
                                                    C0173e.f1876d = new AbstractC0169c();
                                                }
                                                C0173e c0173e = C0173e.f1876d;
                                                kotlin.jvm.internal.l.c(c0173e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                                c0173e.f1861a = t10;
                                                c0173e.f1879c = g;
                                                c0175f = c0173e;
                                            } else {
                                                if (C0175f.f1881e == null) {
                                                    ?? abstractC0169c2 = new AbstractC0169c();
                                                    new Rect();
                                                    C0175f.f1881e = abstractC0169c2;
                                                }
                                                C0175f c0175f2 = C0175f.f1881e;
                                                kotlin.jvm.internal.l.c(c0175f2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                                c0175f2.f1861a = t10;
                                                c0175f2.f1884c = g;
                                                c0175f2.f1885d = nVar;
                                                c0175f = c0175f2;
                                            }
                                            abstractC0169c = c0175f;
                                        }
                                    } else {
                                        Locale locale2 = d10.getContext().getResources().getConfiguration().locale;
                                        if (C0171d.f1871f == null) {
                                            C0171d c0171d3 = new C0171d(1);
                                            c0171d3.f1873d = BreakIterator.getWordInstance(locale2);
                                            C0171d.f1871f = c0171d3;
                                        }
                                        C0171d c0171d4 = C0171d.f1871f;
                                        kotlin.jvm.internal.l.c(c0171d4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                        c0171d4.o(t10);
                                        abstractC0169c = c0171d4;
                                    }
                                    if (abstractC0169c != null) {
                                        int q10 = l10.q(nVar);
                                        if (q10 == -1) {
                                            q10 = z21 ? 0 : t5.length();
                                        }
                                        int[] e11 = z21 ? abstractC0169c.e(q10) : abstractC0169c.l(q10);
                                        if (e11 != null) {
                                            int i22 = e11[0];
                                            int i23 = e11[1];
                                            if (z20 && !c2046i.c(H0.q.f4539a) && c2046i.c(H0.q.f4530C)) {
                                                i13 = l10.r(nVar);
                                                if (i13 == -1) {
                                                    i13 = z21 ? i22 : i23;
                                                }
                                                i14 = z21 ? i23 : i22;
                                            } else {
                                                i13 = z21 ? i23 : i22;
                                                i14 = i13;
                                            }
                                            l10.f1715B = new I(nVar, z21 ? 256 : 512, i21, i22, i23, SystemClock.uptimeMillis());
                                            l10.J(nVar, i13, i14, true);
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                                abstractC0169c = null;
                                if (abstractC0169c != null) {
                                }
                                return false;
                            }
                        }
                        z8 = false;
                    } else {
                        z8 = false;
                        if (l10.f1735n == i7) {
                            l10.f1735n = Integer.MIN_VALUE;
                            l10.f1737p = null;
                            d10.invalidate();
                            L.D(l10, i7, 65536, null, 12);
                            return true;
                        }
                    }
                }
                return z8;
            default:
                I1.a aVar39 = (I1.a) c2354b;
                Chip chip = aVar39.f4974i;
                if (i7 == -1) {
                    WeakHashMap weakHashMap = y1.K.f26642a;
                    return chip.performAccessibilityAction(i10, bundle);
                }
                if (i10 == 1) {
                    return aVar39.p(i7);
                }
                if (i10 == 2) {
                    return aVar39.j(i7);
                }
                if (i10 == 64) {
                    AccessibilityManager accessibilityManager2 = aVar39.f4973h;
                    if (!accessibilityManager2.isEnabled() || !accessibilityManager2.isTouchExplorationEnabled() || (i19 = aVar39.k) == i7) {
                        return false;
                    }
                    if (i19 != Integer.MIN_VALUE) {
                        aVar39.k = Integer.MIN_VALUE;
                        aVar39.f4974i.invalidate();
                        aVar39.q(i19, 65536);
                    }
                    aVar39.k = i7;
                    chip.invalidate();
                    aVar39.q(i7, 32768);
                } else {
                    if (i10 != 128) {
                        C1628d c1628d = (C1628d) aVar39;
                        if (i10 != 16) {
                            return false;
                        }
                        Chip chip2 = c1628d.f20691q;
                        if (i7 == 0) {
                            return chip2.performClick();
                        }
                        if (i7 != 1) {
                            return false;
                        }
                        chip2.playSoundEffect(0);
                        View.OnClickListener onClickListener = chip2.f15280v;
                        if (onClickListener != null) {
                            onClickListener.onClick(chip2);
                            z11 = true;
                        }
                        if (!chip2.f15273H) {
                            return z11;
                        }
                        chip2.f15272G.q(1, 1);
                        return z11;
                    }
                    if (aVar39.k != i7) {
                        return false;
                    }
                    aVar39.k = Integer.MIN_VALUE;
                    chip.invalidate();
                    aVar39.q(i7, 65536);
                }
                return true;
        }
    }
}
