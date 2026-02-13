package com.google.firebase.messaging;

import E5.b;
import E5.n;
import E5.o;
import N5.a;
import Z9.x;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import ia.C1358d;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l2.X;
import r8.g;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends g {

    /* renamed from: u, reason: collision with root package name */
    public static final ArrayDeque f15872u = new ArrayDeque(10);

    /* renamed from: f, reason: collision with root package name */
    public b f15873f;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b2  */
    @Override // r8.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Intent intent) {
        b bVar;
        int i7;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                f(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayDeque arrayDeque = f15872u;
            if (arrayDeque.contains(stringExtra)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra);
                }
                if (this.f15873f == null) {
                    this.f15873f = new b(getApplicationContext());
                }
                bVar = this.f15873f;
                if (bVar.f3675c.v() >= 233700000) {
                    Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle = new Bundle();
                String stringExtra2 = intent.getStringExtra("google.message_id");
                if (stringExtra2 == null) {
                    stringExtra2 = intent.getStringExtra("message_id");
                }
                bundle.putString("google.message_id", stringExtra2);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle.putInt("google.product_id", valueOf.intValue());
                }
                o j = o.j(bVar.f3674b);
                synchronized (j) {
                    i7 = j.f3712a;
                    j.f3712a = 1 + i7;
                }
                j.k(new n(i7, 3, bundle, 0));
                return;
            }
            if (arrayDeque.size() >= 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(stringExtra);
        }
        String stringExtra3 = intent.getStringExtra("message_type");
        if (stringExtra3 == null) {
            stringExtra3 = "gcm";
        }
        char c10 = 65535;
        switch (stringExtra3.hashCode()) {
            case -2062414158:
                if (stringExtra3.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra3.equals("gcm")) {
                    c10 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra3.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra3.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                break;
            case 1:
                x.F(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (C1358d.p(extras)) {
                    C1358d c1358d = new C1358d(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Network-Io"));
                    try {
                        if (new X(this, c1358d, newSingleThreadExecutor).r()) {
                            break;
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (x.S(intent)) {
                                x.G("_nf", intent.getExtras());
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                c(new r8.n(extras));
                break;
            case 2:
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new Exception(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case 3:
                d(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra3));
                break;
        }
        if (this.f15873f == null) {
        }
        bVar = this.f15873f;
        if (bVar.f3675c.v() >= 233700000) {
        }
    }

    public void c(r8.n nVar) {
    }

    public void d(String str) {
    }

    public void f(String str) {
    }
}
