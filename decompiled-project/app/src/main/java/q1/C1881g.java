package q1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import y7.u0;

/* renamed from: q1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1881g extends C1879e {
    public final Class k;

    /* renamed from: l, reason: collision with root package name */
    public final Constructor f23355l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f23356m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f23357n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f23358o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f23359p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f23360q;

    public C1881g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = R(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = S(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.k = cls;
        this.f23355l = constructor;
        this.f23356m = method2;
        this.f23357n = method3;
        this.f23358o = method4;
        this.f23359p = method5;
        this.f23360q = method;
    }

    public static Method R(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void L(Object obj) {
        try {
            this.f23359p.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean M(Context context, Object obj, String str, int i7, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f23356m.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface N(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.k, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f23360q.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O(Object obj) {
        try {
            return ((Boolean) this.f23358o.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean P() {
        Method method = this.f23356m;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object Q() {
        try {
            return this.f23355l.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method S(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // q1.C1879e, vc.i
    public final Typeface j(Context context, n1.e eVar, Resources resources, int i7) {
        if (!P()) {
            return super.j(context, eVar, resources, i7);
        }
        Object Q3 = Q();
        if (Q3 == null) {
            return null;
        }
        for (n1.f fVar : eVar.f21030a) {
            if (!M(context, Q3, fVar.f21031a, fVar.f21035e, fVar.f21032b, fVar.f21033c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f21034d))) {
                L(Q3);
                return null;
            }
        }
        if (O(Q3)) {
            return N(Q3);
        }
        return null;
    }

    @Override // q1.C1879e, vc.i
    public final Typeface k(Context context, v1.h[] hVarArr, int i7) {
        Typeface N10;
        boolean z8;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!P()) {
            v1.h p10 = p(hVarArr, i7);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(p10.f24953a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(p10.f24955c).setItalic(p10.f24956d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (v1.h hVar : hVarArr) {
            if (hVar.f24957e == 0) {
                Uri uri = hVar.f24953a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, u0.A(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object Q3 = Q();
        if (Q3 == null) {
            return null;
        }
        int length = hVarArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            v1.h hVar2 = hVarArr[i10];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f24953a);
            if (byteBuffer != null) {
                try {
                    z8 = ((Boolean) this.f23357n.invoke(Q3, byteBuffer, Integer.valueOf(hVar2.f24954b), null, Integer.valueOf(hVar2.f24955c), Integer.valueOf(hVar2.f24956d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z8 = false;
                }
                if (!z8) {
                    L(Q3);
                    return null;
                }
                z10 = true;
            }
            i10++;
            z10 = z10;
        }
        if (!z10) {
            L(Q3);
            return null;
        }
        if (O(Q3) && (N10 = N(Q3)) != null) {
            return Typeface.create(N10, i7);
        }
        return null;
    }

    @Override // vc.i
    public final Typeface n(Context context, Resources resources, int i7, String str, int i10) {
        if (!P()) {
            return super.n(context, resources, i7, str, i10);
        }
        Object Q3 = Q();
        if (Q3 == null) {
            return null;
        }
        if (!M(context, Q3, str, 0, -1, -1, null)) {
            L(Q3);
            return null;
        }
        if (O(Q3)) {
            return N(Q3);
        }
        return null;
    }
}
