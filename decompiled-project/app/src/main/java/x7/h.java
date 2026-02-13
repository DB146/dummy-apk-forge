package x7;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f26255b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final B7.d f26256a;

    public h(B7.d dVar) {
        this.f26256a = dVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            String string = jSONArray.getString(i7);
            try {
                R7.a aVar = n.f26273a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                arrayList.add(new b(string2, string3, string4.length() > 256 ? string4.substring(0, 256) : string4, jSONObject.getString("variantId"), jSONObject.getLong("templateVersion")));
            } catch (Exception e2) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e2);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i7 = 0; i7 < list.size(); i7++) {
            try {
                jSONArray.put(new JSONObject(n.f26273a.u(list.get(i7))));
            } catch (JSONException e2) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e2);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", A3.c.j("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map c(String str, boolean z8) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e2;
        B7.d dVar = this.f26256a;
        File b2 = z8 ? dVar.b(str, "internal-keys") : dVar.b(str, "keys");
        if (!b2.exists() || b2.length() == 0) {
            g(b2, "The file has a length of zero for session: " + str);
            return Collections.emptyMap();
        }
        try {
            try {
                fileInputStream = new FileInputStream(b2);
                try {
                    HashMap a9 = a(v7.g.i(fileInputStream));
                    v7.g.b(fileInputStream, "Failed to close user metadata file.");
                    return a9;
                } catch (Exception e10) {
                    e2 = e10;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e2);
                    f(b2);
                    v7.g.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                }
            } catch (Throwable th2) {
                th = th2;
                v7.g.b(r1, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            fileInputStream = null;
            e2 = e11;
        } catch (Throwable th3) {
            ?? r12 = 0;
            th = th3;
            v7.g.b(r12, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File b2 = this.f26256a.b(str, "user-data");
        Closeable closeable = null;
        if (b2.exists()) {
            ?? r32 = (b2.length() > 0L ? 1 : (b2.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b2);
                        try {
                            JSONObject jSONObject = new JSONObject(v7.g.i(fileInputStream));
                            String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + optString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            v7.g.b(fileInputStream, "Failed to close user metadata file.");
                            return optString;
                        } catch (Exception e2) {
                            e = e2;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(b2);
                            v7.g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        v7.g.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        String t5 = X.c.t("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", t5, null);
        }
        f(b2);
        return null;
    }

    public final void h(String str, Map map, boolean z8) {
        String jSONObject;
        BufferedWriter bufferedWriter;
        B7.d dVar = this.f26256a;
        File b2 = z8 ? dVar.b(str, "internal-keys") : dVar.b(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), f26255b));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            v7.g.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e10) {
            e = e10;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(b2);
            v7.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            v7.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void i(String str, List list) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e2;
        File b2 = this.f26256a.b(str, "rollouts-state");
        ?? isEmpty = list.isEmpty();
        if (isEmpty != 0) {
            g(b2, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String e10 = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b2), f26255b));
                try {
                    bufferedWriter.write(e10);
                    bufferedWriter.flush();
                    isEmpty = bufferedWriter;
                } catch (Exception e11) {
                    e2 = e11;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e2);
                    f(b2);
                    isEmpty = bufferedWriter;
                    v7.g.b(isEmpty, "Failed to close rollouts state file.");
                }
            } catch (Throwable th2) {
                th = th2;
                v7.g.b(isEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e2 = e12;
        } catch (Throwable th3) {
            isEmpty = 0;
            th = th3;
            v7.g.b(isEmpty, "Failed to close rollouts state file.");
            throw th;
        }
        v7.g.b(isEmpty, "Failed to close rollouts state file.");
    }
}
