package n1;

import A4.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import j1.AbstractC1370a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.RunnableC1559b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q1.AbstractC1875a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f21023a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f21024b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f21025c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f21026d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f21027e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f21028f;
    public static boolean g;

    public static int b(Context context, int i7, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId != 0 ? i7 : i10;
    }

    public static s c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7) {
        s sVar;
        boolean e2 = e(xmlPullParser, str);
        Object obj = null;
        int i10 = 0;
        if (e2) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new s(typedValue.data, obj, obj);
            }
            try {
                sVar = s.h(typedArray.getResourceId(i7, 0), theme, typedArray.getResources());
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                sVar = null;
            }
            if (sVar != null) {
                return sVar;
            }
        }
        return new s(i10, obj, obj);
    }

    public static String d(TypedArray typedArray, int i7, int i10) {
        String string = typedArray.getString(i7);
        return string == null ? typedArray.getString(i10) : string;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int f(float f4) {
        if (f4 < 1.0f) {
            return -16777216;
        }
        if (f4 > 99.0f) {
            return -1;
        }
        float f10 = (f4 + 16.0f) / 116.0f;
        float f11 = f4 > 8.0f ? f10 * f10 * f10 : f4 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z8 = f12 > 0.008856452f;
        float f13 = z8 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z8) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f21025c;
        return AbstractC1875a.b(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    public static float g(int i7) {
        float f4 = i7 / 255.0f;
        return (f4 <= 0.04045f ? f4 / 12.92f : (float) Math.pow((f4 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static d k(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1370a.f18565b);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(5);
            String string3 = obtainAttributes.getString(6);
            String string4 = obtainAttributes.getString(2);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(3, 1);
            int integer2 = obtainAttributes.getInteger(4, 500);
            String string5 = obtainAttributes.getString(7);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    m(xmlResourceParser);
                }
                List l10 = l(resources, resourceId);
                return new g(new v1.c(string, string2, string3, l10), string4 != null ? new v1.c(string, string2, string4, l10) : null, integer, integer2, string5);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1370a.f18566c);
                        int i7 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z8 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i10 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i11 = obtainAttributes2.getInt(i10, 0);
                        int i12 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i12, 0);
                        String string7 = obtainAttributes2.getString(i12);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m(xmlResourceParser);
                        }
                        arrayList.add(new f(i7, i11, resourceId2, string7, string6, z8));
                    } else {
                        m(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new e((f[]) arrayList.toArray(new f[0]));
            }
        } else {
            m(xmlResourceParser);
        }
        return null;
    }

    public static List l(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i7);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void m(XmlResourceParser xmlResourceParser) {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    public static float n() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i7) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1559b(this, i7, 1));
    }

    public abstract void i(int i7);

    public abstract void j(Typeface typeface);
}
