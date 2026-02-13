package androidx.room;

import I2.BinderC0328q;
import I2.r;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f13719a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13720b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final r f13721c = new r(this);

    /* renamed from: d, reason: collision with root package name */
    public final BinderC0328q f13722d = new BinderC0328q(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        l.e(intent, "intent");
        return this.f13722d;
    }
}
