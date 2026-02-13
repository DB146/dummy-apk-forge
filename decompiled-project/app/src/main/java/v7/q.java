package v7;

import A0.C0018g0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import y.S;
import y7.C2420c0;
import y7.T;
import y7.U;
import y7.V;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f25162f;
    public static final String g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25163a;

    /* renamed from: b, reason: collision with root package name */
    public final v f25164b;

    /* renamed from: c, reason: collision with root package name */
    public final C0018g0 f25165c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.c f25166d;

    /* renamed from: e, reason: collision with root package name */
    public final D7.d f25167e;

    static {
        HashMap hashMap = new HashMap();
        f25162f = hashMap;
        S.c(5, hashMap, "armeabi", 6, "armeabi-v7a");
        S.c(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/19.4.4";
    }

    public q(Context context, v vVar, C0018g0 c0018g0, q3.c cVar, D7.d dVar) {
        this.f25163a = context;
        this.f25164b = vVar;
        this.f25165c = c0018g0;
        this.f25166d = cVar;
        this.f25167e = dVar;
    }

    public static U c(q3.n nVar, int i7) {
        String str = (String) nVar.f23397c;
        int i10 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) nVar.f23398d;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        q3.n nVar2 = (q3.n) nVar.f23399e;
        if (i7 >= 8) {
            for (q3.n nVar3 = nVar2; nVar3 != null; nVar3 = (q3.n) nVar3.f23399e) {
                i10++;
            }
        }
        int i11 = i10;
        List d10 = d(stackTraceElementArr, 4);
        if (d10 == null) {
            throw new NullPointerException("Null frames");
        }
        byte b2 = (byte) (0 | 1);
        U u3 = null;
        if (nVar2 != null && i11 == 0) {
            u3 = c(nVar2, i7 + 1);
        }
        if (b2 == 1) {
            return new U(str, (String) nVar.f23396b, d10, u3, i11);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, y7.X] */
    public static List d(StackTraceElement[] stackTraceElementArr, int i7) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.f27209e = i7;
            obj.f27210f = (byte) (obj.f27210f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            obj.f27205a = max;
            byte b2 = (byte) (obj.f27210f | 1);
            obj.f27210f = b2;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            obj.f27206b = str;
            obj.f27207c = fileName;
            obj.f27208d = j;
            obj.f27210f = (byte) (b2 | 2);
            arrayList.add(obj.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static V e() {
        byte b2 = (byte) 1;
        if (b2 == 1) {
            return new V(0L, "0", "0");
        }
        StringBuilder sb2 = new StringBuilder();
        if (b2 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }

    public final List a() {
        byte b2 = (byte) (((byte) (0 | 1)) | 2);
        C0018g0 c0018g0 = this.f25165c;
        String str = (String) c0018g0.f229f;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b2 == 3) {
            return Collections.singletonList(new T(0L, 0L, str, (String) c0018g0.f226c));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b2 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, y7.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2420c0 b(int i7) {
        boolean z8;
        Float f4;
        long j;
        Intent registerReceiver;
        Context context = this.f25163a;
        boolean z10 = false;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e2) {
            e = e2;
            z8 = false;
        }
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            z8 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
            try {
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    f4 = Float.valueOf(intExtra2 / intExtra3);
                }
            } catch (IllegalStateException e10) {
                e = e10;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f4 = null;
                if (f4 != null) {
                }
                if (z8) {
                }
                if (!g.f()) {
                    z10 = true;
                }
                long a9 = g.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = a9 - memoryInfo.availMem;
                if (j <= 0) {
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                ?? obj = new Object();
                obj.f27237a = r5;
                obj.f27238b = r0;
                byte b2 = (byte) (obj.g | 1);
                obj.f27239c = z10;
                obj.f27240d = i7;
                obj.f27241e = j;
                obj.f27242f = (r7.getBlockCount() * blockSize) - (blockSize * r7.getAvailableBlocks());
                obj.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
                return obj.a();
            }
            f4 = null;
        } else {
            f4 = null;
            z8 = false;
        }
        Double valueOf = f4 != null ? Double.valueOf(f4.doubleValue()) : null;
        int i10 = (z8 || f4 == null) ? 1 : ((double) f4.floatValue()) < 0.99d ? 2 : 3;
        if (!g.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z10 = true;
        }
        long a92 = g.a(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = a92 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        ?? obj2 = new Object();
        obj2.f27237a = valueOf;
        obj2.f27238b = i10;
        byte b22 = (byte) (obj2.g | 1);
        obj2.f27239c = z10;
        obj2.f27240d = i7;
        obj2.f27241e = j;
        obj2.f27242f = (r7.getBlockCount() * blockSize2) - (blockSize2 * r7.getAvailableBlocks());
        obj2.g = (byte) (((byte) (((byte) (((byte) (b22 | 2)) | 4)) | 8)) | 16);
        return obj2.a();
    }
}
