package M9;

import A0.G0;
import Eb.AbstractC0250a;
import Eb.D;
import I2.K;
import P4.G;
import Z9.C0666c;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import androidx.work.WorkerParameters;
import b4.C0837h;
import b4.C0838i;
import b4.C0840k;
import ca.C0918a;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kt.apps.autoupdate.usecase.DownloadFileWorker;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.JsoupResponse;
import com.kt.apps.core.utils.JsoupUtilsKt;
import com.kt.apps.core.utils.NetworkUtilsKt;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import e4.C1085a;
import e4.C1086b;
import e4.C1088d;
import e4.C1089e;
import e4.C1090f;
import e4.C1091g;
import e4.EnumC1087c;
import ea.C1112g;
import g4.C1196a;
import h3.C1249k;
import h3.H;
import i1.C1290a;
import i4.C1345a;
import i4.C1346b;
import j4.InterfaceC1376b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import k8.C1433a;
import kotlin.jvm.internal.v;
import l4.AbstractC1485a;
import ma.C1651b;
import ma.C1652c;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import org.json.JSONObject;
import r7.C1947c;
import rc.AbstractC1958b;
import rc.B;
import rc.C1959c;
import rc.C1964h;
import rc.InterfaceC1966j;
import sb.C2010d;
import t9.C2035a;
import tb.C2037a;
import v8.C2151e;
import v8.C2155i;
import w8.RunnableC2224a;
import y7.u0;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements gb.j, gb.r, OnCompleteListener, InterfaceC1376b, a1.j, i4.e, SuccessContinuation, Continuation, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6855c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6856d;

    public /* synthetic */ e(Z9.s sVar, u8.c cVar, C0918a c0918a, C2037a c2037a) {
        this.f6853a = 3;
        this.f6855c = cVar;
        this.f6856d = c0918a;
        this.f6854b = c2037a;
    }

    public /* synthetic */ e(BufferedReader bufferedReader, d dVar, t tVar) {
        this.f6853a = 1;
        this.f6855c = bufferedReader;
        this.f6854b = dVar;
        this.f6856d = tVar;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i7) {
        this.f6853a = i7;
        this.f6855c = obj;
        this.f6856d = obj2;
        this.f6854b = obj3;
    }

    @Override // a1.j
    public Object a(a1.i iVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        h3.s sVar = new h3.s(atomicBoolean, 0);
        h3.n nVar = h3.n.f17701a;
        a1.n nVar2 = iVar.f12473c;
        if (nVar2 != null) {
            nVar2.a(sVar, nVar);
        }
        ((Executor) this.f6855c).execute(new G(atomicBoolean, iVar, (Rb.a) this.f6854b, 4));
        return (String) this.f6856d;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [Y.k, java.lang.Object] */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        i4.g gVar;
        EnumC1087c enumC1087c;
        EnumC1087c enumC1087c2;
        int i7 = 5;
        int i10 = 4;
        int i11 = 3;
        EnumC1087c enumC1087c3 = EnumC1087c.CACHE_FULL;
        int i12 = 2;
        Object obj2 = this.f6854b;
        int i13 = 0;
        Object obj3 = this.f6856d;
        Object obj4 = this.f6855c;
        int i14 = 1;
        switch (this.f6853a) {
            case 9:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                i4.g gVar2 = (i4.g) obj4;
                long simpleQueryForLong = gVar2.l().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar2.l().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C1345a c1345a = gVar2.f18415d;
                long j = c1345a.f18401a;
                C0837h c0837h = (C0837h) obj3;
                String str = c0837h.f13851a;
                if (simpleQueryForLong >= j) {
                    gVar2.P(1L, enumC1087c3, str);
                    return -1L;
                }
                C0838i c0838i = (C0838i) obj2;
                Long n6 = i4.g.n(sQLiteDatabase, c0838i);
                if (n6 != null) {
                    insert = n6.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c0838i.f13859a);
                    contentValues.put("priority", Integer.valueOf(AbstractC1485a.a(c0838i.f13861c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c0838i.f13860b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                C0840k c0840k = c0837h.f13853c;
                byte[] bArr2 = c0840k.f13869b;
                int length = bArr2.length;
                int i15 = c1345a.f18405e;
                boolean z8 = length <= i15;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c0837h.f13854d));
                contentValues2.put("uptime_ms", Long.valueOf(c0837h.f13855e));
                contentValues2.put("payload_encoding", c0840k.f13868a.f11148a);
                contentValues2.put("code", c0837h.f13852b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z8));
                contentValues2.put("payload", z8 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", c0837h.g);
                contentValues2.put("pseudonymous_id", c0837h.f13857h);
                contentValues2.put("experiment_ids_clear_blob", c0837h.f13858i);
                contentValues2.put("experiment_ids_encrypted_blob", c0837h.j);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z8) {
                    int ceil = (int) Math.ceil(bArr2.length / i15);
                    for (int i16 = 1; i16 <= ceil; i16++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i16 - 1) * i15, Math.min(i16 * i15, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i16));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c0837h.f13856f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 10:
                Cursor cursor = (Cursor) obj;
                i4.g gVar3 = (i4.g) obj4;
                gVar3.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    int i17 = cursor.getInt(7) != 0 ? i14 : 0;
                    ?? obj5 = new Object();
                    obj5.f11059f = new HashMap();
                    String string = cursor.getString(i14);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    obj5.f11054a = string;
                    obj5.f11057d = Long.valueOf(cursor.getLong(i12));
                    obj5.f11058e = Long.valueOf(cursor.getLong(3));
                    if (i17 != 0) {
                        String string2 = cursor.getString(4);
                        obj5.f11056c = new C0840k(string2 == null ? i4.g.f18411f : new Y3.c(string2), cursor.getBlob(5));
                        gVar = gVar3;
                    } else {
                        String string3 = cursor.getString(4);
                        Y3.c cVar = string3 == null ? i4.g.f18411f : new Y3.c(string3);
                        Cursor query = gVar3.l().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int i18 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList.add(blob);
                                i18 += blob.length;
                            }
                            byte[] bArr3 = new byte[i18];
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i19);
                                ArrayList arrayList2 = arrayList;
                                i4.g gVar4 = gVar3;
                                System.arraycopy(bArr4, 0, bArr3, i20, bArr4.length);
                                i20 += bArr4.length;
                                i19++;
                                arrayList = arrayList2;
                                gVar3 = gVar4;
                            }
                            gVar = gVar3;
                            query.close();
                            obj5.f11056c = new C0840k(cVar, bArr3);
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        obj5.f11055b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        obj5.g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        obj5.f11060h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        obj5.f11061i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        obj5.j = cursor.getBlob(11);
                    }
                    ((ArrayList) obj3).add(new C1346b(j10, (C0838i) obj2, obj5.d()));
                    gVar3 = gVar;
                    i12 = 2;
                    i14 = 1;
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                i4.g gVar5 = (i4.g) obj4;
                gVar5.getClass();
                while (true) {
                    HashMap hashMap = (HashMap) obj3;
                    if (cursor2.moveToNext()) {
                        String string4 = cursor2.getString(i13);
                        int i21 = cursor2.getInt(1);
                        EnumC1087c enumC1087c4 = EnumC1087c.REASON_UNKNOWN;
                        if (i21 != 0) {
                            if (i21 == 1) {
                                enumC1087c4 = EnumC1087c.MESSAGE_TOO_OLD;
                            } else if (i21 == 2) {
                                enumC1087c = enumC1087c3;
                                enumC1087c2 = enumC1087c;
                                long j11 = cursor2.getLong(2);
                                if (hashMap.containsKey(string4)) {
                                    hashMap.put(string4, new ArrayList());
                                }
                                ((List) hashMap.get(string4)).add(new C1088d(j11, enumC1087c));
                                enumC1087c3 = enumC1087c2;
                                i7 = 5;
                                i10 = 4;
                                i11 = 3;
                                i13 = 0;
                            } else if (i21 == i11) {
                                enumC1087c4 = EnumC1087c.PAYLOAD_TOO_BIG;
                            } else if (i21 == i10) {
                                enumC1087c4 = EnumC1087c.MAX_RETRIES_REACHED;
                            } else if (i21 == i7) {
                                enumC1087c4 = EnumC1087c.INVALID_PAYLOD;
                            } else if (i21 == 6) {
                                enumC1087c4 = EnumC1087c.SERVER_ERROR;
                            } else {
                                android.support.v4.media.session.b.l(Integer.valueOf(i21), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                            }
                        }
                        enumC1087c2 = enumC1087c3;
                        enumC1087c = enumC1087c4;
                        long j112 = cursor2.getLong(2);
                        if (hashMap.containsKey(string4)) {
                        }
                        ((List) hashMap.get(string4)).add(new C1088d(j112, enumC1087c));
                        enumC1087c3 = enumC1087c2;
                        i7 = 5;
                        i10 = 4;
                        i11 = 3;
                        i13 = 0;
                    } else {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            r8.o oVar = (r8.o) obj2;
                            if (!it.hasNext()) {
                                long b2 = gVar5.f18413b.b();
                                SQLiteDatabase l10 = gVar5.l();
                                l10.beginTransaction();
                                try {
                                    Cursor rawQuery = l10.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        rawQuery.moveToNext();
                                        C1091g c1091g = new C1091g(rawQuery.getLong(0), b2);
                                        rawQuery.close();
                                        l10.setTransactionSuccessful();
                                        l10.endTransaction();
                                        oVar.f23858c = c1091g;
                                        oVar.f23860e = new C1086b(new C1090f(gVar5.l().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar5.l().compileStatement("PRAGMA page_count").simpleQueryForLong(), C1345a.f18400f.f18401a));
                                        oVar.f23857b = (String) gVar5.f18416e.get();
                                        return new C1085a((C1091g) oVar.f23858c, Collections.unmodifiableList((ArrayList) oVar.f23859d), (C1086b) oVar.f23860e, (String) oVar.f23857b);
                                    } catch (Throwable th2) {
                                        rawQuery.close();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    l10.endTransaction();
                                    throw th3;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i22 = C1089e.f16793c;
                            new ArrayList();
                            ((ArrayList) oVar.f23859d).add(new C1089e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
        }
    }

    @Override // gb.r
    public void c(C2037a c2037a) {
        File file;
        switch (this.f6853a) {
            case 2:
                u8.c cVar = (u8.c) this.f6855c;
                cVar.b().addOnCompleteListener(new e((Z9.s) this.f6856d, cVar, (C0918a) this.f6854b, c2037a)).addOnFailureListener(new Q9.a(c2037a, 3));
                return;
            default:
                DownloadFileWorker downloadFileWorker = (DownloadFileWorker) this.f6855c;
                OkHttpClient okHttpClient = (OkHttpClient) downloadFileWorker.f15909f.getValue();
                Request.Builder builder = new Request.Builder();
                builder.e((String) this.f6856d);
                Response e2 = okHttpClient.b(new Request(builder)).e();
                File file2 = new File(downloadFileWorker.f17718a.getFilesDir(), "Update/newVersion");
                C1249k c1249k = downloadFileWorker.f17719b.f13734b;
                c1249k.getClass();
                Object obj = c1249k.f17699a.get("extra:file_length");
                long longValue = ((Number) (obj instanceof Long ? obj : 17825792L)).longValue();
                if (c2037a.g()) {
                    return;
                }
                int i7 = e2.f22442d;
                if (200 > i7 || i7 >= 300) {
                    _UtilCommonKt.a(e2);
                    c2037a.a(new C2035a());
                    return;
                }
                InterfaceC1966j F10 = e2.f22445u.F();
                B b2 = AbstractC1958b.b(new C1959c(1, new FileOutputStream(file2, false), new Object()));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("extra:progress", Float.valueOf(0.0f));
                C1249k c1249k2 = new C1249k(linkedHashMap);
                c2.i.y(c1249k2);
                WorkerParameters workerParameters = downloadFileWorker.f17719b;
                r3.p pVar = workerParameters.g;
                UUID uuid = workerParameters.f13733a;
                q3.f.n((K) pVar.f23690b.f23382a, "updateProgress", new okhttp3.internal.connection.a(pVar, uuid, c1249k2, 1));
                long j = 0;
                while (true) {
                    C1964h c1964h = b2.f23926b;
                    long O10 = F10.O(8192L, c1964h);
                    if (O10 == -1) {
                        File file3 = file2;
                        b2.flush();
                        b2.close();
                        F10.close();
                        _UtilCommonKt.a(e2);
                        if (com.bumptech.glide.c.i(file3, (String) this.f6854b)) {
                            c2037a.c(file3);
                            return;
                        } else {
                            c2037a.a(new C2035a());
                            return;
                        }
                    }
                    if (b2.f23927c) {
                        throw new IllegalStateException("closed");
                    }
                    long j10 = c1964h.f23966b;
                    if (j10 > 0) {
                        file = file2;
                        b2.f23925a.m(j10, c1964h);
                    } else {
                        file = file2;
                    }
                    j += O10;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("extra:progress", Float.valueOf(((float) j) / ((float) longValue)));
                    C1249k c1249k3 = new C1249k(linkedHashMap2);
                    c2.i.y(c1249k3);
                    WorkerParameters workerParameters2 = downloadFileWorker.f17719b;
                    r3.p pVar2 = workerParameters2.g;
                    UUID uuid2 = workerParameters2.f13733a;
                    q3.f.n((K) pVar2.f23690b.f23382a, "updateProgress", new okhttp3.internal.connection.a(pVar2, uuid2, c1249k3, 1));
                    file2 = file;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:450:0x0c0d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x09e0 A[SYNTHETIC] */
    @Override // gb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(C2010d c2010d) {
        Bc.k kVar;
        String str;
        String a9;
        Bc.k kVar2;
        String name;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        int f02;
        int f03;
        r8.o a10;
        TVChannel.Url fromUrl;
        JSONObject optJSONObject;
        String string;
        String findFirstNumber;
        String str2;
        ka.c cVar;
        Iterable iterable;
        e eVar = this;
        switch (eVar.f6853a) {
            case 0:
                OkHttpClient.Builder a11 = ((k) eVar.f6855c).f6874a.a();
                a11.a(2L, TimeUnit.MINUTES);
                TimeUnit unit = TimeUnit.SECONDS;
                kotlin.jvm.internal.l.e(unit, "unit");
                a11.f22411x = _UtilJvmKt.b(30L, unit);
                a11.f22412y = _UtilJvmKt.b(90L, unit);
                OkHttpClient okHttpClient = new OkHttpClient(a11);
                Request.Builder builder = new Request.Builder();
                String str3 = (String) eVar.f6856d;
                builder.e(str3);
                builder.a("Content-Type", "text/xml");
                Response e2 = okHttpClient.b(new Request(builder)).e();
                int i7 = e2.f22442d;
                if (200 > i7 || i7 >= 300) {
                    if (i7 != 403 && i7 != 404 && i7 != 502) {
                        throw new Throwable(e2.f22441c);
                    }
                    throw new f(1);
                }
                boolean a12 = kotlin.jvm.internal.l.a(e2.f22444f.b("content-type"), "application/octet-stream");
                ResponseBody responseBody = e2.f22445u;
                try {
                    G0 g02 = new G0(Bc.n.f2313a.a(a12 ? new GZIPInputStream(responseBody.F().S()) : responseBody.F().S()));
                    String str4 = null;
                    if (((Bc.m) g02.f29d).isEmpty()) {
                        kVar = g02.N(null);
                        if (kVar == null) {
                            throw new Exception("Document has no root element");
                        }
                    } else {
                        kVar = null;
                    }
                    kotlin.jvm.internal.l.b(kVar);
                    G0 g03 = (G0) kVar.f2311c;
                    Bc.k N10 = g03.N(kVar);
                    ArrayList arrayList2 = new ArrayList();
                    while (N10 != null) {
                        Bc.h hVar = (Bc.h) N10.f2312d;
                        String name2 = hVar.getName();
                        kotlin.jvm.internal.l.d(name2, "getName(...)");
                        boolean a13 = kotlin.jvm.internal.l.a(ac.g.v0(name2).toString(), "tv");
                        Bc.l lVar = (Bc.l) N10.f2310b;
                        d dVar = (d) eVar.f6854b;
                        String str5 = "";
                        if (a13) {
                            N9.b bVar = new N9.b("", "", "", "", "", "");
                            try {
                                String str6 = dVar.f6851b;
                                kotlin.jvm.internal.l.e(str6, "<set-?>");
                                bVar.f7404e = str6;
                                bVar.f7405f = str3;
                                Bc.k kVar3 = (Bc.k) lVar.get("generator-info-name");
                                if (kVar3 == null || (str = kVar3.a()) == null) {
                                    str = "";
                                }
                                bVar.f7402c = str;
                                Bc.k kVar4 = (Bc.k) lVar.get("generator-info-url");
                                if (kVar4 != null && (a9 = kVar4.a()) != null) {
                                    str5 = a9;
                                }
                                bVar.f7403d = str5;
                            } catch (Exception unused) {
                            }
                            if (c2010d.g()) {
                                return;
                            } else {
                                c2010d.d(bVar);
                            }
                        } else {
                            Bc.m mVar = (Bc.m) ((G0) N10.f2311c).f29d;
                            if ((mVar.size() <= 0 ? null : mVar.get(0)) != N10) {
                                String name3 = hVar.getName();
                                kotlin.jvm.internal.l.d(name3, "getName(...)");
                                if (kotlin.jvm.internal.l.a(ac.g.v0(name3).toString(), "channel")) {
                                    kotlin.jvm.internal.l.d(((Bc.k) lVar.get("id")).a(), "getValue(...)");
                                    N10 = g03.N(kVar);
                                    while (N10 != null) {
                                        Bc.h hVar2 = (Bc.h) N10.f2312d;
                                        String name4 = hVar2.getName();
                                        kotlin.jvm.internal.l.d(name4, "getName(...)");
                                        if (!kotlin.jvm.internal.l.a(ac.g.v0(name4).toString(), "channel")) {
                                            String name5 = hVar2.getName();
                                            kotlin.jvm.internal.l.d(name5, "getName(...)");
                                            if (!kotlin.jvm.internal.l.a(ac.g.v0(name5).toString(), "programme")) {
                                                String name6 = hVar2.getName();
                                                kotlin.jvm.internal.l.d(name6, "getName(...)");
                                                String obj = ac.g.v0(name6).toString();
                                                int hashCode = obj.hashCode();
                                                if (hashCode != 3226745) {
                                                    if (hashCode != 207957684) {
                                                        if (hashCode == 1568910518 && obj.equals("display-name")) {
                                                            N10.a();
                                                        }
                                                    } else if (obj.equals("display-number")) {
                                                        N10.a();
                                                    }
                                                } else if (obj.equals("icon") && (kVar2 = (Bc.k) ((Bc.l) N10.f2310b).get("src")) != null) {
                                                    kVar2.a();
                                                }
                                                N10 = g03.N(kVar);
                                            }
                                        }
                                        if (N10 == null) {
                                        }
                                    }
                                    if (N10 == null) {
                                    }
                                } else {
                                    String name7 = hVar.getName();
                                    kotlin.jvm.internal.l.d(name7, "getName(...)");
                                    if (kotlin.jvm.internal.l.a(ac.g.v0(name7).toString(), "programme")) {
                                        N9.a aVar = new N9.a(255, str4, str4);
                                        aVar.f7396v = str3;
                                        String str7 = dVar.f6851b;
                                        kotlin.jvm.internal.l.e(str7, "<set-?>");
                                        aVar.f7395u = str7;
                                        String a14 = ((Bc.k) lVar.get("channel")).a();
                                        if (a14 == null) {
                                            a14 = "";
                                        }
                                        aVar.f7389a = a14;
                                        String a15 = ((Bc.k) lVar.get("start")).a();
                                        if (a15 == null) {
                                            a15 = "";
                                        }
                                        aVar.f7391c = a15;
                                        String a16 = ((Bc.k) lVar.get("stop")).a();
                                        if (a16 == null) {
                                            a16 = "";
                                        }
                                        aVar.f7392d = a16;
                                        Bc.k N11 = g03.N(kVar);
                                        String name8 = ((Bc.h) N11.f2312d).getName();
                                        kotlin.jvm.internal.l.d(name8, "getName(...)");
                                        String obj2 = ac.g.v0(name8).toString();
                                        while (N11 != null && !kotlin.jvm.internal.l.a(obj2, "channel") && !kotlin.jvm.internal.l.a(obj2, "programme")) {
                                            if (kotlin.jvm.internal.l.a(obj2, "title")) {
                                                String a17 = N11.a();
                                                if (a17 == null) {
                                                    a17 = "";
                                                }
                                                aVar.f7393e = a17;
                                            } else if (kotlin.jvm.internal.l.a(obj2, "desc")) {
                                                String a18 = N11.a();
                                                if (a18 == null) {
                                                    a18 = "";
                                                }
                                                aVar.f7394f = a18;
                                            }
                                            N11 = g03.N(kVar);
                                            if (N11 == null || (name = ((Bc.h) N11.f2312d).getName()) == null || (obj2 = ac.g.v0(name).toString()) == null) {
                                                obj2 = "";
                                            }
                                        }
                                        arrayList2.add(aVar);
                                        if (c2010d.g()) {
                                            return;
                                        }
                                        if (arrayList2.size() >= 500) {
                                            c2010d.d(arrayList2);
                                            arrayList2 = new ArrayList();
                                        }
                                        if (N11 != null) {
                                            N10 = N11;
                                        }
                                    }
                                }
                            }
                        }
                        N10 = g03.N(kVar);
                    }
                    if (c2010d.g()) {
                        return;
                    }
                    if (!arrayList2.isEmpty()) {
                        c2010d.d(arrayList2);
                    }
                    c2010d.a();
                    return;
                } catch (Exception unused2) {
                    if (c2010d.g()) {
                        return;
                    }
                    c2010d.onError(new f(0));
                    return;
                }
            case 1:
                BufferedReader bufferedReader = (BufferedReader) eVar.f6855c;
                d dVar2 = (d) eVar.f6854b;
                t t5 = (t) eVar.f6856d;
                String readLine = bufferedReader.readLine();
                String obj3 = readLine != null ? ac.g.w0(readLine).toString() : null;
                ArrayList arrayList3 = new ArrayList();
                String str8 = "";
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String str9 = dVar2.f6850a;
                boolean z8 = false;
                String str10 = "";
                String str11 = "";
                String str12 = "";
                String str13 = "";
                String str14 = "";
                String str15 = "";
                String str16 = "";
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                int i10 = 0;
                ArrayList arrayList4 = arrayList3;
                String str17 = obj3;
                while (str17 != null && !c2010d.g() && !Thread.currentThread().isInterrupted()) {
                    kotlin.jvm.internal.l.e(t5, "t");
                    if (ac.g.h0(ac.g.v0(str17).toString())) {
                        String readLine2 = bufferedReader.readLine();
                        str17 = readLine2 != null ? ac.g.w0(readLine2).toString() : null;
                    } else {
                        if (ac.n.Y(str17, "#EXTINF:", false) || ac.n.Y(str17, "EXTINF:", false)) {
                            ExtensionsChannel extensionsChannel = new ExtensionsChannel(str12, str11, ac.g.v0(str8).toString(), str16, str9, str10, -1L, z8, str13, str14, str15, linkedHashMap3, dVar2.f6851b);
                            if (extensionsChannel.isValidChannel()) {
                                synchronized (arrayList4) {
                                    try {
                                        arrayList4.add(extensionsChannel);
                                        i10++;
                                        if (arrayList4.size() > 100) {
                                            String message = "Insert to db: " + arrayList4.size();
                                            kotlin.jvm.internal.l.e(message, "message");
                                            if (!c2010d.g()) {
                                                c2010d.d(arrayList4);
                                            }
                                            arrayList = new ArrayList();
                                        } else {
                                            arrayList = arrayList4;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                arrayList4 = arrayList;
                            }
                            str10 = "";
                            str11 = "";
                            str12 = "";
                            str8 = "";
                            str13 = "";
                            str14 = "";
                            str15 = "";
                            str16 = "";
                            linkedHashMap = new LinkedHashMap();
                            z8 = false;
                        } else {
                            linkedHashMap = linkedHashMap3;
                        }
                        if (ac.g.b0(str17, "url-tvg")) {
                            k kVar5 = t5.f6917d;
                            Pattern REGEX_PROGRAM_SCHEDULE_URL = t.f6911s;
                            kotlin.jvm.internal.l.d(REGEX_PROGRAM_SCHEDULE_URL, "REGEX_PROGRAM_SCHEDULE_URL");
                            kVar5.a(dVar2, t.b(str17, REGEX_PROGRAM_SCHEDULE_URL));
                        }
                        if (ac.g.b0(str17, "catchup-source")) {
                            Pattern CHANNEL_CATCH_UP_SOURCE_REGEX = t.f6907o;
                            kotlin.jvm.internal.l.d(CHANNEL_CATCH_UP_SOURCE_REGEX, "CHANNEL_CATCH_UP_SOURCE_REGEX");
                            str13 = t.b(str17, CHANNEL_CATCH_UP_SOURCE_REGEX);
                        }
                        if (ac.g.b0(str17, "user-agent")) {
                            Pattern REGEX_USER_AGENT = t.f6903i;
                            kotlin.jvm.internal.l.d(REGEX_USER_AGENT, "REGEX_USER_AGENT");
                            str14 = t.b(str17, REGEX_USER_AGENT);
                        }
                        if (ac.g.b0(str17, "|Referer")) {
                            Pattern REFERER_REGEX = t.f6908p;
                            kotlin.jvm.internal.l.d(REFERER_REGEX, "REFERER_REGEX");
                            String b2 = t.b(str17, REFERER_REGEX);
                            linkedHashMap.put("referer", b2);
                            str15 = b2;
                        }
                        String n02 = ac.g.n0(str17, "#");
                        if ((ac.n.Y(n02, "http", false) || ac.n.Y(n02, "rtp", false) || ac.n.Y(n02, "udp", false)) && str16.length() == 0) {
                            String e10 = t.j.e(ac.g.v0(ac.g.n0(ac.g.v0(str17).toString(), "#")).toString());
                            while (ac.g.b0(e10, "|Referer")) {
                                Pattern REFERER_REGEX2 = t.f6908p;
                                kotlin.jvm.internal.l.d(REFERER_REGEX2, "REFERER_REGEX");
                                String concat = "|Referer=".concat(t.b(e10, REFERER_REGEX2));
                                if (ac.g.b0(e10, concat)) {
                                    e10 = ac.g.v0(ac.n.W(e10, concat, "")).toString();
                                } else if (ac.g.b0(e10, "|")) {
                                    e10 = e10.substring(0, ac.g.f0(e10, "|", 0, 6));
                                    kotlin.jvm.internal.l.d(e10, "substring(...)");
                                }
                            }
                            String obj4 = ac.g.v0(ac.g.o0(ac.g.v0(e10).toString(), "#")).toString();
                            if (ac.g.b0(obj4, "|")) {
                                obj4 = obj4.substring(0, ac.g.f0(obj4, "|", 0, 6));
                                kotlin.jvm.internal.l.d(obj4, "substring(...)");
                            }
                            str16 = obj4;
                        }
                        if (ac.g.b0(str17, "tvg-logo") || ac.g.b0(str17, "tvg-id") || ac.g.b0(str17, "group-title")) {
                            if (ac.g.b0(str17, "tvg-id")) {
                                Pattern CHANNEL_ID_REGEX = t.k;
                                kotlin.jvm.internal.l.d(CHANNEL_ID_REGEX, "CHANNEL_ID_REGEX");
                                str10 = t.b(str17, CHANNEL_ID_REGEX);
                            }
                            if (ac.g.b0(str17, "tvg-logo")) {
                                Pattern CHANNEL_LOGO_REGEX = t.f6904l;
                                kotlin.jvm.internal.l.d(CHANNEL_LOGO_REGEX, "CHANNEL_LOGO_REGEX");
                                str11 = t.b(str17, CHANNEL_LOGO_REGEX);
                            }
                            if (ac.g.b0(str17, "group-title")) {
                                Pattern CHANNEL_GROUP_TITLE_REGEX = t.f6905m;
                                kotlin.jvm.internal.l.d(CHANNEL_GROUP_TITLE_REGEX, "CHANNEL_GROUP_TITLE_REGEX");
                                str12 = t.b(str17, CHANNEL_GROUP_TITLE_REGEX);
                            }
                            ac.e eVar2 = t.f6906n;
                            if (eVar2.f12833a.matcher(str17).find() && (a10 = ac.e.a(eVar2, str17)) != null) {
                                Collection e11 = a10.e();
                                if (((AbstractC0250a) e11).isEmpty()) {
                                    e11 = null;
                                }
                                if (e11 != null && kotlin.jvm.internal.l.a((String) ((D) e11).get(0), "stream")) {
                                    z8 = true;
                                }
                            }
                            int i02 = ac.g.i0(6, str17, ",");
                            if (i02 >= 0 && i02 < str17.length()) {
                                String substring = str17.substring(i02 + 1);
                                kotlin.jvm.internal.l.d(substring, "substring(...)");
                                if (ac.g.b0(substring, "Tham gia group") && (f03 = ac.g.f0(substring, "Tham gia group", 0, 6)) > 0) {
                                    String substring2 = substring.substring(0, f03);
                                    kotlin.jvm.internal.l.d(substring2, "substring(...)");
                                    substring = ac.g.o0(ac.g.v0(substring2).toString(), "-");
                                }
                                if (ac.g.b0(substring, "Mời bạn tham gia nhóm Zalo") && (f02 = ac.g.f0(substring, "Mời bạn tham gia nhóm Zalo", 0, 6)) > 0) {
                                    String substring3 = substring.substring(0, f02);
                                    kotlin.jvm.internal.l.d(substring3, "substring(...)");
                                    substring = ac.g.o0(ac.g.v0(substring3).toString(), "-");
                                }
                                str8 = substring;
                            }
                        } else if (ac.g.b0(str17, "EXTVLCOPT")) {
                            Pattern REGEX_EXTVLCOPT_PROP_KEY = t.f6910r;
                            kotlin.jvm.internal.l.d(REGEX_EXTVLCOPT_PROP_KEY, "REGEX_EXTVLCOPT_PROP_KEY");
                            Db.j d10 = t.d(str17, REGEX_EXTVLCOPT_PROP_KEY);
                            linkedHashMap.put(d10.f3354a, d10.f3355b);
                        } else if (ac.g.b0(str17, "KODIPROP")) {
                            Pattern REGEX_KODI_PROP_KEY = t.f6909q;
                            kotlin.jvm.internal.l.d(REGEX_KODI_PROP_KEY, "REGEX_KODI_PROP_KEY");
                            Db.j d11 = t.d(str17, REGEX_KODI_PROP_KEY);
                            linkedHashMap.put(d11.f3354a, d11.f3355b);
                        }
                        String readLine3 = bufferedReader.readLine();
                        str17 = readLine3 != null ? ac.g.w0(readLine3).toString() : null;
                        linkedHashMap3 = linkedHashMap;
                    }
                }
                if (!arrayList4.isEmpty() && !c2010d.g()) {
                    c2010d.d(arrayList4);
                }
                if (c2010d.g()) {
                    return;
                }
                if (i10 == 0) {
                    c2010d.onError(new Throwable("Empty channel found"));
                    return;
                } else {
                    c2010d.a();
                    return;
                }
            case 2:
            case 3:
            default:
                C1651b c1651b = (C1651b) eVar.f6855c;
                String str18 = c1651b.f20819f;
                ka.c cVar2 = (ka.c) eVar.f6856d;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    JsoupResponse jsoupParse = JsoupUtilsKt.jsoupParse(str18, cVar2.a(), new Db.j("referer", str18));
                    cVar2.a().putAll(jsoupParse.getCookie());
                    zc.e m02 = jsoupParse.getBody().m0("script");
                    kotlin.jvm.internal.l.d(m02, "select(...)");
                    Iterator it = m02.iterator();
                    kotlin.jvm.internal.l.d(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        kotlin.jvm.internal.l.d(next, "next(...)");
                        ac.e eVar3 = (ac.e) ((v) eVar.f6854b).f19134a;
                        StringBuilder b10 = wc.l.b();
                        new C1947c(b10, 19).h((xc.l) next);
                        String l10 = wc.l.l(b10);
                        kotlin.jvm.internal.l.d(l10, "data(...)");
                        r8.o a19 = ac.e.a(eVar3, l10);
                        if (a19 == null || (str2 = (String) ((D) a19.e()).get(1)) == null) {
                            eVar = this;
                            linkedHashSet = linkedHashSet;
                            it = it;
                            c1651b = c1651b;
                            cVar2 = cVar2;
                        } else {
                            List r02 = ac.g.r0(ac.n.W(str2, "\"", ""), new String[]{","});
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it2 = r02.iterator();
                            while (it2.hasNext()) {
                                String str19 = (String) it2.next();
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it3 = it;
                                Iterator it4 = it2;
                                String str20 = "%21";
                                C1651b c1651b2 = c1651b;
                                String str21 = "%27";
                                LinkedHashSet linkedHashSet2 = linkedHashSet;
                                ArrayList arrayList7 = arrayList5;
                                String str22 = "/\\(/g";
                                String str23 = "%28";
                                String str24 = "/\\)/g";
                                String str25 = "%29";
                                String str26 = "/\\*/g";
                                String str27 = "%2A";
                                String str28 = "/%20/g";
                                String str29 = "+";
                                String str30 = "\\/";
                                String str31 = "/";
                                JsoupResponse jsoupParse2 = JsoupUtilsKt.jsoupParse(ac.n.W(ac.n.W(ac.n.W(ac.n.W(ac.n.W(ac.n.W(ac.n.W(ac.n.W(ac.n.W(str19, "/#!/g", "%23"), "/!/g", "%21"), "/'/g", "%27"), "/\\(/g", "%28"), "/\\)/g", "%29"), "/\\*/g", "%2A"), "/%20/g", "+"), "\\/", "/"), "//", "/"), cVar2.a(), new Db.j("referer", str19));
                                cVar2.a().putAll(jsoupParse2.getCookie());
                                zc.e i03 = jsoupParse2.getBody().i0("script");
                                kotlin.jvm.internal.l.d(i03, "getElementsByTag(...)");
                                Iterator it5 = i03.iterator();
                                kotlin.jvm.internal.l.d(it5, "iterator(...)");
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    kotlin.jvm.internal.l.d(next2, "next(...)");
                                    String j02 = ((xc.l) next2).j0();
                                    kotlin.jvm.internal.l.d(j02, "html(...)");
                                    String obj5 = ac.g.v0(j02).toString();
                                    Iterator it6 = it5;
                                    if (ac.n.Y(obj5, "var", false)) {
                                        String str32 = cVar2.f19064a.f20826b;
                                        kotlin.jvm.internal.l.b(str32);
                                        Pattern compile = Pattern.compile(str32);
                                        kotlin.jvm.internal.l.d(compile, "compile(...)");
                                        Matcher matcher = compile.matcher(obj5);
                                        kotlin.jvm.internal.l.d(matcher, "matcher(...)");
                                        while (matcher.find()) {
                                            String group = matcher.group(0);
                                            if (group != null) {
                                                arrayList6.add(ac.n.W(group, "=", "="));
                                            }
                                        }
                                    }
                                    it5 = it6;
                                }
                                if (arrayList6.isEmpty()) {
                                    iterable = Eb.v.f3891a;
                                    cVar = cVar2;
                                } else {
                                    ArrayList arrayList8 = new ArrayList(Eb.p.S(arrayList6, 10));
                                    Iterator it7 = arrayList6.iterator();
                                    while (it7.hasNext()) {
                                        String str33 = (String) it7.next();
                                        ka.c cVar3 = cVar2;
                                        String W10 = ac.n.W(ac.n.W(ac.n.W(str19, "/#!/g", "%23"), "/!/g", str20), "/'/g", str21);
                                        String str34 = str21;
                                        String str35 = str22;
                                        String str36 = str20;
                                        String str37 = str23;
                                        String W11 = ac.n.W(W10, str35, str37);
                                        String str38 = str24;
                                        String str39 = str25;
                                        String W12 = ac.n.W(W11, str38, str39);
                                        String str40 = str26;
                                        String str41 = str27;
                                        String W13 = ac.n.W(W12, str40, str41);
                                        String str42 = str28;
                                        String str43 = str29;
                                        String W14 = ac.n.W(W13, str42, str43);
                                        String str44 = str30;
                                        String str45 = str31;
                                        arrayList8.add(new ma.g(str33, ac.n.W(ac.n.W(W14, str44, str45), "//", str45)));
                                        cVar2 = cVar3;
                                        str21 = str34;
                                        str31 = str45;
                                        str20 = str36;
                                        str22 = str35;
                                        str23 = str37;
                                        str24 = str38;
                                        str25 = str39;
                                        str26 = str40;
                                        str27 = str41;
                                        str28 = str42;
                                        str29 = str43;
                                        str30 = str44;
                                    }
                                    cVar = cVar2;
                                    iterable = arrayList8;
                                }
                                Eb.o.U(arrayList7, iterable);
                                arrayList5 = arrayList7;
                                it = it3;
                                it2 = it4;
                                c1651b = c1651b2;
                                linkedHashSet = linkedHashSet2;
                                cVar2 = cVar;
                            }
                            linkedHashSet.addAll(arrayList5);
                            eVar = this;
                            c1651b = c1651b;
                        }
                    }
                    C1651b c1651b3 = c1651b;
                    List s02 = Eb.o.s0(linkedHashSet);
                    Object c1652c = new C1652c(c1651b3, s02);
                    kotlin.jvm.internal.l.d(new G8.m().f(s02), "toJson(...)");
                    if (c2010d.g()) {
                        return;
                    }
                    c2010d.d(c1652c);
                    c2010d.a();
                    return;
                } catch (Exception e12) {
                    if (c2010d.g()) {
                        return;
                    }
                    c2010d.onError(H.A(3, e12));
                    return;
                }
            case 4:
                Z9.B b11 = (Z9.B) eVar.f6855c;
                String str46 = (String) eVar.f6856d;
                try {
                    NetworkUtilsKt.trustEveryone();
                    OkHttpClient okHttpClient2 = b11.f12222a;
                    Request.Builder builder2 = new Request.Builder();
                    for (Map.Entry entry : ((Map) b11.f12228h.getValue()).entrySet()) {
                        builder2.b((String) entry.getKey(), (String) entry.getValue());
                    }
                    builder2.b("x-trace-account-id", "anonymous");
                    builder2.b("Access-Control-Request-Headers", "x-req-auth,x-trace-account-id,x-user-agent");
                    builder2.e(b11.c(str46));
                    Response e13 = okHttpClient2.b(new Request(builder2)).e();
                    TVChannel tVChannel = (TVChannel) eVar.f6854b;
                    int i11 = e13.f22442d;
                    if (200 > i11 || i11 >= 300) {
                        if (c2010d.g()) {
                            return;
                        }
                        List<TVChannel.Url> urls = tVChannel.getUrls();
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj6 : urls) {
                            if (kotlin.jvm.internal.l.a(((TVChannel.Url) obj6).getType(), "streaming")) {
                                arrayList9.add(obj6);
                            }
                        }
                        if (!arrayList9.isEmpty()) {
                            c2010d.onError(new Throwable(e13.f22441c));
                            return;
                        }
                        tVChannel.setReferer("https://sctvonline.vn/");
                        c2010d.d(new TVChannelLinkStream(tVChannel, arrayList9));
                        c2010d.a();
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(e13.f22445u.K());
                    if (c2010d.g()) {
                        return;
                    }
                    String optString = jSONObject.optString("link_play");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("play_info");
                    String str47 = null;
                    if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("data")) != null && (string = optJSONObject.getString("hls_link_play")) != null && !string.equals("null") && string.length() > 0) {
                        str47 = string;
                    }
                    tVChannel.setReferer("https://sctvonline.vn/");
                    List x2 = (str47 == null || str47.length() == 0) ? u0.x(optString) : u0.y(optString, str47);
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj7 : x2) {
                        String str48 = (String) obj7;
                        kotlin.jvm.internal.l.b(str48);
                        if (str48.length() > 0) {
                            arrayList10.add(obj7);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList(Eb.p.S(arrayList10, 10));
                    Iterator it8 = arrayList10.iterator();
                    while (it8.hasNext()) {
                        String str49 = (String) it8.next();
                        TVChannel.Url.Companion companion = TVChannel.Url.Companion;
                        kotlin.jvm.internal.l.b(str49);
                        fromUrl = companion.fromUrl(str49, (r15 & 2) != 0 ? MainTVDataSource$TVChannelUrlType.STREAM.getValue() : null, (r15 & 4) != 0 ? null : null, (r15 & 8) != 0 ? null : tVChannel.getTvChannelWebDetailPage(), (r15 & 16) != 0 ? null : UtilsKt.getBaseUrl(tVChannel.getTvChannelWebDetailPage()), (r15 & 32) != 0 ? null : null, (r15 & 64) == 0 ? null : null);
                        arrayList11.add(fromUrl);
                    }
                    TVChannelLinkStream tVChannelLinkStream = new TVChannelLinkStream(tVChannel, arrayList11);
                    String message2 = tVChannelLinkStream.toString();
                    kotlin.jvm.internal.l.e(message2, "message");
                    c2010d.d(tVChannelLinkStream);
                    c2010d.a();
                    return;
                } catch (Exception e14) {
                    if (c2010d.g()) {
                        return;
                    }
                    c2010d.onError(e14);
                    return;
                }
            case 5:
                Z9.H t10 = (Z9.H) eVar.f6855c;
                String name9 = (String) eVar.f6856d;
                try {
                } catch (Exception unused3) {
                    U9.m C2 = t10.f12250c.C();
                    C2.getClass();
                    kotlin.jvm.internal.l.e(name9, "name");
                    findFirstNumber = StringUtilsKt.findFirstNumber(((W9.d) Eb.o.Y((List) android.support.v4.media.session.b.j(C2.f9902a, new String[]{"MapChannel"}, new U9.b(name9, 2)).d())).f10866a);
                    try {
                        kotlin.jvm.internal.l.b(findFirstNumber);
                        if (Integer.parseInt(findFirstNumber) == 16) {
                            findFirstNumber = "15";
                        }
                    } catch (Exception unused4) {
                    }
                }
                for (Object obj8 : t10.f12249b.d("VTC_BACKUP")) {
                    if (ac.n.T(name9, ((TVChannel) obj8).getTvChannelName(), true)) {
                        findFirstNumber = ((TVChannel) obj8).getChannelId();
                        String message3 = "ChannelId: " + findFirstNumber;
                        kotlin.jvm.internal.l.e(t10, "t");
                        kotlin.jvm.internal.l.e(message3, "message");
                        U9.k kVar6 = new U9.k(t10, c2010d, (TVChannel) eVar.f6854b, 3);
                        C0666c c0666c = new C0666c(c2010d, 1);
                        if (findFirstNumber == null) {
                            c0666c.invoke(new Throwable("Channel id is null"));
                            return;
                        }
                        FormBody.Builder builder3 = new FormBody.Builder(0);
                        builder3.a("streamID", findFirstNumber);
                        FormBody formBody = new FormBody(builder3.f22324a, builder3.f22325b);
                        String o02 = ac.g.o0(t10.c().getBaseUrl(), "/");
                        String getLinkStreamPath = t10.c().getGetLinkStreamPath();
                        kotlin.jvm.internal.l.b(getLinkStreamPath);
                        String i12 = X.c.i(o02, "/", ac.g.o0(getLinkStreamPath, "/"));
                        Request.Builder builder4 = new Request.Builder();
                        builder4.e(i12);
                        builder4.a("Origin", ac.g.o0(t10.c().getBaseUrl(), "/"));
                        builder4.a("Referer", t10.c().getBaseUrl());
                        builder4.a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36");
                        builder4.a("Cookie", UtilsKt.buildCookie(t10.f12251d));
                        builder4.d(formBody);
                        t10.f12248a.b(new Request(builder4)).d(new q3.s(25, c0666c, kVar6, false));
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // j4.InterfaceC1376b
    public Object e() {
        C1196a c1196a = (C1196a) this.f6855c;
        i4.g gVar = (i4.g) c1196a.f17450d;
        gVar.getClass();
        C0838i c0838i = (C0838i) this.f6856d;
        C0837h c0837h = (C0837h) this.f6854b;
        String w10 = android.support.v4.media.session.b.w("SQLiteEventStore");
        if (Log.isLoggable(w10, 3)) {
            Log.d(w10, "Storing event with priority=" + c0838i.f13861c + ", name=" + c0837h.f13851a + " for destination " + c0838i.f13859a);
        }
        ((Long) gVar.F(new e(gVar, c0837h, c0838i, 9))).getClass();
        c1196a.f17447a.a(c0838i, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Object n6;
        u8.c cVar = (u8.c) this.f6855c;
        C0918a c0918a = (C0918a) this.f6856d;
        C2037a c2037a = (C2037a) this.f6854b;
        kotlin.jvm.internal.l.e(task, "task");
        try {
            try {
                n6 = task.isComplete() ? (Boolean) task.getResult() : Boolean.FALSE;
            } catch (Throwable th) {
                n6 = com.bumptech.glide.c.n(th);
            }
            Object obj = Boolean.FALSE;
            if (n6 instanceof Db.l) {
                n6 = obj;
            }
            ((Boolean) n6).booleanValue();
            boolean c10 = cVar.c();
            long f4 = cVar.f("version_need_refresh");
            long j = c0918a.f14463b.getLong("version_need_refresh".concat("_refresh_version"), 1L);
            String message = "{useOnlineData: " + c10 + ", version: " + f4 + ", refreshedVersion: " + j + "}";
            kotlin.jvm.internal.l.e(message, "message");
            if (c2037a.g()) {
                return;
            }
            c2037a.c(Boolean.valueOf(c10 && f4 > j));
        } catch (Exception e2) {
            if (c2037a.g()) {
                return;
            }
            c2037a.a(e2);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Task task = (Task) this.f6856d;
        s7.b bVar = (s7.b) this.f6854b;
        r8.o oVar = (r8.o) this.f6855c;
        try {
            C2151e c2151e = (C2151e) task.getResult();
            if (c2151e != null) {
                ((Executor) oVar.f23859d).execute(new RunnableC2224a(bVar, ((C1112g) oVar.f23858c).g(c2151e), 1));
            }
        } catch (u8.e e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e2);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f6855c;
        String str = (String) this.f6856d;
        r8.p pVar = (r8.p) this.f6854b;
        String str2 = (String) obj;
        C1290a c10 = FirebaseMessaging.c(firebaseMessaging.f15865b);
        Y6.i iVar = firebaseMessaging.f15864a;
        iVar.b();
        String g = "[DEFAULT]".equals(iVar.f12042b) ? "" : iVar.g();
        String b2 = firebaseMessaging.f15870h.b();
        synchronized (c10) {
            String a9 = r8.p.a(System.currentTimeMillis(), str2, b2);
            if (a9 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f18187b).edit();
                edit.putString(g + "|T|" + str + "|*", a9);
                edit.commit();
            }
        }
        if (pVar == null || !str2.equals(pVar.f23862a)) {
            Y6.i iVar2 = firebaseMessaging.f15864a;
            iVar2.b();
            if ("[DEFAULT]".equals(iVar2.f12042b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    iVar2.b();
                    sb2.append(iVar2.f12042b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new r8.h(firebaseMessaging.f15865b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C2151e c2151e;
        URL url;
        switch (this.f6853a) {
            case 14:
                u8.c cVar = (u8.c) this.f6855c;
                cVar.getClass();
                Task task2 = (Task) this.f6856d;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                C2151e c2151e2 = (C2151e) task2.getResult();
                Task task3 = (Task) this.f6854b;
                return (task3.isSuccessful() && (c2151e = (C2151e) task3.getResult()) != null && c2151e2.f25212c.equals(c2151e.f25212c)) ? Tasks.forResult(Boolean.FALSE) : cVar.f24885d.d(c2151e2).continueWith(cVar.f24883b, new u8.b(cVar));
            case 15:
                C2155i c2155i = (C2155i) this.f6855c;
                c2155i.getClass();
                Task task4 = (Task) this.f6856d;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new Y6.k("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                Task task5 = (Task) this.f6854b;
                try {
                    if (!task5.isSuccessful()) {
                        return Tasks.forException(new Y6.k("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                    }
                    try {
                        url = new URL(c2155i.c(c2155i.f25245n));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    c2155i.i(httpURLConnection, (String) task5.getResult(), ((C1433a) task4.getResult()).f19028a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e2) {
                    return Tasks.forException(new Y6.k("Failed to open HTTP stream connection", e2));
                }
            default:
                boolean isSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6855c;
                if (isSuccessful) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (((AtomicBoolean) this.f6856d).getAndSet(true)) {
                    ((CancellationTokenSource) this.f6854b).cancel();
                }
                return Tasks.forResult(null);
        }
    }
}
