package com.kt.apps.core.service;

import A1.d;
import A3.c;
import Db.o;
import M9.k;
import P4.Y;
import R9.a;
import U9.t;
import a.AbstractC0672a;
import ab.i;
import ac.g;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import cb.b;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.kt.apps.core.storage.local.RoomDataBase;
import hb.C1268a;
import java.util.Map;
import kotlin.jvm.internal.l;
import nb.e;
import oa.C1831f;
import oa.j;
import ob.C1837e;
import r8.n;
import t8.C2034c;
import u.C2052e;

/* loaded from: classes2.dex */
public final class CloudMessagingService extends FirebaseMessagingService implements b {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f16116C = 0;

    /* renamed from: A, reason: collision with root package name */
    public RoomDataBase f16117A;

    /* renamed from: v, reason: collision with root package name */
    public volatile i f16119v;

    /* renamed from: y, reason: collision with root package name */
    public a f16122y;

    /* renamed from: z, reason: collision with root package name */
    public SharedPreferences f16123z;

    /* renamed from: w, reason: collision with root package name */
    public final Object f16120w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public boolean f16121x = false;

    /* renamed from: B, reason: collision with root package name */
    public final o f16118B = android.support.v4.media.session.b.z(new I9.a(23));

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0096, code lost:
    
        continue;
     */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(n nVar) {
        long parseLong;
        String str;
        k kVar;
        Bundle bundle = nVar.f23853a;
        String string = bundle.getString("google.message_id");
        if (string == null) {
            string = bundle.getString("message_id");
        }
        String string2 = nVar.f23853a.getString("message_type");
        Object obj = nVar.f23853a.get("google.sent_time");
        if (obj instanceof Long) {
            parseLong = ((Long) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
                }
            }
            parseLong = 0;
        }
        String string3 = nVar.f23853a.getString("google.c.sender.id");
        Map t5 = nVar.t();
        StringBuilder o10 = c.o("onMessageReceived: {messageId: ", string, ", messageType: ", string2, ", sentTime: ");
        o10.append(parseLong);
        o10.append(", senderId: ");
        o10.append(string3);
        o10.append(",data: ");
        o10.append(t5);
        o10.append("}");
        String message = o10.toString();
        l.e(message, "message");
        Map t10 = nVar.t();
        l.d(t10, "getData(...)");
        for (Map.Entry entry : ((C2052e) t10).entrySet()) {
            if (l.a((String) entry.getKey(), "type") && (str = (String) entry.getValue()) != null) {
                switch (str.hashCode()) {
                    case -1273351885:
                        if (str.equals("clearCacheProgramCache")) {
                            g();
                            break;
                        } else {
                            break;
                        }
                    case -838846263:
                        if (str.equals("update")) {
                            a aVar = this.f16122y;
                            if (aVar == null) {
                                l.j("keyValueStorage");
                                throw null;
                            }
                            ((R9.b) aVar).f8941a.edit().remove("version_need_refresh").apply();
                            SharedPreferences sharedPreferences = this.f16123z;
                            if (sharedPreferences == null) {
                                l.j("sharedPreferences");
                                throw null;
                            }
                            for (String str2 : sharedPreferences.getAll().keySet()) {
                                l.b(str2);
                                if (g.b0(str2, "_refresh_version")) {
                                    SharedPreferences sharedPreferences2 = this.f16123z;
                                    if (sharedPreferences2 == null) {
                                        l.j("sharedPreferences");
                                        throw null;
                                    }
                                    sharedPreferences2.edit().remove(str2).apply();
                                }
                            }
                            synchronized (k.k) {
                                kVar = k.f6873l;
                            }
                            if (kVar != null) {
                                kVar.d().clear();
                            }
                            AbstractC0672a.i().b().addOnSuccessListener(new d(new Ba.i(5), 29)).addOnFailureListener(new Y(5)).addOnCanceledListener(new Y(6));
                            break;
                        } else {
                            continue;
                        }
                    case -759238347:
                        if (str.equals("clearCache")) {
                            g();
                            break;
                        } else {
                            break;
                        }
                    case 1085444827:
                        str.equals("refresh");
                        break;
                }
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String msgId) {
        l.e(msgId, "msgId");
    }

    @Override // cb.b
    public final Object e() {
        if (this.f16119v == null) {
            synchronized (this.f16120w) {
                try {
                    if (this.f16119v == null) {
                        this.f16119v = new i(this);
                    }
                } finally {
                }
            }
        }
        return this.f16119v.e();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void f(String token) {
        l.e(token, "token");
        String message = "FCM token: ".concat(token);
        l.e(message, "message");
        a aVar = this.f16122y;
        if (aVar != null) {
            if (aVar != null) {
                ((R9.b) aVar).b(token, "FcmToken");
            } else {
                l.j("keyValueStorage");
                throw null;
            }
        }
    }

    public final void g() {
        String str;
        a aVar = this.f16122y;
        if (aVar == null) {
            l.j("keyValueStorage");
            throw null;
        }
        try {
            str = (String) ((R9.b) aVar).a(String.class, "DefaultEpgUrl");
        } catch (Exception unused) {
            str = "";
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return;
        }
        C1268a c1268a = (C1268a) this.f16118B.getValue();
        RoomDataBase roomDataBase = this.f16117A;
        if (roomDataBase == null) {
            l.j("roomDataBase");
            throw null;
        }
        t A10 = roomDataBase.A();
        A10.getClass();
        C1837e g = android.support.v4.media.session.b.g(A10.f9911a, new Aa.t(20, "DEFAULT", str));
        e eVar = new e(0, new C2034c(this, 29), new Q9.a(this, 0));
        g.c(eVar);
        c1268a.d(eVar);
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f16121x) {
            this.f16121x = true;
            j jVar = ((C1831f) ((Q9.b) e())).f22153a;
            this.f16122y = (a) jVar.j.get();
            this.f16123z = (SharedPreferences) jVar.f22176i.get();
            this.f16117A = (RoomDataBase) jVar.k.get();
        }
        super.onCreate();
    }
}
