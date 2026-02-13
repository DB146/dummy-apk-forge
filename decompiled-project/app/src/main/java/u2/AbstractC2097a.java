package u2;

import android.os.Build;
import android.util.Log;
import com.kt.apps.media.xemtv.App;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2097a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f24828a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f24829b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z8 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z8 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("VM with version ");
        sb2.append(property);
        sb2.append(z8 ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb2.toString());
        f24829b = z8;
    }

    public static void a(App app) {
        File file = new File(app.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[Catch: all -> 0x0011, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0011, blocks: (B:4:0x0009, B:6:0x000f, B:9:0x0014, B:12:0x003e, B:13:0x0042, B:17:0x0057, B:21:0x0065, B:23:0x006c, B:24:0x007c, B:32:0x00a7, B:34:0x00ae, B:36:0x00b0, B:43:0x00b2, B:44:0x00b5, B:48:0x0070, B:51:0x005e, B:52:0x0047, B:56:0x004f, B:27:0x008a, B:29:0x008e, B:40:0x0096, B:20:0x0059), top: B:3:0x0009, inners: #0, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(App app, File file, File file2) {
        ClassLoader classLoader;
        HashSet hashSet = f24828a;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(file)) {
                    return;
                }
                hashSet.add(file);
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                IOException e2 = null;
                try {
                    classLoader = app.getClassLoader();
                } catch (RuntimeException e10) {
                    Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e10);
                }
                if (classLoader instanceof BaseDexClassLoader) {
                    if (classLoader != null) {
                        return;
                    }
                    try {
                        a(app);
                    } catch (Throwable th) {
                        Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                    }
                    File file3 = new File(file2, "code_cache");
                    try {
                        e(file3);
                    } catch (IOException unused) {
                        file3 = new File(app.getFilesDir(), "code_cache");
                        e(file3);
                    }
                    File file4 = new File(file3, "secondary-dexes");
                    e(file4);
                    C2100d c2100d = new C2100d(file, file4);
                    try {
                        try {
                            d((BaseDexClassLoader) classLoader, file4, c2100d.K(app, false));
                        } catch (IOException e11) {
                            Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e11);
                            d((BaseDexClassLoader) classLoader, file4, c2100d.K(app, true));
                        }
                        try {
                        } catch (IOException e12) {
                            e2 = e12;
                        }
                        if (e2 != null) {
                            throw e2;
                        }
                        return;
                    } finally {
                        try {
                            c2100d.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
                Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                classLoader = null;
                if (classLoader != null) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Field c(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder n6 = X.c.n("Field ", str, " not found in ");
        n6.append(obj.getClass());
        throw new NoSuchFieldException(n6.toString());
    }

    public static void d(BaseDexClassLoader baseDexClassLoader, File file, ArrayList arrayList) {
        IOException[] iOExceptionArr;
        if (arrayList.isEmpty()) {
            return;
        }
        Object obj = c(baseDexClassLoader, "pathList").get(baseDexClassLoader);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
                Field c10 = c(obj, "dexElements");
                Object[] objArr2 = (Object[]) c10.get(obj);
                Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                c10.set(obj, objArr3);
                if (arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                    }
                    Field c11 = c(obj, "dexElementsSuppressedExceptions");
                    IOException[] iOExceptionArr2 = (IOException[]) c11.get(obj);
                    if (iOExceptionArr2 == null) {
                        iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                    } else {
                        IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                        arrayList2.toArray(iOExceptionArr3);
                        System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                        iOExceptionArr = iOExceptionArr3;
                    }
                    c11.set(obj, iOExceptionArr);
                    IOException iOException = new IOException("I/O exception during makeDexElement");
                    iOException.initCause((Throwable) arrayList2.get(0));
                    throw iOException;
                }
                return;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static void e(File file) {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
