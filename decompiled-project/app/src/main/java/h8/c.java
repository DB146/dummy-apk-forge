package h8;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import t8.C2033b;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17872b;

    public /* synthetic */ c(d dVar, int i7) {
        this.f17871a = i7;
        this.f17872b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f17871a) {
            case 0:
                d dVar = this.f17872b;
                synchronized (dVar) {
                    try {
                        h hVar = (h) dVar.f17873a.get();
                        ArrayList c10 = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i7 = 0; i7 < c10.size(); i7++) {
                            C1261a c1261a = (C1261a) c10.get(i7);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", c1261a.f17867a);
                            jSONObject.put("dates", new JSONArray((Collection) c1261a.f17868b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return byteArrayOutputStream;
            default:
                d dVar2 = this.f17872b;
                synchronized (dVar2) {
                    ((h) dVar2.f17873a.get()).h(((C2033b) dVar2.f17875c.get()).a(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
