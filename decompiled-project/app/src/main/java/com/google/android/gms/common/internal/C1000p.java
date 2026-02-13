package com.google.android.gms.common.internal;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.internal.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000p {

    /* renamed from: b, reason: collision with root package name */
    public static final q3.l f15092b = new q3.l("");

    /* renamed from: c, reason: collision with root package name */
    public static final C1000p f15093c = new C1000p();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f15094a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        IOException e2;
        String str2;
        InputStream inputStream;
        q3.l lVar = f15092b;
        G.e(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f15094a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r6 = null;
        String str3 = null;
        inputStream2 = null;
        try {
            try {
                inputStream = C1000p.class.getResourceAsStream("/" + str + ".properties");
            } catch (IOException e10) {
                e2 = e10;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                String str4 = str + " version is " + str3;
                if (Log.isLoggable((String) lVar.f23391b, 2)) {
                    String str5 = (String) lVar.f23392c;
                    if (str5 != null) {
                        str4 = str5.concat(str4);
                    }
                    Log.v("LibraryVersion", str4);
                }
            } else {
                String concat = "Failed to get app version for libraryName: ".concat(str);
                if (Log.isLoggable((String) lVar.f23391b, 5)) {
                    String str6 = (String) lVar.f23392c;
                    if (str6 != null) {
                        concat = str6.concat(concat);
                    }
                    Log.w("LibraryVersion", concat);
                }
            }
        } catch (IOException e11) {
            e2 = e11;
            inputStream2 = inputStream;
            str2 = null;
            String concat2 = "Failed to get app version for libraryName: ".concat(str);
            if (Log.isLoggable((String) lVar.f23391b, 6)) {
                String str7 = (String) lVar.f23392c;
                if (str7 != null) {
                    concat2 = str7.concat(concat2);
                }
                Log.e("LibraryVersion", concat2, e2);
            }
            InputStream inputStream3 = inputStream2;
            str3 = str2;
            inputStream = inputStream3;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            concurrentHashMap.put(str, str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                M5.c.c(inputStream2);
            }
            throw th;
        }
        if (inputStream != null) {
            M5.c.c(inputStream);
        }
        if (str3 == null) {
            if (Log.isLoggable((String) lVar.f23391b, 3)) {
                String str8 = (String) lVar.f23392c;
                Log.d("LibraryVersion", str8 != null ? str8.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            str3 = "UNKNOWN";
        }
        concurrentHashMap.put(str, str3);
        return str3;
    }
}
