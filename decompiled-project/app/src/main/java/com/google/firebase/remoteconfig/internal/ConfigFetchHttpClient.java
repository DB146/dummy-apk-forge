package com.google.firebase.remoteconfig.internal;

import C1.i;
import M5.c;
import Y6.k;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u8.g;
import v8.C2150d;
import v8.C2151e;
import v8.C2152f;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f15876h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f15877a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15878b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15879c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15880d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15881e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15882f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j10) {
        this.f15877a = context;
        this.f15878b = str;
        this.f15879c = str2;
        Matcher matcher = f15876h.matcher(str);
        this.f15880d = matcher.matches() ? matcher.group(1) : null;
        this.f15881e = "firebase";
        this.f15882f = j;
        this.g = j10;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) read);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l10, Map map2) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            throw new k("Fetch failed: Firebase installation id is null.");
        }
        hashMap.put("appInstanceId", str);
        hashMap.put("appInstanceIdToken", str2);
        hashMap.put("appId", this.f15878b);
        Context context = this.f15877a;
        Locale locale = context.getResources().getConfiguration().locale;
        hashMap.put("countryCode", locale.getCountry());
        int i7 = Build.VERSION.SDK_INT;
        hashMap.put("languageCode", locale.toLanguageTag());
        hashMap.put("platformVersion", Integer.toString(i7));
        hashMap.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put("appVersion", packageInfo.versionName);
                hashMap.put("appBuild", Long.toString(i7 >= 28 ? i.d(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("packageName", context.getPackageName());
        hashMap.put("sdkVersion", "22.1.2");
        hashMap.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            hashMap.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l10 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("firstOpenTime", simpleDateFormat.format(l10));
        }
        return new JSONObject(hashMap);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f15880d + "/namespaces/" + this.f15881e + ":fetch").openConnection();
        } catch (IOException e2) {
            throw new k(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a2 A[LOOP:0: B:8:0x009c->B:10:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc A[Catch: all -> 0x018e, JSONException -> 0x0190, IOException | JSONException -> 0x0192, TRY_LEAVE, TryCatch #8 {all -> 0x018e, blocks: (B:14:0x00c0, B:16:0x00dc, B:84:0x0194, B:85:0x019d, B:94:0x019e, B:95:0x01a5), top: B:13:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0194 A[Catch: all -> 0x018e, JSONException -> 0x0190, IOException | JSONException -> 0x0192, TRY_ENTER, TryCatch #8 {all -> 0x018e, blocks: (B:14:0x00c0, B:16:0x00dc, B:84:0x0194, B:85:0x019d, B:94:0x019e, B:95:0x01a5), top: B:13:0x00c0 }] */
    @Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2152f fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date, Map<String, String> map3) {
        String str4;
        int responseCode;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z8;
        byte[] e2;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f15882f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f15879c);
        Context context = this.f15877a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            e2 = c.e(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e10);
        }
        if (e2 == null) {
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
            str4 = null;
            httpURLConnection.setRequestProperty("X-Android-Cert", str4);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            try {
                try {
                    d(httpURLConnection, a(str, str2, map, l10, map3).toString().getBytes("utf-8"));
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        throw new g(responseCode, httpURLConnection.getResponseMessage());
                    }
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject c10 = c(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    try {
                        C2150d c11 = C2151e.c();
                        c11.f25204b = date;
                        try {
                            jSONObject = c10.getJSONObject("entries");
                        } catch (JSONException unused2) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            try {
                                c11.f25203a = new JSONObject(jSONObject.toString());
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            jSONArray = c10.getJSONArray("experimentDescriptions");
                        } catch (JSONException unused4) {
                            jSONArray = null;
                        }
                        if (jSONArray != null) {
                            try {
                                c11.f25205c = new JSONArray(jSONArray.toString());
                            } catch (JSONException unused5) {
                            }
                        }
                        try {
                            jSONObject2 = c10.getJSONObject("personalizationMetadata");
                        } catch (JSONException unused6) {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            try {
                                c11.f25206d = new JSONObject(jSONObject2.toString());
                            } catch (JSONException unused7) {
                            }
                        }
                        String string = c10.has("templateVersion") ? c10.getString("templateVersion") : null;
                        if (string != null) {
                            c11.f25207e = Long.parseLong(string);
                        }
                        try {
                            jSONArray2 = c10.getJSONArray("rolloutMetadata");
                        } catch (JSONException unused8) {
                            jSONArray2 = null;
                        }
                        if (jSONArray2 != null) {
                            try {
                                c11.f25208f = new JSONArray(jSONArray2.toString());
                            } catch (JSONException unused9) {
                            }
                        }
                        C2151e a9 = c11.a();
                        try {
                            z8 = !c10.get("state").equals("NO_CHANGE");
                        } catch (JSONException unused10) {
                            z8 = true;
                        }
                        return !z8 ? new C2152f(1, a9, null) : new C2152f(0, a9, headerField);
                    } catch (JSONException e11) {
                        throw new k("Fetch failed: fetch response could not be parsed.", e11);
                    }
                } finally {
                    httpURLConnection.disconnect();
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused11) {
                    }
                }
            } catch (IOException | JSONException e12) {
                throw new k("The client had an error while calling the backend!", e12);
            }
        }
        str4 = c.b(e2);
        httpURLConnection.setRequestProperty("X-Android-Cert", str4);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        while (r0.hasNext()) {
        }
        d(httpURLConnection, a(str, str2, map, l10, map3).toString().getBytes("utf-8"));
        httpURLConnection.connect();
        responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
        }
    }
}
