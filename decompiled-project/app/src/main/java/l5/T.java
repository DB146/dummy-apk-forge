package l5;

import N6.y0;
import a5.C0776b;
import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.webkit.WebView;
import android.widget.FrameLayout;
import e5.C1092a;
import e5.C1094c;
import e5.C1095d;
import ea.C1112g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class T extends FrameLayout implements L {

    /* renamed from: a, reason: collision with root package name */
    public final C1488b f19405a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f19406b;

    /* renamed from: c, reason: collision with root package name */
    public List f19407c;

    /* renamed from: d, reason: collision with root package name */
    public C1489c f19408d;

    /* renamed from: e, reason: collision with root package name */
    public float f19409e;

    /* renamed from: f, reason: collision with root package name */
    public float f19410f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.webkit.WebView, l5.Q] */
    public T(Context context) {
        super(context, null);
        this.f19407c = Collections.emptyList();
        this.f19408d = C1489c.g;
        this.f19409e = 0.0533f;
        this.f19410f = 0.08f;
        C1488b c1488b = new C1488b(context);
        this.f19405a = c1488b;
        ?? webView = new WebView(context, null);
        this.f19406b = webView;
        webView.setBackgroundColor(0);
        addView(c1488b);
        addView(webView);
    }

    @Override // l5.L
    public final void a(List list, C1489c c1489c, float f4, float f10) {
        this.f19408d = c1489c;
        this.f19409e = f4;
        this.f19410f = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            C0776b c0776b = (C0776b) list.get(i7);
            if (c0776b.f12734d != null) {
                arrayList.add(c0776b);
            } else {
                arrayList2.add(c0776b);
            }
        }
        if (!this.f19407c.isEmpty() || !arrayList2.isEmpty()) {
            this.f19407c = arrayList2;
            c();
        }
        this.f19405a.a(arrayList, c1489c, f4, f10);
        invalidate();
    }

    public final String b(int i7, float f4) {
        float a02 = com.bumptech.glide.c.a0(f4, i7, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (a02 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(a02 / getContext().getResources().getDisplayMetrics().density)};
        int i10 = n5.D.f21141a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x01f7, code lost:
    
        if (r2 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x01f9, code lost:
    
        r1 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x01fc, code lost:
    
        r1 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0203, code lost:
    
        if (r2 != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String format;
        String format2;
        boolean z8;
        String str;
        int i7;
        String str2;
        String str3;
        String str4;
        Object obj;
        Object obj2;
        CharSequence charSequence;
        String str5;
        String str6;
        StringBuilder sb2;
        C0776b c0776b;
        int i10;
        String str7;
        String str8;
        String str9;
        char c10;
        C1112g c1112g;
        Object[] objArr;
        String str10;
        int i11;
        float f4;
        String str11;
        int i12;
        String format3;
        String str12;
        float f10;
        String str13;
        Layout.Alignment alignment;
        int i13;
        String str14;
        T t5 = this;
        int i14 = 1;
        StringBuilder sb3 = new StringBuilder();
        String G9 = android.support.v4.media.session.b.G(t5.f19408d.f19416a);
        int i15 = 0;
        String b2 = t5.b(0, t5.f19409e);
        Float valueOf = Float.valueOf(1.2f);
        C1489c c1489c = t5.f19408d;
        int i16 = c1489c.f19419d;
        int i17 = 2;
        int i18 = c1489c.f19420e;
        if (i16 == 1) {
            Object[] objArr2 = {android.support.v4.media.session.b.G(i18)};
            int i19 = n5.D.f21141a;
            format = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i16 == 2) {
            String G10 = android.support.v4.media.session.b.G(i18);
            int i20 = n5.D.f21141a;
            Locale locale = Locale.US;
            format = "0.1em 0.12em 0.15em ".concat(G10);
        } else if (i16 == 3) {
            String G11 = android.support.v4.media.session.b.G(i18);
            int i21 = n5.D.f21141a;
            Locale locale2 = Locale.US;
            format = "0.06em 0.08em 0.15em ".concat(G11);
        } else if (i16 != 4) {
            format = "unset";
        } else {
            String G12 = android.support.v4.media.session.b.G(i18);
            int i22 = n5.D.f21141a;
            Locale locale3 = Locale.US;
            format = "-0.05em -0.05em 0.15em ".concat(G12);
        }
        Object[] objArr3 = {G9, b2, valueOf, format};
        int i23 = n5.D.f21141a;
        sb3.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap hashMap = new HashMap();
        String G13 = android.support.v4.media.session.b.G(t5.f19408d.f19417b);
        String str15 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(G13);
        String str16 = ";";
        sb4.append(";");
        hashMap.put(".default_bg,.default_bg *", sb4.toString());
        int i24 = 0;
        while (i24 < t5.f19407c.size()) {
            C0776b c0776b2 = (C0776b) t5.f19407c.get(i24);
            float f11 = c0776b2.f12738v;
            float f12 = f11 != -3.4028235E38f ? f11 * 100.0f : 50.0f;
            int i25 = -100;
            int i26 = c0776b2.f12739w;
            int i27 = i26 != i14 ? i26 != i17 ? i15 : -100 : -50;
            float f13 = c0776b2.f12735e;
            int i28 = c0776b2.f12729D;
            if (f13 == -3.4028235E38f) {
                format2 = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - t5.f19410f) * 100.0f));
                z8 = false;
            } else if (c0776b2.f12736f != i14) {
                String format4 = String.format(Locale.US, "%.2f%%", Float.valueOf(f13 * 100.0f));
                int i29 = c0776b2.f12737u;
                i25 = i28 == i14 ? -(i29 != i14 ? i29 != i17 ? 0 : -100 : -50) : i29 != i14 ? i29 != i17 ? 0 : -100 : -50;
                format2 = format4;
                z8 = false;
            } else {
                if (f13 >= 0.0f) {
                    format2 = String.format(Locale.US, "%.2fem", Float.valueOf(f13 * 1.2f));
                    z8 = false;
                } else {
                    format2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f13) - 1.0f) * 1.2f));
                    z8 = true;
                }
                i25 = 0;
            }
            float f14 = c0776b2.f12740x;
            String format5 = f14 != -3.4028235E38f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f14 * 100.0f)) : "fit-content";
            Layout.Alignment alignment2 = c0776b2.f12732b;
            if (alignment2 == null) {
                str = "start";
                str2 = "center";
                i7 = 2;
            } else {
                int i30 = S.f19404a[alignment2.ordinal()];
                str = "start";
                if (i30 != 1) {
                    i7 = 2;
                    str2 = i30 != 2 ? "center" : "end";
                } else {
                    i7 = 2;
                    str2 = str;
                }
            }
            String str17 = i28 != 1 ? i28 != i7 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
            String b10 = t5.b(c0776b2.f12727B, c0776b2.f12728C);
            String G14 = android.support.v4.media.session.b.G(c0776b2.f12742z ? c0776b2.f12726A : t5.f19408d.f19418c);
            if (i28 != 1) {
                if (i28 != 2) {
                    str4 = z8 ? "bottom" : "top";
                    obj = "left";
                    if (i28 != 2 || i28 == 1) {
                        obj2 = "height";
                        int i31 = i25;
                        i25 = i27;
                        i27 = i31;
                    } else {
                        obj2 = "width";
                    }
                    float f15 = getContext().getResources().getDisplayMetrics().density;
                    Pattern pattern = AbstractC1501o.f19533a;
                    y0 y0Var = y0.f7368u;
                    String str18 = ";'>";
                    charSequence = c0776b2.f12731a;
                    if (charSequence != null) {
                        c1112g = new C1112g(5, "", y0Var);
                        sb2 = sb3;
                        str7 = str16;
                        str8 = ";'>";
                        str6 = "</span>";
                        str9 = str15;
                        c0776b = c0776b2;
                        str5 = "";
                    } else {
                        str5 = "";
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned) charSequence;
                            HashSet hashSet = new HashSet();
                            str6 = "</span>";
                            sb2 = sb3;
                            BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                            int i32 = 0;
                            for (int length = backgroundColorSpanArr.length; i32 < length; length = length) {
                                hashSet.add(Integer.valueOf(backgroundColorSpanArr[i32].getBackgroundColor()));
                                i32++;
                            }
                            HashMap hashMap2 = new HashMap();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                int intValue = ((Integer) it.next()).intValue();
                                String l10 = h3.o.l(intValue, "bg_");
                                Iterator it2 = it;
                                C0776b c0776b3 = c0776b2;
                                String n6 = h3.o.n(".", l10, ",.", l10, " *");
                                String G15 = android.support.v4.media.session.b.G(intValue);
                                int i33 = n5.D.f21141a;
                                Locale locale4 = Locale.US;
                                hashMap2.put(n6, str15 + G15 + str16);
                                it = it2;
                                i28 = i28;
                                c0776b2 = c0776b3;
                            }
                            c0776b = c0776b2;
                            i10 = i28;
                            SparseArray sparseArray = new SparseArray();
                            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                            int length2 = spans.length;
                            int i34 = 0;
                            while (i34 < length2) {
                                Object obj3 = spans[i34];
                                String str19 = str16;
                                boolean z10 = obj3 instanceof StrikethroughSpan;
                                if (z10) {
                                    f4 = f15;
                                    str11 = str18;
                                    str10 = str15;
                                    i11 = length2;
                                    objArr = spans;
                                    format3 = "<span style='text-decoration:line-through;'>";
                                } else {
                                    objArr = spans;
                                    if (obj3 instanceof ForegroundColorSpan) {
                                        String G16 = android.support.v4.media.session.b.G(((ForegroundColorSpan) obj3).getForegroundColor());
                                        int i35 = n5.D.f21141a;
                                        Locale locale5 = Locale.US;
                                        str10 = str15;
                                        format3 = y.S.b("<span style='color:", G16, str18);
                                        f4 = f15;
                                        str11 = str18;
                                        i11 = length2;
                                    } else {
                                        str10 = str15;
                                        if (obj3 instanceof BackgroundColorSpan) {
                                            int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                            int i36 = n5.D.f21141a;
                                            Locale locale6 = Locale.US;
                                            i11 = length2;
                                            format3 = A3.c.f(backgroundColor, "<span class='bg_", "'>");
                                        } else {
                                            i11 = length2;
                                            if (obj3 instanceof C1092a) {
                                                format3 = "<span style='text-combine-upright:all;'>";
                                            } else if (obj3 instanceof AbsoluteSizeSpan) {
                                                Object[] objArr4 = {Float.valueOf(((AbsoluteSizeSpan) obj3).getDip() ? r7.getSize() : r7.getSize() / f15)};
                                                int i37 = n5.D.f21141a;
                                                format3 = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                            } else if (obj3 instanceof RelativeSizeSpan) {
                                                Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                                int i38 = n5.D.f21141a;
                                                format3 = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                            } else if (obj3 instanceof TypefaceSpan) {
                                                String family = ((TypefaceSpan) obj3).getFamily();
                                                if (family != null) {
                                                    int i39 = n5.D.f21141a;
                                                    Locale locale7 = Locale.US;
                                                    format3 = y.S.b("<span style='font-family:\"", family, "\";'>");
                                                } else {
                                                    format3 = null;
                                                }
                                            } else if (obj3 instanceof StyleSpan) {
                                                int style = ((StyleSpan) obj3).getStyle();
                                                if (style == 1) {
                                                    format3 = "<b>";
                                                } else if (style != 2) {
                                                    if (style == 3) {
                                                        format3 = "<b><i>";
                                                    }
                                                    f4 = f15;
                                                    str11 = str18;
                                                    format3 = null;
                                                } else {
                                                    format3 = "<i>";
                                                }
                                            } else if (obj3 instanceof C1094c) {
                                                int i40 = ((C1094c) obj3).f16801b;
                                                if (i40 == -1) {
                                                    format3 = "<ruby style='ruby-position:unset;'>";
                                                } else if (i40 != 1) {
                                                    if (i40 == 2) {
                                                        format3 = "<ruby style='ruby-position:under;'>";
                                                    }
                                                    f4 = f15;
                                                    str11 = str18;
                                                    format3 = null;
                                                } else {
                                                    format3 = "<ruby style='ruby-position:over;'>";
                                                }
                                            } else if (obj3 instanceof UnderlineSpan) {
                                                format3 = "<u>";
                                            } else {
                                                if (obj3 instanceof C1095d) {
                                                    C1095d c1095d = (C1095d) obj3;
                                                    int i41 = c1095d.f16802a;
                                                    StringBuilder sb5 = new StringBuilder();
                                                    f4 = f15;
                                                    int i42 = c1095d.f16803b;
                                                    str11 = str18;
                                                    if (i42 != 1) {
                                                        i12 = 2;
                                                        if (i42 == 2) {
                                                            sb5.append("open ");
                                                        }
                                                    } else {
                                                        i12 = 2;
                                                        sb5.append("filled ");
                                                    }
                                                    if (i41 == 0) {
                                                        sb5.append("none");
                                                    } else if (i41 == 1) {
                                                        sb5.append("circle");
                                                    } else if (i41 == i12) {
                                                        sb5.append("dot");
                                                    } else if (i41 != 3) {
                                                        sb5.append("unset");
                                                    } else {
                                                        sb5.append("sesame");
                                                    }
                                                    Object[] objArr6 = {sb5.toString(), c1095d.f16804c != 2 ? "over right" : "under left"};
                                                    int i43 = n5.D.f21141a;
                                                    format3 = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                                }
                                                f4 = f15;
                                                str11 = str18;
                                                format3 = null;
                                            }
                                        }
                                        f4 = f15;
                                        str11 = str18;
                                    }
                                }
                                if (z10 || (obj3 instanceof ForegroundColorSpan) || (obj3 instanceof BackgroundColorSpan) || (obj3 instanceof C1092a) || (obj3 instanceof AbsoluteSizeSpan) || (obj3 instanceof RelativeSizeSpan) || (obj3 instanceof C1095d)) {
                                    str12 = str6;
                                } else if (obj3 instanceof TypefaceSpan) {
                                    str12 = ((TypefaceSpan) obj3).getFamily() != null ? str6 : null;
                                } else {
                                    if (obj3 instanceof StyleSpan) {
                                        int style2 = ((StyleSpan) obj3).getStyle();
                                        if (style2 == 1) {
                                            r25 = "</b>";
                                        } else if (style2 == 2) {
                                            r25 = "</i>";
                                        } else if (style2 == 3) {
                                            r25 = "</i></b>";
                                        }
                                    } else if (obj3 instanceof C1094c) {
                                        r25 = "<rt>" + AbstractC1501o.a(((C1094c) obj3).f16800a) + "</rt></ruby>";
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        r25 = "</u>";
                                    }
                                    str12 = r25;
                                }
                                int spanStart = spanned.getSpanStart(obj3);
                                int spanEnd = spanned.getSpanEnd(obj3);
                                if (format3 != null) {
                                    str12.getClass();
                                    C1499m c1499m = new C1499m(spanStart, spanEnd, format3, str12);
                                    C1500n c1500n = (C1500n) sparseArray.get(spanStart);
                                    if (c1500n == null) {
                                        c1500n = new C1500n();
                                        sparseArray.put(spanStart, c1500n);
                                    }
                                    c1500n.f19531a.add(c1499m);
                                    C1500n c1500n2 = (C1500n) sparseArray.get(spanEnd);
                                    if (c1500n2 == null) {
                                        c1500n2 = new C1500n();
                                        sparseArray.put(spanEnd, c1500n2);
                                    }
                                    c1500n2.f19532b.add(c1499m);
                                }
                                i34++;
                                spans = objArr;
                                length2 = i11;
                                str16 = str19;
                                str15 = str10;
                                f15 = f4;
                                str18 = str11;
                            }
                            str7 = str16;
                            str8 = str18;
                            str9 = str15;
                            c10 = 3;
                            StringBuilder sb6 = new StringBuilder(spanned.length());
                            int i44 = 0;
                            int i45 = 0;
                            while (i44 < sparseArray.size()) {
                                int keyAt = sparseArray.keyAt(i44);
                                sb6.append(AbstractC1501o.a(spanned.subSequence(i45, keyAt)));
                                C1500n c1500n3 = (C1500n) sparseArray.get(keyAt);
                                Collections.sort(c1500n3.f19532b, C1499m.f19526f);
                                Iterator it3 = c1500n3.f19532b.iterator();
                                while (it3.hasNext()) {
                                    sb6.append(((C1499m) it3.next()).f19530d);
                                }
                                ArrayList arrayList = c1500n3.f19531a;
                                Collections.sort(arrayList, C1499m.f19525e);
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    sb6.append(((C1499m) it4.next()).f19529c);
                                }
                                i44++;
                                i45 = keyAt;
                            }
                            sb6.append(AbstractC1501o.a(spanned.subSequence(i45, spanned.length())));
                            c1112g = new C1112g(5, sb6.toString(), hashMap2);
                            for (String str20 : hashMap.keySet()) {
                                String str21 = (String) hashMap.put(str20, (String) hashMap.get(str20));
                                AbstractC1705a.m(str21 == null || str21.equals(hashMap.get(str20)));
                            }
                            Integer valueOf2 = Integer.valueOf(i24);
                            Float valueOf3 = Float.valueOf(f12);
                            Integer valueOf4 = Integer.valueOf(i27);
                            Integer valueOf5 = Integer.valueOf(i25);
                            C0776b c0776b4 = c0776b;
                            f10 = c0776b4.f12730E;
                            if (f10 != 0.0f) {
                                int i46 = i10;
                                Object[] objArr7 = {(i46 == 2 || i46 == 1) ? "skewY" : "skewX", Float.valueOf(f10)};
                                int i47 = n5.D.f21141a;
                                str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                            } else {
                                str13 = str5;
                            }
                            String format6 = String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf2, obj, valueOf3, str4, format2, obj2, format5, str2, str17, b10, G14, valueOf4, valueOf5, str13);
                            sb3 = sb2;
                            sb3.append(format6);
                            sb3.append("<span class='default_bg'>");
                            String str22 = (String) c1112g.f16840b;
                            alignment = c0776b4.f12733c;
                            if (alignment != null) {
                                int i48 = S.f19404a[alignment.ordinal()];
                                if (i48 != 1) {
                                    i13 = 2;
                                    str14 = i48 != 2 ? "center" : "end";
                                } else {
                                    i13 = 2;
                                    str14 = str;
                                }
                                sb3.append("<span style='display:inline-block; text-align:" + str14 + str8);
                                sb3.append(str22);
                                sb3.append(str6);
                            } else {
                                i13 = 2;
                                sb3.append(str22);
                            }
                            sb3.append("</span></div>");
                            i24++;
                            i14 = 1;
                            i17 = i13;
                            str16 = str7;
                            str15 = str9;
                            i15 = 0;
                            t5 = this;
                        } else {
                            c1112g = new C1112g(5, AbstractC1501o.a(charSequence), y0Var);
                            sb2 = sb3;
                            str7 = str16;
                            str8 = ";'>";
                            str6 = "</span>";
                            str9 = str15;
                            c0776b = c0776b2;
                        }
                    }
                    i10 = i28;
                    c10 = 3;
                    while (r1.hasNext()) {
                    }
                    Integer valueOf22 = Integer.valueOf(i24);
                    Float valueOf32 = Float.valueOf(f12);
                    Integer valueOf42 = Integer.valueOf(i27);
                    Integer valueOf52 = Integer.valueOf(i25);
                    C0776b c0776b42 = c0776b;
                    f10 = c0776b42.f12730E;
                    if (f10 != 0.0f) {
                    }
                    String format62 = String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf22, obj, valueOf32, str4, format2, obj2, format5, str2, str17, b10, G14, valueOf42, valueOf52, str13);
                    sb3 = sb2;
                    sb3.append(format62);
                    sb3.append("<span class='default_bg'>");
                    String str222 = (String) c1112g.f16840b;
                    alignment = c0776b42.f12733c;
                    if (alignment != null) {
                    }
                    sb3.append("</span></div>");
                    i24++;
                    i14 = 1;
                    i17 = i13;
                    str16 = str7;
                    str15 = str9;
                    i15 = 0;
                    t5 = this;
                }
            }
            str4 = str3;
            obj = "top";
            if (i28 != 2) {
            }
            obj2 = "height";
            int i312 = i25;
            i25 = i27;
            i27 = i312;
            float f152 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = AbstractC1501o.f19533a;
            y0 y0Var2 = y0.f7368u;
            String str182 = ";'>";
            charSequence = c0776b2.f12731a;
            if (charSequence != null) {
            }
            i10 = i28;
            c10 = 3;
            while (r1.hasNext()) {
            }
            Integer valueOf222 = Integer.valueOf(i24);
            Float valueOf322 = Float.valueOf(f12);
            Integer valueOf422 = Integer.valueOf(i27);
            Integer valueOf522 = Integer.valueOf(i25);
            C0776b c0776b422 = c0776b;
            f10 = c0776b422.f12730E;
            if (f10 != 0.0f) {
            }
            String format622 = String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", valueOf222, obj, valueOf322, str4, format2, obj2, format5, str2, str17, b10, G14, valueOf422, valueOf522, str13);
            sb3 = sb2;
            sb3.append(format622);
            sb3.append("<span class='default_bg'>");
            String str2222 = (String) c1112g.f16840b;
            alignment = c0776b422.f12733c;
            if (alignment != null) {
            }
            sb3.append("</span></div>");
            i24++;
            i14 = 1;
            i17 = i13;
            str16 = str7;
            str15 = str9;
            i15 = 0;
            t5 = this;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb7 = new StringBuilder("<html><head><style>");
        for (String str23 : hashMap.keySet()) {
            sb7.append(str23);
            sb7.append("{");
            sb7.append((String) hashMap.get(str23));
            sb7.append("}");
        }
        sb7.append("</style></head>");
        sb3.insert(0, sb7.toString());
        this.f19406b.loadData(Base64.encodeToString(sb3.toString().getBytes(M6.e.f6799c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        if (!z8 || this.f19407c.isEmpty()) {
            return;
        }
        c();
    }
}
