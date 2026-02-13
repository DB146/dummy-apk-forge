package q1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import u.T;
import y7.u0;

/* renamed from: q1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1880f extends vc.i {

    /* renamed from: f, reason: collision with root package name */
    public static final Class f23352f;
    public static final Constructor g;

    /* renamed from: h, reason: collision with root package name */
    public static final Method f23353h;

    /* renamed from: i, reason: collision with root package name */
    public static final Method f23354i;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        g = constructor;
        f23352f = cls;
        f23353h = method2;
        f23354i = method;
    }

    public static boolean J(Object obj, ByteBuffer byteBuffer, int i7, int i10, boolean z8) {
        try {
            return ((Boolean) f23353h.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i10), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface K(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f23352f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f23354i.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    @Override // vc.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface j(Context context, n1.e eVar, Resources resources, int i7) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (n1.f fVar : eVar.f21030a) {
            int i10 = fVar.f21036f;
            File u3 = u0.u(context);
            if (u3 != null) {
                try {
                    if (u0.k(u3, resources, i10)) {
                        try {
                            fileInputStream = new FileInputStream(u3);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null) {
                                return null;
                            }
                            if (!J(obj, mappedByteBuffer, fVar.f21035e, fVar.f21032b, fVar.f21033c)) {
                                return null;
                            }
                        } finally {
                            break;
                        }
                    }
                } finally {
                    u3.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
            }
        }
        return K(obj);
    }

    @Override // vc.i
    public final Typeface k(Context context, v1.h[] hVarArr, int i7) {
        Object obj;
        try {
            obj = g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        T t5 = new T(0);
        for (v1.h hVar : hVarArr) {
            Uri uri = hVar.f24953a;
            ByteBuffer byteBuffer = (ByteBuffer) t5.get(uri);
            if (byteBuffer == null) {
                byteBuffer = u0.A(context, uri);
                t5.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!J(obj, byteBuffer, hVar.f24954b, hVar.f24955c, hVar.f24956d)) {
                return null;
            }
        }
        Typeface K10 = K(obj);
        if (K10 == null) {
            return null;
        }
        return Typeface.create(K10, i7);
    }
}
