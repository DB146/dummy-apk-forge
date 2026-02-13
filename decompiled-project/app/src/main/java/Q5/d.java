package Q5;

import A9.C0154x0;
import B0.C0178g0;
import J3.D;
import U9.j;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import dalvik.system.PathClassLoader;
import i2.C1332t;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import y6.C2399e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f8654f = null;
    public static String g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f8655h = false;

    /* renamed from: i, reason: collision with root package name */
    public static int f8656i = -1;
    public static Boolean j;

    /* renamed from: n, reason: collision with root package name */
    public static h f8659n;

    /* renamed from: o, reason: collision with root package name */
    public static i f8660o;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8661a;
    public static final ThreadLocal k = new ThreadLocal();

    /* renamed from: l, reason: collision with root package name */
    public static final C0178g0 f8657l = new C0178g0(1);

    /* renamed from: m, reason: collision with root package name */
    public static final C1332t f8658m = new C1332t(12);

    /* renamed from: b, reason: collision with root package name */
    public static final C2399e f8650b = new C2399e(12);

    /* renamed from: c, reason: collision with root package name */
    public static final Hc.e f8651c = new Hc.e(13);

    /* renamed from: d, reason: collision with root package name */
    public static final U9.i f8652d = new U9.i(13);

    /* renamed from: e, reason: collision with root package name */
    public static final j f8653e = new j(13);

    public d(Context context) {
        this.f8661a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (G.k(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r10 != 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v0, types: [Q5.g, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d c(Context context, c cVar, String str) {
        g gVar;
        g gVar2;
        d dVar;
        Boolean bool;
        P5.a h10;
        d dVar2;
        i iVar;
        boolean z8;
        P5.a h11;
        Context context2 = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new Exception("null application Context");
        }
        ThreadLocal threadLocal = k;
        g gVar3 = (g) threadLocal.get();
        ?? obj = new Object();
        threadLocal.set(obj);
        C0178g0 c0178g0 = f8657l;
        Long l10 = (Long) c0178g0.get();
        long longValue = l10.longValue();
        try {
            c0178g0.set(Long.valueOf(SystemClock.uptimeMillis()));
            E3.h h12 = cVar.h(context2, str, f8658m);
            int i7 = h12.f3537a;
            try {
                int i10 = h12.f3538b;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i7 + " and remote module " + str + ":" + i10);
                    int i11 = h12.f3539c;
                    try {
                        if (i11 != 0) {
                            if (i11 == -1) {
                                if (h12.f3537a != 0) {
                                    i11 = -1;
                                }
                            }
                            i10 = i10;
                            if (i11 == 1) {
                                int i12 = h12.f3538b;
                                i10 = i12;
                            }
                            if (i11 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                dVar = new d(applicationContext);
                            } else {
                                if (i11 != 1) {
                                    throw new Exception("VersionPolicy returned invalid code:" + i11);
                                }
                                try {
                                    int i13 = h12.f3538b;
                                    try {
                                        synchronized (d.class) {
                                            if (!g(context)) {
                                                throw new Exception("Remote loading disabled");
                                            }
                                            bool = f8654f;
                                        }
                                        if (bool == null) {
                                            throw new Exception("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i13);
                                            synchronized (d.class) {
                                                iVar = f8660o;
                                            }
                                            if (iVar == null) {
                                                throw new Exception("DynamiteLoaderV2 was not cached.");
                                            }
                                            g gVar4 = (g) threadLocal.get();
                                            if (gVar4 == null || gVar4.f8665a == null) {
                                                throw new Exception("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor = gVar4.f8665a;
                                            new P5.b(null);
                                            synchronized (d.class) {
                                                z8 = f8656i >= 2;
                                            }
                                            if (z8) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                h11 = iVar.F(new P5.b(applicationContext2), str, i13, new P5.b(cursor));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                h11 = iVar.h(new P5.b(applicationContext2), str, i13, new P5.b(cursor));
                                            }
                                            Context context3 = (Context) P5.b.F(h11);
                                            if (context3 == null) {
                                                throw new Exception("Failed to get module context");
                                            }
                                            dVar2 = new d(context3);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i13);
                                            h h13 = h(context);
                                            if (h13 == null) {
                                                throw new Exception("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel zzB = h13.zzB(6, h13.zza());
                                            int readInt = zzB.readInt();
                                            zzB.recycle();
                                            if (readInt >= 3) {
                                                g gVar5 = (g) threadLocal.get();
                                                if (gVar5 == null) {
                                                    throw new Exception("No cached result cursor holder");
                                                }
                                                h10 = h13.F(new P5.b(context2), str, i13, new P5.b(gVar5.f8665a));
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                h10 = h13.G(new P5.b(context2), str, i13);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                h10 = h13.h(new P5.b(context2), str, i13);
                                            }
                                            Object F10 = P5.b.F(h10);
                                            if (F10 == null) {
                                                throw new Exception("Failed to load remote module.");
                                            }
                                            dVar2 = new d((Context) F10);
                                        }
                                        dVar = dVar2;
                                    } catch (a e2) {
                                        throw e2;
                                    } catch (RemoteException e10) {
                                        throw new Exception("Failed to load remote module.", e10);
                                    } catch (Throwable th) {
                                        throw new Exception("Failed to load remote module.", th);
                                    }
                                } catch (a e11) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e11.getMessage());
                                    int i14 = h12.f3537a;
                                    if (i14 == 0 || cVar.h(context2, str, new C0154x0(i14)).f3539c != -1) {
                                        throw new Exception("Remote load failed. No local fallback found.", e11);
                                    }
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    dVar = new d(applicationContext);
                                }
                            }
                            if (longValue == 0) {
                                f8657l.remove();
                            } else {
                                f8657l.set(l10);
                            }
                            Cursor cursor2 = obj.f8665a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            k.set(gVar3);
                            return dVar;
                        }
                        throw new Exception("No acceptable module " + str + " found. Local version is " + h12.f3537a + " and remote version is " + h12.f3538b + ".");
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = context2;
                        gVar2 = i10;
                        if (longValue == 0) {
                            f8657l.remove();
                        } else {
                            f8657l.set(l10);
                        }
                        Cursor cursor3 = gVar.f8665a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        k.set(gVar2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gVar2 = gVar3;
                    gVar = obj;
                }
            } catch (Throwable th4) {
                th = th4;
                gVar = obj;
                gVar2 = gVar3;
            }
        } catch (Throwable th5) {
            th = th5;
            gVar = obj;
            gVar2 = gVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0178, code lost:
    
        if (r2 != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Context context, String str, boolean z8) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int readInt;
        Cursor cursor;
        try {
            synchronized (d.class) {
                Boolean bool = f8654f;
                boolean z10 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e10.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (!f8655h) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e11 = e(str, context, z8, true);
                                        String str2 = g;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader T10 = e.T();
                                            if (T10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    D.c();
                                                    String str3 = g;
                                                    G.g(str3);
                                                    T10 = D.b(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = g;
                                                    G.g(str4);
                                                    T10 = new PathClassLoader(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            f(T10);
                                            declaredField.set(null, T10);
                                            f8654f = bool2;
                                            return e11;
                                        }
                                        return e11;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f8654f = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(str, context, z8, false);
                    } catch (a e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                h h10 = h(context);
                try {
                    if (h10 == null) {
                        return 0;
                    }
                    try {
                        Parcel zzB = h10.zzB(6, h10.zza());
                        int readInt2 = zzB.readInt();
                        zzB.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = k;
                            g gVar = (g) threadLocal.get();
                            if (gVar != null && (cursor = gVar.f8665a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) P5.b.F(h10.H(new P5.b(context), str, z8, ((Long) f8657l.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0) {
                                            g gVar2 = (g) threadLocal.get();
                                            if (gVar2 == null || gVar2.f8665a != null) {
                                                z10 = false;
                                            } else {
                                                gVar2.f8665a = cursor3;
                                            }
                                        }
                                        cursor2 = cursor3;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e13) {
                                    e2 = e13;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            P5.b bVar = new P5.b(context);
                            Parcel zza = h10.zza();
                            zzc.zze(zza, bVar);
                            zza.writeString(str);
                            zza.writeInt(z8 ? 1 : 0);
                            Parcel zzB2 = h10.zzB(5, zza);
                            readInt = zzB2.readInt();
                            zzB2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            P5.b bVar2 = new P5.b(context);
                            Parcel zza2 = h10.zza();
                            zzc.zze(zza2, bVar2);
                            zza2.writeString(str);
                            zza2.writeInt(z8 ? 1 : 0);
                            Parcel zzB3 = h10.zzB(3, zza2);
                            readInt = zzB3.readInt();
                            zzB3.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e14) {
                        e2 = e14;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            try {
                G.g(context);
            } catch (Exception e15) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e15);
            }
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
    
        if (r5 != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(String str, Context context, boolean z8, boolean z10) {
        Cursor query;
        MatrixCursor matrixCursor;
        boolean z11;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z12 = true;
                Uri build = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z8 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f8657l.get()).longValue())).build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z13 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (RemoteException unused) {
                    } catch (Throwable th) {
                        acquireUnstableContentProviderClient.release();
                        throw th;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new MatrixCursor(query.getColumnNames(), count);
                            for (int i7 = 0; i7 < count; i7++) {
                                if (!query.moveToPosition(i7)) {
                                    throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                Object[] objArr = new Object[columnCount];
                                for (int i10 = 0; i10 < columnCount; i10++) {
                                    int type = query.getType(i10);
                                    if (type == 0) {
                                        objArr[i10] = null;
                                    } else if (type == 1) {
                                        objArr[i10] = Long.valueOf(query.getLong(i10));
                                    } else if (type == 2) {
                                        objArr[i10] = Double.valueOf(query.getDouble(i10));
                                    } else if (type == 3) {
                                        objArr[i10] = query.getString(i10);
                                    } else {
                                        if (type != 4) {
                                            throw new RemoteException("Unknown column type");
                                        }
                                        objArr[i10] = query.getBlob(i10);
                                    }
                                }
                                matrixCursor.addRow(objArr);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i11 = matrixCursor.getInt(0);
                                        if (i11 > 0) {
                                            synchronized (d.class) {
                                                try {
                                                    g = matrixCursor.getString(2);
                                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                    if (columnIndex >= 0) {
                                                        f8656i = matrixCursor.getInt(columnIndex);
                                                    }
                                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                    if (columnIndex2 >= 0) {
                                                        z11 = matrixCursor.getInt(columnIndex2) != 0;
                                                        f8655h = z11;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                } finally {
                                                }
                                            }
                                            g gVar = (g) k.get();
                                            if (gVar == null || gVar.f8665a != null) {
                                                z12 = false;
                                            } else {
                                                gVar.f8665a = matrixCursor;
                                            }
                                            z13 = z11;
                                        }
                                        matrixCursor2 = matrixCursor;
                                        if (z10 && z13) {
                                            throw new Exception("forcing fallback to container DynamiteLoader impl");
                                        }
                                        if (matrixCursor2 != null) {
                                            matrixCursor2.close();
                                        }
                                        return i11;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    if (e instanceof a) {
                                        throw e;
                                    }
                                    throw new Exception("V2 version check failed: " + e.getMessage(), e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    matrixCursor2 = matrixCursor;
                                    if (matrixCursor2 != null) {
                                        matrixCursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new Exception("Failed to connect to dynamite module ContentResolver.");
                        } finally {
                            try {
                                query.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new Exception("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.common.zza] */
    public static void f(ClassLoader classLoader) {
        try {
            i iVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new zza(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f8660o = iVar;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e12) {
            e = e12;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e13) {
            e = e13;
            throw new Exception("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(j)) {
            return true;
        }
        boolean z8 = false;
        if (j == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (F5.f.f4100b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z8 = true;
            }
            j = Boolean.valueOf(z8);
            if (z8 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f8655h = true;
            }
        }
        if (!z8) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h h(Context context) {
        h hVar;
        synchronized (d.class) {
            h hVar2 = f8659n;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new zza(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (hVar != 0) {
                    f8659n = hVar;
                    return hVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f8661a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
