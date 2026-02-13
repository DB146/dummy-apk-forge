package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f15037d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f15038a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15039b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15040c;

    public O(String str, String str2, boolean z8) {
        G.d(str);
        this.f15038a = str;
        G.d(str2);
        this.f15039b = str2;
        this.f15040c = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent a(Context context) {
        Bundle bundle;
        PendingIntent pendingIntent;
        ContentProviderClient acquireUnstableContentProviderClient;
        Intent intent = null;
        String str = this.f15038a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f15040c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f15037d);
            } catch (RemoteException e2) {
                e = e2;
                bundle = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundle == null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            } catch (IllegalArgumentException e10) {
                e = e10;
                bundle = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundle == null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            }
            if (acquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                try {
                } catch (RemoteException e11) {
                    e = e11;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundle == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                } catch (IllegalArgumentException e12) {
                    e = e12;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundle == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                }
                if (bundle == null && (intent = (Intent) bundle.getParcelable("serviceResponseIntentKey")) == null && (pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey")) != null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action " + str + " but has possible resolution");
                    throw new H(new F5.b(25, pendingIntent));
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(str));
                }
            } finally {
                acquireUnstableContentProviderClient.release();
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f15039b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return G.k(this.f15038a, o10.f15038a) && G.k(this.f15039b, o10.f15039b) && G.k(null, null) && this.f15040c == o10.f15040c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15038a, this.f15039b, null, 4225, Boolean.valueOf(this.f15040c)});
    }

    public final String toString() {
        String str = this.f15038a;
        if (str != null) {
            return str;
        }
        G.g(null);
        throw null;
    }
}
