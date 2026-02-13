package E8;

import Db.q;
import cc.E;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f3768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f3769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3770c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f3771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f3772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Map map, c cVar, d dVar, Hb.d dVar2) {
        super(2, dVar2);
        this.f3769b = gVar;
        this.f3770c = map;
        this.f3771d = cVar;
        this.f3772e = dVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        c cVar = this.f3771d;
        d dVar2 = this.f3772e;
        return new f(this.f3769b, this.f3770c, cVar, dVar2, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f3768a;
        d dVar = this.f3772e;
        q qVar = q.f3365a;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                URLConnection openConnection = g.a(this.f3769b).openConnection();
                kotlin.jvm.internal.l.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f3770c.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    c cVar = this.f3771d;
                    this.f3768a = 1;
                    if (cVar.invoke(jSONObject, this) == aVar) {
                        return aVar;
                    }
                } else {
                    this.f3768a = 2;
                    dVar.invoke("Bad response code: " + responseCode, this);
                    if (qVar == aVar) {
                        return aVar;
                    }
                }
            } else if (i7 == 1 || i7 == 2) {
                com.bumptech.glide.c.c0(obj);
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
            }
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = e2.toString();
            }
            this.f3768a = 3;
            dVar.invoke(message, this);
            if (qVar == aVar) {
                return aVar;
            }
        }
        return qVar;
    }
}
