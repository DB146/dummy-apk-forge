package q1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y7.u0;

/* renamed from: q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1879e extends vc.i {

    /* renamed from: f, reason: collision with root package name */
    public static Class f23349f = null;
    public static Constructor g = null;

    /* renamed from: h, reason: collision with root package name */
    public static Method f23350h = null;

    /* renamed from: i, reason: collision with root package name */
    public static Method f23351i = null;
    public static boolean j = false;

    public static boolean J(Object obj, String str, int i7, boolean z8) {
        K();
        try {
            return ((Boolean) f23350h.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void K() {
        Method method;
        Class<?> cls;
        Method method2;
        if (j) {
            return;
        }
        j = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        g = constructor;
        f23349f = cls;
        f23350h = method2;
        f23351i = method;
    }

    @Override // vc.i
    public Typeface j(Context context, n1.e eVar, Resources resources, int i7) {
        K();
        try {
            Object newInstance = g.newInstance(null);
            for (n1.f fVar : eVar.f21030a) {
                File u3 = u0.u(context);
                if (u3 == null) {
                    return null;
                }
                try {
                    if (!u0.k(u3, resources, fVar.f21036f)) {
                        return null;
                    }
                    if (!J(newInstance, u3.getPath(), fVar.f21032b, fVar.f21033c)) {
                        return null;
                    }
                    u3.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    u3.delete();
                }
            }
            K();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f23349f, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f23351i.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // vc.i
    public Typeface k(Context context, v1.h[] hVarArr, int i7) {
        File file;
        String readlink;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(p(hVarArr, i7).f24953a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                try {
                    if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                        file = new File(readlink);
                        if (file != null && file.canRead()) {
                            Typeface createFromFile = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface m10 = m(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return m10;
                    }
                    Typeface m102 = m(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return m102;
                } finally {
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } catch (Throwable th) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
