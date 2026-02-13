package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17224a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f17225b;

    /* renamed from: c, reason: collision with root package name */
    public int f17226c;

    /* renamed from: d, reason: collision with root package name */
    public float f17227d;

    /* renamed from: e, reason: collision with root package name */
    public String f17228e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17229f;
    public int g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f17225b = bVar.f17225b;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [g1.b, java.lang.Object] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f17425d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i7 = 0;
        boolean z8 = false;
        Object obj = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z8 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i7 = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i7 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i11 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i7 = i11;
                            }
                        }
                        i7 = 7;
                    }
                }
                i7 = i12;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f17225b = i7;
            obj2.f17224a = z8;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (P.c.b(this.f17225b)) {
            case 0:
            case 7:
                this.f17226c = ((Integer) obj).intValue();
                return;
            case 1:
                this.f17227d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f17228e = (String) obj;
                return;
            case 5:
                this.f17229f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f17227d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
