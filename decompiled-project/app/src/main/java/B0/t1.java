package B0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class t1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec.d f1981a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(ec.d dVar, Handler handler) {
        super(handler);
        this.f1981a = dVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8, Uri uri) {
        this.f1981a.h(Db.q.f3365a);
    }
}
