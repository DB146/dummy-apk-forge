package n1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.kt.apps.media.xemtv.beta.R;
import j1.AbstractC1370a;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f21029a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f4;
        int attributeCount;
        int i7;
        boolean z8;
        int[] iArr;
        int i10;
        boolean z10;
        int f10;
        float f11;
        float f12;
        float f13;
        float cbrt;
        float f14;
        int i11;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z11 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20];
        int[] iArr3 = new int[20];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z11 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = AbstractC1370a.f18564a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i12, i12);
                int resourceId = obtainAttributes.getResourceId(i12, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f21029a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z11);
                    int i14 = typedValue.type;
                    if (i14 < 28 || i14 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i12, -65281);
                        }
                        f4 = !obtainAttributes.hasValue(z11) ? obtainAttributes.getFloat(z11, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f15 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        int i15 = i12;
                        for (i7 = i15; i7 < attributeCount; i7++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i7);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i16 = i15 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i7, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i15] = attributeNameResource;
                                i15 = i16;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i15);
                        float f16 = 0.0f;
                        float f17 = 100.0f;
                        z8 = f15 < 0.0f && f15 <= 100.0f;
                        if (f4 == 1.0f || z8) {
                            int j = O5.b.j((int) ((Color.alpha(color) * f4) + 0.5f), 0, 255);
                            if (z8) {
                                iArr = trimStateSet;
                                i10 = depth2;
                                z10 = true;
                            } else {
                                a a9 = a.a(color);
                                l lVar = l.k;
                                float f18 = a9.f21018b;
                                if (f18 < 1.0d || Math.round(f15) <= 0.0d || Math.round(f15) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i10 = depth2;
                                    z10 = true;
                                    f10 = b.f(f15);
                                } else {
                                    float f19 = a9.f21017a;
                                    float min = f19 < 0.0f ? 0.0f : Math.min(360.0f, f19);
                                    float f20 = 0.0f;
                                    float f21 = f18;
                                    a aVar = null;
                                    boolean z12 = true;
                                    while (true) {
                                        if (Math.abs(f20 - f18) >= 0.4f) {
                                            float f22 = 1000.0f;
                                            float f23 = f16;
                                            float f24 = f17;
                                            float f25 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f23 - f24) <= 0.01f) {
                                                    i10 = depth2;
                                                    f11 = min;
                                                    f12 = f17;
                                                    z10 = true;
                                                    float f26 = f16;
                                                    iArr = trimStateSet;
                                                    f13 = f26;
                                                    break;
                                                }
                                                float f27 = ((f24 - f23) / 2.0f) + f23;
                                                int c10 = a.b(f27, f21, min).c(l.k);
                                                float g = b.g(Color.red(c10));
                                                float g2 = b.g(Color.green(c10));
                                                float g10 = b.g(Color.blue(c10));
                                                z10 = true;
                                                float[] fArr = b.f21026d[1];
                                                f12 = 100.0f;
                                                float f28 = ((g10 * fArr[2]) + ((g2 * fArr[1]) + (g * fArr[0]))) / 100.0f;
                                                if (f28 <= 0.008856452f) {
                                                    cbrt = f28 * 903.2963f;
                                                    i10 = depth2;
                                                } else {
                                                    i10 = depth2;
                                                    cbrt = (((float) Math.cbrt(f28)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f15 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a10 = a.a(c10);
                                                    a b2 = a.b(a10.f21019c, a10.f21018b, min);
                                                    f14 = f27;
                                                    float f29 = a10.f21020d - b2.f21020d;
                                                    f11 = min;
                                                    float f30 = a10.f21021e - b2.f21021e;
                                                    float f31 = a10.f21022f - b2.f21022f;
                                                    double sqrt = Math.sqrt((f31 * f31) + (f30 * f30) + (f29 * f29));
                                                    iArr = trimStateSet;
                                                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f25 = pow;
                                                        aVar2 = a10;
                                                        f22 = abs;
                                                    }
                                                } else {
                                                    f14 = f27;
                                                    f11 = min;
                                                    iArr = trimStateSet;
                                                }
                                                f13 = 0.0f;
                                                if (f22 == 0.0f && f25 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f15) {
                                                    f23 = f14;
                                                } else {
                                                    f24 = f14;
                                                }
                                                f17 = 100.0f;
                                                depth2 = i10;
                                                min = f11;
                                                int[] iArr6 = iArr;
                                                f16 = 0.0f;
                                                trimStateSet = iArr6;
                                            }
                                            a aVar3 = aVar2;
                                            if (!z12) {
                                                if (aVar3 == null) {
                                                    f18 = f21;
                                                } else {
                                                    aVar = aVar3;
                                                    f20 = f21;
                                                }
                                                f21 = ((f18 - f20) / 2.0f) + f20;
                                                f17 = f12;
                                                depth2 = i10;
                                                min = f11;
                                            } else {
                                                if (aVar3 != null) {
                                                    f10 = aVar3.c(lVar);
                                                    break;
                                                }
                                                f21 = ((f18 - f20) / 2.0f) + f20;
                                                f17 = f12;
                                                depth2 = i10;
                                                min = f11;
                                                z12 = false;
                                            }
                                            int[] iArr7 = iArr;
                                            f16 = f13;
                                            trimStateSet = iArr7;
                                        } else {
                                            iArr = trimStateSet;
                                            i10 = depth2;
                                            z10 = true;
                                            f10 = aVar == null ? b.f(f15) : aVar.c(lVar);
                                        }
                                    }
                                }
                                color = f10;
                            }
                            color = (16777215 & color) | (j << 24);
                        } else {
                            iArr = trimStateSet;
                            i10 = depth2;
                            z10 = true;
                        }
                        i11 = i13 + 1;
                        if (i11 > iArr3.length) {
                            int[] iArr8 = new int[i13 <= 4 ? 8 : i13 * 2];
                            System.arraycopy(iArr3, 0, iArr8, 0, i13);
                            iArr3 = iArr8;
                        }
                        iArr3[i13] = color;
                        if (i11 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i13 > 4 ? i13 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i13);
                            iArr2 = r12;
                        }
                        iArr2[i13] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i13 = i11;
                        z11 = z10;
                        depth2 = i10;
                        i12 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i12, -65281);
                if (!obtainAttributes.hasValue(z11)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                int i152 = i12;
                while (i7 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i152);
                float f162 = 0.0f;
                float f172 = 100.0f;
                if (f15 < 0.0f) {
                }
                if (f4 == 1.0f) {
                }
                int j10 = O5.b.j((int) ((Color.alpha(color) * f4) + 0.5f), 0, 255);
                if (z8) {
                }
                color = (16777215 & color) | (j10 << 24);
                i11 = i13 + 1;
                if (i11 > iArr3.length) {
                }
                iArr3[i13] = color;
                if (i11 > iArr2.length) {
                }
                iArr2[i13] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i13 = i11;
                z11 = z10;
                depth2 = i10;
                i12 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z11 = z11;
                depth2 = depth2;
                i12 = 0;
            }
        }
        int[] iArr9 = new int[i13];
        int[][] iArr10 = new int[i13];
        System.arraycopy(iArr3, 0, iArr9, 0, i13);
        System.arraycopy(iArr2, 0, iArr10, 0, i13);
        return new ColorStateList(iArr10, iArr9);
    }
}
