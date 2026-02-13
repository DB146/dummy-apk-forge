package androidx.credentials.playservices;

import D1.a;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final a f13313a = new Binder();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.e(intent, "intent");
        return this.f13313a;
    }
}
