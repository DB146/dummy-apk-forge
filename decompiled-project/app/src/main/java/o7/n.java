package o7;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final zzaj f22098a = zzaj.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: b, reason: collision with root package name */
    public static final n f22099b = new Object();

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f14897a);
        edit.putString("statusMessage", status.f14898b);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzaj zzajVar = f22098a;
        int size = zzajVar.size();
        int i7 = 0;
        while (i7 < size) {
            E e2 = zzajVar.get(i7);
            i7++;
            edit.remove((String) e2);
        }
        edit.commit();
    }
}
