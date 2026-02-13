package o4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: o4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1797k extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f21852a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f21853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1798l f21854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1797k(C1798l c1798l, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f21854c = c1798l;
        this.f21852a = contentResolver;
        this.f21853b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        C1798l c1798l = this.f21854c;
        C1798l.a(c1798l, C1794h.b((Context) c1798l.f21856b));
    }
}
