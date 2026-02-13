package f6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import s6.o;

/* renamed from: f6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1141c {

    /* renamed from: a, reason: collision with root package name */
    public final C1140b f17008a;

    /* renamed from: b, reason: collision with root package name */
    public final C1140b f17009b = new C1140b();

    /* renamed from: c, reason: collision with root package name */
    public final float f17010c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17011d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17012e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17013f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17014h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17015i;
    public final int j;
    public final int k;

    public C1141c(Context context) {
        AttributeSet attributeSet;
        int i7;
        int next;
        C1140b c1140b = new C1140b();
        int i10 = c1140b.f16996a;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                i7 = asAttributeSet.getStyleAttribute();
                attributeSet = asAttributeSet;
            } catch (IOException | XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i7 = 0;
        }
        TypedArray g = o.g(context, attributeSet, AbstractC0911a.f14402a, R.attr.badgeStyle, i7 == 0 ? 2132083957 : i7, new int[0]);
        Resources resources = context.getResources();
        this.f17010c = g.getDimensionPixelSize(4, -1);
        this.f17015i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f17011d = g.getDimensionPixelSize(14, -1);
        this.f17012e = g.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.g = g.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f17013f = g.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f17014h = g.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = g.getInt(24, 1);
        C1140b c1140b2 = this.f17009b;
        int i11 = c1140b.f17004w;
        c1140b2.f17004w = i11 == -2 ? 255 : i11;
        int i12 = c1140b.f17006y;
        if (i12 != -2) {
            c1140b2.f17006y = i12;
        } else if (g.hasValue(23)) {
            this.f17009b.f17006y = g.getInt(23, 0);
        } else {
            this.f17009b.f17006y = -1;
        }
        String str = c1140b.f17005x;
        if (str != null) {
            this.f17009b.f17005x = str;
        } else if (g.hasValue(7)) {
            this.f17009b.f17005x = g.getString(7);
        }
        C1140b c1140b3 = this.f17009b;
        c1140b3.f16981C = c1140b.f16981C;
        CharSequence charSequence = c1140b.f16982D;
        c1140b3.f16982D = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C1140b c1140b4 = this.f17009b;
        int i13 = c1140b.f16983E;
        c1140b4.f16983E = i13 == 0 ? R.plurals.mtrl_badge_content_description : i13;
        int i14 = c1140b.f16984F;
        c1140b4.f16984F = i14 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i14;
        Boolean bool = c1140b.f16986H;
        c1140b4.f16986H = Boolean.valueOf(bool == null || bool.booleanValue());
        C1140b c1140b5 = this.f17009b;
        int i15 = c1140b.f17007z;
        c1140b5.f17007z = i15 == -2 ? g.getInt(21, -2) : i15;
        C1140b c1140b6 = this.f17009b;
        int i16 = c1140b.f16979A;
        c1140b6.f16979A = i16 == -2 ? g.getInt(22, -2) : i16;
        C1140b c1140b7 = this.f17009b;
        Integer num = c1140b.f17000e;
        c1140b7.f17000e = Integer.valueOf(num == null ? g.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C1140b c1140b8 = this.f17009b;
        Integer num2 = c1140b.f17001f;
        c1140b8.f17001f = Integer.valueOf(num2 == null ? g.getResourceId(6, 0) : num2.intValue());
        C1140b c1140b9 = this.f17009b;
        Integer num3 = c1140b.f17002u;
        c1140b9.f17002u = Integer.valueOf(num3 == null ? g.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C1140b c1140b10 = this.f17009b;
        Integer num4 = c1140b.f17003v;
        c1140b10.f17003v = Integer.valueOf(num4 == null ? g.getResourceId(16, 0) : num4.intValue());
        C1140b c1140b11 = this.f17009b;
        Integer num5 = c1140b.f16997b;
        c1140b11.f16997b = Integer.valueOf(num5 == null ? Tb.a.n(context, g, 1).getDefaultColor() : num5.intValue());
        C1140b c1140b12 = this.f17009b;
        Integer num6 = c1140b.f16999d;
        c1140b12.f16999d = Integer.valueOf(num6 == null ? g.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c1140b.f16998c;
        if (num7 != null) {
            this.f17009b.f16998c = num7;
        } else if (g.hasValue(9)) {
            this.f17009b.f16998c = Integer.valueOf(Tb.a.n(context, g, 9).getDefaultColor());
        } else {
            int intValue = this.f17009b.f16999d.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, AbstractC0911a.f14398E);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList n6 = Tb.a.n(context, obtainStyledAttributes, 3);
            Tb.a.n(context, obtainStyledAttributes, 4);
            Tb.a.n(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i17 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i17, 0);
            obtainStyledAttributes.getString(i17);
            obtainStyledAttributes.getBoolean(14, false);
            Tb.a.n(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, AbstractC0911a.f14418t);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f17009b.f16998c = Integer.valueOf(n6.getDefaultColor());
        }
        C1140b c1140b13 = this.f17009b;
        Integer num8 = c1140b.f16985G;
        c1140b13.f16985G = Integer.valueOf(num8 == null ? g.getInt(2, 8388661) : num8.intValue());
        C1140b c1140b14 = this.f17009b;
        Integer num9 = c1140b.f16987I;
        c1140b14.f16987I = Integer.valueOf(num9 == null ? g.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C1140b c1140b15 = this.f17009b;
        Integer num10 = c1140b.f16988J;
        c1140b15.f16988J = Integer.valueOf(num10 == null ? g.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C1140b c1140b16 = this.f17009b;
        Integer num11 = c1140b.f16989K;
        c1140b16.f16989K = Integer.valueOf(num11 == null ? g.getDimensionPixelOffset(18, 0) : num11.intValue());
        C1140b c1140b17 = this.f17009b;
        Integer num12 = c1140b.L;
        c1140b17.L = Integer.valueOf(num12 == null ? g.getDimensionPixelOffset(25, 0) : num12.intValue());
        C1140b c1140b18 = this.f17009b;
        Integer num13 = c1140b.f16990M;
        c1140b18.f16990M = Integer.valueOf(num13 == null ? g.getDimensionPixelOffset(19, c1140b18.f16989K.intValue()) : num13.intValue());
        C1140b c1140b19 = this.f17009b;
        Integer num14 = c1140b.f16991N;
        c1140b19.f16991N = Integer.valueOf(num14 == null ? g.getDimensionPixelOffset(26, c1140b19.L.intValue()) : num14.intValue());
        C1140b c1140b20 = this.f17009b;
        Integer num15 = c1140b.f16994Q;
        c1140b20.f16994Q = Integer.valueOf(num15 == null ? g.getDimensionPixelOffset(20, 0) : num15.intValue());
        C1140b c1140b21 = this.f17009b;
        Integer num16 = c1140b.f16992O;
        c1140b21.f16992O = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C1140b c1140b22 = this.f17009b;
        Integer num17 = c1140b.f16993P;
        c1140b22.f16993P = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C1140b c1140b23 = this.f17009b;
        Boolean bool2 = c1140b.f16995R;
        c1140b23.f16995R = Boolean.valueOf(bool2 == null ? g.getBoolean(0, false) : bool2.booleanValue());
        g.recycle();
        Locale locale = c1140b.f16980B;
        if (locale == null) {
            this.f17009b.f16980B = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f17009b.f16980B = locale;
        }
        this.f17008a = c1140b;
    }
}
