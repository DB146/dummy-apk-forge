package Y5;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Y5.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619h0 implements U0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0646q0 f11773a;

    public C0619h0(I1 i12) {
        this.f11773a = i12.f11414z;
    }

    public /* synthetic */ C0619h0(C0646q0 c0646q0) {
        this.f11773a = c0646q0;
    }

    public boolean a() {
        C0646q0 c0646q0 = this.f11773a;
        try {
            E3.e a9 = O5.c.a(c0646q0.f11907a);
            if (a9 != null) {
                return a9.h(128, "com.android.vending").versionCode >= 80837300;
            }
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11573B.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e2) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11573B.b(e2, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    @Override // Y5.U0
    public void c(int i7, IOException iOException, byte[] bArr) {
        int i10;
        W w10;
        W w11;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        W w12;
        C0646q0 c0646q0 = this.f11773a;
        W w13 = c0646q0.f11912f;
        if (i7 == 200 || i7 == 204) {
            i10 = i7;
        } else {
            i10 = 304;
            if (i7 != 304) {
                i10 = i7;
                C0646q0.l(w13);
                w13.f11580w.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), iOException);
            }
        }
        if (iOException == null) {
            C0613f0 c0613f0 = c0646q0.f11911e;
            C0646q0.j(c0613f0);
            c0613f0.f11736H.b(true);
            if (bArr == null || bArr.length == 0) {
                C0646q0.l(w13);
                w13.f11572A.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    C0646q0.l(w13);
                    w13.f11572A.a("Deferred Deep Link is empty.");
                    w13 = w13;
                } else {
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    String optString4 = jSONObject.optString("gad_source", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle2 = new Bundle();
                    M1 m12 = c0646q0.f11915w;
                    C0646q0.j(m12);
                    C0646q0 c0646q02 = (C0646q0) m12.f3094a;
                    if (TextUtils.isEmpty(optString)) {
                        w11 = w13;
                        w12 = w13;
                    } else {
                        Context context = c0646q02.f11907a;
                        w11 = w13;
                        try {
                            ?? queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                            w12 = queryIntentActivities;
                            if (queryIntentActivities != 0) {
                                ?? isEmpty = queryIntentActivities.isEmpty();
                                w12 = isEmpty;
                                if (isEmpty == 0) {
                                    ?? isEmpty2 = TextUtils.isEmpty(optString3);
                                    if (isEmpty2 == 0) {
                                        bundle2.putString("gbraid", optString3);
                                    }
                                    if (!TextUtils.isEmpty(optString4)) {
                                        bundle2.putString("gad_source", optString4);
                                    }
                                    bundle2.putString("gclid", optString2);
                                    bundle2.putString("_cis", "ddp");
                                    c0646q0.f11890A.Q("auto", "_cmp", bundle2);
                                    w13 = isEmpty2;
                                    if (!TextUtils.isEmpty(optString)) {
                                        try {
                                            SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                            edit.putString("deeplink", optString);
                                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                            w13 = isEmpty2;
                                            if (edit.commit()) {
                                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                                Context context2 = c0646q02.f11907a;
                                                if (Build.VERSION.SDK_INT < 34) {
                                                    context2.sendBroadcast(intent);
                                                    w13 = isEmpty2;
                                                } else {
                                                    makeBasic = BroadcastOptions.makeBasic();
                                                    shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                                    bundle = shareIdentityEnabled.toBundle();
                                                    context2.sendBroadcast(intent, null, bundle);
                                                    w13 = isEmpty2;
                                                }
                                            }
                                        } catch (RuntimeException e2) {
                                            W w14 = c0646q02.f11912f;
                                            C0646q0.l(w14);
                                            w14.f11577f.b(e2, "Failed to persist Deferred Deep Link. exception");
                                            w13 = isEmpty2;
                                        }
                                    }
                                }
                            }
                        } catch (JSONException e10) {
                            e = e10;
                            w10 = w11;
                            C0646q0.l(w10);
                            w10.f11577f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    C0646q0.l(w11);
                    w10 = w11;
                    try {
                        w10.f11580w.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                        w13 = w12;
                    } catch (JSONException e11) {
                        e = e11;
                        C0646q0.l(w10);
                        w10.f11577f.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                return;
            } catch (JSONException e12) {
                e = e12;
                w10 = w13;
            }
        }
        C0646q0.l(w13);
        w13.f11580w.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), iOException);
    }
}
