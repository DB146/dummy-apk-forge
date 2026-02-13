package D7;

import A0.G0;
import A9.O0;
import Y5.C0660y;
import Y6.k;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import ea.C1108c;
import h7.g;
import ia.C1358d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import l7.C1511c;
import org.json.JSONException;
import org.json.JSONObject;
import u8.j;
import v7.l;
import v7.p;
import v8.C2151e;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3268b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f3267a = i7;
        this.f3268b = obj;
    }

    public /* synthetic */ c(C1511c c1511c, C0660y c0660y) {
        this.f3267a = 1;
        this.f3268b = c1511c;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, l7.a] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        C2151e c2151e;
        FileInputStream fileInputStream;
        Throwable th;
        switch (this.f3267a) {
            case 0:
                d dVar = (d) ((q3.e) this.f3268b).f23377c;
                f fVar = (f) dVar.f3270b;
                a aVar = (a) dVar.f3274f;
                String str = aVar.f3260a;
                w7.d.b();
                try {
                    HashMap d10 = a.d(fVar);
                    G0 g02 = new G0(str, d10);
                    HashMap hashMap = (HashMap) g02.f29d;
                    hashMap.put("User-Agent", "Crashlytics Android SDK/19.4.4");
                    hashMap.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    a.b(g02, fVar);
                    String str2 = "Requesting settings from " + str;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    String str3 = "Settings query params were: " + d10;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return aVar.e(g02.G());
                } catch (IOException e2) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e2);
                    return null;
                }
            case 1:
                C1511c c1511c = (C1511c) this.f3268b;
                c1511c.getClass();
                byte[] bytes = new JSONObject().toString().getBytes("UTF-8");
                O0 o02 = c1511c.f19590c;
                o02.getClass();
                g gVar = c1511c.f19593f;
                if (gVar.f17853b > System.currentTimeMillis()) {
                    throw new k("Too many attempts.");
                }
                JSONObject jSONObject = new JSONObject(o02.y(new URL("https://firebaseappcheck.googleapis.com/v1/projects/" + ((String) o02.f925d) + "/apps/" + ((String) o02.f924c) + ":generatePlayIntegrityChallenge?key=" + ((String) o02.f923b)), bytes, gVar, false));
                String a9 = M5.e.a(jSONObject.optString("challenge"));
                String a10 = M5.e.a(jSONObject.optString("ttl"));
                if (a9 == null || a10 == null) {
                    throw new k("Unexpected server response.");
                }
                ?? obj = new Object();
                obj.f19585a = a9;
                return obj;
            case 2:
                WorkDatabase workDatabase = (WorkDatabase) ((C1358d) this.f3268b).f18487b;
                Long o10 = workDatabase.y().o("next_alarm_manager_id");
                int longValue = o10 != null ? (int) o10.longValue() : 0;
                workDatabase.y().p(new q3.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
            case 3:
                return ((j) this.f3268b).a();
            case 4:
                l lVar = ((p) this.f3268b).g;
                lVar.getClass();
                w7.d.a();
                C1108c c1108c = lVar.f25130c;
                String str4 = (String) c1108c.f16831c;
                B7.d dVar2 = (B7.d) c1108c.f16830b;
                dVar2.getClass();
                boolean z8 = true;
                if (new File((File) dVar2.f2212c, str4).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    String str5 = (String) c1108c.f16831c;
                    dVar2.getClass();
                    new File((File) dVar2.f2212c, str5).delete();
                } else {
                    String e10 = lVar.e();
                    if (e10 == null || !lVar.j.c(e10)) {
                        z8 = false;
                    }
                }
                return Boolean.valueOf(z8);
            default:
                v8.l lVar2 = (v8.l) this.f3268b;
                synchronized (lVar2) {
                    c2151e = null;
                    try {
                        fileInputStream = lVar2.f25259a.openFileInput(lVar2.f25260b);
                        try {
                            int available = fileInputStream.available();
                            byte[] bArr = new byte[available];
                            fileInputStream.read(bArr, 0, available);
                            c2151e = C2151e.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStream.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return c2151e;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        fileInputStream = null;
                        th = th3;
                    }
                }
                return c2151e;
        }
    }
}
