package Z9;

import L7.C0384d;
import L7.C0385e;
import ca.C0918a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelGroup;
import com.kt.apps.core.utils.NetworkUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import sb.C2009c;
import sb.C2010d;
import y.S;

/* loaded from: classes2.dex */
public final class B implements Y9.a {
    public static final Db.o k = android.support.v4.media.session.b.z(new S9.a(16));

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f12222a;

    /* renamed from: b, reason: collision with root package name */
    public final G7.f f12223b;

    /* renamed from: c, reason: collision with root package name */
    public final C0918a f12224c;

    /* renamed from: d, reason: collision with root package name */
    public final u8.c f12225d;

    /* renamed from: e, reason: collision with root package name */
    public final Db.o f12226e;

    /* renamed from: f, reason: collision with root package name */
    public final Db.o f12227f;
    public final Db.o g;

    /* renamed from: h, reason: collision with root package name */
    public final Db.o f12228h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f12229i;
    public final Db.o j;

    public B(OkHttpClient okHttpClient, G7.f firebaseDataBase, C0918a keyValueStorage, RoomDataBase roomDataBase, u8.c remoteConfig) {
        kotlin.jvm.internal.l.e(firebaseDataBase, "firebaseDataBase");
        kotlin.jvm.internal.l.e(keyValueStorage, "keyValueStorage");
        kotlin.jvm.internal.l.e(roomDataBase, "roomDataBase");
        kotlin.jvm.internal.l.e(remoteConfig, "remoteConfig");
        this.f12222a = okHttpClient;
        this.f12223b = firebaseDataBase;
        this.f12224c = keyValueStorage;
        this.f12225d = remoteConfig;
        this.f12226e = android.support.v4.media.session.b.z(new S9.a(17));
        final int i7 = 0;
        this.f12227f = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: Z9.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B f12316b;

            {
                this.f12316b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                String optString;
                JSONObject optJSONObject;
                JSONArray optJSONArray;
                String optString2;
                String optString3;
                ArrayList arrayList;
                switch (i7) {
                    case 0:
                        String g = this.f12316b.f12225d.g("sctv_config");
                        if (g.length() <= 0) {
                            g = null;
                        }
                        if (g == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(g);
                        } catch (Exception unused) {
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.f12316b.f12227f.getValue();
                        if (jSONObject != null && (optString = jSONObject.optString("baseBackendUrl")) != null) {
                            if (optString.length() <= 0) {
                                optString = null;
                            }
                            if (optString != null) {
                                return optString;
                            }
                        }
                        return "https://apicdn.sctvonline.vn/";
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.f12316b.f12227f.getValue();
                        if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("headers")) == null) {
                            return (Map) B.k.getValue();
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator<String> keys = optJSONObject.keys();
                        kotlin.jvm.internal.l.d(keys, "keys(...)");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            linkedHashMap.put(next, optJSONObject.optString(next));
                        }
                        return linkedHashMap;
                    default:
                        B b2 = this.f12316b;
                        Map map = (Map) b2.f12229i.get();
                        if (map != null) {
                            return map;
                        }
                        JSONObject jSONObject3 = (JSONObject) b2.f12227f.getValue();
                        if (jSONObject3 == null || (optJSONArray = jSONObject3.optJSONArray("paths")) == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int length = optJSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                            if (optJSONObject2 != null && (optString2 = optJSONObject2.optString("key")) != null && (optString3 = optJSONObject2.optString("value")) != null) {
                                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("replacePathOrQueryKeys");
                                if (optJSONArray2 != null) {
                                    arrayList = new ArrayList();
                                    int length2 = optJSONArray2.length();
                                    for (int i11 = 0; i11 < length2; i11++) {
                                        String optString4 = optJSONArray2.optString(i11);
                                        kotlin.jvm.internal.l.d(optString4, "optString(...)");
                                        arrayList.add(optString4);
                                    }
                                } else {
                                    arrayList = null;
                                }
                                linkedHashMap2.put(optString2, new y(optString3, arrayList));
                            }
                        }
                        b2.f12229i.set(linkedHashMap2);
                        return linkedHashMap2;
                }
            }
        });
        final int i10 = 1;
        this.g = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: Z9.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B f12316b;

            {
                this.f12316b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                String optString;
                JSONObject optJSONObject;
                JSONArray optJSONArray;
                String optString2;
                String optString3;
                ArrayList arrayList;
                switch (i10) {
                    case 0:
                        String g = this.f12316b.f12225d.g("sctv_config");
                        if (g.length() <= 0) {
                            g = null;
                        }
                        if (g == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(g);
                        } catch (Exception unused) {
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.f12316b.f12227f.getValue();
                        if (jSONObject != null && (optString = jSONObject.optString("baseBackendUrl")) != null) {
                            if (optString.length() <= 0) {
                                optString = null;
                            }
                            if (optString != null) {
                                return optString;
                            }
                        }
                        return "https://apicdn.sctvonline.vn/";
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.f12316b.f12227f.getValue();
                        if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("headers")) == null) {
                            return (Map) B.k.getValue();
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator<String> keys = optJSONObject.keys();
                        kotlin.jvm.internal.l.d(keys, "keys(...)");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            linkedHashMap.put(next, optJSONObject.optString(next));
                        }
                        return linkedHashMap;
                    default:
                        B b2 = this.f12316b;
                        Map map = (Map) b2.f12229i.get();
                        if (map != null) {
                            return map;
                        }
                        JSONObject jSONObject3 = (JSONObject) b2.f12227f.getValue();
                        if (jSONObject3 == null || (optJSONArray = jSONObject3.optJSONArray("paths")) == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int length = optJSONArray.length();
                        for (int i102 = 0; i102 < length; i102++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i102);
                            if (optJSONObject2 != null && (optString2 = optJSONObject2.optString("key")) != null && (optString3 = optJSONObject2.optString("value")) != null) {
                                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("replacePathOrQueryKeys");
                                if (optJSONArray2 != null) {
                                    arrayList = new ArrayList();
                                    int length2 = optJSONArray2.length();
                                    for (int i11 = 0; i11 < length2; i11++) {
                                        String optString4 = optJSONArray2.optString(i11);
                                        kotlin.jvm.internal.l.d(optString4, "optString(...)");
                                        arrayList.add(optString4);
                                    }
                                } else {
                                    arrayList = null;
                                }
                                linkedHashMap2.put(optString2, new y(optString3, arrayList));
                            }
                        }
                        b2.f12229i.set(linkedHashMap2);
                        return linkedHashMap2;
                }
            }
        });
        final int i11 = 2;
        this.f12228h = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: Z9.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B f12316b;

            {
                this.f12316b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                String optString;
                JSONObject optJSONObject;
                JSONArray optJSONArray;
                String optString2;
                String optString3;
                ArrayList arrayList;
                switch (i11) {
                    case 0:
                        String g = this.f12316b.f12225d.g("sctv_config");
                        if (g.length() <= 0) {
                            g = null;
                        }
                        if (g == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(g);
                        } catch (Exception unused) {
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.f12316b.f12227f.getValue();
                        if (jSONObject != null && (optString = jSONObject.optString("baseBackendUrl")) != null) {
                            if (optString.length() <= 0) {
                                optString = null;
                            }
                            if (optString != null) {
                                return optString;
                            }
                        }
                        return "https://apicdn.sctvonline.vn/";
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.f12316b.f12227f.getValue();
                        if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("headers")) == null) {
                            return (Map) B.k.getValue();
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator<String> keys = optJSONObject.keys();
                        kotlin.jvm.internal.l.d(keys, "keys(...)");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            linkedHashMap.put(next, optJSONObject.optString(next));
                        }
                        return linkedHashMap;
                    default:
                        B b2 = this.f12316b;
                        Map map = (Map) b2.f12229i.get();
                        if (map != null) {
                            return map;
                        }
                        JSONObject jSONObject3 = (JSONObject) b2.f12227f.getValue();
                        if (jSONObject3 == null || (optJSONArray = jSONObject3.optJSONArray("paths")) == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int length = optJSONArray.length();
                        for (int i102 = 0; i102 < length; i102++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i102);
                            if (optJSONObject2 != null && (optString2 = optJSONObject2.optString("key")) != null && (optString3 = optJSONObject2.optString("value")) != null) {
                                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("replacePathOrQueryKeys");
                                if (optJSONArray2 != null) {
                                    arrayList = new ArrayList();
                                    int length2 = optJSONArray2.length();
                                    for (int i112 = 0; i112 < length2; i112++) {
                                        String optString4 = optJSONArray2.optString(i112);
                                        kotlin.jvm.internal.l.d(optString4, "optString(...)");
                                        arrayList.add(optString4);
                                    }
                                } else {
                                    arrayList = null;
                                }
                                linkedHashMap2.put(optString2, new y(optString3, arrayList));
                            }
                        }
                        b2.f12229i.set(linkedHashMap2);
                        return linkedHashMap2;
                }
            }
        });
        this.f12229i = new AtomicReference(null);
        final int i12 = 3;
        this.j = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: Z9.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B f12316b;

            {
                this.f12316b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                String optString;
                JSONObject optJSONObject;
                JSONArray optJSONArray;
                String optString2;
                String optString3;
                ArrayList arrayList;
                switch (i12) {
                    case 0:
                        String g = this.f12316b.f12225d.g("sctv_config");
                        if (g.length() <= 0) {
                            g = null;
                        }
                        if (g == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(g);
                        } catch (Exception unused) {
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.f12316b.f12227f.getValue();
                        if (jSONObject != null && (optString = jSONObject.optString("baseBackendUrl")) != null) {
                            if (optString.length() <= 0) {
                                optString = null;
                            }
                            if (optString != null) {
                                return optString;
                            }
                        }
                        return "https://apicdn.sctvonline.vn/";
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.f12316b.f12227f.getValue();
                        if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("headers")) == null) {
                            return (Map) B.k.getValue();
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator<String> keys = optJSONObject.keys();
                        kotlin.jvm.internal.l.d(keys, "keys(...)");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            linkedHashMap.put(next, optJSONObject.optString(next));
                        }
                        return linkedHashMap;
                    default:
                        B b2 = this.f12316b;
                        Map map = (Map) b2.f12229i.get();
                        if (map != null) {
                            return map;
                        }
                        JSONObject jSONObject3 = (JSONObject) b2.f12227f.getValue();
                        if (jSONObject3 == null || (optJSONArray = jSONObject3.optJSONArray("paths")) == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int length = optJSONArray.length();
                        for (int i102 = 0; i102 < length; i102++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i102);
                            if (optJSONObject2 != null && (optString2 = optJSONObject2.optString("key")) != null && (optString3 = optJSONObject2.optString("value")) != null) {
                                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("replacePathOrQueryKeys");
                                if (optJSONArray2 != null) {
                                    arrayList = new ArrayList();
                                    int length2 = optJSONArray2.length();
                                    for (int i112 = 0; i112 < length2; i112++) {
                                        String optString4 = optJSONArray2.optString(i112);
                                        kotlin.jvm.internal.l.d(optString4, "optString(...)");
                                        arrayList.add(optString4);
                                    }
                                } else {
                                    arrayList = null;
                                }
                                linkedHashMap2.put(optString2, new y(optString3, arrayList));
                            }
                        }
                        b2.f12229i.set(linkedHashMap2);
                        return linkedHashMap2;
                }
            }
        });
    }

    @Override // Y9.a
    public final gb.i a() {
        final int i7 = 0;
        int i10 = 2;
        final int i11 = 1;
        return new C2009c(gb.i.k(new sb.q(new sb.q(new sb.q(new sb.g(new qb.m(new gb.j(this) { // from class: Z9.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B f12314b;

            {
                this.f12314b = this;
            }

            @Override // gb.j
            public final void d(C2010d c2010d) {
                B b2;
                ArrayList arrayList;
                switch (i11) {
                    case 0:
                        B b10 = this.f12314b;
                        List list = (List) b10.f12226e.getValue();
                        ArrayList arrayList2 = new ArrayList(Eb.p.S(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((TVChannelGroup) it.next()).name());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        boolean z8 = false;
                        AtomicInteger atomicInteger = new AtomicInteger(0);
                        u8.c remoteConfig = b10.f12225d;
                        C0918a tvStorage = b10.f12224c;
                        kotlin.jvm.internal.l.e(remoteConfig, "remoteConfig");
                        kotlin.jvm.internal.l.e(tvStorage, "tvStorage");
                        remoteConfig.b();
                        boolean c10 = remoteConfig.c();
                        long f4 = remoteConfig.f("version_need_refresh");
                        long j = tvStorage.f14463b.getLong("version_need_refresh".concat("_refresh_version"), 1L);
                        String message = "{useOnlineData: " + c10 + ", version: " + f4 + ", refreshedVersion: " + j + "}";
                        kotlin.jvm.internal.l.e(message, "message");
                        if (c10 && f4 > j) {
                            z8 = true;
                        }
                        boolean z10 = z8;
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (b10.f12224c.d(str).isEmpty() || z10) {
                                w wVar = new w(b10, str, arrayList3, atomicInteger, arrayList2, c2010d, z10);
                                G7.f fVar = b10.f12223b;
                                synchronized (fVar) {
                                    if (fVar.f4364c == null) {
                                        fVar.f4362a.getClass();
                                        fVar.f4364c = L7.l.a(fVar.f4363b, fVar.f4362a);
                                    }
                                }
                                L7.j jVar = fVar.f4364c;
                                C0385e c0385e = C0385e.f6337d;
                                Q7.e eVar = Q7.e.f8679f;
                                if (c0385e.isEmpty()) {
                                    O7.l.b(str);
                                } else {
                                    O7.l.a(str);
                                }
                                G7.d dVar = new G7.d(jVar, c0385e.i(new C0385e(str)));
                                jVar.getClass();
                                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                b2 = b10;
                                arrayList = arrayList2;
                                ((O7.b) ((C0384d) jVar.f6362i).f6333e.f27b).execute(new L7.i(jVar, dVar, taskCompletionSource, jVar, 0));
                                Task addOnSuccessListener = taskCompletionSource.getTask().addOnSuccessListener(new Q9.a(new Aa.t(23, wVar, str), 6));
                                kotlin.jvm.internal.l.d(addOnSuccessListener, "addOnSuccessListener(...)");
                                addOnSuccessListener.addOnFailureListener(new F8.a(9, atomicInteger, c2010d));
                            } else {
                                arrayList3.addAll(b10.f12224c.d(str));
                                if (atomicInteger.incrementAndGet() == arrayList2.size()) {
                                    if (c2010d.g()) {
                                        return;
                                    }
                                    c2010d.d(arrayList3);
                                    c2010d.a();
                                }
                                b2 = b10;
                                arrayList = arrayList2;
                            }
                            b10 = b2;
                            arrayList2 = arrayList;
                        }
                        return;
                    default:
                        NetworkUtilsKt.trustEveryone();
                        OkHttpClient okHttpClient = this.f12314b.f12222a;
                        Request.Builder builder = new Request.Builder();
                        builder.e("https://apicdn.sctvonline.vn/backend/cm/menu/sctv-mobile/");
                        builder.b("origin", "https://sctvonline.vn");
                        builder.b("referer", "https://sctvonline.vn/");
                        Response e2 = okHttpClient.b(new Request(builder)).e();
                        int i12 = e2.f22442d;
                        if (200 > i12 || i12 >= 300) {
                            if (c2010d.g()) {
                                return;
                            }
                            c2010d.e(new Throwable("canretry"));
                            return;
                        }
                        if (new G8.m().b(e2.f22445u.K(), new N8.a(Bc.m.class)) != null) {
                            throw new ClassCastException();
                        }
                        if (c2010d.g()) {
                            return;
                        }
                        c2010d.d(null);
                        c2010d.a();
                        return;
                }
            }
        }, i10), new R7.b(new AtomicInteger(2), 15), 3), C0668e.f12266u, i11), new C0668e(8), i11).j(new A(this), com.google.android.gms.common.api.f.API_PRIORITY_OTHER), C0668e.f12267v, i11), new qb.m(new gb.j(this) { // from class: Z9.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B f12314b;

            {
                this.f12314b = this;
            }

            @Override // gb.j
            public final void d(C2010d c2010d) {
                B b2;
                ArrayList arrayList;
                switch (i7) {
                    case 0:
                        B b10 = this.f12314b;
                        List list = (List) b10.f12226e.getValue();
                        ArrayList arrayList2 = new ArrayList(Eb.p.S(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((TVChannelGroup) it.next()).name());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        boolean z8 = false;
                        AtomicInteger atomicInteger = new AtomicInteger(0);
                        u8.c remoteConfig = b10.f12225d;
                        C0918a tvStorage = b10.f12224c;
                        kotlin.jvm.internal.l.e(remoteConfig, "remoteConfig");
                        kotlin.jvm.internal.l.e(tvStorage, "tvStorage");
                        remoteConfig.b();
                        boolean c10 = remoteConfig.c();
                        long f4 = remoteConfig.f("version_need_refresh");
                        long j = tvStorage.f14463b.getLong("version_need_refresh".concat("_refresh_version"), 1L);
                        String message = "{useOnlineData: " + c10 + ", version: " + f4 + ", refreshedVersion: " + j + "}";
                        kotlin.jvm.internal.l.e(message, "message");
                        if (c10 && f4 > j) {
                            z8 = true;
                        }
                        boolean z10 = z8;
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (b10.f12224c.d(str).isEmpty() || z10) {
                                w wVar = new w(b10, str, arrayList3, atomicInteger, arrayList2, c2010d, z10);
                                G7.f fVar = b10.f12223b;
                                synchronized (fVar) {
                                    if (fVar.f4364c == null) {
                                        fVar.f4362a.getClass();
                                        fVar.f4364c = L7.l.a(fVar.f4363b, fVar.f4362a);
                                    }
                                }
                                L7.j jVar = fVar.f4364c;
                                C0385e c0385e = C0385e.f6337d;
                                Q7.e eVar = Q7.e.f8679f;
                                if (c0385e.isEmpty()) {
                                    O7.l.b(str);
                                } else {
                                    O7.l.a(str);
                                }
                                G7.d dVar = new G7.d(jVar, c0385e.i(new C0385e(str)));
                                jVar.getClass();
                                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                b2 = b10;
                                arrayList = arrayList2;
                                ((O7.b) ((C0384d) jVar.f6362i).f6333e.f27b).execute(new L7.i(jVar, dVar, taskCompletionSource, jVar, 0));
                                Task addOnSuccessListener = taskCompletionSource.getTask().addOnSuccessListener(new Q9.a(new Aa.t(23, wVar, str), 6));
                                kotlin.jvm.internal.l.d(addOnSuccessListener, "addOnSuccessListener(...)");
                                addOnSuccessListener.addOnFailureListener(new F8.a(9, atomicInteger, c2010d));
                            } else {
                                arrayList3.addAll(b10.f12224c.d(str));
                                if (atomicInteger.incrementAndGet() == arrayList2.size()) {
                                    if (c2010d.g()) {
                                        return;
                                    }
                                    c2010d.d(arrayList3);
                                    c2010d.a();
                                }
                                b2 = b10;
                                arrayList = arrayList2;
                            }
                            b10 = b2;
                            arrayList2 = arrayList;
                        }
                        return;
                    default:
                        NetworkUtilsKt.trustEveryone();
                        OkHttpClient okHttpClient = this.f12314b.f12222a;
                        Request.Builder builder = new Request.Builder();
                        builder.e("https://apicdn.sctvonline.vn/backend/cm/menu/sctv-mobile/");
                        builder.b("origin", "https://sctvonline.vn");
                        builder.b("referer", "https://sctvonline.vn/");
                        Response e2 = okHttpClient.b(new Request(builder)).e();
                        int i12 = e2.f22442d;
                        if (200 > i12 || i12 >= 300) {
                            if (c2010d.g()) {
                                return;
                            }
                            c2010d.e(new Throwable("canretry"));
                            return;
                        }
                        if (new G8.m().b(e2.f22445u.K(), new N8.a(Bc.m.class)) != null) {
                            throw new ClassCastException();
                        }
                        if (c2010d.g()) {
                            return;
                        }
                        c2010d.d(null);
                        c2010d.a();
                        return;
                }
            }
        }, i10)), gb.d.f17483a);
    }

    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        String str;
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        if (!kotlin.jvm.internal.l.a(tvChannel.getSourceFrom(), "SCTV")) {
            try {
                HttpUrl.Companion companion = HttpUrl.j;
                List<TVChannel.Url> urls = tvChannel.getUrls();
                ListIterator<TVChannel.Url> listIterator = urls.listIterator(urls.size());
                while (listIterator.hasPrevious()) {
                    TVChannel.Url previous = listIterator.previous();
                    if (kotlin.jvm.internal.l.a(previous.getDataSource(), "sctv")) {
                        String url = previous.getUrl();
                        companion.getClass();
                        ArrayList arrayList = HttpUrl.Companion.b(url).f22340f;
                        ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
                        while (listIterator2.hasPrevious()) {
                            Object previous2 = listIterator2.previous();
                            if (!ac.g.h0((String) previous2)) {
                                str = (String) previous2;
                            }
                        }
                        throw new NoSuchElementException("List contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("List contains no element matching the predicate.");
            } catch (NoSuchElementException unused) {
                return gb.i.i(new Throwable("Not url support SCTV source"));
            }
        }
        str = tvChannel.getChannelId();
        return new qb.m(new M9.e(this, str, tvChannel, 4), 2).o(3L);
    }

    public final String c(String str) {
        Map map = (Map) this.j.getValue();
        y yVar = map != null ? (y) map.get("linkStream") : null;
        String obj = yVar != null ? ac.g.v0(yVar.f12326a).toString() : null;
        return (obj == null || obj.length() == 0) ? S.b("https://apicdn.sctvonline.vn/", ac.n.W("tenants/sctv/contents/{channel_slug}/view?select=", "{channel_slug}", str), "{\"Content\":[\"current_season\",\"id\",\"slug\",\"is_watchable\",\"progress\",\"youtube_video_id\",\"link_play\",\"play_info\",\"payment_infors\",\"is_favorite\",\"badges\",\"cwl_info\",\"warning_message\",\"price\",\"payment_type\",\"drm_session_info\"]}") : X.c.h((String) this.g.getValue(), ac.n.W(obj, "{channel_slug}", str));
    }
}
